package typings.playcanvas

import typings.playcanvas.pc.GamePads
import typings.playcanvas.pc.Keyboard
import typings.playcanvas.pc.Mouse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gamepads extends js.Object {
  var gamepads: js.UndefOr[GamePads] = js.undefined
  var keyboard: js.UndefOr[Keyboard] = js.undefined
  var mouse: js.UndefOr[Mouse] = js.undefined
}

object Anon_Gamepads {
  @scala.inline
  def apply(gamepads: GamePads = null, keyboard: Keyboard = null, mouse: Mouse = null): Anon_Gamepads = {
    val __obj = js.Dynamic.literal()
    if (gamepads != null) __obj.updateDynamic("gamepads")(gamepads)
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard)
    if (mouse != null) __obj.updateDynamic("mouse")(mouse)
    __obj.asInstanceOf[Anon_Gamepads]
  }
}

