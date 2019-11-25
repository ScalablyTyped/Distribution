package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleAssignment extends Entity {
  // Description of the Role Assignment.
  var description: js.UndefOr[String] = js.undefined
  // The display or friendly name of the role Assignment.
  var displayName: js.UndefOr[String] = js.undefined
  // List of ids of role scope member security groups. These are IDs from Azure Active Directory.
  var resourceScopes: js.UndefOr[js.Array[String]] = js.undefined
  // Role definition this assignment is part of.
  var roleDefinition: js.UndefOr[RoleDefinition] = js.undefined
}

object RoleAssignment {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    id: String = null,
    resourceScopes: js.Array[String] = null,
    roleDefinition: RoleDefinition = null
  ): RoleAssignment = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (resourceScopes != null) __obj.updateDynamic("resourceScopes")(resourceScopes.asInstanceOf[js.Any])
    if (roleDefinition != null) __obj.updateDynamic("roleDefinition")(roleDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleAssignment]
  }
}

