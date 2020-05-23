package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new curve set.
  * @param [curveKeys] - An array of arrays of keys (pairs of numbers with
  the time first and value second).
  */
@js.native
trait CurveSet extends js.Object {
  /**
    * The number of curves in the curve set.
    */
  val length: Double = js.native
  /**
    * The interpolation scheme applied to all curves in the curve set. Can be:
    
    * {@link pc.CURVE_LINEAR}
    * {@link pc.CURVE_SMOOTHSTEP}
    * {@link pc.CURVE_SPLINE}
    * {@link pc.CURVE_STEP}
    
    Defaults to {@link pc.CURVE_SMOOTHSTEP}.
    */
  var `type`: Double = js.native
  /**
    * Return a specific curve in the curve set.
    * @param index - The index of the curve to return.
    * @returns The curve at the specified index.
    */
  def get(index: Double): Curve = js.native
  /**
    * Returns the interpolated value of all curves in the curve
    set at the specified time.
    * @param time - The time at which to calculate the value.
    * @param [result] - The interpolated curve values at the specified time.
    If this parameter is not supplied, the function allocates a new array internally
    to return the result.
    * @returns The interpolated curve values at the specified time.
    */
  def value(time: Double): js.Array[Double] = js.native
  def value(time: Double, result: js.Array[Double]): js.Array[Double] = js.native
}

