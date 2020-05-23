package typings.physijs.Physijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VehicleTuning extends js.Object {
  var friction_slip: Double
  var max_suspension_force: Double
  var max_suspension_travel: Double
  var suspension_compression: Double
  var suspension_damping: Double
  var suspension_stiffness: Double
}

object VehicleTuning {
  @scala.inline
  def apply(
    friction_slip: Double,
    max_suspension_force: Double,
    max_suspension_travel: Double,
    suspension_compression: Double,
    suspension_damping: Double,
    suspension_stiffness: Double
  ): VehicleTuning = {
    val __obj = js.Dynamic.literal(friction_slip = friction_slip.asInstanceOf[js.Any], max_suspension_force = max_suspension_force.asInstanceOf[js.Any], max_suspension_travel = max_suspension_travel.asInstanceOf[js.Any], suspension_compression = suspension_compression.asInstanceOf[js.Any], suspension_damping = suspension_damping.asInstanceOf[js.Any], suspension_stiffness = suspension_stiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[VehicleTuning]
  }
}

