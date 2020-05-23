package typings.mobx.anon

import typings.mobx.mobxStrings.add
import typings.mobx.observablemapMod.IMapDidChange
import typings.mobx.observablemapMod.ObservableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewValue[K, V] extends IMapDidChange[K, V] {
  var name: K
  var newValue: V
  var `object`: ObservableMap[K, V]
  var `type`: add
}

object NewValue {
  @scala.inline
  def apply[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], `type`: add): NewValue[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValue[K, V]]
  }
}

