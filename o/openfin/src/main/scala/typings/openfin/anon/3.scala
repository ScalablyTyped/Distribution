package typings.openfin.anon

import typings.openfin.windowOptionMod.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  var newVal: js.UndefOr[Api] = js.undefined
  var oldVal: js.UndefOr[Api] = js.undefined
}

object `3` {
  @scala.inline
  def apply(newVal: Api = null, oldVal: Api = null): `3` = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
}

