package typings
package openlayersLib.openlayersMod.olxNs.animationNs

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
  var anchor: js.UndefOr[openlayersLib.openlayersMod.Coordinate] = js.undefined
  var center: js.UndefOr[openlayersLib.openlayersMod.Coordinate] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ scala.Double, scala.Double]] = js.undefined
  var resolution: js.UndefOr[scala.Double] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object AnimateOptions {
  @scala.inline
  def apply(
    anchor: openlayersLib.openlayersMod.Coordinate = null,
    center: openlayersLib.openlayersMod.Coordinate = null,
    duration: scala.Int | scala.Double = null,
    easing: /* t */ scala.Double => scala.Double = null,
    resolution: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null,
    zoom: scala.Int | scala.Double = null
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

