package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[String] = js.undefined
  var endMaxHeight: js.UndefOr[String] = js.undefined
  var endMaxWidth: js.UndefOr[String] = js.undefined
  var persist: js.UndefOr[String] = js.undefined
  var startMaxHeight: js.UndefOr[String] = js.undefined
  var startMaxWidth: js.UndefOr[String] = js.undefined
  var timingFunction: js.UndefOr[String] = js.undefined
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: String = null,
    direction: String = null,
    duration: String = null,
    endMaxHeight: String = null,
    endMaxWidth: String = null,
    persist: String = null,
    startMaxHeight: String = null,
    startMaxWidth: String = null,
    timingFunction: String = null
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (endMaxHeight != null) __obj.updateDynamic("endMaxHeight")(endMaxHeight.asInstanceOf[js.Any])
    if (endMaxWidth != null) __obj.updateDynamic("endMaxWidth")(endMaxWidth.asInstanceOf[js.Any])
    if (persist != null) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (startMaxHeight != null) __obj.updateDynamic("startMaxHeight")(startMaxHeight.asInstanceOf[js.Any])
    if (startMaxWidth != null) __obj.updateDynamic("startMaxWidth")(startMaxWidth.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delay]
  }
}

