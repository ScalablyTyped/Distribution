package typings.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoPreventDefault extends js.Object {
  var autoPreventDefault: js.UndefOr[Boolean] = js.undefined
  var interactionFrequency: js.UndefOr[Double] = js.undefined
  var useSystemTicker: js.UndefOr[Double] = js.undefined
}

object AnonAutoPreventDefault {
  @scala.inline
  def apply(
    autoPreventDefault: js.UndefOr[Boolean] = js.undefined,
    interactionFrequency: Int | Double = null,
    useSystemTicker: Int | Double = null
  ): AnonAutoPreventDefault = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPreventDefault)) __obj.updateDynamic("autoPreventDefault")(autoPreventDefault.asInstanceOf[js.Any])
    if (interactionFrequency != null) __obj.updateDynamic("interactionFrequency")(interactionFrequency.asInstanceOf[js.Any])
    if (useSystemTicker != null) __obj.updateDynamic("useSystemTicker")(useSystemTicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoPreventDefault]
  }
}

