package typings.playcanvas.playcanvasMod

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
@JSImport("playcanvas", "Curve")
@js.native
class Curve ()
  extends typings.playcanvas.pcNs.Curve {
  def this(data: js.Array[Number]) = this()
}

