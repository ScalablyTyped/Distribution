package typings.openlayers.openlayersMod.olx.animation

import typings.openlayers.openlayersMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Animation options. Multiple animations can be run in series by passing
  * multiple options objects. To run multiple animations in parallel, call
  * the method multiple times. An optional callback can be provided as a
  * final argument. The callback will be called with a boolean indicating
  * whether the animation completed without being cancelled.
  */
trait AnimateOptions extends js.Object {
  var anchor: js.UndefOr[Coordinate] = js.undefined
  var center: js.UndefOr[Coordinate] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object AnimateOptions {
  @scala.inline
  def apply(
    anchor: Coordinate = null,
    center: Coordinate = null,
    duration: Int | Double = null,
    easing: /* t */ Double => Double = null,
    resolution: Int | Double = null,
    rotation: Int | Double = null,
    zoom: Int | Double = null
  ): AnimateOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (center != null) __obj.updateDynamic("center")(center)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimateOptions]
  }
}

