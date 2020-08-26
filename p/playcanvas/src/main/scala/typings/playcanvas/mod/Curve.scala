package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new curve.
  * @property length - The number of keys in the curve. [read only].
  * @property type - The curve interpolation scheme. Can be:
  *
  * * {@link pc.CURVE_LINEAR}
  * * {@link pc.CURVE_SMOOTHSTEP}
  * * {@link pc.CURVE_SPLINE}
  * * {@link pc.CURVE_STEP}
  *
  * Defaults to {@link pc.CURVE_SMOOTHSTEP}.
  * @param [data] - An array of keys (pairs of numbers with the time first and
  * value second).
  */
@JSImport("playcanvas", "Curve")
@js.native
class Curve ()
  extends typings.playcanvas.pc.Curve {
  def this(data: js.Array[Double]) = this()
}

