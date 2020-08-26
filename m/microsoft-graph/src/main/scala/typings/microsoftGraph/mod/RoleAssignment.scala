package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleAssignment extends Entity {
  // Description of the Role Assignment.
  var description: js.UndefOr[String] = js.native
  // The display or friendly name of the role Assignment.
  var displayName: js.UndefOr[String] = js.native
  // List of ids of role scope member security groups. These are IDs from Azure Active Directory.
  var resourceScopes: js.UndefOr[js.Array[String]] = js.native
  // Role definition this assignment is part of.
  var roleDefinition: js.UndefOr[RoleDefinition] = js.native
}

object RoleAssignment {
  @scala.inline
  def apply(): RoleAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleAssignment]
  }
  @scala.inline
  implicit class RoleAssignmentOps[Self <: RoleAssignment] (val x: Self) extends AnyVal {
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
    def setResourceScopesVarargs(value: String*): Self = this.set("resourceScopes", js.Array(value :_*))
    @scala.inline
    def setResourceScopes(value: js.Array[String]): Self = this.set("resourceScopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceScopes: Self = this.set("resourceScopes", js.undefined)
    @scala.inline
    def setRoleDefinition(value: RoleDefinition): Self = this.set("roleDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleDefinition: Self = this.set("roleDefinition", js.undefined)
  }
  
}

