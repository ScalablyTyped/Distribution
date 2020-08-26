package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleDefinition extends Entity {
  // Description of the Role definition.
  var description: js.UndefOr[String] = js.native
  // Display Name of the Role definition.
  var displayName: js.UndefOr[String] = js.native
  // Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.
  var isBuiltIn: js.UndefOr[Boolean] = js.native
  // List of Role assignments for this role definition.
  var roleAssignments: js.UndefOr[js.Array[RoleAssignment]] = js.native
  /**
    * List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of
    * the rolePermission.
    */
  var rolePermissions: js.UndefOr[js.Array[RolePermission]] = js.native
}

object RoleDefinition {
  @scala.inline
  def apply(): RoleDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleDefinition]
  }
  @scala.inline
  implicit class RoleDefinitionOps[Self <: RoleDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setIsBuiltIn(value: Boolean): Self = this.set("isBuiltIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBuiltIn: Self = this.set("isBuiltIn", js.undefined)
    @scala.inline
    def setRoleAssignmentsVarargs(value: RoleAssignment*): Self = this.set("roleAssignments", js.Array(value :_*))
    @scala.inline
    def setRoleAssignments(value: js.Array[RoleAssignment]): Self = this.set("roleAssignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleAssignments: Self = this.set("roleAssignments", js.undefined)
    @scala.inline
    def setRolePermissionsVarargs(value: RolePermission*): Self = this.set("rolePermissions", js.Array(value :_*))
    @scala.inline
    def setRolePermissions(value: js.Array[RolePermission]): Self = this.set("rolePermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRolePermissions: Self = this.set("rolePermissions", js.undefined)
  }
  
}

