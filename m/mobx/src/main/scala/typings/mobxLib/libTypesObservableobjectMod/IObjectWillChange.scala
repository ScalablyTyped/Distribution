package typings
package mobxLib.libTypesObservableobjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectWillChange extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var newValue: js.UndefOr[js.Any] = js.undefined
  var `object`: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[
    mobxLib.mobxLibStrings.add | mobxLib.mobxLibStrings.remove | mobxLib.mobxLibStrings.update
  ] = js.undefined
}

object IObjectWillChange {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    newValue: js.Any = null,
    `object`: js.Any = null,
    `type`: mobxLib.mobxLibStrings.update | mobxLib.mobxLibStrings.add = null
  ): IObjectWillChange = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWillChange]
  }
}

