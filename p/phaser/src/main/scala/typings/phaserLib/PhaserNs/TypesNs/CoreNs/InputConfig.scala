package typings
package phaserLib.PhaserNs.TypesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputConfig extends js.Object {
  /**
    * The maximum number of touch pointers. See {@link Phaser.Input.InputManager#pointers}.
    */
  var activePointers: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * Gamepad input configuration. `true` enables gamepad input.
    */
  var gamepad: js.UndefOr[scala.Boolean | GamepadInputConfig] = js.undefined
  /**
    * Keyboard input configuration. `true` uses the default configuration and `false` disables keyboard input.
    */
  var keyboard: js.UndefOr[scala.Boolean | KeyboardInputConfig] = js.undefined
  /**
    * Mouse input configuration. `true` uses the default configuration and `false` disables mouse input.
    */
  var mouse: js.UndefOr[scala.Boolean | MouseInputConfig] = js.undefined
  /**
    * The smoothing factor to apply during Pointer movement. See {@link Phaser.Input.Pointer#smoothFactor}.
    */
  var smoothFactor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Touch input configuration. `true` uses the default configuration and `false` disables touch input.
    */
  var touch: js.UndefOr[scala.Boolean | TouchInputConfig] = js.undefined
  /**
    * Should Phaser listen for input events on the Window? If you disable this, events like 'POINTER_UP_OUTSIDE' will no longer fire.
    */
  var windowEvents: js.UndefOr[scala.Boolean] = js.undefined
}

object InputConfig {
  @scala.inline
  def apply(
    activePointers: js.UndefOr[phaserLib.integer] = js.undefined,
    gamepad: scala.Boolean | GamepadInputConfig = null,
    keyboard: scala.Boolean | KeyboardInputConfig = null,
    mouse: scala.Boolean | MouseInputConfig = null,
    smoothFactor: scala.Int | scala.Double = null,
    touch: scala.Boolean | TouchInputConfig = null,
    windowEvents: js.UndefOr[scala.Boolean] = js.undefined
  ): InputConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activePointers)) __obj.updateDynamic("activePointers")(activePointers)
    if (gamepad != null) __obj.updateDynamic("gamepad")(gamepad.asInstanceOf[js.Any])
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (mouse != null) __obj.updateDynamic("mouse")(mouse.asInstanceOf[js.Any])
    if (smoothFactor != null) __obj.updateDynamic("smoothFactor")(smoothFactor.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (!js.isUndefined(windowEvents)) __obj.updateDynamic("windowEvents")(windowEvents)
    __obj.asInstanceOf[InputConfig]
  }
}

