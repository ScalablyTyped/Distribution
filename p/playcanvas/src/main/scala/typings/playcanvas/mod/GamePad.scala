package typings.playcanvas.mod

import typings.playcanvas.anon.Axes
import typings.playcanvas.anon.StartDelay
import typings.std.Gamepad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A GamePad stores information about a gamepad from the Gamepad API.
  */
@js.native
trait GamePad extends StObject {
  
  /**
    * The axes values from the GamePad. Order is provided by API, use GamePad#axes instead.
    *
    * @type {number[]}
    * @ignore
    */
  var _axes: js.Array[Double] = js.native
  
  /**
    * The buttons present on the GamePad. Order is provided by API, use GamePad#buttons instead.
    *
    * @type {GamePadButton[]}
    * @ignore
    */
  var _buttons: js.Array[GamePadButton] = js.native
  
  /**
    * Compile the buttons mapping to reduce lookup delay.
    *
    * @private
    */
  /* private */ var _compileMapping: Any = js.native
  
  /**
    * The compiled mapping to reduce lookup delay when retrieving buttons
    *
    * @type {object}
    * @private
    */
  /* private */ var _compiledMapping: Any = js.native
  
  /**
    * Previous value for the analog axes present on the gamepad. Values are between -1 and 1.
    *
    * @type {number[]}
    * @ignore
    */
  var _previousAxes: js.Array[Double] = js.native
  
  /**
    * The values from analog axes present on the GamePad. Values are between -1 and 1.
    *
    * @type {number[]}
    */
  def axes: js.Array[Double] = js.native
  
  /**
    * The buttons present on the GamePad.
    *
    * @type {GamePadButton[]}
    */
  def buttons: js.Array[GamePadButton] = js.native
  
  /**
    * Whether the gamepad is connected.
    *
    * @type {boolean}
    */
  def connected: Boolean = js.native
  
  /**
    * Get the value of one of the analog axes of the pad.
    *
    * @param {number} axis - The axis to get the value of, use constants {@link PAD_L_STICK_X}, etc.
    * @returns {number} The value of the axis between -1 and 1.
    */
  def getAxis(axis: Double): Double = js.native
  
  /**
    * Retrieve a button from its index.
    *
    * @param {number} index - The index to return the button for.
    * @returns {GamePadButton} The button for the searched index. May be a placeholder if none found.
    */
  def getButton(index: Double): GamePadButton = js.native
  
  /**
    * Returns the value of a button between 0 and 1, with 0 representing a button that is not pressed, and 1 representing a button that is fully pressed.
    *
    * @param {number} button - The button to retrieve, use constants {@link PAD_FACE_1}, etc.
    * @returns {number} The value of the button between 0 and 1.
    */
  def getValue(button: Double): Double = js.native
  
  /**
    * The hand this gamepad is usually handled on. Only relevant for XR pads. Value is either "left", "right" or "none".
    *
    * @type {string}
    */
  var hand: String = js.native
  
  /**
    * The identifier for the gamepad. Its structure depends on device.
    *
    * @type {string}
    */
  var id: String = js.native
  
  /**
    * The index for this controller. A gamepad that is disconnected and reconnected will retain the same index.
    *
    * @type {number}
    */
  var index: Double = js.native
  
  /**
    * Returns true if the button is pressed.
    *
    * @param {number} button - The button to test, use constants {@link PAD_FACE_1}, etc.
    * @returns {boolean} True if the button is pressed.
    */
  def isPressed(button: Double): Boolean = js.native
  
  /**
    * Returns true if the button is touched.
    *
    * @param {number} button - The button to test, use constants {@link PAD_FACE_1}, etc.
    * @returns {boolean} True if the button is touched.
    */
  def isTouched(button: Double): Boolean = js.native
  
  /**
    * The buttons and axes map.
    *
    * @type {object}
    */
  var map: js.Object = js.native
  
  /**
    * The gamepad mapping detected by the browser. Value is either "standard", "xr-standard", "" or "custom". When empty string, you may need to update the mapping yourself. "custom" means you updated the mapping.
    *
    * @type {string}
    */
  var mapping: String = js.native
  
