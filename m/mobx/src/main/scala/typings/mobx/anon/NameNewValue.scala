package typings.mobx.anon

import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.update
import typings.mobx.observableobjectMod.IObjectWillChange
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameNewValue[T] extends IObjectWillChange[T] {
  
  var name: PropertyKey = js.native
  
  var newValue: js.Any = js.native
  
  var `object`: T = js.native
  
  var `type`: update | add = js.native
}
object NameNewValue {
  
  @scala.inline
  def apply[T](name: PropertyKey, newValue: js.Any, `object`: T, `type`: update | add): NameNewValue[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameNewValue[T]]
  }
  
  @scala.inline
  implicit class NameNewValueMutableBuilder[Self <: NameNewValue[_], T] (val x: Self with NameNewValue[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: PropertyKey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: update | add): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
