package typings.playcanvas.mod

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
@JSImport("playcanvas", "Curve")
@js.native
class Curve ()
  extends typings.playcanvas.pc.Curve {
  def this(data: js.Array[Double]) = this()
}

