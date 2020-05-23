package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreventDefault extends js.Object {
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
}

object PreventDefault {
  @scala.inline
  def apply(
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    stopPropagation: js.UndefOr[Boolean] = js.undefined
  ): PreventDefault = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreventDefault]
  }
}

