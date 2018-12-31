package typings
package pigpioLib.pigpioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pigpio", "Gpio")
@js.native
class Gpio protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  /**
    * Returns a new Gpio object for accessing a GPIO
    * @param gpio      an unsigned integer specifying the GPIO number
    * @param options   object (optional)
    */
  def this(gpio: scala.Double) = this()
  def this(gpio: scala.Double, options: pigpioLib.Anon_Alert) = this()
  /**
    * The same to #pwmWrite.
    * @param dutyCycle     an unsigned integer >= 0 (off) and <= range (fully on). range defaults to 255.
    */
  def analogWrite(dutyCycle: scala.Double): Gpio = js.native
  /**
    * Returns the GPIO level, 0 or 1.
    */
  def digitalRead(): scala.Double = js.native
  /**
    * Sets the GPIO level to 0 or 1. If PWM or servo pulses are active on the GPIO they are switched off.
    * @param levle     0 or 1
    */
  def digitalWrite(levle: scala.Double): Gpio = js.native
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
  def enableInterrupt(edge: scala.Double): Gpio = js.native
  def enableInterrupt(edge: scala.Double, timeout: scala.Double): Gpio = js.native
  /**
    * Returns the GPIO mode.
    */
  def getMode(): scala.Double = js.native
  /**
    * Returns the PWM duty cycle setting on the GPIO.
    */
  def getPwmDutyCycle(): scala.Double = js.native
  /**
    * Returns the frequency (in hertz) used for the GPIO. The default frequency is 800Hz.
    */
  def getPwmFrequency(): scala.Double = js.native
  /**
    * Returns the duty cycle range used for the GPIO.
    * If hardware PWM is active on the GPIO the reported range will be 1000000.
    */
  def getPwmRange(): scala.Double = js.native
  /**
    * Returns the real range used for the GPIO.
    * If hardware PWM is active on the GPIO the reported real range will be approximately 250M divided by the set PWM frequency.
    */
  def getPwmRealRange(): scala.Double = js.native
  /**
    * Returns the servo pulse width setting on the GPIO.
    */
  def getServoPulseWidth(): scala.Double = js.native
  /**
    * Sets a glitch filter on a GPIO. Returns this.
    * @param steady    Time, in microseconds, during which the level must be stable. Maximum value: 300000
    */
  def glitchFilter(steady: scala.Double): Gpio = js.native
  /**
    * Starts hardware PWM on the GPIO at the specified frequency and dutyCycle. Frequencies above 30MHz are unlikely to work.
    * @param frequency     an unsigned integer >= 0 and <= 125000000
    * @param dutyCycle     an unsigned integer >= 0 (off) and <= 1000000 (fully on).
    */
  def hardwarePwmWrite(frequency: scala.Double, dutyCycle: scala.Double): Gpio = js.native
  /**
    * Sets the GPIO mode.
    * @param mode  INPUT, OUTPUT, ALT0, ALT1, ALT2, ALT3, ALT4, or ALT5
    */
  def mode(mode: scala.Double): Gpio = js.native
  /**
    * Sets or clears the resistor pull type for the GPIO.
    * @param pud   PUD_OFF, PUD_DOWN, or PUD_UP
    */
  def pullUpDown(pud: scala.Double): Gpio = js.native
  /**
    * Sets the frequency in hertz to be used for the GPIO. Returns this.
    * @param frequency      an unsigned integer >= 0
    */
  def pwmFrequency(frequency: scala.Double): Gpio = js.native
  /**
    * Selects the duty cycle range to be used for the GPIO. Subsequent calls to pwmWrite will use a duty cycle between 0 (off) and range (fully on).
    * @param range     an unsigned integer in the range 25 through 40000
    */
  def pwmRange(range: scala.Double): Gpio = js.native
  /**
    * Starts PWM on the GPIO. Returns this.
    * @param dutyCycle     an unsigned integer >= 0 (off) and <= range (fully on). range defaults to 255.
    */
  def pwmWrite(dutyCycle: scala.Double): Gpio = js.native
  /**
    * Starts servo pulses at 50Hz on the GPIO, 0 (off), 500 (most anti-clockwise) to 2500 (most clockwise)
    * @param pulseWidth    pulse width in microseconds, an unsigned integer, 0 or a number in the range 500 through 2500
    */
  def servoWrite(pulseWidth: scala.Double): Gpio = js.native
  /**
    * Sends a trigger pulse to the GPIO. The GPIO is set to level for pulseLen microseconds and then reset to not level.
    * @param pulseLen  pulse length in microseconds (1 - 100)
    * @param level     0 or 1
    */
  def trigger(pulseLen: scala.Double, level: scala.Double): Gpio = js.native
}

@JSImport("pigpio", "Gpio")
@js.native
object Gpio extends js.Object {
  /**
    * Indicates that the GPIO is in alternative mode 0.
    */
  var ALT0: scala.Double = js.native
  /**
    * Indicates that the GPIO is in alternative mode 1.
    */
  var ALT1: scala.Double = js.native
  /**
    * Indicates that the GPIO is in alternative mode 2.
    */
  var ALT2: scala.Double = js.native
  /**
    * Indicates that the GPIO is in alternative mode 03.
    */
  var ALT3: scala.Double = js.native
  /**
    * Indicates that the GPIO is in alternative mode 4.
    */
  var ALT4: scala.Double = js.native
  /**
    * Indicates that the GPIO is in alternative mode 5.
    */
  var ALT5: scala.Double = js.native
  /**
    * Indicates that the GPIO fires interrupts on both rising and falling edges.
    */
  var EITHER_EDGE: scala.Double = js.native
  /**
    * Indicates that the GPIO fires interrupts on falling edges.
    */
  var FALLING_EDGE: scala.Double = js.native
  /*----------------------*
    * mode
    *----------------------*/
  /**
    * Indicates that the GPIO is an input.
    */
  var INPUT: scala.Double = js.native
  /**
    * The largest GPIO number.
    */
  var MAX_GPIO: scala.Double = js.native
  /**
    * The largest user GPIO number.
    */
  var MAX_USER_GPIO: scala.Double = js.native
  /*----------------------*
    * gpio numbers
    *----------------------*
    / **
    * The smallest GPIO number.
    */
  var MIN_GPIO: scala.Double = js.native
  /**
    * Indicates that the GPIO is an output.
    */
  var OUTPUT: scala.Double = js.native
  /**
    * Enable pull-down resistor.
    */
  var PUD_DOWN: scala.Double = js.native
  /*----------------------*
    * pud
    *----------------------*/
  /**
    * Niether the pull-up nor the pull-down resistor should be enabled.
    */
  var PUD_OFF: scala.Double = js.native
  /**
    * Enable pull-up resistor.
    */
  var PUD_UP: scala.Double = js.native
  /*----------------------*
    * isr
    *----------------------*/
  /**
    * Indicates that the GPIO fires interrupts on rising edges.
    */
  var RISING_EDGE: scala.Double = js.native
  /*----------------------*
    * timeout
    *----------------------*/
  /**
    * The level argument passed to an interrupt event listener when an interrupt timeout expires.
    */
  var TIMEOUT: scala.Double = js.native
}

