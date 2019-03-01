package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: js.UndefOr[java.lang.String] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[java.lang.String] = js.undefined
  var endMaxHeight: js.UndefOr[java.lang.String] = js.undefined
  var endMaxWidth: js.UndefOr[java.lang.String] = js.undefined
  var persist: js.UndefOr[java.lang.String] = js.undefined
  var startMaxHeight: js.UndefOr[java.lang.String] = js.undefined
  var startMaxWidth: js.UndefOr[java.lang.String] = js.undefined
  var timingFunction: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: java.lang.String = null,
    direction: java.lang.String = null,
    duration: java.lang.String = null,
    endMaxHeight: java.lang.String = null,
    endMaxWidth: java.lang.String = null,
    persist: java.lang.String = null,
    startMaxHeight: java.lang.String = null,
    startMaxWidth: java.lang.String = null,
    timingFunction: java.lang.String = null
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (endMaxHeight != null) __obj.updateDynamic("endMaxHeight")(endMaxHeight)
    if (endMaxWidth != null) __obj.updateDynamic("endMaxWidth")(endMaxWidth)
    if (persist != null) __obj.updateDynamic("persist")(persist)
    if (startMaxHeight != null) __obj.updateDynamic("startMaxHeight")(startMaxHeight)
    if (startMaxWidth != null) __obj.updateDynamic("startMaxWidth")(startMaxWidth)
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction)
    __obj.asInstanceOf[Anon_Delay]
  }
}

