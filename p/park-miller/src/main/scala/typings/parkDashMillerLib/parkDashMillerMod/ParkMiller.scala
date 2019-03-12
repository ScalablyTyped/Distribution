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
    boolean: () => scala.Boolean,
    float: () => scala.Double,
    floatInRange: (scala.Double, scala.Double) => scala.Double,
    integer: () => scala.Double,
    integerInRange: (scala.Double, scala.Double) => scala.Double
  ): ParkMiller = {
    val __obj = js.Dynamic.literal(boolean = js.Any.fromFunction0(boolean), float = js.Any.fromFunction0(float), floatInRange = js.Any.fromFunction2(floatInRange), integer = js.Any.fromFunction0(integer), integerInRange = js.Any.fromFunction2(integerInRange))
  
    __obj.asInstanceOf[ParkMiller]
  }
}

