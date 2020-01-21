package typings.motorHat.mod

import typings.motorHat.motorHatNumbers.`16`
import typings.motorHat.motorHatNumbers.`8`
import typings.motorHat.motorHatStrings.double
import typings.motorHat.motorHatStrings.interleaved
import typings.motorHat.motorHatStrings.microstep
import typings.motorHat.motorHatStrings.single
import typings.std.Error
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
  def init(cb: js.Function2[/* err */ Null, /* self */ this.type, Unit]): Unit = js.native
  /**
    * Perform one step asynchronously.
    * Configuration as stepping style, speed, etc should have been set previously.
    *
    * @param   dir     Direction of movement
    * @param   cb      Node style callback. cb(err, result).
    */
  def oneStep(
    dir: Direction,
    cb: js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  /**
    * Perform one step synchronously.
    * Configuration as stepping style, speed, etc should have been set previously.
    *
    * @param   dir     Direction of movement
    */
  def oneStepSync(dir: Direction): Unit = js.native
  /**
    * Release the stepper motor asynchronously.
    *
    * Stops applying current to the motor coils.
    *
    * @param   cb      Node style callback
    */
  def release(cb: js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[js.Any], Unit]): Unit = js.native
  /**
    * Release the stepper motor synchronously.
    * Stops applying current to the motor coils.
    */
  def releaseSync(): Unit = js.native
  /**
    * Set the current rate at which to supply the steps.
    * Provide a number from 0 to 1 and the current will be reduced proportionally
    *
    * @param   current Current rate, from 0 to 1.
    */
  def setCurrent(current: Double): Unit = js.native
  /**
    * Set PWM Controller working frequency asynchronously.
    *
    * @param   freq    PWM frequency.
    * @param   cb      Node style callback. cb(err, result).
    */
  def setFrequency(freq: Double, cb: js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[js.Any], Unit]): Unit = js.native
  /**
    * Set PWM Controller working frequency synchronously.
    *
    * @param   freq    PWM frequency.
    */
  def setFrequencySync(freq: Double): Unit = js.native
  @JSName("setMicrosteps")
  def setMicrosteps_16(ms: `16`): Unit = js.native
  /**
    * Set desired number of microsteps per step.
    * (Used for microstepping)
    *
    * @param   ms      Microsteps per step
    */
  @JSName("setMicrosteps")
  def setMicrosteps_8(ms: `8`): Unit = js.native
  /**
    * Set motor speed for step().
    */
  def setSpeed(speed: StepperSpeed): Unit = js.native
  /**
    * Set number of steps per revolution for motor.
    *
    * @param   steps   Number of steps per revolution for stepper motor.
    */
  def setSteps(steps: Double): Unit = js.native
  @JSName("setStyle")
  def setStyle_double(style: double): Unit = js.native
  @JSName("setStyle")
  def setStyle_interleaved(style: interleaved): Unit = js.native
  @JSName("setStyle")
  def setStyle_microstep(style: microstep): Unit = js.native
  /**
    * Set stepping style.
    *
    * @param   style   Stepping style.
    */
  @JSName("setStyle")
  def setStyle_single(style: single): Unit = js.native
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
    steps: Double,
    cb: js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[StepResult], Unit]
  ): Unit = js.native
  /**
    * Perform arbitrary number of steps synchronously.
    * Configuration as stepping style, speed, etc should have been set previously.
    *
    * @param   dir     Direction of movement
    * @param   steps   Number of steps.
    * @returns The result of the action.
    */
  def stepSync(dir: Direction, steps: Double): StepSyncResult = js.native
}

