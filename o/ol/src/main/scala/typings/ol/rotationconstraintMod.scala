package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotationconstraintMod {
  
  @JSImport("ol/rotationconstraint", "createSnapToN")
  @js.native
  def createSnapToN(n: Double): Type = js.native
  
  @JSImport("ol/rotationconstraint", "createSnapToZero")
  @js.native
  def createSnapToZero(): Type = js.native
  @JSImport("ol/rotationconstraint", "createSnapToZero")
  @js.native
  def createSnapToZero(opt_tolerance: Double): Type = js.native
  
  @JSImport("ol/rotationconstraint", "disable")
  @js.native
  def disable(): js.UndefOr[Double] = js.native
  @JSImport("ol/rotationconstraint", "disable")
  @js.native
  def disable(rotation: Double): js.UndefOr[Double] = js.native
  
  @JSImport("ol/rotationconstraint", "none")
  @js.native
  def none(): js.UndefOr[Double] = js.native
  @JSImport("ol/rotationconstraint", "none")
  @js.native
  def none(rotation: Double): js.UndefOr[Double] = js.native
  
  type Type = js.Function2[/* p0 */ js.UndefOr[Double], /* p1 */ js.UndefOr[Boolean], js.UndefOr[Double]]
}
