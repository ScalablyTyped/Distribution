package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelayDuration extends js.Object {
  var delay: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[java.lang.String] = js.undefined
  var endOpacity: js.UndefOr[scala.Double] = js.undefined
  var persist: js.UndefOr[java.lang.String] = js.undefined
  var startOpacity: js.UndefOr[scala.Double] = js.undefined
  var timingFunction: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DelayDuration {
  @scala.inline
  def apply(
    delay: java.lang.String = null,
    duration: java.lang.String = null,
    endOpacity: scala.Int | scala.Double = null,
    persist: java.lang.String = null,
    startOpacity: scala.Int | scala.Double = null,
    timingFunction: java.lang.String = null
  ): Anon_DelayDuration = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (endOpacity != null) __obj.updateDynamic("endOpacity")(endOpacity.asInstanceOf[js.Any])
    if (persist != null) __obj.updateDynamic("persist")(persist)
    if (startOpacity != null) __obj.updateDynamic("startOpacity")(startOpacity.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction)
    __obj.asInstanceOf[Anon_DelayDuration]
  }
}

