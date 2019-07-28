package typings.pixiDotJs.PIXINs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionManagerOptions extends js.Object {
  var autoPreventDefault: js.UndefOr[Boolean] = js.undefined
  var interactionFrequency: js.UndefOr[Double] = js.undefined
}

object InteractionManagerOptions {
  @scala.inline
  def apply(autoPreventDefault: js.UndefOr[Boolean] = js.undefined, interactionFrequency: Int | Double = null): InteractionManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPreventDefault)) __obj.updateDynamic("autoPreventDefault")(autoPreventDefault)
    if (interactionFrequency != null) __obj.updateDynamic("interactionFrequency")(interactionFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionManagerOptions]
  }
}

