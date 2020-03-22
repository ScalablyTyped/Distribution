package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedBluetoothDevicesSuccessCallbackResult extends js.Object {
  /** 搜索到的设备列表 */
  var devices: BluetoothDeviceInfo
}

object GetConnectedBluetoothDevicesSuccessCallbackResult {
  @scala.inline
  def apply(devices: BluetoothDeviceInfo): GetConnectedBluetoothDevicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetConnectedBluetoothDevicesSuccessCallbackResult]
  }
}

