package typings.phaser.PhaserNs.TypesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadInputConfig extends js.Object {
  /**
    * Where the Gamepad Manager listens for gamepad input events.
    */
  var target: js.UndefOr[js.Any] = js.undefined
}

object GamepadInputConfig {
  @scala.inline
  def apply(target: js.Any = null): GamepadInputConfig = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[GamepadInputConfig]
  }
}

