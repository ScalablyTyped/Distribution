package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelayDirection extends js.Object {
  var delay: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[String] = js.undefined
  var offsetX: js.UndefOr[String] = js.undefined
  var offsetY: js.UndefOr[String] = js.undefined
  var persist: js.UndefOr[String] = js.undefined
  var timingFunction: js.UndefOr[String] = js.undefined
}

object Anon_DelayDirection {
  @scala.inline
  def apply(
    delay: String = null,
    direction: String = null,
    duration: String = null,
    offsetX: String = null,
    offsetY: String = null,
    persist: String = null,
    timingFunction: String = null
  ): Anon_DelayDirection = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX)
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY)
    if (persist != null) __obj.updateDynamic("persist")(persist)
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction)
    __obj.asInstanceOf[Anon_DelayDirection]
  }
}

