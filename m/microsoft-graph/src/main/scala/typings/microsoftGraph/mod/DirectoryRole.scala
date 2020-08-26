package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryRole extends DirectoryObject {
  // The description for the directory role. Read-only.
  var description: js.UndefOr[String] = js.native
  // The display name for the directory role. Read-only.
  var displayName: js.UndefOr[String] = js.native
  // Users that are members of this directory role. HTTP Methods: GET, POST, DELETE. Read-only. Nullable.
  var members: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * The id of the directoryRoleTemplate that this role is based on. The property must be specified when activating a
    * directory role in a tenant with a POST operation. After the directory role has been activated, the property is read
    * only.
    */
  var roleTemplateId: js.UndefOr[String] = js.native
}

object DirectoryRole {
  @scala.inline
  def apply(): DirectoryRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryRole]
  }
  @scala.inline
  implicit class DirectoryRoleOps[Self <: DirectoryRole] (val x: Self) extends AnyVal {
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
    def setMembersVarargs(value: DirectoryObject*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[DirectoryObject]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    @scala.inline
    def setRoleTemplateId(value: String): Self = this.set("roleTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleTemplateId: Self = this.set("roleTemplateId", js.undefined)
  }
  
}

