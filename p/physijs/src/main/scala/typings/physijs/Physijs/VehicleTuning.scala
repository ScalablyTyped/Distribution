package typings.physijs.Physijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VehicleTuning extends js.Object {
  var friction_slip: Double = js.native
  var max_suspension_force: Double = js.native
  var max_suspension_travel: Double = js.native
  var suspension_compression: Double = js.native
  var suspension_damping: Double = js.native
  var suspension_stiffness: Double = js.native
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
  @scala.inline
  implicit class VehicleTuningOps[Self <: VehicleTuning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFriction_slip(value: Double): Self = this.set("friction_slip", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_suspension_force(value: Double): Self = this.set("max_suspension_force", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_suspension_travel(value: Double): Self = this.set("max_suspension_travel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuspension_compression(value: Double): Self = this.set("suspension_compression", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuspension_damping(value: Double): Self = this.set("suspension_damping", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuspension_stiffness(value: Double): Self = this.set("suspension_stiffness", value.asInstanceOf[js.Any])
  }
  
}

