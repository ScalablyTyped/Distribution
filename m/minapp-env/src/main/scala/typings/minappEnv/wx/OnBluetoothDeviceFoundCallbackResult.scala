package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBluetoothDeviceFoundCallbackResult extends js.Object {
  /** 新搜索到的设备列表 */
  var devices: CallbackResultBlueToothDevice
}

object OnBluetoothDeviceFoundCallbackResult {
  @scala.inline
  def apply(devices: CallbackResultBlueToothDevice): OnBluetoothDeviceFoundCallbackResult = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBluetoothDeviceFoundCallbackResult]
  }
}

