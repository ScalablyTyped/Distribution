package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectedBluetoothDevicesSuccessCallbackResult extends js.Object {
  /** 搜索到的设备列表 */
  var devices: BluetoothDeviceInfo = js.native
}

object GetConnectedBluetoothDevicesSuccessCallbackResult {
  @scala.inline
  def apply(devices: BluetoothDeviceInfo): GetConnectedBluetoothDevicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectedBluetoothDevicesSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetConnectedBluetoothDevicesSuccessCallbackResultOps[Self <: GetConnectedBluetoothDevicesSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDevices(value: BluetoothDeviceInfo): Self = this.set("devices", value.asInstanceOf[js.Any])
  }
  
}

