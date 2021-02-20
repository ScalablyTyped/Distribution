package typings.mobx.anon

import typings.mobx.mobxStrings.add
import typings.mobx.observablesetMod.ISetWillChange
import typings.mobx.observablesetMod.ObservableSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewValueObjectType[T] extends ISetWillChange[T] {
  
  var newValue: T = js.native
  
  var `object`: ObservableSet[T] = js.native
  
  var `type`: add = js.native
}
object NewValueObjectType {
  
  @scala.inline
  def apply[T](newValue: T, `object`: ObservableSet[T], `type`: add): NewValueObjectType[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueObjectType[T]]
  }
  
  @scala.inline
  implicit class NewValueObjectTypeMutableBuilder[Self <: NewValueObjectType[_], T] (val x: Self with NewValueObjectType[T]) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: ObservableSet[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: add): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
