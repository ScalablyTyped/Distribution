package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBLECharacteristicValueChangeCallbackResult extends StObject {
  
  /** 蓝牙特征值的 uuid */
  var characteristicId: String
  
  /** 蓝牙设备 id */
  var deviceId: String
  
  /** 蓝牙特征值对应服务的 uuid */
  var serviceId: String
  
  /** 特征值最新的值 */
  var value: ArrayBuffer
}
object OnBLECharacteristicValueChangeCallbackResult {
  
  inline def apply(characteristicId: String, deviceId: String, serviceId: String, value: ArrayBuffer): OnBLECharacteristicValueChangeCallbackResult = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBLECharacteristicValueChangeCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnBLECharacteristicValueChangeCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
