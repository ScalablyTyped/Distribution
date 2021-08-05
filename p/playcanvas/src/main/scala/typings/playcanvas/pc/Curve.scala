package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new curve.
  * @example
  * var curve = new pc.Curve([
  *     [0, 0],
  *     [0.33, 2],
  *     [0.66, 2.6],
  *     [1, 3]
  * ]);
  * @property length - The number of keys in the curve. [read only].
  * @property type - The curve interpolation scheme. Can be:
  *
  * * {@link pc.CURVE_LINEAR}
  * * {@link pc.CURVE_SMOOTHSTEP}
  * * {@link pc.CURVE_SPLINE}
  * * {@link pc.CURVE_STEP}
  *
  * Defaults to {@link pc.CURVE_SMOOTHSTEP}.
  * @property tension - Controls how {@link pc.CURVE_SPLINE} tangents are calculated.
  * Valid range is between 0 and 1 where 0 results in a non-smooth curve (equivalent to linear
  * interpolation) and 1 results in a very smooth curve. Use 0.5 for a Catmull-rom spline.
  * @param [data] - An array of keys (pairs of numbers with the time first and
  * value second).
  */
trait Curve extends StObject {
  
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
    * The number of keys in the curve. [read only].
    */
  var length: Double
  
  /**
    * Sort keys by time.
    */
  def sort(): Unit
  
  /**
    * Controls how {@link pc.CURVE_SPLINE} tangents are calculated.
    Valid range is between 0 and 1 where 0 results in a non-smooth curve (equivalent to linear
    interpolation) and 1 results in a very smooth curve. Use 0.5 for a Catmull-rom spline.
    */
  var tension: Double
  
  /**
    * The curve interpolation scheme. Can be:
    
    * {@link pc.CURVE_LINEAR}
    * {@link pc.CURVE_SMOOTHSTEP}
    * {@link pc.CURVE_SPLINE}
    * {@link pc.CURVE_STEP}
    
    Defaults to {@link pc.CURVE_SMOOTHSTEP}.
    */
  var `type`: Double
  
  /**
    * Returns the interpolated value of the curve at specified time.
    * @param time - The time at which to calculate the value.
    * @returns The interpolated value.
    */
  def value(time: Double): Double
}
object Curve {
  
  inline def apply(
    add: (Double, Double) => js.Array[Double],
    get: Double => js.Array[Double],
    length: Double,
    sort: () => Unit,
    tension: Double,
    `type`: Double,
    value: Double => Double
  ): Curve = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get = js.Any.fromFunction1(get), length = length.asInstanceOf[js.Any], sort = js.Any.fromFunction0(sort), tension = tension.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curve]
  }
  
  extension [Self <: Curve](x: Self) {
    
    inline def setAdd(value: (Double, Double) => js.Array[Double]): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setGet(value: Double => js.Array[Double]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setSort(value: () => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
    
    inline def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
