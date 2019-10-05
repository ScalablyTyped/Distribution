package typings.playcanvas.pc

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.CurveSet
  * @classdesc A curve set is a collection of curves.
  * @description Creates a new curve set.
  * @param {Array<Number[]>} [curveKeys] An array of arrays of keys (pairs of numbers with
  * the time first and value second).
  */
@JSGlobal("pc.CurveSet")
@js.native
class CurveSet () extends js.Object {
  def this(curveKeys: js.Array[js.Array[Number]]) = this()
  /**
    * @readonly
    * @name pc.CurveSet#length
    * @type Number
    * @description The number of curves in the curve set.
    */
  val length: Double = js.native
  /**
    * @name pc.CurveSet#type
    * @type Number
    * @description The interpolation scheme applied to all curves in the curve set. Can be:
    * <ul>
    *     <li>{@link pc.CURVE_LINEAR}</li>
    *     <li>{@link pc.CURVE_SMOOTHSTEP}</li>
    *     <li>{@link pc.CURVE_SPLINE}</li>
    *     <li>{@link pc.CURVE_STEP}</li>
    * </ul>
    * Defaults to {@link pc.CURVE_SMOOTHSTEP};
    */
  var `type`: Double = js.native
  /**
    * @function
    * @name pc.CurveSet#get
    * @description Return a specific curve in the curve set.
    * @param {Number} index The index of the curve to return
    * @returns {pc.Curve} The curve at the specified index
    */
  def get(index: Double): Curve = js.native
  /**
    * @function
    * @name pc.CurveSet#value
    * @description Returns the interpolated value of all curves in the curve
    * set at the specified time.
    * @param {Number} time The time at which to calculate the value
    * @param {Number[]} [result] The interpolated curve values at the specified time.
    * If this parameter is not supplied, the function allocates a new array internally
    * to return the result.
    * @returns {Number[]} The interpolated curve values at the specified time
    */
  def value(time: Double): js.Array[Number] = js.native
  def value(time: Double, result: js.Array[Number]): js.Array[Number] = js.native
}

