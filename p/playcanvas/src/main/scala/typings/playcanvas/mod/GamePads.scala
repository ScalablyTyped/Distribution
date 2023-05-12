package typings.playcanvas.mod

import typings.playcanvas.anon.StartDelay
import typings.std.Gamepad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input handler for accessing GamePad input.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "GamePads")
@js.native
open class GamePads () extends EventHandler {
  
  /**
    * Callback function when a gamepad is connecting.
    *
    * @param {GamepadEvent} event - The event containing the connecting gamepad.
    * @private
    */
  /* private */ var _ongamepadconnected: Any = js.native
  
  var _ongamepadconnectedHandler: Any = js.native
  
  /**
    * Callback function when a gamepad is disconnecting.
    *
    * @param {GamepadEvent} event - The event containing the disconnecting gamepad.
    * @private
    */
  /* private */ var _ongamepaddisconnected: Any = js.native
  
  var _ongamepaddisconnectedHandler: Any = js.native
  
  /**
    * The list of previous buttons states
    *
    * @type {boolean[][]}
    * @ignore
    */
  var _previous: js.Array[js.Array[Boolean]] = js.native
  
  /**
    * The list of current gamepads.
    *
    * @type {GamePad[]}
    */
  var current: js.Array[GamePad] = js.native
  
  def deadZone: Double = js.native
  /**
    * Fired when a gamepad is connected.
    *
    * @event GamePads#gamepadconnected
    * @param {GamePad} gamepad - The gamepad that was just connected.
    * @example
    * const onPadConnected = function (pad) {
    *     if (!pad.mapping) {
    *         // Map the gamepad as the system could not find the proper map.
    *     } else {
    *         // Make the gamepad pulse.
    *     }
    * };
    * app.keyboard.on("gamepadconnected", onPadConnected, this);
    */
  /**
    * Fired when a gamepad is disconnected.
    *
    * @event GamePads#gamepaddisconnected
    * @param {GamePad} gamepad - The gamepad that was just disconnected.
    * @example
    * const onPadDisconnected = function (pad) {
    *     // Pause the game.
    * };
    * app.keyboard.on("gamepaddisconnected", onPadDisconnected, this);
    */
  /**
    * Threshold for axes to return values. Must be between 0 and 1.
    *
    * @type {number}
    * @ignore
    */
  def deadZone_=(arg: Double): Unit = js.native
  
  /**
    * Destroy the event listeners.
    *
    * @ignore
    */
  def destroy(): Unit = js.native
  
  /**
    * Find a connected {@link GamePad} from its identifier.
    *
    * @param {string} id - The identifier to search for.
    * @returns {GamePad|null} The {@link GamePad} with the matching identifier or null if no gamepad is found or the gamepad is not connected.
    */
  def findById(id: String): GamePad | Null = js.native
  
  /**
    * Find a connected {@link GamePad} from its device index.
    *
    * @param {number} index - The device index to search for.
    * @returns {GamePad|null} The {@link GamePad} with the matching device index or null if no gamepad is found or the gamepad is not connected.
    */
  def findByIndex(index: Double): GamePad | Null = js.native
  
  /**
    * Whether gamepads are supported by this device.
    *
    * @type {boolean}
    */
  var gamepadsSupported: Boolean = js.native
  
  /**
    * Get the value of one of the analog axes of the pad.
    *
    * @param {number} orderIndex - The index of the pad to check, use constants {@link PAD_1}, {@link PAD_2}, etc. For gamepad index call the function from the pad.
    * @param {number} axis - The axis to get the value of, use constants {@link PAD_L_STICK_X}, etc.
    * @returns {number} The value of the axis between -1 and 1.
    */
  def getAxis(orderIndex: Double, axis: Double): Double = js.native
  
  /**
    * Retrieve the order for buttons and axes for given HTML5 Gamepad.
    *
    * @param {Gamepad} pad - The HTML5 Gamepad object.
    * @returns {object} Object defining the order of buttons and axes for given HTML5 Gamepad.
    */
  def getMap(pad: Gamepad): js.Object = js.native
  
