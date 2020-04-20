package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Wifi 信息 */
trait WifiInfo extends js.Object {
  /** Wi-Fi 的 BSSID */
  var BSSID: String
  /** Wi-Fi 的 SSID */
  var SSID: String
  /** Wi-Fi 是否安全 */
  var secure: Boolean
  /** Wi-Fi 信号强度 */
  var signalStrength: Double
}

object WifiInfo {
  @scala.inline
  def apply(BSSID: String, SSID: String, secure: Boolean, signalStrength: Double): WifiInfo = {
    val __obj = js.Dynamic.literal(BSSID = BSSID.asInstanceOf[js.Any], SSID = SSID.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], signalStrength = signalStrength.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiInfo]
  }
}

