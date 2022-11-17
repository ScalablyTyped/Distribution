package typings.mobx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValueOldValue extends StObject {
  
  var newValue: Any
  
  var oldValue: Any
  
  var `type`: "update"
}
object NewValueOldValue {
  
  inline def apply(newValue: Any, oldValue: Any): NewValueOldValue = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("update")
    __obj.asInstanceOf[NewValueOldValue]
  }
  
  extension [Self <: NewValueOldValue](x: Self) {
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: "update"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
