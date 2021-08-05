package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServicePlanInfo extends StObject {
  
  /**
    * The object the service plan can be assigned to. Possible values:'User' - service plan can be assigned to individual
    * users.'Company' - service plan can be assigned to the entire tenant.
    */
  var appliesTo: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The provisioning status of the service plan. Possible values:'Success' - Service is fully provisioned.'Disabled' -
    * Service has been disabled.'PendingInput' - Service is not yet provisioned; awaiting service
    * confirmation.'PendingActivation' - Service is provisioned but requires explicit activation by administrator (for
    * example, Intune_O365 service plan)'PendingProvisioning' - Microsoft has added a new service to the product SKU and it
    * has not been activated in the tenant, yet.
    */
  var provisioningStatus: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier of the service plan.
  var servicePlanId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the service plan.
  var servicePlanName: js.UndefOr[NullableOption[String]] = js.undefined
}
object ServicePlanInfo {
  
  inline def apply(): ServicePlanInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServicePlanInfo]
  }
  
  extension [Self <: ServicePlanInfo](x: Self) {
    
    inline def setAppliesTo(value: NullableOption[String]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    inline def setAppliesToNull: Self = StObject.set(x, "appliesTo", null)
    
    inline def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    inline def setProvisioningStatus(value: NullableOption[String]): Self = StObject.set(x, "provisioningStatus", value.asInstanceOf[js.Any])
    
    inline def setProvisioningStatusNull: Self = StObject.set(x, "provisioningStatus", null)
    
    inline def setProvisioningStatusUndefined: Self = StObject.set(x, "provisioningStatus", js.undefined)
    
    inline def setServicePlanId(value: NullableOption[String]): Self = StObject.set(x, "servicePlanId", value.asInstanceOf[js.Any])
    
    inline def setServicePlanIdNull: Self = StObject.set(x, "servicePlanId", null)
    
    inline def setServicePlanIdUndefined: Self = StObject.set(x, "servicePlanId", js.undefined)
    
    inline def setServicePlanName(value: NullableOption[String]): Self = StObject.set(x, "servicePlanName", value.asInstanceOf[js.Any])
    
    inline def setServicePlanNameNull: Self = StObject.set(x, "servicePlanName", null)
    
    inline def setServicePlanNameUndefined: Self = StObject.set(x, "servicePlanName", js.undefined)
  }
}
