package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Axis extends js.Object {
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var backfaceVisibility: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[java.lang.String] = js.undefined
  var endAngle: js.UndefOr[java.lang.String] = js.undefined
  var flipTarget: js.UndefOr[java.lang.String] = js.undefined
  var persist: js.UndefOr[java.lang.String] = js.undefined
  var perspective: js.UndefOr[java.lang.String] = js.undefined
  var startAngle: js.UndefOr[java.lang.String] = js.undefined
  var timingFunction: js.UndefOr[java.lang.String] = js.undefined
  var transformOrigin: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Axis {
  @scala.inline
  def apply(
    axis: java.lang.String = null,
    backfaceVisibility: java.lang.String = null,
    delay: java.lang.String = null,
    duration: java.lang.String = null,
    endAngle: java.lang.String = null,
    flipTarget: java.lang.String = null,
    persist: java.lang.String = null,
    perspective: java.lang.String = null,
    startAngle: java.lang.String = null,
    timingFunction: java.lang.String = null,
    transformOrigin: java.lang.String = null
  ): Anon_Axis = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (backfaceVisibility != null) __obj.updateDynamic("backfaceVisibility")(backfaceVisibility)
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle)
    if (flipTarget != null) __obj.updateDynamic("flipTarget")(flipTarget)
    if (persist != null) __obj.updateDynamic("persist")(persist)
    if (perspective != null) __obj.updateDynamic("perspective")(perspective)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle)
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction)
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin)
    __obj.asInstanceOf[Anon_Axis]
  }
}

