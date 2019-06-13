package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleDefinition extends Entity {
  /** Description of the Role definition. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Display Name of the Role definition. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition. */
  var isBuiltIn: js.UndefOr[scala.Boolean] = js.undefined
  /** List of Role assignments for this role definition. */
  var roleAssignments: js.UndefOr[js.Array[RoleAssignment]] = js.undefined
  /** List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of the rolePermission. */
  var rolePermissions: js.UndefOr[js.Array[RolePermission]] = js.undefined
}

object RoleDefinition {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    isBuiltIn: js.UndefOr[scala.Boolean] = js.undefined,
    roleAssignments: js.Array[RoleAssignment] = null,
    rolePermissions: js.Array[RolePermission] = null
  ): RoleDefinition = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isBuiltIn)) __obj.updateDynamic("isBuiltIn")(isBuiltIn)
    if (roleAssignments != null) __obj.updateDynamic("roleAssignments")(roleAssignments)
    if (rolePermissions != null) __obj.updateDynamic("rolePermissions")(rolePermissions)
    __obj.asInstanceOf[RoleDefinition]
  }
}

