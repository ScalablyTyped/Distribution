package typings.momentRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludeEnd extends js.Object {
  var excludeEnd: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object AnonExcludeEnd {
  @scala.inline
  def apply(excludeEnd: js.UndefOr[Boolean] = js.undefined, step: Int | Double = null): AnonExcludeEnd = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeEnd)) __obj.updateDynamic("excludeEnd")(excludeEnd.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludeEnd]
  }
}

