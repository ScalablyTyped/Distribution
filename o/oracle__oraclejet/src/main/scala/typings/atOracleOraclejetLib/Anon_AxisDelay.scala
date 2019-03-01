package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxisDelay extends js.Object {
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[java.lang.String] = js.undefined
  var persist: js.UndefOr[java.lang.String] = js.undefined
  var timingFunction: js.UndefOr[java.lang.String] = js.undefined
  var transformOrigin: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AxisDelay {
  @scala.inline
  def apply(
    axis: java.lang.String = null,
    delay: java.lang.String = null,
    duration: java.lang.String = null,
    persist: java.lang.String = null,
    timingFunction: java.lang.String = null,
    transformOrigin: java.lang.String = null
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

