package typings.mobx

import typings.mobx.libTypesObservablemapMod.IMapDidChange
import typings.mobx.libTypesObservablemapMod.ObservableMap
import typings.mobx.mobxStrings.add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add[K, V] extends IMapDidChange[K, V] {
  var name: K
  var newValue: V
  var `object`: ObservableMap[K, V]
  var `type`: add
}

object Anon_Add {
  @scala.inline
  def apply[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], `type`: add): Anon_Add[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Add[K, V]]
  }
}

