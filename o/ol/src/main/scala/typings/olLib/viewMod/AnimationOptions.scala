package typings
package olLib.viewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  var anchor: js.UndefOr[olLib.coordinateMod.Coordinate] = js.undefined
  var center: js.UndefOr[olLib.coordinateMod.Coordinate] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* p0 */ scala.Double, scala.Double]] = js.undefined
  var resolution: js.UndefOr[scala.Double] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    anchor: olLib.coordinateMod.Coordinate = null,
    center: olLib.coordinateMod.Coordinate = null,
    duration: scala.Int | scala.Double = null,
    easing: /* p0 */ scala.Double => scala.Double = null,
    resolution: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null,
    zoom: scala.Int | scala.Double = null
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (center != null) __obj.updateDynamic("center")(center)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
}

