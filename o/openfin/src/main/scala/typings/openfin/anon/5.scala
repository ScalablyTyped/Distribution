package typings.openfin.anon

import typings.openfin.windowOptionMod.ContentNavigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `5` extends js.Object {
  var newVal: js.UndefOr[ContentNavigation] = js.undefined
  var oldVal: js.UndefOr[ContentNavigation] = js.undefined
}

object `5` {
  @scala.inline
  def apply(newVal: ContentNavigation = null, oldVal: ContentNavigation = null): `5` = {
    val __obj = js.Dynamic.literal()
    if (newVal != null) __obj.updateDynamic("newVal")(newVal.asInstanceOf[js.Any])
    if (oldVal != null) __obj.updateDynamic("oldVal")(oldVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
}

