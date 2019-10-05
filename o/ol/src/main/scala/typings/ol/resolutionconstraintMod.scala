package typings.ol

import typings.ol.resolutionconstraintMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/resolutionconstraint", JSImport.Namespace)
@js.native
object resolutionconstraintMod extends js.Object {
  def createSnapToPower(power: Double, maxResolution: Double): Type = js.native
  def createSnapToPower(power: Double, maxResolution: Double, opt_maxLevel: Double): Type = js.native
  def createSnapToResolutions(resolutions: js.Array[Double]): Type = js.native
  type Type = js.Function3[/* p0 */ js.UndefOr[Double], /* p1 */ Double, /* p2 */ Double, js.UndefOr[Double]]
}

