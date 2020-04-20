package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBluetoothAdapterStateChangeCallbackResult extends js.Object {
  /** 蓝牙适配器是否可用 */
  var available: Boolean
  /** 蓝牙适配器是否处于搜索状态 */
  var discovering: Boolean
}

object OnBluetoothAdapterStateChangeCallbackResult {
  @scala.inline
  def apply(available: Boolean, discovering: Boolean): OnBluetoothAdapterStateChangeCallbackResult = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBluetoothAdapterStateChangeCallbackResult]
  }
}

