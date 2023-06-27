package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldValue extends StObject {
  
  var oldValue: Any
  
  var value: Any
}
object OldValue {
  
  inline def apply(oldValue: Any, value: Any): OldValue = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OldValue] (val x: Self) extends AnyVal {
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
