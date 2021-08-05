package typings.mobx.anon

import typings.mobx.mobxStrings.remove
import typings.mobx.observableobjectMod.IObjectWillChange
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectType[T]
  extends StObject
     with IObjectWillChange[T] {
  
  var name: PropertyKey
  
  var `object`: T
  
  var `type`: remove
}
object ObjectType {
  
  inline def apply[T](name: PropertyKey, `object`: T): ObjectType[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("remove")
    __obj.asInstanceOf[ObjectType[T]]
  }
  
  extension [Self <: ObjectType[?], T](x: Self & ObjectType[T]) {
    
    inline def setName(value: PropertyKey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setType(value: remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
