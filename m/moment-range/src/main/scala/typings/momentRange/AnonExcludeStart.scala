package typings.momentRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludeStart extends js.Object {
  var excludeEnd: js.UndefOr[Boolean] = js.undefined
  var excludeStart: js.UndefOr[Boolean] = js.undefined
}

object AnonExcludeStart {
  @scala.inline
  def apply(excludeEnd: js.UndefOr[Boolean] = js.undefined, excludeStart: js.UndefOr[Boolean] = js.undefined): AnonExcludeStart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeEnd)) __obj.updateDynamic("excludeEnd")(excludeEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeStart)) __obj.updateDynamic("excludeStart")(excludeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludeStart]
  }
}

