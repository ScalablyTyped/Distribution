package typings.playcanvas.anon

import typings.playcanvas.pc.GamePads
import typings.playcanvas.pc.Keyboard
import typings.playcanvas.pc.Mouse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gamepads extends js.Object {
  var gamepads: js.UndefOr[GamePads] = js.native
  var keyboard: js.UndefOr[Keyboard] = js.native
  var mouse: js.UndefOr[Mouse] = js.native
}

object Gamepads {
  @scala.inline
  def apply(): Gamepads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gamepads]
  }
  @scala.inline
  implicit class GamepadsOps[Self <: Gamepads] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGamepads(value: GamePads): Self = this.set("gamepads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGamepads: Self = this.set("gamepads", js.undefined)
    @scala.inline
    def setKeyboard(value: Keyboard): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setMouse(value: Mouse): Self = this.set("mouse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouse: Self = this.set("mouse", js.undefined)
  }
  
}

