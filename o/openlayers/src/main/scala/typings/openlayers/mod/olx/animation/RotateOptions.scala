package typings.openlayers.mod.olx.animation

import typings.openlayers.mod.Coordinate_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateOptions extends js.Object {
  var anchor: js.UndefOr[Coordinate_] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object RotateOptions {
  @scala.inline
  def apply(
    anchor: Coordinate_ = null,
    duration: js.UndefOr[Double] = js.undefined,
    easing: /* t */ Double => Double = null,
    rotation: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): RotateOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateOptions]
  }
}

