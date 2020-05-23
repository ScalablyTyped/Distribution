package typings.momentRange.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludeStart extends js.Object {
  var excludeEnd: js.UndefOr[Boolean] = js.undefined
  var excludeStart: js.UndefOr[Boolean] = js.undefined
}

object ExcludeStart {
  @scala.inline
  def apply(excludeEnd: js.UndefOr[Boolean] = js.undefined, excludeStart: js.UndefOr[Boolean] = js.undefined): ExcludeStart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeEnd)) __obj.updateDynamic("excludeEnd")(excludeEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeStart)) __obj.updateDynamic("excludeStart")(excludeStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeStart]
  }
}

