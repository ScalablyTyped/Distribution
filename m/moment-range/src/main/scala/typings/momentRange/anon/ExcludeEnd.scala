package typings.momentRange.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludeEnd extends js.Object {
  var excludeEnd: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object ExcludeEnd {
  @scala.inline
  def apply(excludeEnd: js.UndefOr[Boolean] = js.undefined, step: js.UndefOr[Double] = js.undefined): ExcludeEnd = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeEnd)) __obj.updateDynamic("excludeEnd")(excludeEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeEnd]
  }
}

