package typings.mobx.anon

import typings.mobx.mobxStrings.update
import typings.mobx.observablemapMod.IMapDidChange
import typings.mobx.observablemapMod.ObservableMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name[K, V] extends IMapDidChange[K, V] {
  
  var name: K = js.native
  
  var newValue: V = js.native
  
  var `object`: ObservableMap[K, V] = js.native
  
  var oldValue: V = js.native
  
  var `type`: update = js.native
}
object Name {
  
  @scala.inline
  def apply[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], oldValue: V, `type`: update): Name[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[K, V]]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name[_, _], K, V] (val x: Self with (Name[K, V])) extends AnyVal {
    
    @scala.inline
    def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: V): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: ObservableMap[K, V]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: V): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
