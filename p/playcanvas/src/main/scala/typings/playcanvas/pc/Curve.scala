package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait Curve extends js.Object {
  
  /**
    * Add a new key to the curve.
    * @param time - Time to add new key.
    * @param value - Value of new key.
    * @returns [time, value] pair.
    */
  def add(time: Double, value: Double): js.Array[Double] = js.native
  
  /**
    * Return a specific key.
    * @param index - The index of the key to return.
    * @returns The key at the specified index.
    */
  def get(index: Double): js.Array[Double] = js.native
  
  /**
    * The number of keys in the curve. [read only].
    */
  var length: Double = js.native
  
  /**
    * Sort keys by time.
    */
  def sort(): Unit = js.native
  
  /**
    * Controls how {@link pc.CURVE_SPLINE} tangents are calculated.
    Valid range is between 0 and 1 where 0 results in a non-smooth curve (equivalent to linear
    interpolation) and 1 results in a very smooth curve. Use 0.5 for a Catmull-rom spline.
    */
  var tension: Double = js.native
  
  /**
    * The curve interpolation scheme. Can be:
    
    * {@link pc.CURVE_LINEAR}
    * {@link pc.CURVE_SMOOTHSTEP}
    * {@link pc.CURVE_SPLINE}
    * {@link pc.CURVE_STEP}
    
    Defaults to {@link pc.CURVE_SMOOTHSTEP}.
    */
  var `type`: Double = js.native
  
  /**
    * Returns the interpolated value of the curve at specified time.
    * @param time - The time at which to calculate the value.
    * @returns The interpolated value.
    */
  def value(time: Double): Double = js.native
}
object Curve {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CurveOps[Self <: Curve] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (Double, Double) => js.Array[Double]): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet(value: Double => js.Array[Double]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: () => Unit): Self = this.set("sort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTension(value: Double): Self = this.set("tension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double => Double): Self = this.set("value", js.Any.fromFunction1(value))
  }
}
