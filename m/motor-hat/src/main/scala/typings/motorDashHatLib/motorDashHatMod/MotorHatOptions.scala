package typings
package motorDashHatLib.motorDashHatMod

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
  var address: js.UndefOr[scala.Double] = js.undefined
  /**
       * i2c driver devfile number. Varies by RaspBerry version.
       * Should be automatically detected.
       */
  var busnum: js.UndefOr[scala.Double] = js.undefined
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
  var servos: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
       * Definition of the stepper motors connected to the HAT.
       * At most 2 steppers, each motor is represented by either an object of the form
       * { W1: winding, W2: winding }. Each winding should be one of following: 'M1', 'M2', 'M3',
       * 'M4' depending on the port the stepper is connected to. Correct example: { W1: 'M3', W2: 'M1' }
       */
  var steppers: js.UndefOr[js.Array[motorDashHatLib.Anon_W2W1]] = js.undefined
}

