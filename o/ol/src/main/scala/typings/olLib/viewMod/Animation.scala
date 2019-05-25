package typings
package olLib.viewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var anchor: js.UndefOr[olLib.coordinateMod.Coordinate] = js.undefined
  var complete: scala.Boolean
  var duration: scala.Double
  var sourceCenter: js.UndefOr[olLib.coordinateMod.Coordinate] = js.undefined
  var sourceResolution: js.UndefOr[scala.Double] = js.undefined
  var sourceRotation: js.UndefOr[scala.Double] = js.undefined
  var start: scala.Double
  var targetCenter: js.UndefOr[olLib.coordinateMod.Coordinate] = js.undefined
  var targetResolution: js.UndefOr[scala.Double] = js.undefined
  var targetRotation: js.UndefOr[scala.Double] = js.undefined
  def callback(param0: scala.Boolean): scala.Unit
  def easing(param0: scala.Double): scala.Double
}

object Animation {
  @scala.inline
  def apply(
    callback: scala.Boolean => scala.Unit,
    complete: scala.Boolean,
    duration: scala.Double,
    easing: scala.Double => scala.Double,
    start: scala.Double,
    anchor: olLib.coordinateMod.Coordinate = null,
    sourceCenter: olLib.coordinateMod.Coordinate = null,
    sourceResolution: scala.Int | scala.Double = null,
    sourceRotation: scala.Int | scala.Double = null,
    targetCenter: olLib.coordinateMod.Coordinate = null,
    targetResolution: scala.Int | scala.Double = null,
    targetRotation: scala.Int | scala.Double = null
  ): Animation = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), complete = complete, duration = duration, easing = js.Any.fromFunction1(easing), start = start)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (sourceCenter != null) __obj.updateDynamic("sourceCenter")(sourceCenter)
    if (sourceResolution != null) __obj.updateDynamic("sourceResolution")(sourceResolution.asInstanceOf[js.Any])
    if (sourceRotation != null) __obj.updateDynamic("sourceRotation")(sourceRotation.asInstanceOf[js.Any])
    if (targetCenter != null) __obj.updateDynamic("targetCenter")(targetCenter)
    if (targetResolution != null) __obj.updateDynamic("targetResolution")(targetResolution.asInstanceOf[js.Any])
    if (targetRotation != null) __obj.updateDynamic("targetRotation")(targetRotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}

