package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input handler for accessing GamePad input.
  */
@JSImport("playcanvas", "GamePads")
@js.native
open class GamePads () extends StObject {
  
  var current: js.Array[Any] = js.native
  
  var deadZone: Double = js.native
  
  var gamepadsSupported: Boolean = js.native
  
  /**
    * Get the value of one of the analogue axes of the pad.
    *
    * @param {number} index - The index of the pad to check, use constants {@link PAD_1},
    * {@link PAD_2}, etc.
    * @param {number} axes - The axes to get the value of, use constants {@link PAD_L_STICK_X},
    * etc.
    * @returns {number} The value of the axis between -1 and 1.
    */
  def getAxis(index: Double, axes: Double): Double = js.native
  
  def getMap(pad: Any): Any = js.native
  
  /**
    * Returns true if the button on the pad requested is pressed.
    *
    * @param {number} index - The index of the pad to check, use constants {@link PAD_1},
    * {@link PAD_2}, etc.
    * @param {number} button - The button to test, use constants {@link PAD_FACE_1}, etc.
    * @returns {boolean} True if the button is pressed.
    */
  def isPressed(index: Double, button: Double): Boolean = js.native
  
  /**
    * Poll for the latest data from the gamepad API.
    *
    * @param {object[]} [pads] - An optional array used to receive the gamepads mapping. This
    * array will be returned by this function.
    * @returns {object[]} An array of gamepads and mappings for the model of gamepad that is
    * attached.
    * @example
    * var gamepads = new pc.GamePads();
    * var pads = gamepads.poll();
    */
  def poll(): js.Array[js.Object] = js.native
  def poll(pads: js.Array[js.Object]): js.Array[js.Object] = js.native
  
  var previous: js.Array[Any] = js.native
  
  /**
    * Update the current and previous state of the gamepads. This must be called every frame for
    * `wasPressed` to work.
    */
  def update(): Unit = js.native
  
  /**
    * Returns true if the button was pressed since the last frame.
    *
    * @param {number} index - The index of the pad to check, use constants {@link PAD_1},
    * {@link PAD_2}, etc.
    * @param {number} button - The button to test, use constants {@link PAD_FACE_1}, etc.
    * @returns {boolean} True if the button was pressed since the last frame.
    */
  def wasPressed(index: Double, button: Double): Boolean = js.native
  
  /**
    * Returns true if the button was released since the last frame.
    *
    * @param {number} index - The index of the pad to check, use constants {@link PAD_1},
    * {@link PAD_2}, etc.
    * @param {number} button - The button to test, use constants {@link PAD_FACE_1}, etc.
    * @returns {boolean} True if the button was released since the last frame.
    */
  def wasReleased(index: Double, button: Double): Boolean = js.native
}
