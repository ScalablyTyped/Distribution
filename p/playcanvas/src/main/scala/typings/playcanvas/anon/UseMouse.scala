package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseMouse extends js.Object {
  var useMouse: js.UndefOr[Boolean] = js.undefined
  var useTouch: js.UndefOr[Boolean] = js.undefined
  var useXr: js.UndefOr[Boolean] = js.undefined
}

object UseMouse {
  @scala.inline
  def apply(
    useMouse: js.UndefOr[Boolean] = js.undefined,
    useTouch: js.UndefOr[Boolean] = js.undefined,
    useXr: js.UndefOr[Boolean] = js.undefined
  ): UseMouse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useMouse)) __obj.updateDynamic("useMouse")(useMouse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTouch)) __obj.updateDynamic("useTouch")(useTouch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useXr)) __obj.updateDynamic("useXr")(useXr.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMouse]
  }
}

