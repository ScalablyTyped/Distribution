package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 搜索到的设备列表 */
trait BluetoothDeviceInfo extends StObject {
  
  /** 用于区分设备的 id */
  var deviceId: String
  
  /** 蓝牙设备名称，某些设备可能没有 */
  var name: String
}
object BluetoothDeviceInfo {
  
  inline def apply(deviceId: String, name: String): BluetoothDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDeviceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BluetoothDeviceInfo] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
