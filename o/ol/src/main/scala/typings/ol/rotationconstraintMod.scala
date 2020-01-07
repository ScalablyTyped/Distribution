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
  def disable(): Double = js.native
  def disable(rotation: Double): Double = js.native
  def none(): Double = js.native
  def none(rotation: Double): Double = js.native
  type Type = js.Function2[/* p0 */ js.UndefOr[Double], /* p1 */ js.UndefOr[Boolean], Double]
}

