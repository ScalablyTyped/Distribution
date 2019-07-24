package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleAssignment extends Entity {
  // Description of the Role Assignment.
  var description: js.UndefOr[java.lang.String] = js.undefined
  // The display or friendly name of the role Assignment.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // List of ids of role scope member security groups. These are IDs from Azure Active Directory.
  var resourceScopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Role definition this assignment is part of.
  var roleDefinition: js.UndefOr[RoleDefinition] = js.undefined
}

object RoleAssignment {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    resourceScopes: js.Array[java.lang.String] = null,
    roleDefinition: RoleDefinition = null
  ): RoleAssignment = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (resourceScopes != null) __obj.updateDynamic("resourceScopes")(resourceScopes)
    if (roleDefinition != null) __obj.updateDynamic("roleDefinition")(roleDefinition)
    __obj.asInstanceOf[RoleAssignment]
  }
}

