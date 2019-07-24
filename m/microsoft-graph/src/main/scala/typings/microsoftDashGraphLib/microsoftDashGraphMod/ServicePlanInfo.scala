package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicePlanInfo extends js.Object {
  /**
    * The object the service plan can be assigned to. Possible values:'User' - service plan can be assigned to individual
    * users.'Company' - service plan can be assigned to the entire tenant.
    */
  var appliesTo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The provisioning status of the service plan. Possible values:'Success' - Service is fully provisioned.'Disabled' -
    * Service has been disabled.'PendingInput' - Service is not yet provisioned; awaiting service
    * confirmation.'PendingActivation' - Service is provisioned but requires explicit activation by administrator (for
    * example, Intune_O365 service plan)'PendingProvisioning' - Microsoft has added a new service to the product SKU and it
    * has not been activated in the tenant, yet.
    */
  var provisioningStatus: js.UndefOr[java.lang.String] = js.undefined
  // The unique identifier of the service plan.
  var servicePlanId: js.UndefOr[java.lang.String] = js.undefined
  // The name of the service plan.
  var servicePlanName: js.UndefOr[java.lang.String] = js.undefined
}

object ServicePlanInfo {
  @scala.inline
  def apply(
    appliesTo: java.lang.String = null,
    provisioningStatus: java.lang.String = null,
    servicePlanId: java.lang.String = null,
    servicePlanName: java.lang.String = null
  ): ServicePlanInfo = {
    val __obj = js.Dynamic.literal()
    if (appliesTo != null) __obj.updateDynamic("appliesTo")(appliesTo)
    if (provisioningStatus != null) __obj.updateDynamic("provisioningStatus")(provisioningStatus)
    if (servicePlanId != null) __obj.updateDynamic("servicePlanId")(servicePlanId)
    if (servicePlanName != null) __obj.updateDynamic("servicePlanName")(servicePlanName)
    __obj.asInstanceOf[ServicePlanInfo]
  }
}

