package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleDefinition extends Entity {
  // Description of the Role definition.
  var description: js.UndefOr[String] = js.undefined
  // Display Name of the Role definition.
  var displayName: js.UndefOr[String] = js.undefined
  // Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.
  var isBuiltIn: js.UndefOr[Boolean] = js.undefined
  // List of Role assignments for this role definition.
  var roleAssignments: js.UndefOr[js.Array[RoleAssignment]] = js.undefined
  /**
    * List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of
    * the rolePermission.
    */
  var rolePermissions: js.UndefOr[js.Array[RolePermission]] = js.undefined
}

object RoleDefinition {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    id: String = null,
    isBuiltIn: js.UndefOr[Boolean] = js.undefined,
    roleAssignments: js.Array[RoleAssignment] = null,
    rolePermissions: js.Array[RolePermission] = null
  ): RoleDefinition = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isBuiltIn)) __obj.updateDynamic("isBuiltIn")(isBuiltIn.asInstanceOf[js.Any])
    if (roleAssignments != null) __obj.updateDynamic("roleAssignments")(roleAssignments.asInstanceOf[js.Any])
    if (rolePermissions != null) __obj.updateDynamic("rolePermissions")(rolePermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleDefinition]
  }
}

