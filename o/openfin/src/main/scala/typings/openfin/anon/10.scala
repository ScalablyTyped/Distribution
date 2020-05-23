package typings.openfin.anon

import typings.openfin.windowOptionMod.ResizeRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `10` extends js.Object {
  var newVal: js.UndefOr[ResizeRegion] = js.undefined
  var oldVal: js.UndefOr[ResizeRegion] = js.undefined
}

object `10` {
  @scala.inline
  def apply(newVal: ResizeRegion = null, oldVal: ResizeRegion = null): `10` = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
}

