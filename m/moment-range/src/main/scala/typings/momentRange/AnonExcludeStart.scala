package typings.momentRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludeStart extends js.Object {
  var excludeStart: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object AnonExcludeStart {
  @scala.inline
  def apply(excludeStart: js.UndefOr[Boolean] = js.undefined, step: Int | Double = null): AnonExcludeStart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeStart)) __obj.updateDynamic("excludeStart")(excludeStart.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludeStart]
  }
}

