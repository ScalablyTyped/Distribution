package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/rotationconstraint", JSImport.Namespace)
@js.native
object rotationconstraintMod extends js.Object {
  
  def createSnapToN(n: Double): Type = js.native
  
  def createSnapToZero(): Type = js.native
  def createSnapToZero(opt_tolerance: Double): Type = js.native
  
  def disable(): js.UndefOr[Double] = js.native
  def disable(rotation: Double): js.UndefOr[Double] = js.native
  
  def none(): js.UndefOr[Double] = js.native
  def none(rotation: Double): js.UndefOr[Double] = js.native
  
  type Type = js.Function2[/* p0 */ js.UndefOr[Double], /* p1 */ js.UndefOr[Boolean], js.UndefOr[Double]]
}
