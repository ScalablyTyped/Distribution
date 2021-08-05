package typings.mobx.anon

import typings.mobx.mobxStrings.delete
import typings.mobx.observablesetMod.ISetWillChange
import typings.mobx.observablesetMod.ObservableSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldValueType[T]
  extends StObject
     with ISetWillChange[T] {
  
  var `object`: ObservableSet[T]
  
  var oldValue: T
  
  var `type`: delete
}
object OldValueType {
  
  inline def apply[T](`object`: ObservableSet[T], oldValue: T): OldValueType[T] = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[OldValueType[T]]
  }
  
  extension [Self <: OldValueType[?], T](x: Self & OldValueType[T]) {
    
    inline def setObject(value: ObservableSet[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
