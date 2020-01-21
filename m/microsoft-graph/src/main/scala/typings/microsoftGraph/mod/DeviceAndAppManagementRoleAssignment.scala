package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceAndAppManagementRoleAssignment extends RoleAssignment {
  // The list of ids of role member security groups. These are IDs from Azure Active Directory.
  var members: js.UndefOr[js.Array[String]] = js.undefined
}

object DeviceAndAppManagementRoleAssignment {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    id: String = null,
    members: js.Array[String] = null,
    resourceScopes: js.Array[String] = null,
    roleDefinition: RoleDefinition = null
  ): DeviceAndAppManagementRoleAssignment = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (resourceScopes != null) __obj.updateDynamic("resourceScopes")(resourceScopes.asInstanceOf[js.Any])
    if (roleDefinition != null) __obj.updateDynamic("roleDefinition")(roleDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceAndAppManagementRoleAssignment]
  }
}

