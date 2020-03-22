package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 提供预设的 Wi-Fi 信息列表 */
trait WifiData extends js.Object {
  /** Wi-Fi 的 BSSID */
  var BSSID: js.UndefOr[String] = js.undefined
  /** Wi-Fi 的 SSID */
  var SSID: js.UndefOr[String] = js.undefined
  /** Wi-Fi 设备密码 */
  var password: js.UndefOr[String] = js.undefined
}

object WifiData {
  @scala.inline
  def apply(BSSID: String = null, SSID: String = null, password: String = null): WifiData = {
    val __obj = js.Dynamic.literal()
    if (BSSID != null) __obj.updateDynamic("BSSID")(BSSID.asInstanceOf[js.Any])
    if (SSID != null) __obj.updateDynamic("SSID")(SSID.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiData]
  }
}

