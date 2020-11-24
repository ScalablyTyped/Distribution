package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBluetoothDevicesSuccessCallbackResult extends js.Object {
  
  /** uuid 对应的的已连接设备列表 */
  var devices: GetBluetoothDevicesSuccessCallbackResultBlueToothDevice = js.native
}
object GetBluetoothDevicesSuccessCallbackResult {
  
  @scala.inline
  def apply(devices: GetBluetoothDevicesSuccessCallbackResultBlueToothDevice): GetBluetoothDevicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBluetoothDevicesSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetBluetoothDevicesSuccessCallbackResultOps[Self <: GetBluetoothDevicesSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setDevices(value: GetBluetoothDevicesSuccessCallbackResultBlueToothDevice): Self = this.set("devices", value.asInstanceOf[js.Any])
  }
}
