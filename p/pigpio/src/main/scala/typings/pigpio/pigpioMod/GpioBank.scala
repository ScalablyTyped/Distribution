package typings.pigpio.pigpioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pigpio", "GpioBank")
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

/* static members */
@JSImport("pigpio", "GpioBank")
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

