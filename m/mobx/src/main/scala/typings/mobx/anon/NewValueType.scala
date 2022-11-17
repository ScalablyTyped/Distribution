package typings.mobx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValueType extends StObject {
  
  var newValue: Any
  
  var `type`: "add"
}
object NewValueType {
  
  inline def apply(newValue: Any): NewValueType = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("add")
    __obj.asInstanceOf[NewValueType]
  }
  
  extension [Self <: NewValueType](x: Self) {
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: "add"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
