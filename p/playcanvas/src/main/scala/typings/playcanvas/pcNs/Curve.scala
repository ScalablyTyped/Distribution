package typings.playcanvas.pcNs

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Curve
  * @classdesc A curve is a collection of keys (time/value pairs). The shape of the
  * curve is defined by its type that specifies an interpolation scheme for the keys.
  * @description Creates a new curve.
  * @param {Number[]} [data] An array of keys (pairs of numbers with the time first and
  * value second)
  * @property {Number} length The number of keys in the curve. [read only]
  * @property {Number} type The curve interpolation scheme. Can be:
  * <ul>
  *     <li>{@link pc.CURVE_LINEAR}</li>
  *     <li>{@link pc.CURVE_SMOOTHSTEP}</li>
  *     <li>{@link pc.CURVE_SPLINE}</li>
  *     <li>{@link pc.CURVE_STEP}</li>
  * </ul>
  * Defaults to {@link pc.CURVE_SMOOTHSTEP};
  */
@JSGlobal("pc.Curve")
@js.native
class Curve () extends js.Object {
  def this(data: js.Array[Number]) = this()
  /**
    * The number of keys in the curve. [read only]
    */
  var length: Double = js.native
  /**
    * The curve interpolation scheme. Can be:
    * <ul>
    * <li>{@link pc.CURVE_LINEAR}</li>
    * <li>{@link pc.CURVE_SMOOTHSTEP}</li>
    * <li>{@link pc.CURVE_SPLINE}</li>
    * <li>{@link pc.CURVE_STEP}</li>
    * </ul>
    * Defaults to {@link pc.CURVE_SMOOTHSTEP};
    */
  var `type`: Double = js.native
  /**
    * @function
    * @name pc.Curve#add
    * @description Add a new key to the curve.
    * @param {Number} time Time to add new key
    * @param {Number} value Value of new key
    * @returns {Number[]} [time, value] pair
    */
  def add(time: Double, value: Double): js.Array[Number] = js.native
  /**
    * @function
    * @name pc.Curve#get
    * @description Return a specific key.
    * @param {Number} index The index of the key to return
    * @returns {Number[]} The key at the specified index
    */
  def get(index: Double): js.Array[Number] = js.native
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
    * @param {Number} time The time at which to calculate the value
    * @returns {Number} The interpolated value
    */
  def value(time: Double): Double = js.native
}