  /**
    * Returns true if the button on the pad requested is pressed.
    *
    * @param {number} orderIndex - The order index of the pad to check, use constants {@link PAD_1}, {@link PAD_2}, etc. For gamepad index call the function from the pad.
    * @param {number} button - The button to test, use constants {@link PAD_FACE_1}, etc.
    * @returns {boolean} True if the button is pressed.
    */
  def isPressed(orderIndex: Double, button: Double): Boolean = js.native
  
  /**
    * Poll for the latest data from the gamepad API.
    *
    * @param {GamePad[]} [pads] - An optional array used to receive the gamepads mapping. This
    * array will be returned by this function.
    * @returns {GamePad[]} An array of gamepads and mappings for the model of gamepad that is
    * attached.
    * @example
    * const gamepads = new pc.GamePads();
    * const pads = gamepads.poll();
    */
  def poll(): js.Array[GamePad] = js.native
  def poll(pads: js.Array[GamePad]): js.Array[GamePad] = js.native
  
  /**
    * The list of previous buttons states.
    *
    * @type {boolean[][]}
    * @ignore
    */
  def previous: js.Array[js.Array[Boolean]] = js.native
  
  /**
    * Make the gamepad vibrate.
    *
    * @param {number} orderIndex - The index of the pad to check, use constants {@link PAD_1}, {@link PAD_2}, etc. For gamepad index call the function from the pad.
    * @param {number} intensity - Intensity for the vibration in the range 0 to 1.
    * @param {number} duration - Duration for the vibration in milliseconds.
    * @param {object} [options] - Options for special vibration pattern.
    * @param {number} [options.startDelay] - Delay before the pattern starts, in milliseconds. Defaults to 0.
    * @param {number} [options.strongMagnitude] - Intensity for strong actuators in the range 0 to 1. Defaults to intensity.
    * @param {number} [options.weakMagnitude] - Intensity for weak actuators in the range 0 to 1. Defaults to intensity.
    * @returns {Promise<boolean>} Return a Promise resulting in true if the pulse was successfully completed.
    */
  def pulse(orderIndex: Double, intensity: Double, duration: Double): js.Promise[Boolean] = js.native
  def pulse(orderIndex: Double, intensity: Double, duration: Double, options: StartDelay): js.Promise[Boolean] = js.native
  
  /**
    * Make all gamepads vibrate.
    *
    * @param {number} intensity - Intensity for the vibration in the range 0 to 1.
    * @param {number} duration - Duration for the vibration in milliseconds.
    * @param {object} [options] - Options for special vibration pattern.
    * @param {number} [options.startDelay] - Delay before the pattern starts, in milliseconds. Defaults to 0.
    * @param {number} [options.strongMagnitude] - Intensity for strong actuators in the range 0 to 1. Defaults to intensity.
    * @param {number} [options.weakMagnitude] - Intensity for weak actuators in the range 0 to 1. Defaults to intensity.
    * @returns {Promise<boolean[]>} Return a Promise resulting in an array of booleans defining if the pulse was successfully completed for every gamepads.
    */
  def pulseAll(intensity: Double, duration: Double): js.Promise[js.Array[Boolean]] = js.native
  def pulseAll(intensity: Double, duration: Double, options: StartDelay): js.Promise[js.Array[Boolean]] = js.native
  
  /**
    * Update the previous state of the gamepads. This must be called every frame for
    * `wasPressed` and `wasTouched` to work.
    *
    * @ignore
    */
  def update(): Unit = js.native
  
  /**
    * Returns true if the button was pressed since the last frame.
    *
    * @param {number} orderIndex - The index of the pad to check, use constants {@link PAD_1}, {@link PAD_2}, etc. For gamepad index call the function from the pad.
    * @param {number} button - The button to test, use constants {@link PAD_FACE_1}, etc.
    * @returns {boolean} True if the button was pressed since the last frame.
    */
  def wasPressed(orderIndex: Double, button: Double): Boolean = js.native
  
  /**
    * Returns true if the button was released since the last frame.
    *
    * @param {number} orderIndex - The index of the pad to check, use constants {@link PAD_1}, {@link PAD_2}, etc. For gamepad index call the function from the pad.
    * @param {number} button - The button to test, use constants {@link PAD_FACE_1}, etc.
    * @returns {boolean} True if the button was released since the last frame.
    */
  def wasReleased(orderIndex: Double, button: Double): Boolean = js.native
}
