package typings.ol.viewMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var anchor: js.UndefOr[Coordinate] = js.undefined
  var complete: Boolean
  var duration: Double
  var sourceCenter: js.UndefOr[Coordinate] = js.undefined
  var sourceResolution: js.UndefOr[Double] = js.undefined
  var sourceRotation: js.UndefOr[Double] = js.undefined
  var start: Double
  var targetCenter: js.UndefOr[Coordinate] = js.undefined
  var targetResolution: js.UndefOr[Double] = js.undefined
  var targetRotation: js.UndefOr[Double] = js.undefined
  def callback(p0: Boolean): Unit
  def easing(p0: Double): Double
}

object Animation {
  @scala.inline
  def apply(
    callback: Boolean => Unit,
    complete: Boolean,
    duration: Double,
    easing: Double => Double,
    start: Double,
    anchor: Coordinate = null,
    sourceCenter: Coordinate = null,
    sourceResolution: Int | Double = null,
    sourceRotation: Int | Double = null,
    targetCenter: Coordinate = null,
    targetResolution: Int | Double = null,
    targetRotation: Int | Double = null
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

