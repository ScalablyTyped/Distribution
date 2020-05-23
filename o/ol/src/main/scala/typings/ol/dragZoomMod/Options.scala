package typings.ol.dragZoomMod

import typings.ol.conditionMod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var condition: js.UndefOr[Condition] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var minArea: js.UndefOr[Double] = js.undefined
  var out: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: String = null,
    condition: Condition = null,
    duration: js.UndefOr[Double] = js.undefined,
    minArea: js.UndefOr[Double] = js.undefined,
    out: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minArea)) __obj.updateDynamic("minArea")(minArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(out)) __obj.updateDynamic("out")(out.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

