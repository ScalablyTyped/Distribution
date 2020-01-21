package typings.popperJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends js.Object {
  var offset: js.UndefOr[Double | String] = js.undefined
}

object AnonOffset {
  @scala.inline
  def apply(offset: Double | String = null): AnonOffset = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffset]
  }
}

