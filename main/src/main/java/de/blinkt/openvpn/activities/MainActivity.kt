/*
*   androidFreeOpenVPN acts as a custom UI for ics-openvpn and provides 1 free slow VPN server.

    This file is a part of the androidFreeOpenVPN app.

    Copyright (C) 2024 Yurii Shmal

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
* */

package de.blinkt.openvpn.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import de.blinkt.openvpn.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun tryConnect(view: View) {
        Intent(applicationContext, ConnectingActivity::class.java).also {
            startActivity(it)
        }
        finish()
    }


}