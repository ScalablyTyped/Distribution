package typings
package mobxLib.libTypesObservablemapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapDidChange[K, V] extends js.Object {
  var name: js.UndefOr[K] = js.undefined
  var newValue: js.UndefOr[V] = js.undefined
  var `object`: js.UndefOr[ObservableMap[K, V]] = js.undefined
  var oldValue: js.UndefOr[V] = js.undefined
  var `type`: js.UndefOr[
    mobxLib.mobxLibStrings.add | mobxLib.mobxLibStrings.delete | mobxLib.mobxLibStrings.update
  ] = js.undefined
}

object IMapDidChange {
  @scala.inline
  def apply[K, V](
    name: K = null,
    newValue: V = null,
    `object`: ObservableMap[K, V] = null,
    oldValue: V = null,
    `type`: mobxLib.mobxLibStrings.update = null
  ): IMapDidChange[K, V] = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IMapDidChange[K, V]]
  }
}

