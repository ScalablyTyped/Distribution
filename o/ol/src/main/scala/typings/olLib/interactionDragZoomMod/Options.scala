package typings
package olLib.interactionDragZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var condition: js.UndefOr[olLib.eventsConditionMod.Condition] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var out: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    condition: olLib.eventsConditionMod.Condition = null,
    duration: scala.Int | scala.Double = null,
    out: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(out)) __obj.updateDynamic("out")(out)
    __obj.asInstanceOf[Options]
  }
}

