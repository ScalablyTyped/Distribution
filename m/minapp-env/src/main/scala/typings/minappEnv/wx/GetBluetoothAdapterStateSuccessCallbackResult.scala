package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBluetoothAdapterStateSuccessCallbackResult extends js.Object {
  /** 蓝牙适配器是否可用 */
  var available: Boolean
  /** 是否正在搜索设备 */
  var discovering: Boolean
}

object GetBluetoothAdapterStateSuccessCallbackResult {
  @scala.inline
  def apply(available: Boolean, discovering: Boolean): GetBluetoothAdapterStateSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBluetoothAdapterStateSuccessCallbackResult]
  }
}

