package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedPlan extends js.Object {
  // For example, 'Enabled'.
  var capabilityStatus: js.UndefOr[String] = js.native
  // For example, 'Success'.
  var provisioningStatus: js.UndefOr[String] = js.native
  // The name of the service; for example, 'AccessControlS2S'
  var service: js.UndefOr[String] = js.native
}

object ProvisionedPlan {
  @scala.inline
  def apply(): ProvisionedPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedPlan]
  }
  @scala.inline
  implicit class ProvisionedPlanOps[Self <: ProvisionedPlan] (val x: Self) extends AnyVal {
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
    def setCapabilityStatus(value: String): Self = this.set("capabilityStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilityStatus: Self = this.set("capabilityStatus", js.undefined)
    @scala.inline
    def setProvisioningStatus(value: String): Self = this.set("provisioningStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningStatus: Self = this.set("provisioningStatus", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

