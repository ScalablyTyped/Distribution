package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axis extends js.Object {
  var axis: js.UndefOr[String] = js.undefined
  var backfaceVisibility: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[String] = js.undefined
  var endAngle: js.UndefOr[String] = js.undefined
  var flipTarget: js.UndefOr[String] = js.undefined
  var persist: js.UndefOr[String] = js.undefined
  var perspective: js.UndefOr[String] = js.undefined
  var startAngle: js.UndefOr[String] = js.undefined
  var timingFunction: js.UndefOr[String] = js.undefined
  var transformOrigin: js.UndefOr[String] = js.undefined
}

object Axis {
  @scala.inline
  def apply(
    axis: String = null,
    backfaceVisibility: String = null,
    delay: String = null,
    duration: String = null,
    endAngle: String = null,
    flipTarget: String = null,
    persist: String = null,
    perspective: String = null,
    startAngle: String = null,
    timingFunction: String = null,
    transformOrigin: String = null
  ): Axis = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (backfaceVisibility != null) __obj.updateDynamic("backfaceVisibility")(backfaceVisibility.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (flipTarget != null) __obj.updateDynamic("flipTarget")(flipTarget.asInstanceOf[js.Any])
    if (persist != null) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (perspective != null) __obj.updateDynamic("perspective")(perspective.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction.asInstanceOf[js.Any])
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
}

