package typings.mobx.libTypesObservablemapMod

import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.delete
import typings.mobx.mobxStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapWillChange[K, V] extends js.Object {
  var name: K
  var newValue: js.UndefOr[V] = js.undefined
  var `object`: ObservableMap[K, V]
  var `type`: update | add | delete
}

object IMapWillChange {
  @scala.inline
  def apply[K, V](name: K, `object`: ObservableMap[K, V], `type`: update | add | delete, newValue: V = null): IMapWillChange[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapWillChange[K, V]]
  }
}

