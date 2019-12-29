package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/rotationconstraint", JSImport.Namespace)
@js.native
object rotationconstraintMod extends js.Object {
  def createSnapToN(n: Double): Type = js.native
  def createSnapToZero(): Type = js.native
  def createSnapToZero(opt_tolerance: Double): Type = js.native
  def disable(rotation: js.UndefOr[scala.Nothing], delta: Double): js.UndefOr[Double] = js.native
  def disable(rotation: Double, delta: Double): js.UndefOr[Double] = js.native
  def none(rotation: js.UndefOr[scala.Nothing], delta: Double): js.UndefOr[Double] = js.native
  def none(rotation: Double, delta: Double): js.UndefOr[Double] = js.native
  type Type = js.Function2[/* p0 */ js.UndefOr[Double], /* p1 */ Double, js.UndefOr[Double]]
}

