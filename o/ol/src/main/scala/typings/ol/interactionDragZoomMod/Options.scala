package typings.ol.interactionDragZoomMod

import typings.ol.eventsConditionMod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var condition: js.UndefOr[Condition] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var out: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: String = null,
    condition: Condition = null,
    duration: Int | Double = null,
    out: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(out)) __obj.updateDynamic("out")(out)
    __obj.asInstanceOf[Options]
  }
}

