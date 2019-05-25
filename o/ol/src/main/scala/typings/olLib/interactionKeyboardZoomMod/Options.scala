package typings
package olLib.interactionKeyboardZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var condition: js.UndefOr[olLib.eventsConditionMod.Condition] = js.undefined
  var delta: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    condition: olLib.eventsConditionMod.Condition = null,
    delta: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

