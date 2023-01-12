package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Characteristic extends StObject {
  
  var characteristic: CharacteristicId
}
object Characteristic {
  
  inline def apply(characteristic: CharacteristicId): Characteristic = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characteristic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Characteristic] (val x: Self) extends AnyVal {
    
    inline def setCharacteristic(value: CharacteristicId): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
  }
}
