package typings.parkMiller.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParkMiller extends js.Object {
  def boolean(): Boolean = js.native
  def float(): Double = js.native
  def floatInRange(min: Double, max: Double): Double = js.native
  def integer(): Double = js.native
  def integerInRange(min: Double, max: Double): Double = js.native
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
  @scala.inline
  implicit class ParkMillerOps[Self <: ParkMiller] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoolean(value: () => Boolean): Self = this.set("boolean", js.Any.fromFunction0(value))
    @scala.inline
    def setFloat(value: () => Double): Self = this.set("float", js.Any.fromFunction0(value))
    @scala.inline
    def setFloatInRange(value: (Double, Double) => Double): Self = this.set("floatInRange", js.Any.fromFunction2(value))
    @scala.inline
    def setInteger(value: () => Double): Self = this.set("integer", js.Any.fromFunction0(value))
    @scala.inline
    def setIntegerInRange(value: (Double, Double) => Double): Self = this.set("integerInRange", js.Any.fromFunction2(value))
  }
  
}

