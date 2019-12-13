package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UseMouse extends js.Object {
  var useMouse: js.UndefOr[Boolean] = js.undefined
  var useTouch: js.UndefOr[Boolean] = js.undefined
}

object Anon_UseMouse {
  @scala.inline
  def apply(useMouse: js.UndefOr[Boolean] = js.undefined, useTouch: js.UndefOr[Boolean] = js.undefined): Anon_UseMouse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useMouse)) __obj.updateDynamic("useMouse")(useMouse.asInstanceOf[js.Any])
    if (!js.isUndefined(useTouch)) __obj.updateDynamic("useTouch")(useTouch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_UseMouse]
  }
}

