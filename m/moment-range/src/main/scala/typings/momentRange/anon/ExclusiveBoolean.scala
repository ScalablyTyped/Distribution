package typings.momentRange.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExclusiveBoolean extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
}

object ExclusiveBoolean {
  @scala.inline
  def apply(exclusive: js.UndefOr[Boolean] = js.undefined): ExclusiveBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExclusiveBoolean]
  }
}

