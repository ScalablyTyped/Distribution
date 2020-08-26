package typings.miniprogramWxs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Math extends js.Object {
  /** The mathematical constant e. This is Euler's number, the base of natural logarithms. */
  val E: Double = js.native
  /** The natural logarithm of 10. */
  val LN10: Double = js.native
  /** The natural logarithm of 2. */
  val LN2: Double = js.native
  /** The base-10 logarithm of e. */
  val LOG10E: Double = js.native
  /** The base-2 logarithm of e. */
  val LOG2E: Double = js.native
  /** Pi. This is the ratio of the circumference of a circle to its diameter. */
  val PI: Double = js.native
  /** The square root of 0.5, or, equivalently, one divided by the square root of 2. */
  val SQRT1_2: Double = js.native
  /** The square root of 2. */
  val SQRT2: Double = js.native
  /**
    * Returns the absolute value of a number (the value without regard to whether it is positive or negative).
    * For example, the absolute value of -5 is the same as the absolute value of 5.
    * @param x A numeric expression for which the absolute value is needed.
    */
  def abs(x: Double): Double = js.native
  /**
    * Returns the arc cosine (or inverse cosine) of a number.
    * @param x A numeric expression.
    */
  def acos(x: Double): Double = js.native
  /**
    * Returns the arcsine of a number.
    * @param x A numeric expression.
    */
  def asin(x: Double): Double = js.native
  /**
    * Returns the arctangent of a number.
    * @param x A numeric expression for which the arctangent is needed.
    */
  def atan(x: Double): Double = js.native
  /**
    * Returns the angle (in radians) from the X axis to a point.
    * @param y A numeric expression representing the cartesian y-coordinate.
    * @param x A numeric expression representing the cartesian x-coordinate.
    */
  def atan2(y: Double, x: Double): Double = js.native
  /**
    * Returns the smallest integer greater than or equal to its numeric argument.
    * @param x A numeric expression.
    */
  def ceil(x: Double): Double = js.native
  /**
    * Returns the cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def cos(x: Double): Double = js.native
  /**
    * Returns e (the base of natural logarithms) raised to a power.
    * @param x A numeric expression representing the power of e.
    */
  def exp(x: Double): Double = js.native
  /**
    * Returns the greatest integer less than or equal to its numeric argument.
    * @param x A numeric expression.
    */
  def floor(x: Double): Double = js.native
  /**
    * Returns the natural logarithm (base e) of a number.
    * @param x A numeric expression.
    */
  def log(x: Double): Double = js.native
  /**
    * Returns the larger of a set of supplied numeric expressions.
    * @param values Numeric expressions to be evaluated.
    */
  def max(values: Double*): Double = js.native
  /**
    * Returns the smaller of a set of supplied numeric expressions.
    * @param values Numeric expressions to be evaluated.
    */
  def min(values: Double*): Double = js.native
  /**
    * Returns the value of a base expression taken to a specified power.
    * @param x The base value of the expression.
    * @param y The exponent value of the expression.
    */
  def pow(x: Double, y: Double): Double = js.native
  /** Returns a pseudorandom number between 0 and 1. */
  def random(): Double = js.native
  /**
    * Returns a supplied numeric expression rounded to the nearest number.
    * @param x The value to be rounded to the nearest number.
    */
  def round(x: Double): Double = js.native
  /**
    * Returns the sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def sin(x: Double): Double = js.native
  /**
    * Returns the square root of a number.
    * @param x A numeric expression.
    */
  def sqrt(x: Double): Double = js.native
  /**
    * Returns the tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def tan(x: Double): Double = js.native
}

object Math {
  @scala.inline
  def apply(
    E: Double,
    LN10: Double,
    LN2: Double,
    LOG10E: Double,
    LOG2E: Double,
    PI: Double,
    SQRT1_2: Double,
    SQRT2: Double,
    abs: Double => Double,
    acos: Double => Double,
    asin: Double => Double,
    atan: Double => Double,
    atan2: (Double, Double) => Double,
    ceil: Double => Double,
    cos: Double => Double,
    exp: Double => Double,
    floor: Double => Double,
    log: Double => Double,
    max: /* repeated */ Double => Double,
    min: /* repeated */ Double => Double,
    pow: (Double, Double) => Double,
    random: () => Double,
    round: Double => Double,
    sin: Double => Double,
    sqrt: Double => Double,
    tan: Double => Double
  ): Math = {
    val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], LN10 = LN10.asInstanceOf[js.Any], LN2 = LN2.asInstanceOf[js.Any], LOG10E = LOG10E.asInstanceOf[js.Any], LOG2E = LOG2E.asInstanceOf[js.Any], PI = PI.asInstanceOf[js.Any], SQRT1_2 = SQRT1_2.asInstanceOf[js.Any], SQRT2 = SQRT2.asInstanceOf[js.Any], abs = js.Any.fromFunction1(abs), acos = js.Any.fromFunction1(acos), asin = js.Any.fromFunction1(asin), atan = js.Any.fromFunction1(atan), atan2 = js.Any.fromFunction2(atan2), ceil = js.Any.fromFunction1(ceil), cos = js.Any.fromFunction1(cos), exp = js.Any.fromFunction1(exp), floor = js.Any.fromFunction1(floor), log = js.Any.fromFunction1(log), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), pow = js.Any.fromFunction2(pow), random = js.Any.fromFunction0(random), round = js.Any.fromFunction1(round), sin = js.Any.fromFunction1(sin), sqrt = js.Any.fromFunction1(sqrt), tan = js.Any.fromFunction1(tan))
    __obj.asInstanceOf[Math]
  }
  @scala.inline
  implicit class MathOps[Self <: Math] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setE(value: Double): Self = this.set("E", value.asInstanceOf[js.Any])
    @scala.inline
    def setLN10(value: Double): Self = this.set("LN10", value.asInstanceOf[js.Any])
    @scala.inline
    def setLN2(value: Double): Self = this.set("LN2", value.asInstanceOf[js.Any])
    @scala.inline
    def setLOG10E(value: Double): Self = this.set("LOG10E", value.asInstanceOf[js.Any])
    @scala.inline
    def setLOG2E(value: Double): Self = this.set("LOG2E", value.asInstanceOf[js.Any])
    @scala.inline
    def setPI(value: Double): Self = this.set("PI", value.asInstanceOf[js.Any])
    @scala.inline
    def setSQRT1_2(value: Double): Self = this.set("SQRT1_2", value.asInstanceOf[js.Any])
    @scala.inline
    def setSQRT2(value: Double): Self = this.set("SQRT2", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbs(value: Double => Double): Self = this.set("abs", js.Any.fromFunction1(value))
    @scala.inline
    def setAcos(value: Double => Double): Self = this.set("acos", js.Any.fromFunction1(value))
    @scala.inline
    def setAsin(value: Double => Double): Self = this.set("asin", js.Any.fromFunction1(value))
    @scala.inline
    def setAtan(value: Double => Double): Self = this.set("atan", js.Any.fromFunction1(value))
    @scala.inline
    def setAtan2(value: (Double, Double) => Double): Self = this.set("atan2", js.Any.fromFunction2(value))
    @scala.inline
    def setCeil(value: Double => Double): Self = this.set("ceil", js.Any.fromFunction1(value))
    @scala.inline
    def setCos(value: Double => Double): Self = this.set("cos", js.Any.fromFunction1(value))
    @scala.inline
    def setExp(value: Double => Double): Self = this.set("exp", js.Any.fromFunction1(value))
    @scala.inline
    def setFloor(value: Double => Double): Self = this.set("floor", js.Any.fromFunction1(value))
    @scala.inline
    def setLog(value: Double => Double): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def setMax(value: /* repeated */ Double => Double): Self = this.set("max", js.Any.fromFunction1(value))
    @scala.inline
    def setMin(value: /* repeated */ Double => Double): Self = this.set("min", js.Any.fromFunction1(value))
    @scala.inline
    def setPow(value: (Double, Double) => Double): Self = this.set("pow", js.Any.fromFunction2(value))
    @scala.inline
    def setRandom(value: () => Double): Self = this.set("random", js.Any.fromFunction0(value))
    @scala.inline
    def setRound(value: Double => Double): Self = this.set("round", js.Any.fromFunction1(value))
    @scala.inline
    def setSin(value: Double => Double): Self = this.set("sin", js.Any.fromFunction1(value))
    @scala.inline
    def setSqrt(value: Double => Double): Self = this.set("sqrt", js.Any.fromFunction1(value))
    @scala.inline
    def setTan(value: Double => Double): Self = this.set("tan", js.Any.fromFunction1(value))
  }
  
}

