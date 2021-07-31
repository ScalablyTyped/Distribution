package typings.playcanvas.global.pc

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
@JSGlobal("pc.Curve")
@js.native
class Curve ()
  extends StObject
     with typings.playcanvas.pc.Curve {
  def this(data: js.Array[Double]) = this()
  
  /**
    * Add a new key to the curve.
    * @param time - Time to add new key.
    * @param value - Value of new key.
    * @returns [time, value] pair.
    */
  /* CompleteClass */
  override def add(time: Double, value: Double): js.Array[Double] = js.native
  
  /**
    * Return a specific key.
    * @param index - The index of the key to return.
    * @returns The key at the specified index.
    */
  /* CompleteClass */
  override def get(index: Double): js.Array[Double] = js.native
  
  /**
    * The number of keys in the curve. [read only].
    */
  /* CompleteClass */
  var length: Double = js.native
  
  /**
    * Sort keys by time.
    */
  /* CompleteClass */
  override def sort(): Unit = js.native
  
  /**
    * Controls how {@link pc.CURVE_SPLINE} tangents are calculated.
    Valid range is between 0 and 1 where 0 results in a non-smooth curve (equivalent to linear
    interpolation) and 1 results in a very smooth curve. Use 0.5 for a Catmull-rom spline.
    */
  /* CompleteClass */
  var tension: Double = js.native
  
  /**
    * The curve interpolation scheme. Can be:
    
    * {@link pc.CURVE_LINEAR}
    * {@link pc.CURVE_SMOOTHSTEP}
    * {@link pc.CURVE_SPLINE}
    * {@link pc.CURVE_STEP}
    
    Defaults to {@link pc.CURVE_SMOOTHSTEP}.
    */
  /* CompleteClass */
  var `type`: Double = js.native
  
  /**
    * Returns the interpolated value of the curve at specified time.
    * @param time - The time at which to calculate the value.
    * @returns The interpolated value.
    */
  /* CompleteClass */
  override def value(time: Double): Double = js.native
}
