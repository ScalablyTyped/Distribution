package typings.mobx.anon

import typings.mobx.distTypesObservablemapMod.ObservableMap
import typings.mobx.mobxStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldValue[K, V] extends StObject {
  
  var name: K
  
  var `object`: ObservableMap[K, V]
  
  var oldValue: V
  
  var `type`: delete
}
object OldValue {
  
  inline def apply[K, V](name: K, `object`: ObservableMap[K, V], oldValue: V): OldValue[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[OldValue[K, V]]
  }
  
  extension [Self <: OldValue[?, ?], K, V](x: Self & (OldValue[K, V])) {
    
    inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ObservableMap[K, V]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: V): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
