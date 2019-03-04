package typings
package openlayersLib.openlayersMod.olxNs.animationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptions extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ scala.Double, scala.Double]] = js.undefined
  var resolution: scala.Double
  var start: js.UndefOr[scala.Double] = js.undefined
}

object ZoomOptions {
  @scala.inline
  def apply(
    resolution: scala.Double,
    duration: scala.Int | scala.Double = null,
    easing: js.Function1[/* t */ scala.Double, scala.Double] = null,
    start: scala.Int | scala.Double = null
  ): ZoomOptions = {
    val __obj = js.Dynamic.literal(resolution = resolution)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptions]
  }
}

