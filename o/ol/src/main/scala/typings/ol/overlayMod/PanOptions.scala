package typings.ol.overlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* p0 */ Double, Double]] = js.undefined
}

object PanOptions {
  @scala.inline
  def apply(duration: Int | Double = null, easing: /* p0 */ Double => Double = null): PanOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    __obj.asInstanceOf[PanOptions]
  }
}

