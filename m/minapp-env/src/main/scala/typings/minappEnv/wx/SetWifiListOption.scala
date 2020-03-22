package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetWifiListOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetWifiListCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetWifiListFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetWifiListSuccessCallback] = js.undefined
  /** 提供预设的 Wi-Fi 信息列表 */
  var wifiList: WifiData
}

object SetWifiListOption {
  @scala.inline
  def apply(
    wifiList: WifiData,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): SetWifiListOption = {
    val __obj = js.Dynamic.literal(wifiList = wifiList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetWifiListOption]
  }
}

