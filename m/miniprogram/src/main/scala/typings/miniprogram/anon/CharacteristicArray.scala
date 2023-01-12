package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacteristicArray extends StObject {
  
  var characteristic: js.Array[Properties]
}
object CharacteristicArray {
  
  inline def apply(characteristic: js.Array[Properties]): CharacteristicArray = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacteristicArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CharacteristicArray] (val x: Self) extends AnyVal {
    
    inline def setCharacteristic(value: js.Array[Properties]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicVarargs(value: Properties*): Self = StObject.set(x, "characteristic", js.Array(value*))
  }
}
