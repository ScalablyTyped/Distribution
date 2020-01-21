package typings.mobx.observablemapMod

import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.delete
import typings.mobx.mobxStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mobx.AnonName[K, V]
  - typings.mobx.AnonAdd[K, V]
  - typings.mobx.AnonDelete[K, V]
*/
trait IMapDidChange[K, V] extends js.Object

object IMapDidChange {
  @scala.inline
  def AnonName[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], oldValue: V, `type`: update): IMapDidChange[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapDidChange[K, V]]
  }
  @scala.inline
  def AnonAdd[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], `type`: add): IMapDidChange[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapDidChange[K, V]]
  }
  @scala.inline
  def AnonDelete[K, V](name: K, `object`: ObservableMap[K, V], oldValue: V, `type`: delete): IMapDidChange[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapDidChange[K, V]]
  }
}

