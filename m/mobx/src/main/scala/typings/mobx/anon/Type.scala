package typings.mobx.anon

import typings.mobx.mobxStrings.add
import typings.mobx.observableobjectMod.IObjectDidChange
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type[T] extends IObjectDidChange[T] {
  
  var name: PropertyKey = js.native
  
  var newValue: js.Any = js.native
  
  var `object`: T = js.native
  
  var `type`: add = js.native
}
object Type {
  
  @scala.inline
  def apply[T](name: PropertyKey, newValue: js.Any, `object`: T, `type`: add): Type[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[T]]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type[_], T] (val x: Self with Type[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: PropertyKey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: add): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
