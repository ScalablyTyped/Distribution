package typings.mobx.anon

import typings.mobx.mobxStrings.add
import typings.mobx.observablesetMod.ISetDidChange
import typings.mobx.observablesetMod.ObservableSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValueObject[T]
  extends StObject
     with ISetDidChange[T] {
  
  var newValue: T
  
  var `object`: ObservableSet[T]
  
  var `type`: add
}
object NewValueObject {
  
  @scala.inline
  def apply[T](newValue: T, `object`: ObservableSet[T]): NewValueObject[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("add")
    __obj.asInstanceOf[NewValueObject[T]]
  }
  
  @scala.inline
  implicit class NewValueObjectMutableBuilder[Self <: NewValueObject[?], T] (val x: Self & NewValueObject[T]) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: ObservableSet[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: add): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
