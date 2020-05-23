package typings.openlayers.mod.olx.animation

import typings.openlayers.mod.Coordinate_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
  var source: Coordinate_
  var start: js.UndefOr[Double] = js.undefined
}

object PanOptions {
  @scala.inline
  def apply(
    source: Coordinate_,
    duration: js.UndefOr[Double] = js.undefined,
    easing: /* t */ Double => Double = null,
    start: js.UndefOr[Double] = js.undefined
  ): PanOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanOptions]
  }
}

