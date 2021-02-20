package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input handler for accessing GamePad input.
  */
@js.native
trait GamePads extends StObject {
  
  /**
    * Get the value of one of the analogue axes of the pad.
    * @param index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param axes - The axes to get the value of, use constants pc.PAD_L_STICK_X, etc.
    * @returns The value of the axis between -1 and 1.
    */
  def getAxis(index: Double, axes: Double): Double = js.native
  
  /**
    * Returns true if the button on the pad requested is pressed.
    * @param index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param button - The button to test, use constants pc.PAD_FACE_1, etc.
    * @returns True if the button is pressed.
    */
  def isPressed(index: Double, button: Double): Boolean = js.native
  
  /**
    * Poll for the latest data from the gamepad API.
    * @example
    * var gamepads = new pc.GamePads();
    * var pads = gamepads.poll();
    * @returns An array of gamepads and mappings for the model of gamepad that is attached.
    */
  def poll(): js.Array[js.Object] = js.native
  
  /**
    * Update the current and previous state of the gamepads. This must be called every frame for wasPressed()
    * to work.
    */
  def update(): Unit = js.native
  
  /**
    * Returns true if the button was pressed since the last frame.
    * @param index - The index of the pad to check, use constants pc.PAD_1, pc.PAD_2, etc.
    * @param button - The button to test, use constants pc.PAD_FACE_1, etc.
    * @returns True if the button was pressed since the last frame.
    */
  def wasPressed(index: Double, button: Double): Boolean = js.native
}
object GamePads {
  
  @scala.inline
  def apply(
    getAxis: (Double, Double) => Double,
    isPressed: (Double, Double) => Boolean,
    poll: () => js.Array[js.Object],
    update: () => Unit,
    wasPressed: (Double, Double) => Boolean
  ): GamePads = {
    val __obj = js.Dynamic.literal(getAxis = js.Any.fromFunction2(getAxis), isPressed = js.Any.fromFunction2(isPressed), poll = js.Any.fromFunction0(poll), update = js.Any.fromFunction0(update), wasPressed = js.Any.fromFunction2(wasPressed))
    __obj.asInstanceOf[GamePads]
  }
  
  @scala.inline
  implicit class GamePadsMutableBuilder[Self <: GamePads] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAxis(value: (Double, Double) => Double): Self = StObject.set(x, "getAxis", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsPressed(value: (Double, Double) => Boolean): Self = StObject.set(x, "isPressed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPoll(value: () => js.Array[js.Object]): Self = StObject.set(x, "poll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWasPressed(value: (Double, Double) => Boolean): Self = StObject.set(x, "wasPressed", js.Any.fromFunction2(value))
  }
}
