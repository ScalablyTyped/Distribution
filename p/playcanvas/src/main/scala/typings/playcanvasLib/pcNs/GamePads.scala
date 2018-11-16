package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * @name pc.GamePads
    * @class Input handler for accessing GamePad input
    */
@JSGlobal("pc.GamePads")
@js.native
class GamePads () extends js.Object {
  /**
          * @function
          * @name pc.GamePads#getAxis
          * @description Get the value of one of the analogue axes of the pad
          * @param {Number} index The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc
          * @param {Number} axes The axes to get the value of, use constants pc.PAD_L_STICK_X, etc
          * @returns {Number} The value of the axis between -1 and 1.
          */
  def getAxis(index: scala.Double, axes: scala.Double): scala.Double = js.native
  /**
          * @function
          * @name pc.GamePads#isPressed
          * @description Returns true if the button on the pad requested is pressed
          * @param {Number} index The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc
          * @param {Number} button The button to test, use constants pc.PAD_FACE_1, etc
          * @returns {Boolean} True if the button is pressed
          */
  def isPressed(index: scala.Double, button: scala.Double): scala.Boolean = js.native
  /**
          * @function
          * @name pc.GamePads#poll
          * @description Poll for the latest data from the gamepad API.
          * @returns {Object[]} An array of gamepads and mappings for the model of gamepad that is attached
          * @example
          *   var gamepads = new pc.GamePads();
          *   var pads = gamepads.poll();
          *   // pads[0] = { map: <map>, pad: <pad> }
          */
  def poll(): playcanvasLib.Anon_Map = js.native
  /**
          * @function
          * @name pc.GamePads#update
          * @description Update the current and previous state of the gamepads. This must be called every frame for wasPressed()
          * to work
          */
  def update(dt: scala.Double): scala.Unit = js.native
  /**
          * @function
          * @name pc.GamePads#wasPressed
          * @description Returns true if the button was pressed since the last frame
          * @param {Number} index The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc
          * @param {Number} button The button to test, use constants pc.PAD_FACE_1, etc
          * @returns {Boolean} True if the button was pressed since the last frame
          */
  def wasPressed(index: scala.Double, button: scala.Double): scala.Boolean = js.native
}

