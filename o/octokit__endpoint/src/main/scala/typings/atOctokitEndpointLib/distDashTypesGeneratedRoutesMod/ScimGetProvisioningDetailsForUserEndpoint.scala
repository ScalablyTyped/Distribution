package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScimGetProvisioningDetailsForUserEndpoint extends js.Object {
  var external_identity_guid: js.UndefOr[scala.Double] = js.undefined
  var org: java.lang.String
  var scim_user_id: scala.Double
}

object ScimGetProvisioningDetailsForUserEndpoint {
  @scala.inline
  def apply(
    org: java.lang.String,
    scim_user_id: scala.Double,
    external_identity_guid: scala.Int | scala.Double = null
  ): ScimGetProvisioningDetailsForUserEndpoint = {
    val __obj = js.Dynamic.literal(org = org, scim_user_id = scim_user_id)
    if (external_identity_guid != null) __obj.updateDynamic("external_identity_guid")(external_identity_guid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimGetProvisioningDetailsForUserEndpoint]
  }
}

