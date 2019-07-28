package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScimRemoveUserFromOrgEndpoint extends js.Object {
  var external_identity_guid: js.UndefOr[Double] = js.undefined
  var org: String
  var scim_user_id: Double
}

object ScimRemoveUserFromOrgEndpoint {
  @scala.inline
  def apply(org: String, scim_user_id: Double, external_identity_guid: Int | Double = null): ScimRemoveUserFromOrgEndpoint = {
    val __obj = js.Dynamic.literal(org = org, scim_user_id = scim_user_id)
    if (external_identity_guid != null) __obj.updateDynamic("external_identity_guid")(external_identity_guid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimRemoveUserFromOrgEndpoint]
  }
}

