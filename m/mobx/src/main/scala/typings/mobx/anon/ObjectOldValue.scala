package typings.mobx.anon

import typings.mobx.mobxStrings.delete
import typings.mobx.observablesetMod.ISetDidChange
import typings.mobx.observablesetMod.ObservableSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectOldValue[T] extends ISetDidChange[T] {
  
  var `object`: ObservableSet[T] = js.native
  
  var oldValue: T = js.native
  
  var `type`: delete = js.native
}
object ObjectOldValue {
  
  @scala.inline
  def apply[T](`object`: ObservableSet[T], oldValue: T, `type`: delete): ObjectOldValue[T] = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectOldValue[T]]
  }
  
  @scala.inline
  implicit class ObjectOldValueMutableBuilder[Self <: ObjectOldValue[_], T] (val x: Self with ObjectOldValue[T]) extends AnyVal {
    
    @scala.inline
    def setObject(value: ObservableSet[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
