package typings.momentRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExclusiveBoolean extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
}

object AnonExclusiveBoolean {
  @scala.inline
  def apply(exclusive: js.UndefOr[Boolean] = js.undefined): AnonExclusiveBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExclusiveBoolean]
  }
}

