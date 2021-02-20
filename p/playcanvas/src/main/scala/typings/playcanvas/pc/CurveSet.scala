package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new curve set.
  * @example
  * var curveSet = new pc.CurveSet([
  *     [
  *         [0, 0],
  *         [0.33, 2],
  *         [0.66, 2.6],
  *         [1, 3]
  *     ],
  *     [
  *         [0, 34],
  *         [0.33, 35],
  *         [0.66, 36],
  *         [1, 37]
  *     ]
  * ]);
  * @param [curveKeys] - An array of arrays of keys (pairs of numbers with
  * the time first and value second).
  */
@js.native
trait CurveSet extends StObject {
  
  /**
    * Return a specific curve in the curve set.
    * @param index - The index of the curve to return.
    * @returns The curve at the specified index.
    */
  def get(index: Double): Curve = js.native
  
  /**
    * The number of curves in the curve set.
    */
  val length: Double = js.native
  
  /**
    * The interpolation scheme applied to all curves in the curve set. Can be:
    *
    * * {@link pc.CURVE_LINEAR}
    * * {@link pc.CURVE_SMOOTHSTEP}
    * * {@link pc.CURVE_SPLINE}
    * * {@link pc.CURVE_STEP}
    *
    * Defaults to {@link pc.CURVE_SMOOTHSTEP}.
    */
  var `type`: Double = js.native
  
  /**
    * Returns the interpolated value of all curves in the curve
    * set at the specified time.
    * @param time - The time at which to calculate the value.
    * @param [result] - The interpolated curve values at the specified time.
    * If this parameter is not supplied, the function allocates a new array internally
    * to return the result.
    * @returns The interpolated curve values at the specified time.
    */
  def value(time: Double): js.Array[Double] = js.native
  def value(time: Double, result: js.Array[Double]): js.Array[Double] = js.native
}
