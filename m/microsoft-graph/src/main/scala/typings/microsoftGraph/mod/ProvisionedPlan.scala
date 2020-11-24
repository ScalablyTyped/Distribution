package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionedPlan extends js.Object {
  
  // For example, 'Enabled'.
  var capabilityStatus: js.UndefOr[NullableOption[String]] = js.native
  
  // For example, 'Success'.
  var provisioningStatus: js.UndefOr[NullableOption[String]] = js.native
  
  // The name of the service; for example, 'AccessControlS2S'
  var service: js.UndefOr[NullableOption[String]] = js.native
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
    def setCapabilityStatus(value: NullableOption[String]): Self = this.set("capabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilityStatus: Self = this.set("capabilityStatus", js.undefined)
    
    @scala.inline
    def setCapabilityStatusNull: Self = this.set("capabilityStatus", null)
    
    @scala.inline
    def setProvisioningStatus(value: NullableOption[String]): Self = this.set("provisioningStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningStatus: Self = this.set("provisioningStatus", js.undefined)
    
    @scala.inline
    def setProvisioningStatusNull: Self = this.set("provisioningStatus", null)
    
    @scala.inline
    def setService(value: NullableOption[String]): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setServiceNull: Self = this.set("service", null)
  }
}
