package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnWifiConnectedCallbackResult extends js.Object {
  /** [WifiInfo](https://developers.weixin.qq.com/miniprogram/dev/api/device/wifi/WifiInfo.html)
    *
    * Wi-Fi 信息 */
  var wifi: WifiInfo
}

object OnWifiConnectedCallbackResult {
  @scala.inline
  def apply(wifi: WifiInfo): OnWifiConnectedCallbackResult = {
    val __obj = js.Dynamic.literal(wifi = wifi.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnWifiConnectedCallbackResult]
  }
}

