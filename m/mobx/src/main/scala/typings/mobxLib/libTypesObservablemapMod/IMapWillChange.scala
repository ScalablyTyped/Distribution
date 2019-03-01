package typings
package mobxLib.libTypesObservablemapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapWillChange[K, V] extends js.Object {
  var name: K
  var newValue: js.UndefOr[V] = js.undefined
  var `object`: ObservableMap[K, V]
  var `type`: mobxLib.mobxLibStrings.update | mobxLib.mobxLibStrings.add | mobxLib.mobxLibStrings.delete
}

object IMapWillChange {
  @scala.inline
  def apply[K, V](
    name: K,
    `object`: ObservableMap[K, V],
    `type`: mobxLib.mobxLibStrings.update | mobxLib.mobxLibStrings.add | mobxLib.mobxLibStrings.delete,
    newValue: V = null
  ): IMapWillChange[K, V] = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapWillChange[K, V]]
  }
}

