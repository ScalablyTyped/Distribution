package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceAndAppManagementRoleAssignment extends RoleAssignment {
  /** The list of ids of role member security groups. These are IDs from Azure Active Directory. */
  var members: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object DeviceAndAppManagementRoleAssignment {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    members: js.Array[java.lang.String] = null,
    resourceScopes: js.Array[java.lang.String] = null,
    roleDefinition: RoleDefinition = null
  ): DeviceAndAppManagementRoleAssignment = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (members != null) __obj.updateDynamic("members")(members)
    if (resourceScopes != null) __obj.updateDynamic("resourceScopes")(resourceScopes)
    if (roleDefinition != null) __obj.updateDynamic("roleDefinition")(roleDefinition)
    __obj.asInstanceOf[DeviceAndAppManagementRoleAssignment]
  }
}

