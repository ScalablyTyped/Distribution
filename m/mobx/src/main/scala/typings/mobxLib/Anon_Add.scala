package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add[K, V]
  extends mobxLib.libTypesObservablemapMod.IMapDidChange[K, V] {
  var name: K
  var newValue: V
  var `object`: mobxLib.libTypesObservablemapMod.ObservableMap[K, V]
  var `type`: mobxLib.mobxLibStrings.add
}

object Anon_Add {
  @scala.inline
  def apply[K, V](
    name: K,
    newValue: V,
    `object`: mobxLib.libTypesObservablemapMod.ObservableMap[K, V],
    `type`: mobxLib.mobxLibStrings.add
  ): Anon_Add[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Add[K, V]]
  }
}

