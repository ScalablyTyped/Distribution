package typings.momentDashRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeStart extends js.Object {
  var excludeStart: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object Anon_ExcludeStart {
  @scala.inline
  def apply(excludeStart: js.UndefOr[Boolean] = js.undefined, step: Int | Double = null): Anon_ExcludeStart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeStart)) __obj.updateDynamic("excludeStart")(excludeStart)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExcludeStart]
  }
}

