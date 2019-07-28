package typings.phaser.PhaserNs.InputNs.GamepadNs

import typings.phaser.PhaserNs.EventsNs.EventEmitter
import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.PhaserNs.TypesNs.InputNs.GamepadNs.Pad
import typings.phaser.integer
import typings.std.GamepadHapticActuator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Gamepad.
  * 
  * These are created, updated and managed by the Gamepad Plugin.
  */
@JSGlobal("Phaser.Input.Gamepad.Gamepad")
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

