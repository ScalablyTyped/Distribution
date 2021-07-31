package typings.mobx.anon

import typings.mobx.mobxStrings.delete
import typings.mobx.observablesetMod.ISetDidChange
import typings.mobx.observablesetMod.ObservableSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectOldValue[T]
  extends StObject
     with ISetDidChange[T] {
  
  var `object`: ObservableSet[T]
  
  var oldValue: T
  
  var `type`: delete
}
object ObjectOldValue {
  
  @scala.inline
  def apply[T](`object`: ObservableSet[T], oldValue: T): ObjectOldValue[T] = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[ObjectOldValue[T]]
  }
  
  @scala.inline
  implicit class ObjectOldValueMutableBuilder[Self <: ObjectOldValue[?], T] (val x: Self & ObjectOldValue[T]) extends AnyVal {
    
    @scala.inline
    def setObject(value: ObservableSet[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
