package typings.minappEnv.wx

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGetWifiListCallbackResult extends js.Object {
  /** Wi-Fi 列表数据 */
  var wifiList: Array[WifiInfo]
}

object OnGetWifiListCallbackResult {
  @scala.inline
  def apply(wifiList: Array[WifiInfo]): OnGetWifiListCallbackResult = {
    val __obj = js.Dynamic.literal(wifiList = wifiList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGetWifiListCallbackResult]
  }
}

