package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputConfig extends js.Object {
  /**
    * The maximum number of touch pointers. See {@link Phaser.Input.InputManager#pointers}.
    */
  var activePointers: js.UndefOr[integer] = js.undefined
  /**
    * Gamepad input configuration. `true` enables gamepad input.
    */
  var gamepad: js.UndefOr[Boolean | GamepadInputConfig] = js.undefined
  /**
    * Keyboard input configuration. `true` uses the default configuration and `false` disables keyboard input.
    */
  var keyboard: js.UndefOr[Boolean | KeyboardInputConfig] = js.undefined
  /**
    * Mouse input configuration. `true` uses the default configuration and `false` disables mouse input.
    */
  var mouse: js.UndefOr[Boolean | MouseInputConfig] = js.undefined
  /**
    * The smoothing factor to apply during Pointer movement. See {@link Phaser.Input.Pointer#smoothFactor}.
    */
  var smoothFactor: js.UndefOr[Double] = js.undefined
  /**
    * Touch input configuration. `true` uses the default configuration and `false` disables touch input.
    */
  var touch: js.UndefOr[Boolean | TouchInputConfig] = js.undefined
  /**
    * Should Phaser listen for input events on the Window? If you disable this, events like 'POINTER_UP_OUTSIDE' will no longer fire.
    */
  var windowEvents: js.UndefOr[Boolean] = js.undefined
}

object InputConfig {
  @scala.inline
  def apply(
    activePointers: Int | Double = null,
    gamepad: Boolean | GamepadInputConfig = null,
    keyboard: Boolean | KeyboardInputConfig = null,
    mouse: Boolean | MouseInputConfig = null,
    smoothFactor: Int | Double = null,
    touch: Boolean | TouchInputConfig = null,
    windowEvents: js.UndefOr[Boolean] = js.undefined
  ): InputConfig = {
    val __obj = js.Dynamic.literal()
    if (activePointers != null) __obj.updateDynamic("activePointers")(activePointers.asInstanceOf[js.Any])
    if (gamepad != null) __obj.updateDynamic("gamepad")(gamepad.asInstanceOf[js.Any])
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (mouse != null) __obj.updateDynamic("mouse")(mouse.asInstanceOf[js.Any])
    if (smoothFactor != null) __obj.updateDynamic("smoothFactor")(smoothFactor.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (!js.isUndefined(windowEvents)) __obj.updateDynamic("windowEvents")(windowEvents)
    __obj.asInstanceOf[InputConfig]
  }
}

