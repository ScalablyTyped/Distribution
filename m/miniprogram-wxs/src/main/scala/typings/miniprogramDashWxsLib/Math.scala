package typings
package miniprogramDashWxsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  /** The mathematical constant e. This is Euler's number, the base of natural logarithms. */
  val E: scala.Double
  /** The natural logarithm of 10. */
  val LN10: scala.Double
  /** The natural logarithm of 2. */
  val LN2: scala.Double
  /** The base-10 logarithm of e. */
  val LOG10E: scala.Double
  /** The base-2 logarithm of e. */
  val LOG2E: scala.Double
  /** Pi. This is the ratio of the circumference of a circle to its diameter. */
  val PI: scala.Double
  /** The square root of 0.5, or, equivalently, one divided by the square root of 2. */
  val SQRT1_2: scala.Double
  /** The square root of 2. */
  val SQRT2: scala.Double
  /**
    * Returns the absolute value of a number (the value without regard to whether it is positive or negative).
    * For example, the absolute value of -5 is the same as the absolute value of 5.
    * @param x A numeric expression for which the absolute value is needed.
    */
  def abs(x: scala.Double): scala.Double
  /**
    * Returns the arc cosine (or inverse cosine) of a number.
    * @param x A numeric expression.
    */
  def acos(x: scala.Double): scala.Double
  /**
    * Returns the arcsine of a number.
    * @param x A numeric expression.
    */
  def asin(x: scala.Double): scala.Double
  /**
    * Returns the arctangent of a number.
    * @param x A numeric expression for which the arctangent is needed.
    */
  def atan(x: scala.Double): scala.Double
  /**
    * Returns the angle (in radians) from the X axis to a point.
    * @param y A numeric expression representing the cartesian y-coordinate.
    * @param x A numeric expression representing the cartesian x-coordinate.
    */
  def atan2(y: scala.Double, x: scala.Double): scala.Double
  /**
    * Returns the smallest integer greater than or equal to its numeric argument.
    * @param x A numeric expression.
    */
  def ceil(x: scala.Double): scala.Double
  /**
    * Returns the cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def cos(x: scala.Double): scala.Double
  /**
    * Returns e (the base of natural logarithms) raised to a power.
    * @param x A numeric expression representing the power of e.
    */
  def exp(x: scala.Double): scala.Double
  /**
    * Returns the greatest integer less than or equal to its numeric argument.
    * @param x A numeric expression.
    */
  def floor(x: scala.Double): scala.Double
  /**
    * Returns the natural logarithm (base e) of a number.
    * @param x A numeric expression.
    */
  def log(x: scala.Double): scala.Double
  /**
    * Returns the larger of a set of supplied numeric expressions.
    * @param values Numeric expressions to be evaluated.
    */
  def max(values: scala.Double*): scala.Double
  /**
    * Returns the smaller of a set of supplied numeric expressions.
    * @param values Numeric expressions to be evaluated.
    */
  def min(values: scala.Double*): scala.Double
  /**
    * Returns the value of a base expression taken to a specified power.
    * @param x The base value of the expression.
    * @param y The exponent value of the expression.
    */
  def pow(x: scala.Double, y: scala.Double): scala.Double
  /** Returns a pseudorandom number between 0 and 1. */
  def random(): scala.Double
  /**
    * Returns a supplied numeric expression rounded to the nearest number.
    * @param x The value to be rounded to the nearest number.
    */
  def round(x: scala.Double): scala.Double
  /**
    * Returns the sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def sin(x: scala.Double): scala.Double
  /**
    * Returns the square root of a number.
    * @param x A numeric expression.
    */
  def sqrt(x: scala.Double): scala.Double
  /**
    * Returns the tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def tan(x: scala.Double): scala.Double
}

object Math {
  @scala.inline
  def apply(
    E: scala.Double,
    LN10: scala.Double,
    LN2: scala.Double,
    LOG10E: scala.Double,
    LOG2E: scala.Double,
    PI: scala.Double,
    SQRT1_2: scala.Double,
    SQRT2: scala.Double,
    abs: scala.Double => scala.Double,
    acos: scala.Double => scala.Double,
    asin: scala.Double => scala.Double,
    atan: scala.Double => scala.Double,
    atan2: (scala.Double, scala.Double) => scala.Double,
    ceil: scala.Double => scala.Double,
    cos: scala.Double => scala.Double,
    exp: scala.Double => scala.Double,
    floor: scala.Double => scala.Double,
    log: scala.Double => scala.Double,
    max: /* repeated */ scala.Double => scala.Double,
    min: /* repeated */ scala.Double => scala.Double,
    pow: (scala.Double, scala.Double) => scala.Double,
    random: () => scala.Double,
    round: scala.Double => scala.Double,
    sin: scala.Double => scala.Double,
    sqrt: scala.Double => scala.Double,
    tan: scala.Double => scala.Double
  ): Math = {
    val __obj = js.Dynamic.literal(E = E, LN10 = LN10, LN2 = LN2, LOG10E = LOG10E, LOG2E = LOG2E, PI = PI, SQRT1_2 = SQRT1_2, SQRT2 = SQRT2, abs = js.Any.fromFunction1(abs), acos = js.Any.fromFunction1(acos), asin = js.Any.fromFunction1(asin), atan = js.Any.fromFunction1(atan), atan2 = js.Any.fromFunction2(atan2), ceil = js.Any.fromFunction1(ceil), cos = js.Any.fromFunction1(cos), exp = js.Any.fromFunction1(exp), floor = js.Any.fromFunction1(floor), log = js.Any.fromFunction1(log), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), pow = js.Any.fromFunction2(pow), random = js.Any.fromFunction0(random), round = js.Any.fromFunction1(round), sin = js.Any.fromFunction1(sin), sqrt = js.Any.fromFunction1(sqrt), tan = js.Any.fromFunction1(tan))
  
    __obj.asInstanceOf[Math]
  }
}

