package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBluetoothDevicesSuccessCallbackResult extends js.Object {
  /** uuid 对应的的已连接设备列表 */
  var devices: GetBluetoothDevicesSuccessCallbackResultBlueToothDevice
}

object GetBluetoothDevicesSuccessCallbackResult {
  @scala.inline
  def apply(devices: GetBluetoothDevicesSuccessCallbackResultBlueToothDevice): GetBluetoothDevicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBluetoothDevicesSuccessCallbackResult]
  }
}

