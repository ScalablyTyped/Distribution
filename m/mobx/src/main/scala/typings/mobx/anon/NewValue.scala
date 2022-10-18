package typings.mobx.anon

import typings.mobx.distTypesObservablemapMod.ObservableMap
import typings.mobx.mobxStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValue[K, V] extends StObject {
  
  var name: K
  
  var newValue: V
  
  var `object`: ObservableMap[K, V]
  
  var oldValue: V
  
  var `type`: update
}
object NewValue {
  
  inline def apply[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], oldValue: V): NewValue[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("update")
    __obj.asInstanceOf[NewValue[K, V]]
  }
  
  extension [Self <: NewValue[?, ?], K, V](x: Self & (NewValue[K, V])) {
    
    inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: V): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ObservableMap[K, V]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: V): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
