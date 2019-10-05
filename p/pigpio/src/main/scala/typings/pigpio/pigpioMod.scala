package typings.pigpio

import typings.node.NodeJS.EventEmitter
import typings.node.NodeJS.ReadableStream
import typings.pigpio.pigpioMod.Gpio
import typings.pigpio.pigpioMod.GpioBank
import typings.pigpio.pigpioMod.Notifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pigpio", JSImport.Namespace)
@js.native
object pigpioMod extends js.Object {
  @js.native
  class Gpio protected () extends EventEmitter {
    /**
      * Returns a new Gpio object for accessing a GPIO
      * @param gpio      an unsigned integer specifying the GPIO number
      * @param options   object (optional)
      */
    def this(gpio: Double) = this()
    def this(gpio: Double, options: Anon_Alert) = this()
    /**
      * The same to #pwmWrite.
      * @param dutyCycle     an unsigned integer >= 0 (off) and <= range (fully on). range defaults to 255.
      */
    def analogWrite(dutyCycle: Double): Gpio = js.native
    /**
      * Returns the GPIO level, 0 or 1.
      */
    def digitalRead(): Double = js.native
    /**
      * Sets the GPIO level to 0 or 1. If PWM or servo pulses are active on the GPIO they are switched off.
      * @param level     0 or 1
      */
    def digitalWrite(level: Double): Gpio = js.native
    /**
      * Disables aterts for the GPIO. Returns this.
      */
    def disableAlert(): Gpio = js.native
    /**
      * Disables interrupts for the GPIO. Returns this.
      */
    def disableInterrupt(): Gpio = js.native
    /**
      * Enables alerts for the GPIO. Returns this.
      */
    def enableAlert(): Gpio = js.native
    /**
      * Enables interrupts for the GPI
      * @param edge      RISING_EDGE, FALLING_EDGE, or EITHER_EDGE
      * @param timeout   interrupt timeout in milliseconds (optional, defaults to 0 meaning no timeout)
      */
    def enableInterrupt(edge: Double): Gpio = js.native
    def enableInterrupt(edge: Double, timeout: Double): Gpio = js.native
    /**
      * Returns the GPIO mode.
      */
    def getMode(): Double = js.native
    /**
      * Returns the PWM duty cycle setting on the GPIO.
      */
    def getPwmDutyCycle(): Double = js.native
    /**
      * Returns the frequency (in hertz) used for the GPIO. The default frequency is 800Hz.
      */
    def getPwmFrequency(): Double = js.native
    /**
      * Returns the duty cycle range used for the GPIO.
      * If hardware PWM is active on the GPIO the reported range will be 1000000.
      */
    def getPwmRange(): Double = js.native
    /**
      * Returns the real range used for the GPIO.
      * If hardware PWM is active on the GPIO the reported real range will be approximately 250M divided by the set PWM frequency.
      */
    def getPwmRealRange(): Double = js.native
    /**
      * Returns the servo pulse width setting on the GPIO.
      */
    def getServoPulseWidth(): Double = js.native
    /**
      * Sets a glitch filter on a GPIO. Returns this.
      * @param steady    Time, in microseconds, during which the level must be stable. Maximum value: 300000
      */
    def glitchFilter(steady: Double): Gpio = js.native
    /**
      * Starts hardware PWM on the GPIO at the specified frequency and dutyCycle. Frequencies above 30MHz are unlikely to work.
      * @param frequency     an unsigned integer >= 0 and <= 125000000
      * @param dutyCycle     an unsigned integer >= 0 (off) and <= 1000000 (fully on).
      */
    def hardwarePwmWrite(frequency: Double, dutyCycle: Double): Gpio = js.native
    /**
      * Sets the GPIO mode.
      * @param mode  INPUT, OUTPUT, ALT0, ALT1, ALT2, ALT3, ALT4, or ALT5
      */
    def mode(mode: Double): Gpio = js.native
    /**
      * Sets or clears the resistor pull type for the GPIO.
      * @param pud   PUD_OFF, PUD_DOWN, or PUD_UP
      */
    def pullUpDown(pud: Double): Gpio = js.native
    /**
      * Sets the frequency in hertz to be used for the GPIO. Returns this.
      * @param frequency      an unsigned integer >= 0
      */
    def pwmFrequency(frequency: Double): Gpio = js.native
    /**
      * Selects the duty cycle range to be used for the GPIO. Subsequent calls to pwmWrite will use a duty cycle between 0 (off) and range (fully on).
      * @param range     an unsigned integer in the range 25 through 40000
      */
    def pwmRange(range: Double): Gpio = js.native
    /**
      * Starts PWM on the GPIO. Returns this.
      * @param dutyCycle     an unsigned integer >= 0 (off) and <= range (fully on). range defaults to 255.
      */
    def pwmWrite(dutyCycle: Double): Gpio = js.native
    /**
      * Starts servo pulses at 50Hz on the GPIO, 0 (off), 500 (most anti-clockwise) to 2500 (most clockwise)
      * @param pulseWidth    pulse width in microseconds, an unsigned integer, 0 or a number in the range 500 through 2500
      */
    def servoWrite(pulseWidth: Double): Gpio = js.native
    /**
      * Sends a trigger pulse to the GPIO. The GPIO is set to level for pulseLen microseconds and then reset to not level.
      * @param pulseLen  pulse length in microseconds (1 - 100)
      * @param level     0 or 1
      */
    def trigger(pulseLen: Double, level: Double): Gpio = js.native
  }
  
