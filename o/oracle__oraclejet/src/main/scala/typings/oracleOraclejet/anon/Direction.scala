package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direction extends js.Object {
  var delay: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[String] = js.undefined
  var offsetX: js.UndefOr[String] = js.undefined
  var offsetY: js.UndefOr[String] = js.undefined
  var persist: js.UndefOr[String] = js.undefined
  var timingFunction: js.UndefOr[String] = js.undefined
}

object Direction {
  @scala.inline
  def apply(
    delay: String = null,
    direction: String = null,
    duration: String = null,
    offsetX: String = null,
    offsetY: String = null,
    persist: String = null,
    timingFunction: String = null
  ): Direction = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (persist != null) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
}

