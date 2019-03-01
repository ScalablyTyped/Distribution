package typings
package pixiDotJsLib.PIXINs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionManagerOptions extends js.Object {
  var autoPreventDefault: js.UndefOr[scala.Boolean] = js.undefined
  var interactionFrequency: js.UndefOr[scala.Double] = js.undefined
}

object InteractionManagerOptions {
  @scala.inline
  def apply(
    autoPreventDefault: js.UndefOr[scala.Boolean] = js.undefined,
    interactionFrequency: scala.Int | scala.Double = null
  ): InteractionManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPreventDefault)) __obj.updateDynamic("autoPreventDefault")(autoPreventDefault)
    if (interactionFrequency != null) __obj.updateDynamic("interactionFrequency")(interactionFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionManagerOptions]
  }
}

