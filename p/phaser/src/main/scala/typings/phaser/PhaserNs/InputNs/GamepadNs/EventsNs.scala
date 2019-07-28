package typings.phaser.PhaserNs.InputNs.GamepadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Input.Gamepad.Events")
@js.native
object EventsNs extends js.Object {
  /**
    * The Gamepad Button Down Event.
    * 
    * This event is dispatched by the Gamepad Plugin when a button has been pressed on any active Gamepad.
    * 
    * Listen to this event from within a Scene using: `this.input.gamepad.on('down', listener)`.
    * 
    * You can also listen for a DOWN event from a Gamepad instance. See the [GAMEPAD_BUTTON_DOWN]{@linkcode Phaser.Input.Gamepad.Events#event:GAMEPAD_BUTTON_DOWN} event for details.
    */
  val BUTTON_DOWN: js.Any = js.native
  /**
    * The Gamepad Button Up Event.
    * 
    * This event is dispatched by the Gamepad Plugin when a button has been released on any active Gamepad.
    * 
    * Listen to this event from within a Scene using: `this.input.gamepad.on('up', listener)`.
    * 
    * You can also listen for an UP event from a Gamepad instance. See the [GAMEPAD_BUTTON_UP]{@linkcode Phaser.Input.Gamepad.Events#event:GAMEPAD_BUTTON_UP} event for details.
    */
  val BUTTON_UP: js.Any = js.native
  /**
    * The Gamepad Connected Event.
    * 
    * This event is dispatched by the Gamepad Plugin when a Gamepad has been connected.
    * 
    * Listen to this event from within a Scene using: `this.input.gamepad.once('connected', listener)`.
    * 
    * Note that the browser may require you to press a button on a gamepad before it will allow you to access it,
    * this is for security reasons. However, it may also trust the page already, in which case you won't get the
    * 'connected' event and instead should check `GamepadPlugin.total` to see if it thinks there are any gamepads
    * already connected.
    */
  val CONNECTED: js.Any = js.native
  /**
    * The Gamepad Disconnected Event.
    * 
    * This event is dispatched by the Gamepad Plugin when a Gamepad has been disconnected.
    * 
    * Listen to this event from within a Scene using: `this.input.gamepad.once('disconnected', listener)`.
    */
  val DISCONNECTED: js.Any = js.native
  /**
    * The Gamepad Button Down Event.
    * 
    * This event is dispatched by a Gamepad instance when a button has been pressed on it.
    * 
    * Listen to this event from a Gamepad instance. Once way to get this is from the `pad1`, `pad2`, etc properties on the Gamepad Plugin:
    * `this.input.gamepad.pad1.on('down', listener)`.
    * 
    * Note that you will not receive any Gamepad button events until the browser considers the Gamepad as being 'connected'.
    * 
    * You can also listen for a DOWN event from the Gamepad Plugin. See the [BUTTON_DOWN]{@linkcode Phaser.Input.Gamepad.Events#event:BUTTON_DOWN} event for details.
    */
  val GAMEPAD_BUTTON_DOWN: js.Any = js.native
  /**
    * The Gamepad Button Up Event.
    * 
    * This event is dispatched by a Gamepad instance when a button has been released on it.
    * 
    * Listen to this event from a Gamepad instance. Once way to get this is from the `pad1`, `pad2`, etc properties on the Gamepad Plugin:
    * `this.input.gamepad.pad1.on('up', listener)`.
    * 
    * Note that you will not receive any Gamepad button events until the browser considers the Gamepad as being 'connected'.
    * 
    * You can also listen for an UP event from the Gamepad Plugin. See the [BUTTON_UP]{@linkcode Phaser.Input.Gamepad.Events#event:BUTTON_UP} event for details.
    */
  val GAMEPAD_BUTTON_UP: js.Any = js.native
}

