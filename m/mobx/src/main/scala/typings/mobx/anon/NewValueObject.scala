package typings.mobx.anon

import typings.mobx.distTypesObservablesetMod.ISetWillChange
import typings.mobx.distTypesObservablesetMod.ObservableSet
import typings.mobx.mobxStrings.add
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValueObject[T]
  extends StObject
     with ISetWillChange[T] {
  
  var newValue: T
  
  var `object`: ObservableSet[T]
  
  var `type`: add
}
object NewValueObject {
  
  inline def apply[T](newValue: T, `object`: ObservableSet[T]): NewValueObject[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("add")
    __obj.asInstanceOf[NewValueObject[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewValueObject[?], T] (val x: Self & NewValueObject[T]) extends AnyVal {
    
    inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ObservableSet[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setType(value: add): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
