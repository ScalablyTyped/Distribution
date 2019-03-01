package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelayDirection extends js.Object {
  var delay: js.UndefOr[java.lang.String] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[java.lang.String] = js.undefined
  var offsetX: js.UndefOr[java.lang.String] = js.undefined
  var offsetY: js.UndefOr[java.lang.String] = js.undefined
  var persist: js.UndefOr[java.lang.String] = js.undefined
  var timingFunction: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DelayDirection {
  @scala.inline
  def apply(
    delay: java.lang.String = null,
    direction: java.lang.String = null,
    duration: java.lang.String = null,
    offsetX: java.lang.String = null,
    offsetY: java.lang.String = null,
    persist: java.lang.String = null,
    timingFunction: java.lang.String = null
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

