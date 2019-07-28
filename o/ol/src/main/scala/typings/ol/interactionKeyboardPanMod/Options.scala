package typings.ol.interactionKeyboardPanMod

import typings.ol.eventsConditionMod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var condition: js.UndefOr[Condition] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var pixelDelta: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(condition: Condition = null, duration: Int | Double = null, pixelDelta: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (pixelDelta != null) __obj.updateDynamic("pixelDelta")(pixelDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

