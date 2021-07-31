package typings.mobx.anon

import typings.mobx.mobxStrings.add
import typings.mobx.observablemapMod.IMapDidChange
import typings.mobx.observablemapMod.ObservableMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValue[K, V]
  extends StObject
     with IMapDidChange[K, V] {
  
  var name: K
  
  var newValue: V
  
  var `object`: ObservableMap[K, V]
  
  var `type`: add
}
object NewValue {
  
  @scala.inline
  def apply[K, V](name: K, newValue: V, `object`: ObservableMap[K, V]): NewValue[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("add")
    __obj.asInstanceOf[NewValue[K, V]]
  }
  
  @scala.inline
  implicit class NewValueMutableBuilder[Self <: NewValue[?, ?], K, V] (val x: Self & (NewValue[K, V])) extends AnyVal {
    
    @scala.inline
    def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: V): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: ObservableMap[K, V]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: add): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
