package typings
package olLib.overlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanOptions extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* param0 */ scala.Double, scala.Double]] = js.undefined
}

object PanOptions {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    easing: /* param0 */ scala.Double => scala.Double = null
  ): PanOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    __obj.asInstanceOf[PanOptions]
  }
}

