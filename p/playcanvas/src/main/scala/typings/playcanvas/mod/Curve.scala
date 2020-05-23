package typings.playcanvas.mod

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
@JSImport("playcanvas", "Curve")
@js.native
class Curve ()
  extends typings.playcanvas.pc.Curve {
  def this(data: js.Array[Double]) = this()
  /**
    * The number of keys in the curve. [read only].
    */
  /* CompleteClass */
  override var length: Double = js.native
  /**
    * The curve interpolation scheme. Can be:
    * * {@link pc.CURVE_LINEAR}
    * * {@link pc.CURVE_SMOOTHSTEP}
    * * {@link pc.CURVE_SPLINE}
    * * {@link pc.CURVE_STEP}
    * Defaults to {@link pc.CURVE_SMOOTHSTEP}.
    */
  /* CompleteClass */
  override var `type`: Double = js.native
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
    * Sort keys by time.
    */
  /* CompleteClass */
  override def sort(): Unit = js.native
  /**
    * Returns the interpolated value of the curve at specified time.
    * @param time - The time at which to calculate the value.
    * @returns The interpolated value.
    */
  /* CompleteClass */
  override def value(time: Double): Double = js.native
}

