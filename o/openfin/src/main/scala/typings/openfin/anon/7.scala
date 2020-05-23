package typings.openfin.anon

import typings.openfin.windowOptionMod.ContentRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `7` extends js.Object {
  var newVal: js.UndefOr[ContentRedirect] = js.undefined
  var oldVal: js.UndefOr[ContentRedirect] = js.undefined
}

object `7` {
  @scala.inline
  def apply(newVal: ContentRedirect = null, oldVal: ContentRedirect = null): `7` = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
}

