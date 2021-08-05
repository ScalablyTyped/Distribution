package typings.mobx.anon

import typings.mobx.mobxStrings.update
import typings.mobx.observableobjectMod.IObjectDidChange
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldValue[T]
  extends StObject
     with IObjectDidChange[T] {
  
  var name: PropertyKey
  
  var newValue: js.Any
  
  var `object`: T
  
  var oldValue: js.Any
  
  var `type`: update
}
object OldValue {
  
  inline def apply[T](name: PropertyKey, newValue: js.Any, `object`: T, oldValue: js.Any): OldValue[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("update")
    __obj.asInstanceOf[OldValue[T]]
  }
  
  extension [Self <: OldValue[?], T](x: Self & OldValue[T]) {
    
    inline def setName(value: PropertyKey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
