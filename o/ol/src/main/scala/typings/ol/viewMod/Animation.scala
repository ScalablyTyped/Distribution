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
    sourceResolution: js.UndefOr[Double] = js.undefined,
    sourceRotation: js.UndefOr[Double] = js.undefined,
    targetCenter: Coordinate = null,
    targetResolution: js.UndefOr[Double] = js.undefined,
    targetRotation: js.UndefOr[Double] = js.undefined
  ): Animation = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), complete = complete.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = js.Any.fromFunction1(easing), start = start.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (sourceCenter != null) __obj.updateDynamic("sourceCenter")(sourceCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceResolution)) __obj.updateDynamic("sourceResolution")(sourceResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceRotation)) __obj.updateDynamic("sourceRotation")(sourceRotation.get.asInstanceOf[js.Any])
    if (targetCenter != null) __obj.updateDynamic("targetCenter")(targetCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(targetResolution)) __obj.updateDynamic("targetResolution")(targetResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetRotation)) __obj.updateDynamic("targetRotation")(targetRotation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}

