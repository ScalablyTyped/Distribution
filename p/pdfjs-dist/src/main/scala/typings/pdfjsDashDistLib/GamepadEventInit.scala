package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadEventInit extends EventInit {
  var gamepad: js.UndefOr[Gamepad] = js.undefined
}

object GamepadEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    gamepad: Gamepad = null
  ): GamepadEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (gamepad != null) __obj.updateDynamic("gamepad")(gamepad)
    __obj.asInstanceOf[GamepadEventInit]
  }
}

