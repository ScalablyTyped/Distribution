package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputConfig extends js.Object {
  /**
    * The maximum number of touch pointers. See {@link Phaser.Input.InputManager#pointers}.
    */
  var activePointers: js.UndefOr[integer] = js.native
  /**
    * Gamepad input configuration. `true` enables gamepad input.
    */
  var gamepad: js.UndefOr[Boolean | GamepadInputConfig] = js.native
  /**
    * Keyboard input configuration. `true` uses the default configuration and `false` disables keyboard input.
    */
  var keyboard: js.UndefOr[Boolean | KeyboardInputConfig] = js.native
  /**
    * Mouse input configuration. `true` uses the default configuration and `false` disables mouse input.
    */
  var mouse: js.UndefOr[Boolean | MouseInputConfig] = js.native
  /**
    * The smoothing factor to apply during Pointer movement. See {@link Phaser.Input.Pointer#smoothFactor}.
    */
  var smoothFactor: js.UndefOr[Double] = js.native
  /**
    * Touch input configuration. `true` uses the default configuration and `false` disables touch input.
    */
  var touch: js.UndefOr[Boolean | TouchInputConfig] = js.native
  /**
    * Should Phaser listen for input events on the Window? If you disable this, events like 'POINTER_UP_OUTSIDE' will no longer fire.
    */
  var windowEvents: js.UndefOr[Boolean] = js.native
}

object InputConfig {
  @scala.inline
  def apply(): InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputConfig]
  }
  @scala.inline
  implicit class InputConfigOps[Self <: InputConfig] (val x: Self) extends AnyVal {
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
    def setActivePointers(value: integer): Self = this.set("activePointers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivePointers: Self = this.set("activePointers", js.undefined)
    @scala.inline
    def setGamepad(value: Boolean | GamepadInputConfig): Self = this.set("gamepad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGamepad: Self = this.set("gamepad", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean | KeyboardInputConfig): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setMouse(value: Boolean | MouseInputConfig): Self = this.set("mouse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouse: Self = this.set("mouse", js.undefined)
    @scala.inline
    def setSmoothFactor(value: Double): Self = this.set("smoothFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothFactor: Self = this.set("smoothFactor", js.undefined)
    @scala.inline
    def setTouch(value: Boolean | TouchInputConfig): Self = this.set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    @scala.inline
    def setWindowEvents(value: Boolean): Self = this.set("windowEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowEvents: Self = this.set("windowEvents", js.undefined)
  }
  
}

