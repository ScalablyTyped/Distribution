package typings
package momentDashRangeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExclusiveStep extends js.Object {
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ExclusiveStep {
  @scala.inline
  def apply(exclusive: js.UndefOr[scala.Boolean] = js.undefined, step: scala.Int | scala.Double = null): Anon_ExclusiveStep = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExclusiveStep]
  }
}

