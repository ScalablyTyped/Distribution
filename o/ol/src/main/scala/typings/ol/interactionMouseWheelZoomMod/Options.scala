package typings.ol.interactionMouseWheelZoomMod

import typings.ol.eventsConditionMod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var condition: js.UndefOr[Condition] = js.undefined
  var constrainResolution: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var useAnchor: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    condition: Condition = null,
    constrainResolution: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    timeout: Int | Double = null,
    useAnchor: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (!js.isUndefined(constrainResolution)) __obj.updateDynamic("constrainResolution")(constrainResolution)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useAnchor)) __obj.updateDynamic("useAnchor")(useAnchor)
    __obj.asInstanceOf[Options]
  }
}

