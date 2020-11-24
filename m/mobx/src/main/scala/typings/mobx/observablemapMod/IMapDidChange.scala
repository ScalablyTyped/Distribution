package typings.mobx.observablemapMod

import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.delete
import typings.mobx.mobxStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mobx.anon.Name[K, V]
  - typings.mobx.anon.NewValue[K, V]
  - typings.mobx.anon.Object[K, V]
*/
trait IMapDidChange[K, V] extends js.Object
object IMapDidChange {
  
  @scala.inline
  def Name[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], oldValue: V, `type`: update): IMapDidChange[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapDidChange[K, V]]
  }
  
  @scala.inline
  def NewValue[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], `type`: add): IMapDidChange[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapDidChange[K, V]]
  }
  
  @scala.inline
  def Object[K, V](name: K, `object`: ObservableMap[K, V], oldValue: V, `type`: delete): IMapDidChange[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapDidChange[K, V]]
  }
}
