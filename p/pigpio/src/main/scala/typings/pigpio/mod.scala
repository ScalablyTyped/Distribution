package typings.pigpio

import typings.node.NodeJS.ReadableStream
import typings.node.eventsMod.EventEmitter
import typings.pigpio.anon.Alert
import typings.pigpio.anon.Bits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pigpio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pigpio", "CLOCK_PCM")
  @js.native
  val CLOCK_PCM: Double = js.native
  
  @JSImport("pigpio", "CLOCK_PWM")
  @js.native
  val CLOCK_PWM: Double = js.native
  
  @JSImport("pigpio", "Gpio")
  @js.native
  class Gpio protected () extends EventEmitter {
    /**
      * Returns a new Gpio object for accessing a GPIO
      * @param gpio      an unsigned integer specifying the GPIO number
      * @param options   object (optional)
      */
    def this(gpio: Double) = this()
    def this(gpio: Double, options: Alert) = this()
    
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
  /* static members */
  object Gpio {
    
    @JSImport("pigpio", "Gpio")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Indicates that the GPIO is in alternative mode 0.
      */
    @JSImport("pigpio", "Gpio.ALT0")
    @js.native
    def ALT0: Double = js.native
    @scala.inline
    def ALT0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALT0")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates that the GPIO is in alternative mode 1.
      */
    @JSImport("pigpio", "Gpio.ALT1")
    @js.native
    def ALT1: Double = js.native
    @scala.inline
    def ALT1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALT1")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates that the GPIO is in alternative mode 2.
      */
    @JSImport("pigpio", "Gpio.ALT2")
    @js.native
    def ALT2: Double = js.native
    @scala.inline
    def ALT2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALT2")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates that the GPIO is in alternative mode 03.
      */
    @JSImport("pigpio", "Gpio.ALT3")
    @js.native
    def ALT3: Double = js.native
    @scala.inline
    def ALT3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALT3")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates that the GPIO is in alternative mode 4.
      */
    @JSImport("pigpio", "Gpio.ALT4")
    @js.native
    def ALT4: Double = js.native
    @scala.inline
    def ALT4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALT4")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates that the GPIO is in alternative mode 5.
      */
    @JSImport("pigpio", "Gpio.ALT5")
    @js.native
    def ALT5: Double = js.native
    @scala.inline
    def ALT5_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALT5")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates that the GPIO fires interrupts on both rising and falling edges.
      */
    @JSImport("pigpio", "Gpio.EITHER_EDGE")
    @js.native
    def EITHER_EDGE: Double = js.native
    @scala.inline
    def EITHER_EDGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EITHER_EDGE")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates that the GPIO fires interrupts on falling edges.
      */
    @JSImport("pigpio", "Gpio.FALLING_EDGE")
    @js.native
    def FALLING_EDGE: Double = js.native
    @scala.inline
    def FALLING_EDGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FALLING_EDGE")(x.asInstanceOf[js.Any])
    
    /*----------------------*
      * mode
      *----------------------*/
    /**
      * Indicates that the GPIO is an input.
      */
    @JSImport("pigpio", "Gpio.INPUT")
    @js.native
    def INPUT: Double = js.native
    @scala.inline
    def INPUT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT")(x.asInstanceOf[js.Any])
    
    /**
      * The largest GPIO number.
      */
    @JSImport("pigpio", "Gpio.MAX_GPIO")
    @js.native
    def MAX_GPIO: Double = js.native
    @scala.inline
    def MAX_GPIO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_GPIO")(x.asInstanceOf[js.Any])
    
    /**
      * The largest user GPIO number.
      */
    @JSImport("pigpio", "Gpio.MAX_USER_GPIO")
    @js.native
    def MAX_USER_GPIO: Double = js.native
    @scala.inline
    def MAX_USER_GPIO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_USER_GPIO")(x.asInstanceOf[js.Any])
    
    /*----------------------*
      * gpio numbers
      *----------------------*
      / **
      * The smallest GPIO number.
      */
    @JSImport("pigpio", "Gpio.MIN_GPIO")
    @js.native
    def MIN_GPIO: Double = js.native
    @scala.inline
    def MIN_GPIO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_GPIO")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates that the GPIO is an output.
      */
    @JSImport("pigpio", "Gpio.OUTPUT")
    @js.native
    def OUTPUT: Double = js.native
    @scala.inline
    def OUTPUT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUTPUT")(x.asInstanceOf[js.Any])
    
    /**
      * Enable pull-down resistor.
      */
    @JSImport("pigpio", "Gpio.PUD_DOWN")
    @js.native
    def PUD_DOWN: Double = js.native
    @scala.inline
    def PUD_DOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUD_DOWN")(x.asInstanceOf[js.Any])
    
    /*----------------------*
      * pud
      *----------------------*/
    /**
      * Niether the pull-up nor the pull-down resistor should be enabled.
      */
    @JSImport("pigpio", "Gpio.PUD_OFF")
    @js.native
    def PUD_OFF: Double = js.native
    @scala.inline
    def PUD_OFF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUD_OFF")(x.asInstanceOf[js.Any])
    
    /**
      * Enable pull-up resistor.
      */
    @JSImport("pigpio", "Gpio.PUD_UP")
    @js.native
    def PUD_UP: Double = js.native
    @scala.inline
    def PUD_UP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUD_UP")(x.asInstanceOf[js.Any])
    
    /*----------------------*
      * isr
      *----------------------*/
    /**
      * Indicates that the GPIO fires interrupts on rising edges.
      */
    @JSImport("pigpio", "Gpio.RISING_EDGE")
    @js.native
    def RISING_EDGE: Double = js.native
    @scala.inline
    def RISING_EDGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RISING_EDGE")(x.asInstanceOf[js.Any])
    
    /*----------------------*
      * timeout
      *----------------------*/
    /**
      * The level argument passed to an interrupt event listener when an interrupt timeout expires.
      */
    @JSImport("pigpio", "Gpio.TIMEOUT")
    @js.native
    def TIMEOUT: Double = js.native
    @scala.inline
    def TIMEOUT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("pigpio", "GpioBank")
  @js.native
  /**
    * Returns a new GpioBank object for accessing up to 32 GPIOs as one operation.
    * @param bank  BANK1 or BANK2 (optional, defaults to BANK1)
    */
  class GpioBank () extends StObject {
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
  /* static members */
  object GpioBank {
    
    @JSImport("pigpio", "GpioBank")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Identifies bank 2.
      */
    @JSImport("pigpio", "GpioBank.BACK2")
    @js.native
    def BACK2: Double = js.native
    @scala.inline
    def BACK2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACK2")(x.asInstanceOf[js.Any])
    
    /**
      * Identifies bank 1.
      */
    @JSImport("pigpio", "GpioBank.BANK1")
    @js.native
    def BANK1: Double = js.native
    @scala.inline
    def BANK1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BANK1")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("pigpio", "Notifier")
  @js.native
  /**
    * Returns a new Notifier object that contains a stream which provides notifications about state changes on any of GPIOs 0 through 31 concurrently.
    * @param options   Used to configure which GPIOs notifications should be provided for.
    */
  class Notifier () extends StObject {
    def this(options: Bits) = this()
    
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
  /* static members */
  object Notifier {
    
    @JSImport("pigpio", "Notifier")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of bytes occupied by a notification in the notification stream.
      */
    @JSImport("pigpio", "Notifier.NOTIFICATION_LENGTH")
    @js.native
    def NOTIFICATION_LENGTH: Double = js.native
    @scala.inline
    def NOTIFICATION_LENGTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTIFICATION_LENGTH")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates a keep alive signal on the stream and is sent once a minute in the absence of other notification activity.
      */
    @JSImport("pigpio", "Notifier.PI_NTFY_FLAGS_ALIVE")
    @js.native
    def PI_NTFY_FLAGS_ALIVE: Double = js.native
    @scala.inline
    def PI_NTFY_FLAGS_ALIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI_NTFY_FLAGS_ALIVE")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def configureClock(microseconds: Double, peripheral: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configureClock")(microseconds.asInstanceOf[js.Any], peripheral.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def configureSocketPort(port: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureSocketPort")(port.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getTick(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTick")().asInstanceOf[Double]
  
  @scala.inline
  def hardwareRevision(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hardwareRevision")().asInstanceOf[Double]
  
  @scala.inline
  def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
  
  @scala.inline
  def terminate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")().asInstanceOf[Unit]
  
  @scala.inline
  def tickDiff(startTick: Double, endTick: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tickDiff")(startTick.asInstanceOf[js.Any], endTick.asInstanceOf[js.Any])).asInstanceOf[Double]
}
