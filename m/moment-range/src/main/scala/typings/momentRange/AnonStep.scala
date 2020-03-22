package typings.momentRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStep extends js.Object {
  var excludeStart: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object AnonStep {
  @scala.inline
  def apply(excludeStart: js.UndefOr[Boolean] = js.undefined, step: Int | Double = null): AnonStep = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeStart)) __obj.updateDynamic("excludeStart")(excludeStart.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStep]
  }
}

