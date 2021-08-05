package typings.mobx.anon

import typings.mobx.mobxStrings.delete
import typings.mobx.observablemapMod.IMapDidChange
import typings.mobx.observablemapMod.ObservableMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Object[K, V]
  extends StObject
     with IMapDidChange[K, V] {
  
  var name: K
  
  var `object`: ObservableMap[K, V]
  
  var oldValue: V
  
  var `type`: delete
}
object Object {
  
  inline def apply[K, V](name: K, `object`: ObservableMap[K, V], oldValue: V): Object[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[Object[K, V]]
  }
  
  extension [Self <: Object[?, ?], K, V](x: Self & (Object[K, V])) {
    
    inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ObservableMap[K, V]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: V): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
