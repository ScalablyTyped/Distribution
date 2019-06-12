package typings
package motorDashHatLib.motorDashHatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stepper extends js.Object {
  val options: StepperOptions = js.native
  /**
    * Initialize the Stepeper controller instance.
    * Synchronous overload.
    *
    * @returns Returns init'd Stepper controller object (self)
    */
  def init(): this.type = js.native
  /**
    * Initialize the Stepeper controller instance.
    * Synchronous overload.
    *
    * @param   cb      Node style callback for asynch initialization
    */
  def init(cb: js.Function2[/* err */ scala.Null, /* self */ this.type, scala.Unit]): scala.Unit = js.native
  /**
    * Perform one step asynchronously.
    * Configuration as stepping style, speed, etc should have been set previously.
    *
    * @param   dir     Direction of movement
    * @param   cb      Node style callback. cb(err, result).
    */
  def oneStep(
    dir: Direction,
    cb: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* result */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Perform one step synchronously.
    * Configuration as stepping style, speed, etc should have been set previously.
    *
    * @param   dir     Direction of movement
    */
  def oneStepSync(dir: Direction): scala.Unit = js.native
  /**
    * Release the stepper motor asynchronously.
    *
    * Stops applying current to the motor coils.
    *
    * @param   cb      Node style callback
    */
  def release(cb: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* result */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  /**
    * Release the stepper motor synchronously.
    * Stops applying current to the motor coils.
    */
  def releaseSync(): scala.Unit = js.native
  /**
    * Set the current rate at which to supply the steps.
    * Provide a number from 0 to 1 and the current will be reduced proportionally
    *
    * @param   current Current rate, from 0 to 1.
    */
  def setCurrent(current: scala.Double): scala.Unit = js.native
  /**
    * Set PWM Controller working frequency asynchronously.
    *
    * @param   freq    PWM frequency.
    * @param   cb      Node style callback. cb(err, result).
    */
  def setFrequency(
    freq: scala.Double,
    cb: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* result */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Set PWM Controller working frequency synchronously.
    *
    * @param   freq    PWM frequency.
    */
  def setFrequencySync(freq: scala.Double): scala.Unit = js.native
  @JSName("setMicrosteps")
  def setMicrosteps_16(ms: motorDashHatLib.motorDashHatLibNumbers.`16`): scala.Unit = js.native
  /**
    * Set desired number of microsteps per step.
    * (Used for microstepping)
    *
    * @param   ms      Microsteps per step
    */
  @JSName("setMicrosteps")
  def setMicrosteps_8(ms: motorDashHatLib.motorDashHatLibNumbers.`8`): scala.Unit = js.native
  /**
    * Set motor speed for step().
    */
  def setSpeed(speed: StepperSpeed): scala.Unit = js.native
  /**
    * Set number of steps per revolution for motor.
    *
    * @param   steps   Number of steps per revolution for stepper motor.
    */
  def setSteps(steps: scala.Double): scala.Unit = js.native
  @JSName("setStyle")
  def setStyle_double(style: motorDashHatLib.motorDashHatLibStrings.double): scala.Unit = js.native
  @JSName("setStyle")
  def setStyle_interleaved(style: motorDashHatLib.motorDashHatLibStrings.interleaved): scala.Unit = js.native
  @JSName("setStyle")
  def setStyle_microstep(style: motorDashHatLib.motorDashHatLibStrings.microstep): scala.Unit = js.native
  /**
    * Set stepping style.
    *
    * @param   style   Stepping style.
    */
  @JSName("setStyle")
  def setStyle_single(style: motorDashHatLib.motorDashHatLibStrings.single): scala.Unit = js.native
  /**
    * Perform arbitrary number of steps asynchronously.
    * Configuration as stepping style, speed, etc should have been set previously.
    *
    * @param   dir     Direction of movement
    * @param   steps   Number of steps.
    * @param   cb      Node style callback. cb(err, result).
    */
  def step(
    dir: Direction,
    steps: scala.Double,
    cb: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* result */ js.UndefOr[StepResult], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Perform arbitrary number of steps synchronously.
    * Configuration as stepping style, speed, etc should have been set previously.
    *
    * @param   dir     Direction of movement
    * @param   steps   Number of steps.
    * @returns The result of the action.
    */
  def stepSync(dir: Direction, steps: scala.Double): StepSyncResult = js.native
}

