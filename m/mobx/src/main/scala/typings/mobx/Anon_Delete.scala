package typings.mobx

import typings.mobx.libTypesObservablemapMod.IMapDidChange
import typings.mobx.libTypesObservablemapMod.ObservableMap
import typings.mobx.mobxStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delete[K, V] extends IMapDidChange[K, V] {
  var name: K
  var `object`: ObservableMap[K, V]
  var oldValue: V
  var `type`: delete
}

object Anon_Delete {
  @scala.inline
  def apply[K, V](name: K, `object`: ObservableMap[K, V], oldValue: V, `type`: delete): Anon_Delete[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delete[K, V]]
  }
}

