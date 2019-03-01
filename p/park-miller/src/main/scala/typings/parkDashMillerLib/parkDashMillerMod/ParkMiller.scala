package typings
package parkDashMillerLib.parkDashMillerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParkMiller extends js.Object {
  def boolean(): scala.Boolean
  def float(): scala.Double
  def floatInRange(min: scala.Double, max: scala.Double): scala.Double
  def integer(): scala.Double
  def integerInRange(min: scala.Double, max: scala.Double): scala.Double
}

object ParkMiller {
  @scala.inline
  def apply(
    boolean: js.Function0[scala.Boolean],
    float: js.Function0[scala.Double],
    floatInRange: js.Function2[scala.Double, scala.Double, scala.Double],
    integer: js.Function0[scala.Double],
    integerInRange: js.Function2[scala.Double, scala.Double, scala.Double]
  ): ParkMiller = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boolean")(boolean)
    __obj.updateDynamic("float")(float)
    __obj.updateDynamic("floatInRange")(floatInRange)
    __obj.updateDynamic("integer")(integer)
    __obj.updateDynamic("integerInRange")(integerInRange)
    __obj.asInstanceOf[ParkMiller]
  }
}

