package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedWifiSuccessCallbackResult extends js.Object {
  /** [WifiInfo](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/WifiInfo.html)
    *
    * Wi-Fi 信息 */
  var wifi: WifiInfo
}

object GetConnectedWifiSuccessCallbackResult {
  @scala.inline
  def apply(wifi: WifiInfo): GetConnectedWifiSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(wifi = wifi.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetConnectedWifiSuccessCallbackResult]
  }
}

