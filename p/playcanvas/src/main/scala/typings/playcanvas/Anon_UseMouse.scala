package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UseMouse extends js.Object {
  var useMouse: js.UndefOr[js.Any] = js.undefined
  var useTouch: js.UndefOr[js.Any] = js.undefined
}

object Anon_UseMouse {
  @scala.inline
  def apply(useMouse: js.Any = null, useTouch: js.Any = null): Anon_UseMouse = {
    val __obj = js.Dynamic.literal()
    if (useMouse != null) __obj.updateDynamic("useMouse")(useMouse.asInstanceOf[js.Any])
    if (useTouch != null) __obj.updateDynamic("useTouch")(useTouch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_UseMouse]
  }
}

