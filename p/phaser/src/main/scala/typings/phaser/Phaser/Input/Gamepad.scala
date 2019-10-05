package typings.phaser.Phaser.Input

import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Input.Gamepad.Axis
import typings.phaser.Phaser.Input.Gamepad.Button
import typings.phaser.Phaser.Input.Gamepad.GamepadPlugin
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.Input.Gamepad.Pad
import typings.phaser.Phaser.Types.Scenes.SettingsObject
import typings.phaser.integer
import typings.std.GamepadHapticActuator
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
  class Axis protected () extends js.Object {
    /**
      * 
      * @param pad A reference to the Gamepad that this Axis belongs to.
      * @param index The index of this Axis.
      */
    def this(pad: typings.phaser.Phaser.Input.Gamepad.Gamepad, index: integer) = this()
    /**
      * An event emitter to use to emit the axis events.
      */
    var events: EventEmitter = js.native
    /**
      * The index of this Axis.
      */
    var index: integer = js.native
    /**
      * A reference to the Gamepad that this Axis belongs to.
      */
    var pad: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
    /**
      * Movement tolerance threshold below which axis values are ignored in `getValue`.
      */
    var threshold: Double = js.native
    /**
      * The raw axis value, between -1 and 1 with 0 being dead center.
      * Use the method `getValue` to get a normalized value with the threshold applied.
      */
    var value: Double = js.native
    /**
      * Destroys this Axis instance and releases external references it holds.
      */
    def destroy(): Unit = js.native
    /**
      * Applies the `threshold` value to the axis and returns it.
      */
    def getValue(): Double = js.native
  }
  
  /**
    * Contains information about a specific button on a Gamepad.
    * Button objects are created automatically by the Gamepad as they are needed.
    */
  @js.native
  class Button protected () extends js.Object {
    /**
      * 
      * @param pad A reference to the Gamepad that this Button belongs to.
      * @param index The index of this Button.
      */
    def this(pad: typings.phaser.Phaser.Input.Gamepad.Gamepad, index: integer) = this()
    /**
      * An event emitter to use to emit the button events.
      */
    var events: EventEmitter = js.native
    /**
      * The index of this Button.
      */
    var index: integer = js.native
    /**
      * A reference to the Gamepad that this Button belongs to.
      */
    var pad: typings.phaser.Phaser.Input.Gamepad.Gamepad = js.native
    /**
      * Is the Button being pressed down or not?
      */
    var pressed: Boolean = js.native
    /**
      * Can be set for analogue buttons to enable a 'pressure' threshold,
      * before a button is considered as being 'pressed'.
      */
    var threshold: Double = js.native
    /**
      * Between 0 and 1.
      */
    var value: Double = js.native
    /**
      * Destroys this Button instance and releases external references it holds.
      */
    def destroy(): Unit = js.native
  }
  
  /**
    * A single Gamepad.
    * 
    * These are created, updated and managed by the Gamepad Plugin.
    */
  @js.native
  class Gamepad protected () extends EventEmitter {
    /**
      * 
      * @param manager A reference to the Gamepad Plugin.
      * @param pad The Gamepad object, as extracted from GamepadEvent.
      */
    def this(manager: GamepadPlugin, pad: Pad) = this()
    /**
      * Is the Gamepad's bottom button in the right button cluster being pressed?
      * If the Gamepad doesn't have this button it will always return false.
      * On a Dual Shock controller it's the X button.
      * On an XBox controller it's the A button.
      */
    var A: Boolean = js.native
    /**
      * Is the Gamepad's right button in the right button cluster being pressed?
      * If the Gamepad doesn't have this button it will always return false.
      * On a Dual Shock controller it's the Circle button.
      * On an XBox controller it's the B button.
      */
    var B: Boolean = js.native
    /**
      * Returns the value of the Gamepad's top left shoulder button.
      * If the Gamepad doesn't have this button it will always return zero.
      * The value is a float between 0 and 1, corresponding to how depressed the button is.
      * On a Dual Shock controller it's the L1 button.
      * On an XBox controller it's the LB button.
      */
    var L1: Double = js.native
    /**
      * Returns the value of the Gamepad's bottom left shoulder button.
      * If the Gamepad doesn't have this button it will always return zero.
      * The value is a float between 0 and 1, corresponding to how depressed the button is.
      * On a Dual Shock controller it's the L2 button.
      * On an XBox controller it's the LT button.
      */
    var L2: Double = js.native
    /**
      * Returns the value of the Gamepad's top right shoulder button.
      * If the Gamepad doesn't have this button it will always return zero.
      * The value is a float between 0 and 1, corresponding to how depressed the button is.
      * On a Dual Shock controller it's the R1 button.
      * On an XBox controller it's the RB button.
      */
    var R1: Double = js.native
    /**
      * Returns the value of the Gamepad's bottom right shoulder button.
      * If the Gamepad doesn't have this button it will always return zero.
      * The value is a float between 0 and 1, corresponding to how depressed the button is.
      * On a Dual Shock controller it's the R2 button.
      * On an XBox controller it's the RT button.
      */
    var R2: Double = js.native
    /**
      * Is the Gamepad's left button in the right button cluster being pressed?
      * If the Gamepad doesn't have this button it will always return false.
      * On a Dual Shock controller it's the Square button.
      * On an XBox controller it's the X button.
      */
    var X: Boolean = js.native
    /**
      * Is the Gamepad's top button in the right button cluster being pressed?
      * If the Gamepad doesn't have this button it will always return false.
      * On a Dual Shock controller it's the Triangle button.
      * On an XBox controller it's the Y button.
      */
    var Y: Boolean = js.native
    /**
      * An array of Gamepad Axis objects, corresponding to the different axes available on the Gamepad, if any.
      */
    var axes: js.Array[Axis] = js.native
    /**
      * An array of Gamepad Button objects, corresponding to the different buttons available on the Gamepad.
      */
    var buttons: js.Array[Button] = js.native
    /**
      * Is this Gamepad currently connected or not?
      */
    var connected: Boolean = js.native
    /**
      * Is the Gamepad's Down button being pressed?
      * If the Gamepad doesn't have this button it will always return false.
      * This is the d-pad down button under standard Gamepad mapping.
      */
    var down: Boolean = js.native
    /**
      * A string containing some information about the controller.
      * 
      * This is not strictly specified, but in Firefox it will contain three pieces of information
      * separated by dashes (-): two 4-digit hexadecimal strings containing the USB vendor and
      * product id of the controller, and the name of the controller as provided by the driver.
      * In Chrome it will contain the name of the controller as provided by the driver,
      * followed by vendor and product 4-digit hexadecimal strings.
      */
    var id: String = js.native
    /**
      * An integer that is unique for each Gamepad currently connected to the system.
      * This can be used to distinguish multiple controllers.
      * Note that disconnecting a device and then connecting a new device may reuse the previous index.
      */
    var index: Double = js.native
    /**
      * Is the Gamepad's Left button being pressed?
      * If the Gamepad doesn't have this button it will always return false.
      * This is the d-pad left button under standard Gamepad mapping.
      */
    var left: Boolean = js.native
    /**
      * A Vector2 containing the most recent values from the Gamepad's left axis stick.
      * This is updated automatically as part of the Gamepad.update cycle.
      * The H Axis is mapped to the `Vector2.x` property, and the V Axis to the `Vector2.y` property.
      * The values are based on the Axis thresholds.
      * If the Gamepad does not have a left axis stick, the values will always be zero.
      */
    var leftStick: Vector2 = js.native
    /**
      * A reference to the Gamepad Plugin.
      */
    var manager: GamepadPlugin = js.native
    /**
      * A reference to the native Gamepad object that is connected to the browser.
      */
    var pad: js.Any = js.native
    /**
      * Is the Gamepad's Right button being pressed?
      * If the Gamepad doesn't have this button it will always return false.
      * This is the d-pad right button under standard Gamepad mapping.
      */
    var right: Boolean = js.native
    /**
      * A Vector2 containing the most recent values from the Gamepad's right axis stick.
      * This is updated automatically as part of the Gamepad.update cycle.
      * The H Axis is mapped to the `Vector2.x` property, and the V Axis to the `Vector2.y` property.
      * The values are based on the Axis thresholds.
      * If the Gamepad does not have a right axis stick, the values will always be zero.
      */
    var rightStick: Vector2 = js.native
    /**
      * A timestamp containing the most recent time this Gamepad was updated.
      */
    var timestamp: Double = js.native
    /**
      * Is the Gamepad's Up button being pressed?
      * If the Gamepad doesn't have this button it will always return false.
      * This is the d-pad up button under standard Gamepad mapping.
      */
    var up: Boolean = js.native
    /**
      * The Gamepad's Haptic Actuator (Vibration / Rumble support).
      * This is highly experimental and only set if both present on the device,
      * and exposed by both the hardware and browser.
      */
    var vibration: GamepadHapticActuator = js.native
    /**
      * Gets the total number of axis this Gamepad claims to support.
      */
    def getAxisTotal(): integer = js.native
    /**
      * Gets the value of an axis based on the given index.
      * The index must be valid within the range of axes supported by this Gamepad.
      * The return value will be a float between 0 and 1.
      * @param index The index of the axes to get the value for.
      */
    def getAxisValue(index: integer): Double = js.native
    /**
      * Gets the total number of buttons this Gamepad claims to have.
      */
    def getButtonTotal(): integer = js.native
    /**
      * Gets the value of a button based on the given index.
      * The index must be valid within the range of buttons supported by this Gamepad.
      * 
      * The return value will be either 0 or 1 for an analogue button, or a float between 0 and 1
      * for a pressure-sensitive digital button, such as the shoulder buttons on a Dual Shock.
      * @param index The index of the button to get the value for.
      */
    def getButtonValue(index: integer): Double = js.native
    /**
      * Returns if the button is pressed down or not.
      * The index must be valid within the range of buttons supported by this Gamepad.
      * @param index The index of the button to get the value for.
      */
    def isButtonDown(index: integer): Boolean = js.native
    /**
      * Sets the threshold value of all axis on this Gamepad.
      * The value is a float between 0 and 1 and is the amount below which the axis is considered as not having been moved.
      * @param value A value between 0 and 1.
      */
    def setAxisThreshold(value: Double): Unit = js.native
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
  class GamepadPlugin protected () extends EventEmitter {
    /**
      * 
      * @param sceneInputPlugin A reference to the Scene Input Plugin that the KeyboardPlugin belongs to.
      */
    def this(sceneInputPlugin: InputPlugin) = this()
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
    /**
      * Disconnects all current Gamepads.
      */
    def disconnectAll(): Unit = js.native
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

