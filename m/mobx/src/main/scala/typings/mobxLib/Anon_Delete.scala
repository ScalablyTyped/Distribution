package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delete[K, V]
  extends mobxLib.libTypesObservablemapMod.IMapDidChange[K, V] {
  var name: K
  var `object`: mobxLib.libTypesObservablemapMod.ObservableMap[K, V]
  var oldValue: V
  var `type`: mobxLib.mobxLibStrings.delete
}

object Anon_Delete {
  @scala.inline
  def apply[K, V](
    name: K,
    `object`: mobxLib.libTypesObservablemapMod.ObservableMap[K, V],
    oldValue: V,
    `type`: mobxLib.mobxLibStrings.delete
  ): Anon_Delete[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Delete[K, V]]
  }
}

