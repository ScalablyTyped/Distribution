package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A curve set is a collection of curves.
  */
@JSImport("playcanvas", "CurveSet")
@js.native
open class CurveSet protected () extends StObject {
  /**
    * Creates a new CurveSet instance.
    *
    * @param {Array<number[]>} curveKeys - An array of arrays of keys (pairs of numbers with the
    * time first and value second).
    * @example
    * const curveSet = new pc.CurveSet([
    *     [
    *         0, 0,        // At 0 time, value of 0
    *         0.33, 2,     // At 0.33 time, value of 2
    *         0.66, 2.6,   // At 0.66 time, value of 2.6
    *         1, 3         // At 1 time, value of 3
    *     ],
    *     [
    *         0, 34,
    *         0.33, 35,
    *         0.66, 36,
    *         1, 37
    *     ]
    * ]);
    */
  def this(args: Any*) = this()
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _type: Any = js.native
  
  var curves: js.Array[Any] = js.native
  
  /**
    * Return a specific curve in the curve set.
    *
    * @param {number} index - The index of the curve to return.
    * @returns {Curve} The curve at the specified index.
    */
  def get(index: Double): Curve = js.native
  
  /**
    * The number of curves in the curve set.
    *
    * @type {number}
    */
  def length: Double = js.native
  
  /**
    * Sample the curveset at regular intervals over the range [0..1].
    *
    * @param {number} precision - The number of samples to return.
    * @returns {Float32Array} The set of quantized values.
    * @ignore
    */
  def quantize(precision: Double): js.typedarray.Float32Array = js.native
  
  /**
    * Sample the curveset at regular intervals over the range [0..1] and clamp the result to min
    * and max.
    *
    * @param {number} precision - The number of samples to return.
    * @param {number} min - The minimum output value.
    * @param {number} max - The maximum output value.
    * @returns {Float32Array} The set of quantized values.
    * @ignore
    */
  def quantizeClamped(precision: Double, min: Double, max: Double): js.typedarray.Float32Array = js.native
  
  def `type`: Double = js.native
  /**
    * The interpolation scheme applied to all curves in the curve set. Can be:
    *
    * - {@link CURVE_LINEAR}
    * - {@link CURVE_SMOOTHSTEP}
    * - {@link CURVE_SPLINE}
    * - {@link CURVE_STEP}
    *
    * Defaults to {@link CURVE_SMOOTHSTEP}.
    *
    * @type {number}
    */
  def type_=(arg: Double): Unit = js.native
  
  /**
    * Returns the interpolated value of all curves in the curve set at the specified time.
    *
    * @param {number} time - The time at which to calculate the value.
    * @param {number[]} [result] - The interpolated curve values at the specified time. If this
    * parameter is not supplied, the function allocates a new array internally to return the
    * result.
    * @returns {number[]} The interpolated curve values at the specified time.
    */
  def value(time: Double): js.Array[Double] = js.native
  def value(time: Double, result: js.Array[Double]): js.Array[Double] = js.native
}
