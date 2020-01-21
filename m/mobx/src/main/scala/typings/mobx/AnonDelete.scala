package typings.mobx

import typings.mobx.mobxStrings.delete
import typings.mobx.observablemapMod.IMapDidChange
import typings.mobx.observablemapMod.ObservableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelete[K, V] extends IMapDidChange[K, V] {
  var name: K
  var `object`: ObservableMap[K, V]
  var oldValue: V
  var `type`: delete
}

object AnonDelete {
  @scala.inline
  def apply[K, V](name: K, `object`: ObservableMap[K, V], oldValue: V, `type`: delete): AnonDelete[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelete[K, V]]
  }
}

