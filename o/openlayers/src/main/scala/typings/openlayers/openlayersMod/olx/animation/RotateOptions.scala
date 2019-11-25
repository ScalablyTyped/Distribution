package typings.openlayers.openlayersMod.olx.animation

import typings.openlayers.openlayersMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateOptions extends js.Object {
  var anchor: js.UndefOr[Coordinate] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object RotateOptions {
  @scala.inline
  def apply(
    anchor: Coordinate = null,
    duration: Int | Double = null,
    easing: /* t */ Double => Double = null,
    rotation: Int | Double = null,
    start: Int | Double = null
  ): RotateOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateOptions]
  }
}

