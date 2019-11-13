package typings.momentDashRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExclusiveBoolean extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
}

object Anon_ExclusiveBoolean {
  @scala.inline
  def apply(exclusive: js.UndefOr[Boolean] = js.undefined): Anon_ExclusiveBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    __obj.asInstanceOf[Anon_ExclusiveBoolean]
  }
}

