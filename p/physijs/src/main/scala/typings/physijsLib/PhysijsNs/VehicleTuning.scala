package typings
package physijsLib.PhysijsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.VehicleTuning")
@js.native
class VehicleTuning protected () extends js.Object {
  def this(suspension_stiffness: js.UndefOr[scala.Double], suspension_compression: js.UndefOr[scala.Double], suspension_damping: js.UndefOr[scala.Double], max_suspension_travel: js.UndefOr[scala.Double], friction_slip: js.UndefOr[scala.Double], max_suspension_force: js.UndefOr[scala.Double]) = this()
  var friction_slip: scala.Double = js.native
  var max_suspension_force: scala.Double = js.native
  var max_suspension_travel: scala.Double = js.native
  var suspension_compression: scala.Double = js.native
  var suspension_damping: scala.Double = js.native
  var suspension_stiffness: scala.Double = js.native
}

