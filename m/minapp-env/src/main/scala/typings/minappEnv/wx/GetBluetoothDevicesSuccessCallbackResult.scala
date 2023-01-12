package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBluetoothDevicesSuccessCallbackResult extends StObject {
  
  /** uuid 对应的的已连接设备列表 */
  var devices: GetBluetoothDevicesSuccessCallbackResultBlueToothDevice
}
object GetBluetoothDevicesSuccessCallbackResult {
  
  inline def apply(devices: GetBluetoothDevicesSuccessCallbackResultBlueToothDevice): GetBluetoothDevicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBluetoothDevicesSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBluetoothDevicesSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setDevices(value: GetBluetoothDevicesSuccessCallbackResultBlueToothDevice): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
  }
}
