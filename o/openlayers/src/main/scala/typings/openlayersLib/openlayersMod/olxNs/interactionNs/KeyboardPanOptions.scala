package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardPanOptions extends js.Object {
  var condition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var pixelDelta: js.UndefOr[scala.Double] = js.undefined
}

object KeyboardPanOptions {
  @scala.inline
  def apply(
    condition: openlayersLib.openlayersMod.EventsConditionType = null,
    duration: scala.Int | scala.Double = null,
    pixelDelta: scala.Int | scala.Double = null
  ): KeyboardPanOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (pixelDelta != null) __obj.updateDynamic("pixelDelta")(pixelDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardPanOptions]
  }
}

