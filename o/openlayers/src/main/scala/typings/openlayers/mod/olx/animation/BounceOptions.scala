package typings.openlayers.mod.olx.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
  var resolution: Double
  var start: js.UndefOr[Double] = js.undefined
}

object BounceOptions {
  @scala.inline
  def apply(
    resolution: Double,
    duration: js.UndefOr[Double] = js.undefined,
    easing: /* t */ Double => Double = null,
    start: js.UndefOr[Double] = js.undefined
  ): BounceOptions = {
    val __obj = js.Dynamic.literal(resolution = resolution.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceOptions]
  }
}