  /**
    * The original Gamepad API gamepad.
    *
    * @type {Gamepad}
    * @ignore
    */
  var pad: Gamepad = js.native
  
  /**
    * Make the gamepad vibrate.
    *
    * @param {number} intensity - Intensity for the vibration in the range 0 to 1.
    * @param {number} duration - Duration for the vibration in milliseconds.
    * @param {object} [options] - Options for special vibration pattern.
    * @param {number} [options.startDelay] - Delay before the pattern starts, in milliseconds. Defaults to 0.
    * @param {number} [options.strongMagnitude] - Intensity for strong actuators in the range 0 to 1. Defaults to intensity.
    * @param {number} [options.weakMagnitude] - Intensity for weak actuators in the range 0 to 1. Defaults to intensity.
    * @returns {Promise<boolean>} Return a Promise resulting in true if the pulse was successfully completed.
    */
  def pulse(intensity: Double, duration: Double): js.Promise[Boolean] = js.native
  def pulse(intensity: Double, duration: Double, options: StartDelay): js.Promise[Boolean] = js.native
  
  /**
    * Reset gamepad mapping to default.
    */
  def resetMap(): Unit = js.native
  
  /**
    * Update the existing GamePad Instance.
    *
    * @param {Gamepad} gamepad - The original Gamepad API gamepad.
    * @ignore
    */
  def update(gamepad: Gamepad): GamePad = js.native
  
  /**
    * Update the map for this gamepad.
    *
    * @param {object} map - The new mapping for this gamepad.
    * @param {string[]} map.buttons - Buttons mapping for this gamepad.
    * @param {string[]} map.axes - Axes mapping for this gamepad.
    * @param {object} [map.synthesizedButtons] - Information about buttons to pull from axes for this gamepad. Requires definition of axis index, min value and max value.
    * @param {"custom"} [map.mapping] - New mapping format. Will be forced into "custom".
    * @example
    * this.pad.updateMap({
    *     buttons: [[
    *         'PAD_FACE_1',
    *         'PAD_FACE_2',
    *         'PAD_FACE_3',
    *         'PAD_FACE_4',
    *         'PAD_L_SHOULDER_1',
    *         'PAD_R_SHOULDER_1',
    *         'PAD_L_SHOULDER_2',
    *         'PAD_R_SHOULDER_2',
    *         'PAD_SELECT',
    *         'PAD_START',
    *         'PAD_L_STICK_BUTTON',
    *         'PAD_R_STICK_BUTTON',
    *         'PAD_VENDOR'
    *     ],
    *     axes: [
    *         'PAD_L_STICK_X',
    *         'PAD_L_STICK_Y',
    *         'PAD_R_STICK_X',
    *         'PAD_R_STICK_Y'
    *     ],
    *     synthesizedButtons: {
    *         PAD_UP: { axis: 0, min: 0, max: 1 },
    *         PAD_DOWN: { axis: 0, min: -1, max: 0 },
    *         PAD_LEFT: { axis: 0, min: -1, max: 0 },
    *         PAD_RIGHT: { axis: 0, min: 0, max: 1 }
    *     }
    * });
    */
  def updateMap(map: Axes): Unit = js.native
  
  /**
    * Return true if the button was pressed since the last update.
    *
    * @param {number} button - The button to test, use constants {@link PAD_FACE_1}, etc.
    * @returns {boolean} Return true if the button was pressed, false if not.
    */
  def wasPressed(button: Double): Boolean = js.native
  
  /**
    * Return true if the button was released since the last update.
    *
    * @param {number} button - The button to test, use constants {@link PAD_FACE_1}, etc.
    * @returns {boolean} Return true if the button was released, false if not.
    */
  def wasReleased(button: Double): Boolean = js.native
  
  /**
    * Return true if the button was touched since the last update.
    *
    * @param {number} button - The button to test, use constants {@link PAD_FACE_1}, etc.
    * @returns {boolean} Return true if the button was touched, false if not.
    */
  def wasTouched(button: Double): Boolean = js.native
}
