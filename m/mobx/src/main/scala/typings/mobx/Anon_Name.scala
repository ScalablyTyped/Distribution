package typings.mobx

import typings.mobx.libTypesObservablemapMod.IMapDidChange
import typings.mobx.libTypesObservablemapMod.ObservableMap
import typings.mobx.mobxStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name[K, V] extends IMapDidChange[K, V] {
  var name: K
  var newValue: V
  var `object`: ObservableMap[K, V]
  var oldValue: V
  var `type`: update
}

object Anon_Name {
  @scala.inline
  def apply[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], oldValue: V, `type`: update): Anon_Name[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name[K, V]]
  }
}

