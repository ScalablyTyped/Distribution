package typings.openfin.anon

import typings.openfin.shapesMod.ContextMenuSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `11` extends js.Object {
  var newVal: js.UndefOr[ContextMenuSettings] = js.undefined
  var oldVal: js.UndefOr[ContextMenuSettings] = js.undefined
}

object `11` {
  @scala.inline
  def apply(newVal: ContextMenuSettings = null, oldVal: ContextMenuSettings = null): `11` = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
}

