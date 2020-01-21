package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUseMouse extends js.Object {
  var useMouse: js.UndefOr[Boolean] = js.undefined
  var useTouch: js.UndefOr[Boolean] = js.undefined
}

object AnonUseMouse {
  @scala.inline
  def apply(useMouse: js.UndefOr[Boolean] = js.undefined, useTouch: js.UndefOr[Boolean] = js.undefined): AnonUseMouse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useMouse)) __obj.updateDynamic("useMouse")(useMouse.asInstanceOf[js.Any])
    if (!js.isUndefined(useTouch)) __obj.updateDynamic("useTouch")(useTouch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUseMouse]
  }
}

