package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBluetoothDeviceFoundCallbackResult extends StObject {
  
  /** 新搜索到的设备列表 */
  var devices: CallbackResultBlueToothDevice
}
object OnBluetoothDeviceFoundCallbackResult {
  
  inline def apply(devices: CallbackResultBlueToothDevice): OnBluetoothDeviceFoundCallbackResult = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBluetoothDeviceFoundCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnBluetoothDeviceFoundCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setDevices(value: CallbackResultBlueToothDevice): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
  }
}
