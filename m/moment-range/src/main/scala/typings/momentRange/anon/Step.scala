package typings.momentRange.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  var excludeStart: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object Step {
  @scala.inline
  def apply(excludeStart: js.UndefOr[Boolean] = js.undefined, step: js.UndefOr[Double] = js.undefined): Step = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeStart)) __obj.updateDynamic("excludeStart")(excludeStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
}

