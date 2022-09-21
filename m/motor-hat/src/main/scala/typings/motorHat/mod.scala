package typings.motorHat

import typings.motorHat.anon.M1
import typings.motorHat.anon.W1
import typings.motorHat.anon.W2
import typings.motorHat.motorHatNumbers.`16`
import typings.motorHat.motorHatNumbers.`8`
import typings.motorHat.motorHatStrings.double
import typings.motorHat.motorHatStrings.interleaved
import typings.motorHat.motorHatStrings.microstep
import typings.motorHat.motorHatStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("motor-hat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new MotorHat controller
    *
    * Pass in an options object to generate an uninitialized MotorHat object.
    */
  inline def default(options: MotorHatOptions): MotorHat = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[MotorHat]
  
  type Callback = js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[Any], Unit]
  
  @js.native
  trait DC extends StObject {
    
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
  
  trait DCOptions extends StObject {
    
    var frequency: js.UndefOr[Double] = js.undefined
    
    /**
      * Pin definition for the motor
      */
    var pins: PinDefinition
    
    /**
      * PWM Interface Object
      */
    var pwm: js.Object
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object DCOptions {
    
    inline def apply(pins: PinDefinition, pwm: js.Object): DCOptions = {
      val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
      __obj.asInstanceOf[DCOptions]
    }
    
    extension [Self <: DCOptions](x: Self) {
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      inline def setPins(value: PinDefinition): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
      
      inline def setPinsVarargs(value: Double*): Self = StObject.set(x, "pins", js.Array(value*))
      
      inline def setPwm(value: js.Object): Self = StObject.set(x, "pwm", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.motorHat.motorHatStrings.fwd
    - typings.motorHat.motorHatStrings.back
  */
  trait Direction extends StObject
  object Direction {
    
    inline def back: typings.motorHat.motorHatStrings.back = "back".asInstanceOf[typings.motorHat.motorHatStrings.back]
    
    inline def fwd: typings.motorHat.motorHatStrings.fwd = "fwd".asInstanceOf[typings.motorHat.motorHatStrings.fwd]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.motorHat.motorHatStrings.M1
    - typings.motorHat.motorHatStrings.M2
    - typings.motorHat.motorHatStrings.M3
    - typings.motorHat.motorHatStrings.M4
  */
  trait Motor extends StObject
  object Motor {
    
    inline def M1: typings.motorHat.motorHatStrings.M1 = "M1".asInstanceOf[typings.motorHat.motorHatStrings.M1]
    
    inline def M2: typings.motorHat.motorHatStrings.M2 = "M2".asInstanceOf[typings.motorHat.motorHatStrings.M2]
    
    inline def M3: typings.motorHat.motorHatStrings.M3 = "M3".asInstanceOf[typings.motorHat.motorHatStrings.M3]
    
    inline def M4: typings.motorHat.motorHatStrings.M4 = "M4".asInstanceOf[typings.motorHat.motorHatStrings.M4]
  }
  
  @js.native
  trait MotorHat extends StObject {
    
    /**
      * Creates a new DC motor controller
      * Pass in an options object to generate an uninitialized DCLib object
      */
    def dc(opts: DCOptions): DC = js.native
    
    /**
      * Array of initialized DC controllers
      */
    val dcs: js.Array[DC] = js.native
    
    /**
      * Initialize the motorHat library instance.
      * Synchronous overload.
      *
      * Instantiates the individual Motor/Servo/Stepper controllers and initializes them.
      *
      * @returns     Returns initialized motorHat object (self)
      */
    def init(): MotorHat = js.native
    /**
      * Initialize the motorHat library instance.
      * Asynchronous overload.
      *
      * Instantiates the individual Motor/Servo/Stepper controllers and initializes them.
      * Returns initialized motorHat object (self) in second parameter to callback if callback
      * provided, to enable chaining.
      *
      * @param   cb  Node style callback for asynch initialization
      */
    def init(cb: Callback): Unit = js.native
    
    val pins: M1 = js.native
    
    /**
      * Creates a servo motor controller.
      * Pass in an options object to generate an uninitialized ServoLib object.
      */
    def servo(opts: ServoOptions): Servo = js.native
    
    /**
      * Array of initialized Servo controllers
      */
    val servos: js.Array[Servo] = js.native
    
    /**
      * Creates a stepper motor controller.
      * Pass in an options object to generate an uninitialized StepperLib object.
      */
    def stepper(opts: StepperOptions): Stepper = js.native
    
    /**
      * Array of initialized Stepper controllers
      */
    val steppers: js.Array[Stepper] = js.native
  }
  
  trait MotorHatOptions extends StObject {
    
    /**
      * i2c address of the PWM chip on the MotorHat.
      *
      * * 0x6F for knockoff HATs.
      *
      * * 0x60 for official AdaFruit HATs??
      */
    var address: js.UndefOr[Double] = js.undefined
    
    /**
      * i2c driver devfile number. Varies by RaspBerry version.
      * Should be automatically detected.
      */
    var busnum: js.UndefOr[Double] = js.undefined
    
    /**
      * Definition of the DC motors connected to the HAT.
      * At most 4 DCs, each should be one of following: 'M1', 'M2', 'M3', 'M4' depending on
      * port the motor is connected to.
      */
    var dcs: js.UndefOr[js.Array[Motor]] = js.undefined
    
    /**
      * Definition of the servos connected to the HAT.
      * List of the channels that have servos connected to them. 0 to 15.
      */
    var servos: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Definition of the stepper motors connected to the HAT.
      * At most 2 steppers, each motor is represented by either an object of the form
      * { W1: winding, W2: winding }. Each winding should be one of following: 'M1', 'M2', 'M3',
      * 'M4' depending on the port the stepper is connected to. Correct example: { W1: 'M3', W2: 'M1' }
      */
    var steppers: js.UndefOr[js.Array[W2]] = js.undefined
  }
  object MotorHatOptions {
    
    inline def apply(): MotorHatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MotorHatOptions]
    }
    
    extension [Self <: MotorHatOptions](x: Self) {
      
      inline def setAddress(value: Double): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setBusnum(value: Double): Self = StObject.set(x, "busnum", value.asInstanceOf[js.Any])
      
      inline def setBusnumUndefined: Self = StObject.set(x, "busnum", js.undefined)
      
      inline def setDcs(value: js.Array[Motor]): Self = StObject.set(x, "dcs", value.asInstanceOf[js.Any])
      
      inline def setDcsUndefined: Self = StObject.set(x, "dcs", js.undefined)
      
      inline def setDcsVarargs(value: Motor*): Self = StObject.set(x, "dcs", js.Array(value*))
      
      inline def setServos(value: js.Array[Double]): Self = StObject.set(x, "servos", value.asInstanceOf[js.Any])
      
      inline def setServosUndefined: Self = StObject.set(x, "servos", js.undefined)
      
      inline def setServosVarargs(value: Double*): Self = StObject.set(x, "servos", js.Array(value*))
      
      inline def setSteppers(value: js.Array[W2]): Self = StObject.set(x, "steppers", value.asInstanceOf[js.Any])
      
      inline def setSteppersUndefined: Self = StObject.set(x, "steppers", js.undefined)
      
      inline def setSteppersVarargs(value: W2*): Self = StObject.set(x, "steppers", js.Array(value*))
    }
  }
  
  trait MotorPins extends StObject {
    
    val IN1: Double
    
    val IN2: Double
    
    val PWM: Double
  }
  object MotorPins {
    
    inline def apply(IN1: Double, IN2: Double, PWM: Double): MotorPins = {
      val __obj = js.Dynamic.literal(IN1 = IN1.asInstanceOf[js.Any], IN2 = IN2.asInstanceOf[js.Any], PWM = PWM.asInstanceOf[js.Any])
      __obj.asInstanceOf[MotorPins]
    }
    
    extension [Self <: MotorPins](x: Self) {
      
      inline def setIN1(value: Double): Self = StObject.set(x, "IN1", value.asInstanceOf[js.Any])
      
      inline def setIN2(value: Double): Self = StObject.set(x, "IN2", value.asInstanceOf[js.Any])
      
      inline def setPWM(value: Double): Self = StObject.set(x, "PWM", value.asInstanceOf[js.Any])
    }
  }
  
  type PinDefinition = PinDefinitionObject | js.Array[Double]
  
  trait PinDefinitionObject extends StObject {
    
    /**
      * Pin number of the first coil output
      */
    var IN1: Double
    
    /**
      * Pin number of the second coil output
      */
    var IN2: Double
    
    /**
      * Pin number of the PWM output
      */
    var PWM: Double
  }
  object PinDefinitionObject {
    
    inline def apply(IN1: Double, IN2: Double, PWM: Double): PinDefinitionObject = {
      val __obj = js.Dynamic.literal(IN1 = IN1.asInstanceOf[js.Any], IN2 = IN2.asInstanceOf[js.Any], PWM = PWM.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinDefinitionObject]
    }
    
    extension [Self <: PinDefinitionObject](x: Self) {
      
      inline def setIN1(value: Double): Self = StObject.set(x, "IN1", value.asInstanceOf[js.Any])
      
      inline def setIN2(value: Double): Self = StObject.set(x, "IN2", value.asInstanceOf[js.Any])
      
      inline def setPWM(value: Double): Self = StObject.set(x, "PWM", value.asInstanceOf[js.Any])
    }
  }
  
  trait Servo extends StObject {
    
    /**
      * Calibrate the limits for the servolib
      *
      * @param   freq    The update freq in Hz
      * @param   min     The min. pulse in ms
      * @param   max     The max. pulse in ms
      */
    def calibrate(freq: Double, min: Double, max: Double): Unit
    
    /**
      * Move Servo to desired position.
      *
      * @param   pos     Relative position (0% to 100%).
      */
    def moveTo(pos: Double): Unit
  }
  object Servo {
    
    inline def apply(calibrate: (Double, Double, Double) => Unit, moveTo: Double => Unit): Servo = {
      val __obj = js.Dynamic.literal(calibrate = js.Any.fromFunction3(calibrate), moveTo = js.Any.fromFunction1(moveTo))
      __obj.asInstanceOf[Servo]
    }
    
    extension [Self <: Servo](x: Self) {
      
      inline def setCalibrate(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "calibrate", js.Any.fromFunction3(value))
      
      inline def setMoveTo(value: Double => Unit): Self = StObject.set(x, "moveTo", js.Any.fromFunction1(value))
    }
  }
  
  trait ServoOptions extends StObject {
    
    /**
      * PWM Controller frequency for the servo
      */
    var freq: js.UndefOr[Double] = js.undefined
    
    /**
      * Duration in ms of pulse at position 100
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * Duration in ms of pulse at position 0
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * Servo controller pin. Which pin (0 to 15) is the servo connected to?
      */
    var pin: Double
    
    /**
      * PWM Interface Object
      */
    var pwm: js.Object
  }
  object ServoOptions {
    
    inline def apply(pin: Double, pwm: js.Object): ServoOptions = {
      val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServoOptions]
    }
    
    extension [Self <: ServoOptions](x: Self) {
      
      inline def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
      
      inline def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setPin(value: Double): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      inline def setPwm(value: js.Object): Self = StObject.set(x, "pwm", value.asInstanceOf[js.Any])
    }
  }
  
  trait StepResult extends StObject {
    
    /**
      * Direction of steps performed
      */
    var dir: Direction
    
    /**
      * Time in ms taken to perform the steps
      */
    var duration: Double
    
    /**
      * Number of steps retried
      */
    var retried: Double
    
    /**
      * Performed steps
      */
    var steps: Double
  }
  object StepResult {
    
    inline def apply(dir: Direction, duration: Double, retried: Double, steps: Double): StepResult = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], retried = retried.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepResult]
    }
    
    extension [Self <: StepResult](x: Self) {
      
      inline def setDir(value: Direction): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setRetried(value: Double): Self = StObject.set(x, "retried", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    }
  }
  
  trait StepSyncResult extends StObject {
    
    /**
      * Direction of steps performed
      */
    var dir: Direction
    
    /**
      * Time in ms taken to perform the steps
      */
    var duration: Double
    
    /**
      * Performed steps
      */
    var steps: Double
  }
  object StepSyncResult {
    
    inline def apply(dir: Direction, duration: Double, steps: Double): StepSyncResult = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepSyncResult]
    }
    
    extension [Self <: StepSyncResult](x: Self) {
      
      inline def setDir(value: Direction): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stepper extends StObject {
    
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
      cb: js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    
    /**
      * Perform one step synchronously.
      * Configuration as stepping style, speed, etc should have been set previously.
      *
      * @param   dir     Direction of movement
      */
    def oneStepSync(dir: Direction): Unit = js.native
    
    val options: StepperOptions = js.native
    
    /**
      * Release the stepper motor asynchronously.
      *
      * Stops applying current to the motor coils.
      *
      * @param   cb      Node style callback
      */
    def release(cb: js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[Any], Unit]): Unit = js.native
    
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
    def setFrequency(freq: Double, cb: js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[Any], Unit]): Unit = js.native
    
    /**
      * Set PWM Controller working frequency synchronously.
      *
      * @param   freq    PWM frequency.
      */
    def setFrequencySync(freq: Double): Unit = js.native
    
    /**
      * Set desired number of microsteps per step.
      * (Used for microstepping)
      *
      * @param   ms      Microsteps per step
      */
    def setMicrosteps(ms: `8` | `16`): Unit = js.native
    
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
    
    /**
      * Set stepping style.
      *
      * @param   style   Stepping style.
      */
    def setStyle(style: single | double | interleaved | microstep): Unit = js.native
    
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
      cb: js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[StepResult], Unit]
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
  
  trait StepperOptions extends StObject {
    
    var current: js.UndefOr[Double] = js.undefined
    
    /**
      * PWM Controller frequency for the stepper
      */
    var frequency: js.UndefOr[Double] = js.undefined
    
    /**
      * number of microsteps per step
      */
    var microsteps: js.UndefOr[`8` | `16`] = js.undefined
    
    /**
      * Pin definition for the motor
      */
    var pins: W1
    
    /**
      * Pulses per second
      */
    var pps: js.UndefOr[Double] = js.undefined
    
    /**
      * PWM Interface Object
      */
    var pwm: js.Object
    
    /**
      * Revolutions per minute
      */
    var rpm: js.UndefOr[Double] = js.undefined
    
    /**
      * Steps per second
      */
    var sps: js.UndefOr[Double] = js.undefined
    
    /**
      * Steps per revolution of the stepper motor
      */
    var steps: js.UndefOr[Double] = js.undefined
    
    /**
      * Stepping style
      */
    var style: js.UndefOr[single | double | interleaved | microstep] = js.undefined
  }
  object StepperOptions {
    
    inline def apply(pins: W1, pwm: js.Object): StepperOptions = {
      val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepperOptions]
    }
    
    extension [Self <: StepperOptions](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      inline def setMicrosteps(value: `8` | `16`): Self = StObject.set(x, "microsteps", value.asInstanceOf[js.Any])
      
      inline def setMicrostepsUndefined: Self = StObject.set(x, "microsteps", js.undefined)
      
      inline def setPins(value: W1): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
      
      inline def setPps(value: Double): Self = StObject.set(x, "pps", value.asInstanceOf[js.Any])
      
      inline def setPpsUndefined: Self = StObject.set(x, "pps", js.undefined)
      
      inline def setPwm(value: js.Object): Self = StObject.set(x, "pwm", value.asInstanceOf[js.Any])
      
      inline def setRpm(value: Double): Self = StObject.set(x, "rpm", value.asInstanceOf[js.Any])
      
      inline def setRpmUndefined: Self = StObject.set(x, "rpm", js.undefined)
      
      inline def setSps(value: Double): Self = StObject.set(x, "sps", value.asInstanceOf[js.Any])
      
      inline def setSpsUndefined: Self = StObject.set(x, "sps", js.undefined)
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStyle(value: single | double | interleaved | microstep): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait StepperSpeed extends StObject {
    
    /**
      * Speed in pulses per second (pulses can be steps, microsteps, etc)
      */
    var pps: js.UndefOr[Double] = js.undefined
    
    /**
      * Speed in revolutions per minute
      */
    var rpm: js.UndefOr[Double] = js.undefined
    
    /**
      * Speed in steps per second
      */
    var sps: js.UndefOr[Double] = js.undefined
  }
  object StepperSpeed {
    
    inline def apply(): StepperSpeed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepperSpeed]
    }
    
    extension [Self <: StepperSpeed](x: Self) {
      
      inline def setPps(value: Double): Self = StObject.set(x, "pps", value.asInstanceOf[js.Any])
      
      inline def setPpsUndefined: Self = StObject.set(x, "pps", js.undefined)
      
      inline def setRpm(value: Double): Self = StObject.set(x, "rpm", value.asInstanceOf[js.Any])
      
      inline def setRpmUndefined: Self = StObject.set(x, "rpm", js.undefined)
      
      inline def setSps(value: Double): Self = StObject.set(x, "sps", value.asInstanceOf[js.Any])
      
      inline def setSpsUndefined: Self = StObject.set(x, "sps", js.undefined)
    }
  }
}
