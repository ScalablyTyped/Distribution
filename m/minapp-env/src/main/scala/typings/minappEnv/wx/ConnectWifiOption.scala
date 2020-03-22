package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectWifiOption extends js.Object {
  /** Wi-Fi 设备 BSSID */
  var BSSID: String
  /** Wi-Fi 设备 SSID */
  var SSID: String
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ConnectWifiCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ConnectWifiFailCallback] = js.undefined
  /** Wi-Fi 设备密码 */
  var password: js.UndefOr[String] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ConnectWifiSuccessCallback] = js.undefined
}

object ConnectWifiOption {
  @scala.inline
  def apply(
    BSSID: String,
    SSID: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    password: String = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): ConnectWifiOption = {
    val __obj = js.Dynamic.literal(BSSID = BSSID.asInstanceOf[js.Any], SSID = SSID.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ConnectWifiOption]
  }
}

