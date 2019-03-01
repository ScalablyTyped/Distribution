package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gamepads extends js.Object {
  var gamepads: playcanvasLib.pcNs.GamePads
  var keyboard: js.UndefOr[playcanvasLib.pcNs.Keyboard] = js.undefined
  var mouse: js.UndefOr[playcanvasLib.pcNs.Mouse] = js.undefined
}

object Anon_Gamepads {
  @scala.inline
  def apply(
    gamepads: playcanvasLib.pcNs.GamePads,
    keyboard: playcanvasLib.pcNs.Keyboard = null,
    mouse: playcanvasLib.pcNs.Mouse = null
  ): Anon_Gamepads = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gamepads")(gamepads)
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard)
    if (mouse != null) __obj.updateDynamic("mouse")(mouse)
    __obj.asInstanceOf[Anon_Gamepads]
  }
}

