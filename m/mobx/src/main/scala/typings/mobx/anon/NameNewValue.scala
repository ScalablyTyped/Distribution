package typings.mobx.anon

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameNewValue[T] extends StObject {
  
  var name: PropertyKey
  
  var newValue: Any
  
  var `object`: T
  
  var `type`: "update" | "add"
}
object NameNewValue {
  
  inline def apply[T](name: PropertyKey, newValue: Any, `object`: T, `type`: "update" | "add"): NameNewValue[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameNewValue[T]]
  }
  
  extension [Self <: NameNewValue[?], T](x: Self & NameNewValue[T]) {
    
    inline def setName(value: PropertyKey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setType(value: "update" | "add"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
