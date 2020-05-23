package typings.openfin.anon

import typings.openfin.windowOptionMod.CustomRequestHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `8` extends js.Object {
  var newVal: js.UndefOr[js.Array[CustomRequestHeaders]] = js.undefined
  var oldVal: js.UndefOr[js.Array[CustomRequestHeaders]] = js.undefined
}

object `8` {
  @scala.inline
  def apply(newVal: js.Array[CustomRequestHeaders] = null, oldVal: js.Array[CustomRequestHeaders] = null): `8` = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
}

