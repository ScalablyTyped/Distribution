package typings.openlayers.openlayersMod.olx.animation

import typings.openlayers.openlayersMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
  var source: Coordinate
  var start: js.UndefOr[Double] = js.undefined
}

object PanOptions {
  @scala.inline
  def apply(
    source: Coordinate,
    duration: Int | Double = null,
    easing: /* t */ Double => Double = null,
    start: Int | Double = null
  ): PanOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanOptions]
  }
}

