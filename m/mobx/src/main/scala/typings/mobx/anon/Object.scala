package typings.mobx.anon

import typings.mobx.mobxStrings.delete
import typings.mobx.observablemapMod.IMapDidChange
import typings.mobx.observablemapMod.ObservableMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object[K, V] extends IMapDidChange[K, V] {
  
  var name: K = js.native
  
  var `object`: ObservableMap[K, V] = js.native
  
  var oldValue: V = js.native
  
  var `type`: delete = js.native
}
object Object {
  
  @scala.inline
  def apply[K, V](name: K, `object`: ObservableMap[K, V], oldValue: V, `type`: delete): Object[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object[K, V]]
  }
  
  @scala.inline
  implicit class ObjectMutableBuilder[Self <: Object[_, _], K, V] (val x: Self with (Object[K, V])) extends AnyVal {
    
    @scala.inline
    def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: ObservableMap[K, V]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: V): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
