package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxisDelay extends js.Object {
  var axis: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[String] = js.undefined
  var persist: js.UndefOr[String] = js.undefined
  var timingFunction: js.UndefOr[String] = js.undefined
  var transformOrigin: js.UndefOr[String] = js.undefined
}

object Anon_AxisDelay {
  @scala.inline
  def apply(
    axis: String = null,
    delay: String = null,
    duration: String = null,
    persist: String = null,
    timingFunction: String = null,
    transformOrigin: String = null
  ): Anon_AxisDelay = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (persist != null) __obj.updateDynamic("persist")(persist)
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction)
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin)
    __obj.asInstanceOf[Anon_AxisDelay]
  }
}

