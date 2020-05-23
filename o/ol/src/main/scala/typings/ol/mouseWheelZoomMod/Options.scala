package typings.ol.mouseWheelZoomMod

import typings.ol.conditionMod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var condition: js.UndefOr[Condition] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var maxDelta: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var useAnchor: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    condition: Condition = null,
    duration: js.UndefOr[Double] = js.undefined,
    maxDelta: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    useAnchor: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDelta)) __obj.updateDynamic("maxDelta")(maxDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useAnchor)) __obj.updateDynamic("useAnchor")(useAnchor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

