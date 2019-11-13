package typings.momentDashRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeEndExcludeStart extends js.Object {
  var excludeEnd: js.UndefOr[Boolean] = js.undefined
  var excludeStart: js.UndefOr[Boolean] = js.undefined
}

object Anon_ExcludeEndExcludeStart {
  @scala.inline
  def apply(excludeEnd: js.UndefOr[Boolean] = js.undefined, excludeStart: js.UndefOr[Boolean] = js.undefined): Anon_ExcludeEndExcludeStart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeEnd)) __obj.updateDynamic("excludeEnd")(excludeEnd)
    if (!js.isUndefined(excludeStart)) __obj.updateDynamic("excludeStart")(excludeStart)
    __obj.asInstanceOf[Anon_ExcludeEndExcludeStart]
  }
}

