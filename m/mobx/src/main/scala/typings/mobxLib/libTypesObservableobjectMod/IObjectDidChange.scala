package typings
package mobxLib.libTypesObservableobjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectDidChange extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var newValue: js.UndefOr[js.Any] = js.undefined
  var `object`: js.UndefOr[js.Any] = js.undefined
  var oldValue: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[
    mobxLib.mobxLibStrings.add | mobxLib.mobxLibStrings.remove | mobxLib.mobxLibStrings.update
  ] = js.undefined
}

object IObjectDidChange {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    newValue: js.Any = null,
    `object`: js.Any = null,
    oldValue: js.Any = null,
    `type`: mobxLib.mobxLibStrings.add = null
  ): IObjectDidChange = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IObjectDidChange]
  }
}

