package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedPlan extends js.Object {
  // For example, 'Enabled'.
  var capabilityStatus: js.UndefOr[String] = js.undefined
  // For example, 'Success'.
  var provisioningStatus: js.UndefOr[String] = js.undefined
  // The name of the service; for example, 'AccessControlS2S'
  var service: js.UndefOr[String] = js.undefined
}

object ProvisionedPlan {
  @scala.inline
  def apply(capabilityStatus: String = null, provisioningStatus: String = null, service: String = null): ProvisionedPlan = {
    val __obj = js.Dynamic.literal()
    if (capabilityStatus != null) __obj.updateDynamic("capabilityStatus")(capabilityStatus)
    if (provisioningStatus != null) __obj.updateDynamic("provisioningStatus")(provisioningStatus)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[ProvisionedPlan]
  }
}

