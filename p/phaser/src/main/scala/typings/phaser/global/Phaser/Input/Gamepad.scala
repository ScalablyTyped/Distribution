package typings.phaser.global.Phaser.Input

import typings.phaser.Phaser.Types.Input.Gamepad.Pad
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Input.Gamepad")
@js.native
object Gamepad extends js.Object {
  /**
    * Contains information about a specific Gamepad Axis.
    * Axis objects are created automatically by the Gamepad as they are needed.
    */
  @js.native
  class Axis protected ()
    extends typings.phaser.Phaser.Input.Gamepad.Axis {
    /**
      * 
      * @param pad A reference to the Gamepad that this Axis belongs to.
      * @param index The index of this Axis.
      */
    def this(pad: typings.phaser.Phaser.Input.Gamepad.Gamepad, index: integer) = this()
  }
  
  /**
    * Contains information about a specific button on a Gamepad.
    * Button objects are created automatically by the Gamepad as they are needed.
    */
  @js.native
  class Button protected ()
    extends typings.phaser.Phaser.Input.Gamepad.Button {
    /**
      * 
      * @param pad A reference to the Gamepad that this Button belongs to.
      * @param index The index of this Button.
      */
    def this(pad: typings.phaser.Phaser.Input.Gamepad.Gamepad, index: integer) = this()
  }
  
  /**
    * A single Gamepad.
    * 
    * These are created, updated and managed by the Gamepad Plugin.
    */
  @js.native
  class Gamepad protected ()
    extends typings.phaser.Phaser.Input.Gamepad.Gamepad {
    /**
      * 
      * @param manager A reference to the Gamepad Plugin.
      * @param pad The Gamepad object, as extracted from GamepadEvent.
      */
    def this(manager: typings.phaser.Phaser.Input.Gamepad.GamepadPlugin, pad: Pad) = this()
  }
  
  /**
    * The Gamepad Plugin is an input plugin that belongs to the Scene-owned Input system.
    * 
    * Its role is to listen for native DOM Gamepad Events and then process them.
    * 
    * You do not need to create this class directly, the Input system will create an instance of it automatically.
    * 
    * You can access it from within a Scene using `this.input.gamepad`.
    * 
    * To listen for a gamepad being connected:
    * 
    * ```javascript
    * this.input.gamepad.once('connected', function (pad) {
    *     //   'pad' is a reference to the gamepad that was just connected
    * });
    * ```
    * 
    * Note that the browser may require you to press a button on a gamepad before it will allow you to access it,
    * this is for security reasons. However, it may also trust the page already, in which case you won't get the
    * 'connected' event and instead should check `GamepadPlugin.total` to see if it thinks there are any gamepads
    * already connected.
    * 
    * Once you have received the connected event, or polled the gamepads and found them enabled, you can access
    * them via the built-in properties `GamepadPlugin.pad1` to `pad4`, for up to 4 game pads. With a reference
    * to the gamepads you can poll its buttons and axis sticks. See the properties and methods available on
    * the `Gamepad` class for more details.
    * 
    * For more information about Gamepad support in browsers see the following resources:
    * 
    * https://developer.mozilla.org/en-US/docs/Web/API/Gamepad_API
    * https://developer.mozilla.org/en-US/docs/Web/API/Gamepad_API/Using_the_Gamepad_API
    * https://www.smashingmagazine.com/2015/11/gamepad-api-in-web-games/
    * http://html5gamepad.com/
    */
  @js.native
  class GamepadPlugin protected ()
    extends typings.phaser.Phaser.Input.Gamepad.GamepadPlugin {
    /**
      * 
      * @param sceneInputPlugin A reference to the Scene Input Plugin that the KeyboardPlugin belongs to.
      */
    def this(sceneInputPlugin: typings.phaser.Phaser.Input.InputPlugin) = this()
  }
  
  @js.native
  object Configs extends js.Object {
    /**
      * PlayStation DualShock 4 Gamepad Configuration.
      * Sony PlayStation DualShock 4 (v2) wireless controller
      */
    var DUALSHOCK_4: js.Object = js.native
    /**
      * Tatar SNES USB Controller Gamepad Configuration.
      * USB Gamepad  (STANDARD GAMEPAD Vendor: 0079 Product: 0011)
      */
    var SNES_USB: js.Object = js.native
    /**
      * XBox 360 Gamepad Configuration.
      */
    var XBOX_360: js.Object = js.native
  }
  
  @js.native
  object Events extends js.Object {
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
  
}

