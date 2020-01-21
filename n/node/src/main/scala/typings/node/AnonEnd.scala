package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: js.UndefOr[Boolean] = js.undefined
}

object AnonEnd {
  @scala.inline
  def apply(end: js.UndefOr[Boolean] = js.undefined): AnonEnd = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

