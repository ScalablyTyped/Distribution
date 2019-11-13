package typings.momentDashRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exclusive extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object Anon_Exclusive {
  @scala.inline
  def apply(exclusive: js.UndefOr[Boolean] = js.undefined, step: Int | Double = null): Anon_Exclusive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Exclusive]
  }
}

