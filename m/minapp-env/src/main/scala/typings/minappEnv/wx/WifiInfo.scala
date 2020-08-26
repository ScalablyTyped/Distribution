package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Wifi 信息 */
@js.native
trait WifiInfo extends js.Object {
  /** Wi-Fi 的 BSSID */
  var BSSID: String = js.native
  /** Wi-Fi 的 SSID */
  var SSID: String = js.native
  /** Wi-Fi 是否安全 */
  var secure: Boolean = js.native
  /** Wi-Fi 信号强度 */
  var signalStrength: Double = js.native
}

object WifiInfo {
  @scala.inline
  def apply(BSSID: String, SSID: String, secure: Boolean, signalStrength: Double): WifiInfo = {
    val __obj = js.Dynamic.literal(BSSID = BSSID.asInstanceOf[js.Any], SSID = SSID.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], signalStrength = signalStrength.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiInfo]
  }
  @scala.inline
  implicit class WifiInfoOps[Self <: WifiInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBSSID(value: String): Self = this.set("BSSID", value.asInstanceOf[js.Any])
    @scala.inline
    def setSSID(value: String): Self = this.set("SSID", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignalStrength(value: Double): Self = this.set("signalStrength", value.asInstanceOf[js.Any])
  }
  
}

