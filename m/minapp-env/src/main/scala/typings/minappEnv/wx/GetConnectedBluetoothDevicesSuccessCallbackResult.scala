package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectedBluetoothDevicesSuccessCallbackResult extends StObject {
  
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
  implicit class GetConnectedBluetoothDevicesSuccessCallbackResultMutableBuilder[Self <: GetConnectedBluetoothDevicesSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: BluetoothDeviceInfo): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
  }
}
