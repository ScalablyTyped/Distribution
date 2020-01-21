package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPad extends js.Object {
  var pad: js.UndefOr[js.Any] = js.undefined
}

object AnonPad {
  @scala.inline
  def apply(pad: js.Any = null): AnonPad = {
    val __obj = js.Dynamic.literal()
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPad]
  }
}

