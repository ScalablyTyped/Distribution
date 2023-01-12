package typings.miniprogram

import typings.miniprogram.anon.Characteristic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadBLECharacteristicValueArgs
  extends StObject
     with AsyncCallback[Characteristic] {
  
  var characteristicId: String
  
  var deviceId: String
  
  var serviceId: String
}
object ReadBLECharacteristicValueArgs {
  
  inline def apply(characteristicId: String, deviceId: String, serviceId: String): ReadBLECharacteristicValueArgs = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadBLECharacteristicValueArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadBLECharacteristicValueArgs] (val x: Self) extends AnyVal {
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
  }
}
