package typings.phaser.Phaser.Input.Gamepad

import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Input.InputPlugin
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.Scenes.SettingsObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait GamepadPlugin extends EventEmitter {
  
  /**
    * Disconnects all current Gamepads.
    */
  def disconnectAll(): Unit = js.native
  
  /**
    * A boolean that controls if the Gamepad Manager is enabled or not.
    * Can be toggled on the fly.
    */
  var enabled: Boolean = js.native
  
  /**
    * An array of the connected Gamepads.
    */
  var gamepads: js.Array[typings.phaser.Phaser.Input.Gamepad.Gamepad] = js.native
  
  /**
    * Returns an array of all currently connected Gamepads.
    */
  def getAll(): js.Array[typings.phaser.Phaser.Input.Gamepad.Gamepad] = js.native
  
  /**
    * Looks-up a single Gamepad based on the given index value.
    * @param index The index of the Gamepad to get.
    */
  def getPad(index: Double): typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
  
  /**
    * Checks to see if both this plugin and the Scene to which it belongs is active.
    */
  def isActive(): Boolean = js.native
  
  /**
    * A reference to the first connected Gamepad.
    * 
    * This will be undefined if either no pads are connected, or the browser
    * has not yet issued a gamepadconnect, which can happen even if a Gamepad
    * is plugged in, but hasn't yet had any buttons pressed on it.
    */
  var pad1: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
  
  /**
    * A reference to the second connected Gamepad.
    * 
    * This will be undefined if either no pads are connected, or the browser
    * has not yet issued a gamepadconnect, which can happen even if a Gamepad
    * is plugged in, but hasn't yet had any buttons pressed on it.
    */
  var pad2: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
  
  /**
    * A reference to the third connected Gamepad.
    * 
    * This will be undefined if either no pads are connected, or the browser
    * has not yet issued a gamepadconnect, which can happen even if a Gamepad
    * is plugged in, but hasn't yet had any buttons pressed on it.
    */
  var pad3: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
  
  /**
    * A reference to the fourth connected Gamepad.
    * 
    * This will be undefined if either no pads are connected, or the browser
    * has not yet issued a gamepadconnect, which can happen even if a Gamepad
    * is plugged in, but hasn't yet had any buttons pressed on it.
    */
  var pad4: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
  
  /**
    * A reference to the Scene that this Input Plugin is responsible for.
    */
  var scene: Scene = js.native
  
  /**
    * A reference to the Scene Input Plugin that created this Keyboard Plugin.
    */
  var sceneInputPlugin: InputPlugin = js.native
  
  /**
    * A reference to the Scene Systems Settings.
    */
  var settings: SettingsObject = js.native
  
  /**
    * The Gamepad Event target, as defined in the Game Config.
    * Typically the browser window, but can be any interactive DOM element.
    */
  var target: js.Any = js.native
  
  /**
    * The total number of connected game pads.
    */
  var total: integer = js.native
}
