package typings.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DC extends js.Object {
  
  /**
    * Initialize the DC controller instance.
    * Synchronous overload.
    */
  def init(): this.type = js.native
  /**
    * Initialize the DC controller instance.
    * Asynchronous overload.
    *
    * @param   cb      Node style callback for asynch initialization
    */
  def init(cb: Callback): Unit = js.native
  
  /**
    * Starts the motor in the desired direction.
    *
    * @param   dir     Direction of movement.
    * @param   cb      Node style callback. Gets called with cb(err, result) after completion.
    */
  def run(dir: Direction, cb: Callback): Unit = js.native
  
  /**
    * Starts the motor in the desired direction.
    *
    * @param   dir     Direction of movement.
    */
  def runSync(dir: Direction): Unit = js.native
  
  /**
    * Sets the PWM frequency for the DC motor.
    * This setting affects the frequency at which the PWM chip will work to command the DC motor.
    *
    * @param   freq    PWM Frequency in Hz.
    * @param   cb      Node style callback. Gets called with cb(err, result) after completion.
    */
  def setFrequency(freq: Double, cb: Callback): Unit = js.native
  
  /**
    * Sets the PWM frequency for the DC motor.
    * This setting affects the frequency at which the PWM chip will work to command the DC motor.
    *
    * @param   freq    PWM Frequency in Hz.
    */
  def setFrequencySync(freq: Double): Unit = js.native
  
  /**
    * Sets DC motor speed.
    * The speed can be set as a percentage, from 0% to 100%. To change the actual top speed,
    * the actual voltage supplied to the motor needs to be controlled by hardware (get a higher
    * voltage source).
    *
    * @param   speed   Relative speed. 0% to 100%.
    * @param   cb      Node style callback. Gets called with cb(err, result) after completion.
    */
  def setSpeed(speed: Double, cb: Callback): Unit = js.native
  
  /**
    * Sets DC motor speed.
    * The speed can be set as a percentage, from 0% to 100%. To change the actual top speed,
    * the actual voltage supplied to the motor needs to be controlled by hardware (get a higher
    * voltage source).
    *
    * @param   speed   Relative speed. 0% to 100%.
    */
  def setSpeedSync(speed: Double): Unit = js.native
  
  /**
    * Stops the motor.
    * Doesn't actually brake the motor, just stops applying voltage to it.
    *
    * @param   cb      Node style callback. Gets called with cb(err, result) after completion.
    */
  def stop(cb: Callback): Unit = js.native
  
  /**
    * Stops the motor.
    * Doesn't actually brake the motor, just stops applying voltage to it.
    */
  def stopSync(): Unit = js.native
}
