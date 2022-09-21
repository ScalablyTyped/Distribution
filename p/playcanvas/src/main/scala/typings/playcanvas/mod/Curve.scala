package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A curve is a collection of keys (time/value pairs). The shape of the curve is defined by its
  * type that specifies an interpolation scheme for the keys.
  */
@JSImport("playcanvas", "Curve")
@js.native
/**
  * Creates a new Curve instance.
  *
  * @param {number[]} [data] - An array of keys (pairs of numbers with the time first and value
  * second).
  * @example
  * var curve = new pc.Curve([
  *     0, 0,        // At 0 time, value of 0
  *     0.33, 2,     // At 0.33 time, value of 2
  *     0.66, 2.6,   // At 0.66 time, value of 2.6
  *     1, 3         // At 1 time, value of 3
  * ]);
  */
open class Curve () extends StObject {
  def this(data: js.Array[Double]) = this()
  
  /**
    * @type {CurveEvaluator}
    * @private
    */
  /* private */ var _eval: Any = js.native
  
  /**
    * Add a new key to the curve.
    *
    * @param {number} time - Time to add new key.
    * @param {number} value - Value of new key.
    * @returns {number[]} [time, value] pair.
    */
  def add(time: Double, value: Double): js.Array[Double] = js.native
  
  def closest(time: Any): js.Array[Double] = js.native
  
  /**
    * Return a specific key.
    *
    * @param {number} index - The index of the key to return.
    * @returns {number[]} The key at the specified index.
    */
  def get(index: Double): js.Array[Double] = js.native
  
  var keys: js.Array[js.Array[Double]] = js.native
  
  /**
    * Get the number of keys in the curve.
    *
    * @type {number}
    */
  def length: Double = js.native
  
  /**
    * Sample the curve at regular intervals over the range [0..1].
    *
    * @param {number} precision - The number of samples to return.
    * @returns {Float32Array} The set of quantized values.
    * @ignore
    */
  def quantize(precision: Double): js.typedarray.Float32Array = js.native
  
  /**
    * Sample the curve at regular intervals over the range [0..1] and clamp the resulting samples
    * to [min..max].
    *
    * @param {number} precision - The number of samples to return.
    * @param {number} min - The minimum output value.
    * @param {number} max - The maximum output value.
    * @returns {Float32Array} The set of quantized values.
    * @ignore
    */
  def quantizeClamped(precision: Double, min: Double, max: Double): js.typedarray.Float32Array = js.native
  
  /**
    * Sort keys by time.
    */
  def sort(): Unit = js.native
  
  /**
    * Controls how {@link CURVE_SPLINE} tangents are calculated. Valid range is between 0 and
    * 1 where 0 results in a non-smooth curve (equivalent to linear interpolation) and 1
    * results in a very smooth curve. Use 0.5 for a Catmull-rom spline.
    *
    * @type {number}
    */
  var tension: Double = js.native
  
  /**
    * The curve interpolation scheme. Can be:
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
  var `type`: Double = js.native
  
  /**
    * Returns the interpolated value of the curve at specified time.
    *
    * @param {number} time - The time at which to calculate the value.
    * @returns {number} The interpolated value.
    */
  def value(time: Double): Double = js.native
}
