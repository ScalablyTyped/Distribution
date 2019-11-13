package typings.momentDashRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeEnd extends js.Object {
  var excludeEnd: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object Anon_ExcludeEnd {
  @scala.inline
  def apply(excludeEnd: js.UndefOr[Boolean] = js.undefined, step: Int | Double = null): Anon_ExcludeEnd = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeEnd)) __obj.updateDynamic("excludeEnd")(excludeEnd)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExcludeEnd]
  }
}

