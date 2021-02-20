package typings.mobx.anon

import typings.mobx.mobxStrings.remove
import typings.mobx.observableobjectMod.IObjectWillChange
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectType[T] extends IObjectWillChange[T] {
  
  var name: PropertyKey = js.native
  
  var `object`: T = js.native
  
  var `type`: remove = js.native
}
object ObjectType {
  
  @scala.inline
  def apply[T](name: PropertyKey, `object`: T, `type`: remove): ObjectType[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectType[T]]
  }
  
  @scala.inline
  implicit class ObjectTypeMutableBuilder[Self <: ObjectType[_], T] (val x: Self with ObjectType[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: PropertyKey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
