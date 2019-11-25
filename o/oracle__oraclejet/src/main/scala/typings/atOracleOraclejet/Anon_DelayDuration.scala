package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelayDuration extends js.Object {
  var delay: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[String] = js.undefined
  var endOpacity: js.UndefOr[Double] = js.undefined
  var persist: js.UndefOr[String] = js.undefined
  var startOpacity: js.UndefOr[Double] = js.undefined
  var timingFunction: js.UndefOr[String] = js.undefined
}

object Anon_DelayDuration {
  @scala.inline
  def apply(
    delay: String = null,
    duration: String = null,
    endOpacity: Int | Double = null,
    persist: String = null,
    startOpacity: Int | Double = null,
    timingFunction: String = null
  ): Anon_DelayDuration = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (endOpacity != null) __obj.updateDynamic("endOpacity")(endOpacity.asInstanceOf[js.Any])
    if (persist != null) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (startOpacity != null) __obj.updateDynamic("startOpacity")(startOpacity.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DelayDuration]
  }
}

