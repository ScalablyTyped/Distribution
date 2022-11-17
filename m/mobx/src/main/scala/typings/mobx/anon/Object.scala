package typings.mobx.anon

import typings.mobx.distTypesObservablemapMod.ObservableMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Object[K, V] extends StObject {
  
  var name: K
  
  var newValue: V
  
  var `object`: ObservableMap[K, V]
  
  var `type`: "add"
}
object Object {
  
  inline def apply[K, V](name: K, newValue: V, `object`: ObservableMap[K, V]): Object[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("add")
    __obj.asInstanceOf[Object[K, V]]
  }
  
  extension [Self <: Object[?, ?], K, V](x: Self & (Object[K, V])) {
    
    inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: V): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ObservableMap[K, V]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setType(value: "add"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
