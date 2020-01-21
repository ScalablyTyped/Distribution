package typings.natural

import typings.natural.naturalBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  var search: js.UndefOr[`false`] = js.undefined
}

object AnonFalse {
  @scala.inline
  def apply(search: `false` = null): AnonFalse = {
    val __obj = js.Dynamic.literal()
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}

