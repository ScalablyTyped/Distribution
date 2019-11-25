package typings.motorDashHat.motorDashHatMod

import typings.motorDashHat.Anon_W1W2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotorHatOptions extends js.Object {
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
  var steppers: js.UndefOr[js.Array[Anon_W1W2]] = js.undefined
}

object MotorHatOptions {
  @scala.inline
  def apply(
    address: Int | Double = null,
    busnum: Int | Double = null,
    dcs: js.Array[Motor] = null,
    servos: js.Array[Double] = null,
    steppers: js.Array[Anon_W1W2] = null
  ): MotorHatOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (busnum != null) __obj.updateDynamic("busnum")(busnum.asInstanceOf[js.Any])
    if (dcs != null) __obj.updateDynamic("dcs")(dcs.asInstanceOf[js.Any])
    if (servos != null) __obj.updateDynamic("servos")(servos.asInstanceOf[js.Any])
    if (steppers != null) __obj.updateDynamic("steppers")(steppers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotorHatOptions]
  }
}

