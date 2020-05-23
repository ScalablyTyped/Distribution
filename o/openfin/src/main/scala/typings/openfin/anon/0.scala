package typings.openfin.anon

import typings.openfin.shapesMod.Hotkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var newVal: js.UndefOr[js.Array[Hotkey]] = js.undefined
  var oldVal: js.UndefOr[js.Array[Hotkey]] = js.undefined
}

object `0` {
  @scala.inline
  def apply(newVal: js.Array[Hotkey] = null, oldVal: js.Array[Hotkey] = null): `0` = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