  @js.native
  /**
    * Returns a new GpioBank object for accessing up to 32 GPIOs as one operation.
    * @param bank  BANK1 or BANK2 (optional, defaults to BANK1)
    */
  class GpioBank () extends js.Object {
    def this(bank: Double) = this()
    /**
      * Returns the bank identifier (BANK1 or BANK2.)
      */
    def bank(): Double = js.native
    /**
      * For each GPIO in the bank, sets the GPIO level to 0 if the corresponding bit in bits is set.
      * @param bits   a bit mask of the the GPIOs to clear or set to 0
      */
    def clear(bits: Double): GpioBank = js.native
    /**
      * Returns the current level of all GPIOs in the bank.
      */
    def read(): Double = js.native
    /**
      * For each GPIO in the bank, sets the GPIO level to 1 if the corresponding bit in bits is set.
      * @param bits  a bit mask of the the GPIOs to set to 1
      */
    def set(bits: Double): GpioBank = js.native
  }
  
  @js.native
  /**
    * Returns a new Notifier object that contains a stream which provides notifications about state changes on any of GPIOs 0 through 31 concurrently.
    * @param options   Used to configure which GPIOs notifications should be provided for.
    */
  class Notifier () extends js.Object {
    def this(options: Anon_Bits) = this()
    /**
      * Stops notifications and releases resources.
      */
    def close(): Notifier = js.native
    /**
      * Starts notifications for the GPIOs specified in the bit mask.
      * @param bits  a bit mask indicating the GPIOs of interest, bit0 corresponds to GPIO0, bit1 corresponds to GPIO1, ..., bit31 corresponds to GPIO31.
      * If a bit is set, the corresponding GPIO will be monitored for state changes.
      */
    def start(bits: Double): Notifier = js.native
    /**
      * Stops notifications. Notifications can be restarted with the start method.
      */
    def stop(): Notifier = js.native
    /**
      * Returns the notification stream which is a Readable stream.
      */
    def stream(): ReadableStream = js.native
  }
  
  val CLOCK_PCM: Double = js.native
  val CLOCK_PWM: Double = js.native
  def configureClock(microseconds: Double, peripheral: Double): Unit = js.native
  def configureSocketPort(port: Double): Unit = js.native
  def getTick(): Double = js.native
  def hardwareRevision(): Double = js.native
  def initialize(): Unit = js.native
  def terminate(): Unit = js.native
  def tickDiff(startTick: Double, endTick: Double): Double = js.native
  /* static members */
  @js.native
  object Gpio extends js.Object {
    /**
      * Indicates that the GPIO is in alternative mode 0.
      */
    var ALT0: Double = js.native
    /**
      * Indicates that the GPIO is in alternative mode 1.
      */
    var ALT1: Double = js.native
    /**
      * Indicates that the GPIO is in alternative mode 2.
      */
    var ALT2: Double = js.native
    /**
      * Indicates that the GPIO is in alternative mode 03.
      */
    var ALT3: Double = js.native
    /**
      * Indicates that the GPIO is in alternative mode 4.
      */
    var ALT4: Double = js.native
    /**
      * Indicates that the GPIO is in alternative mode 5.
      */
    var ALT5: Double = js.native
    /**
      * Indicates that the GPIO fires interrupts on both rising and falling edges.
      */
    var EITHER_EDGE: Double = js.native
    /**
      * Indicates that the GPIO fires interrupts on falling edges.
      */
    var FALLING_EDGE: Double = js.native
    /*----------------------*
      * mode
      *----------------------*/
    /**
      * Indicates that the GPIO is an input.
      */
    var INPUT: Double = js.native
    /**
      * The largest GPIO number.
      */
    var MAX_GPIO: Double = js.native
    /**
      * The largest user GPIO number.
      */
    var MAX_USER_GPIO: Double = js.native
    /*----------------------*
      * gpio numbers
      *----------------------*
      / **
      * The smallest GPIO number.
      */
    var MIN_GPIO: Double = js.native
    /**
      * Indicates that the GPIO is an output.
      */
    var OUTPUT: Double = js.native
    /**
      * Enable pull-down resistor.
      */
    var PUD_DOWN: Double = js.native
    /*----------------------*
      * pud
      *----------------------*/
    /**
      * Niether the pull-up nor the pull-down resistor should be enabled.
      */
    var PUD_OFF: Double = js.native
    /**
      * Enable pull-up resistor.
      */
    var PUD_UP: Double = js.native
    /*----------------------*
      * isr
      *----------------------*/
    /**
      * Indicates that the GPIO fires interrupts on rising edges.
      */
    var RISING_EDGE: Double = js.native
    /*----------------------*
      * timeout
      *----------------------*/
    /**
      * The level argument passed to an interrupt event listener when an interrupt timeout expires.
      */
    var TIMEOUT: Double = js.native
  }
  
  /* static members */
  @js.native
  object GpioBank extends js.Object {
    /**
      * Identifies bank 2.
      */
    var BACK2: Double = js.native
    /**
      * Identifies bank 1.
      */
    var BANK1: Double = js.native
  }
  
  /* static members */
  @js.native
  object Notifier extends js.Object {
    /**
      * The number of bytes occupied by a notification in the notification stream.
      */
    var NOTIFICATION_LENGTH: Double = js.native
    /**
      * Indicates a keep alive signal on the stream and is sent once a minute in the absence of other notification activity.
      */
    var PI_NTFY_FLAGS_ALIVE: Double = js.native
  }
  
}

