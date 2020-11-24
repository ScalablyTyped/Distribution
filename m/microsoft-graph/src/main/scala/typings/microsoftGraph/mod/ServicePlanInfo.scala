package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicePlanInfo extends js.Object {
  
  /**
    * The object the service plan can be assigned to. Possible values:'User' - service plan can be assigned to individual
    * users.'Company' - service plan can be assigned to the entire tenant.
    */
  var appliesTo: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The provisioning status of the service plan. Possible values:'Success' - Service is fully provisioned.'Disabled' -
    * Service has been disabled.'PendingInput' - Service is not yet provisioned; awaiting service
    * confirmation.'PendingActivation' - Service is provisioned but requires explicit activation by administrator (for
    * example, Intune_O365 service plan)'PendingProvisioning' - Microsoft has added a new service to the product SKU and it
    * has not been activated in the tenant, yet.
    */
  var provisioningStatus: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier of the service plan.
  var servicePlanId: js.UndefOr[NullableOption[String]] = js.native
  
  // The name of the service plan.
  var servicePlanName: js.UndefOr[NullableOption[String]] = js.native
}
object ServicePlanInfo {
  
  @scala.inline
  def apply(): ServicePlanInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServicePlanInfo]
  }
  
  @scala.inline
  implicit class ServicePlanInfoOps[Self <: ServicePlanInfo] (val x: Self) extends AnyVal {
    
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
    def setAppliesTo(value: NullableOption[String]): Self = this.set("appliesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliesTo: Self = this.set("appliesTo", js.undefined)
    
    @scala.inline
    def setAppliesToNull: Self = this.set("appliesTo", null)
    
    @scala.inline
    def setProvisioningStatus(value: NullableOption[String]): Self = this.set("provisioningStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningStatus: Self = this.set("provisioningStatus", js.undefined)
    
    @scala.inline
    def setProvisioningStatusNull: Self = this.set("provisioningStatus", null)
    
    @scala.inline
    def setServicePlanId(value: NullableOption[String]): Self = this.set("servicePlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePlanId: Self = this.set("servicePlanId", js.undefined)
    
    @scala.inline
    def setServicePlanIdNull: Self = this.set("servicePlanId", null)
    
    @scala.inline
    def setServicePlanName(value: NullableOption[String]): Self = this.set("servicePlanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePlanName: Self = this.set("servicePlanName", js.undefined)
    
    @scala.inline
    def setServicePlanNameNull: Self = this.set("servicePlanName", null)
  }
}
