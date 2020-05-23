package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new curve.
  * @property length - The number of keys in the curve. [read only].
  * @property type - The curve interpolation scheme. Can be:
  
  * {@link pc.CURVE_LINEAR}
  * {@link pc.CURVE_SMOOTHSTEP}
  * {@link pc.CURVE_SPLINE}
  * {@link pc.CURVE_STEP}
  
  Defaults to {@link pc.CURVE_SMOOTHSTEP}.
  * @param [data] - An array of keys (pairs of numbers with the time first and
  value second).
  */
trait Curve extends js.Object {
  /**
    * The number of keys in the curve. [read only].
    */
  var length: Double
  /**
    * The curve interpolation scheme. Can be:
    * * {@link pc.CURVE_LINEAR}
    * * {@link pc.CURVE_SMOOTHSTEP}
    * * {@link pc.CURVE_SPLINE}
    * * {@link pc.CURVE_STEP}
    * Defaults to {@link pc.CURVE_SMOOTHSTEP}.
    */
  var `type`: Double
  /**
    * Add a new key to the curve.
    * @param time - Time to add new key.
    * @param value - Value of new key.
    * @returns [time, value] pair.
    */
  def add(time: Double, value: Double): js.Array[Double]
  /**
    * Return a specific key.
    * @param index - The index of the key to return.
    * @returns The key at the specified index.
    */
  def get(index: Double): js.Array[Double]
  /**
    * Sort keys by time.
    */
  def sort(): Unit
  /**
    * Returns the interpolated value of the curve at specified time.
    * @param time - The time at which to calculate the value.
    * @returns The interpolated value.
    */
  def value(time: Double): Double
}

object Curve {
  @scala.inline
  def apply(
    add: (Double, Double) => js.Array[Double],
    get: Double => js.Array[Double],
    length: Double,
    sort: () => Unit,
    `type`: Double,
    value: Double => Double
  ): Curve = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get = js.Any.fromFunction1(get), length = length.asInstanceOf[js.Any], sort = js.Any.fromFunction0(sort), value = js.Any.fromFunction1(value))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curve]
  }
}

