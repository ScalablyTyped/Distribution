package typings.mobx

import typings.mobx.mobxStrings.add
import typings.mobx.observablemapMod.IMapDidChange
import typings.mobx.observablemapMod.ObservableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewValue[K, V] extends IMapDidChange[K, V] {
  var name: K
  var newValue: V
  var `object`: ObservableMap[K, V]
  var `type`: add
}

object AnonNewValue {
  @scala.inline
  def apply[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], `type`: add): AnonNewValue[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewValue[K, V]]
  }
}

