package typings.mobx.anon

import typings.mobx.distTypesObservablesetMod.ISetWillChange
import typings.mobx.distTypesObservablesetMod.ObservableSet
import typings.mobx.mobxStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectOldValue[T]
  extends StObject
     with ISetWillChange[T] {
  
  var `object`: ObservableSet[T]
  
  var oldValue: T
  
  var `type`: delete
}
object ObjectOldValue {
  
  inline def apply[T](`object`: ObservableSet[T], oldValue: T): ObjectOldValue[T] = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[ObjectOldValue[T]]
  }
  
  extension [Self <: ObjectOldValue[?], T](x: Self & ObjectOldValue[T]) {
    
    inline def setObject(value: ObservableSet[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
