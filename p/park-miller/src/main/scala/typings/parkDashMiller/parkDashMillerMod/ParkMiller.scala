package typings.parkDashMiller.parkDashMillerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParkMiller extends js.Object {
  def boolean(): Boolean
  def float(): Double
  def floatInRange(min: Double, max: Double): Double
  def integer(): Double
  def integerInRange(min: Double, max: Double): Double
}

object ParkMiller {
  @scala.inline
  def apply(
    boolean: () => Boolean,
    float: () => Double,
    floatInRange: (Double, Double) => Double,
    integer: () => Double,
    integerInRange: (Double, Double) => Double
  ): ParkMiller = {
    val __obj = js.Dynamic.literal(boolean = js.Any.fromFunction0(boolean), float = js.Any.fromFunction0(float), floatInRange = js.Any.fromFunction2(floatInRange), integer = js.Any.fromFunction0(integer), integerInRange = js.Any.fromFunction2(integerInRange))
  
    __obj.asInstanceOf[ParkMiller]
  }
}

