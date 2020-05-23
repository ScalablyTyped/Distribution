package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pad extends js.Object {
  var pad: js.UndefOr[js.Any] = js.undefined
}

object Pad {
  @scala.inline
  def apply(pad: js.Any = null): Pad = {
    val __obj = js.Dynamic.literal()
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pad]
  }
}

