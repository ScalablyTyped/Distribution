package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var delay: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[String] = js.undefined
  var endOpacity: js.UndefOr[Double] = js.undefined
  var persist: js.UndefOr[String] = js.undefined
  var startOpacity: js.UndefOr[Double] = js.undefined
  var timingFunction: js.UndefOr[String] = js.undefined
}

object Duration {
  @scala.inline
  def apply(
    delay: String = null,
    duration: String = null,
    endOpacity: js.UndefOr[Double] = js.undefined,
    persist: String = null,
    startOpacity: js.UndefOr[Double] = js.undefined,
    timingFunction: String = null
  ): Duration = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(endOpacity)) __obj.updateDynamic("endOpacity")(endOpacity.get.asInstanceOf[js.Any])
    if (persist != null) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpacity)) __obj.updateDynamic("startOpacity")(startOpacity.get.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

