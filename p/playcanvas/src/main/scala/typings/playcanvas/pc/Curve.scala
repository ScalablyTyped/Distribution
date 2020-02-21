package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Curve
  * @classdesc A curve is a collection of keys (time/value pairs). The shape of the
  * curve is defined by its type that specifies an interpolation scheme for the keys.
  * @description Creates a new curve.
  * @param {number[]} [data] - An array of keys (pairs of numbers with the time first and
  * value second).
  * @property {number} length The number of keys in the curve. [read only].
  * @property {number} type The curve interpolation scheme. Can be:
  *
  * * {@link pc.CURVE_LINEAR}
  * * {@link pc.CURVE_SMOOTHSTEP}
  * * {@link pc.CURVE_SPLINE}
  * * {@link pc.CURVE_STEP}
  *
  * Defaults to {@link pc.CURVE_SMOOTHSTEP}.
  */
@JSGlobal("pc.Curve")
@js.native
class Curve () extends js.Object {
  def this(data: js.Array[Double]) = this()
  /**
    * The number of keys in the curve. [read only].
    */
  var length: Double = js.native
  /**
    * The curve interpolation scheme. Can be:
    * * {@link pc.CURVE_LINEAR}
    * * {@link pc.CURVE_SMOOTHSTEP}
    * * {@link pc.CURVE_SPLINE}
    * * {@link pc.CURVE_STEP}
    * Defaults to {@link pc.CURVE_SMOOTHSTEP}.
    */
  var `type`: Double = js.native
  /**
    * @function
    * @name pc.Curve#add
    * @description Add a new key to the curve.
    * @param {number} time - Time to add new key.
    * @param {number} value - Value of new key.
    * @returns {number[]} [time, value] pair.
    */
  def add(time: Double, value: Double): js.Array[Double] = js.native
  /**
    * @function
    * @name pc.Curve#get
    * @description Return a specific key.
    * @param {number} index - The index of the key to return.
    * @returns {number[]} The key at the specified index.
    */
  def get(index: Double): js.Array[Double] = js.native
  /**
    * @function
    * @name pc.Curve#sort
    * @description Sort keys by time.
    */
  def sort(): Unit = js.native
  /**
    * @function
    * @name pc.Curve#value
    * @description Returns the interpolated value of the curve at specified time.
    * @param {number} time - The time at which to calculate the value.
    * @returns {number} The interpolated value.
    */
  def value(time: Double): Double = js.native
}

