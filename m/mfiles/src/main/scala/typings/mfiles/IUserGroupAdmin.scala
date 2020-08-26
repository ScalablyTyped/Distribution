package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserGroupAdmin extends js.Object {
  var AccessControlList: IAccessControlList = js.native
  var SemanticAliases: ISemanticAliases = js.native
  var UserGroup: IUserGroup = js.native
  def Clone(): IUserGroupAdmin = js.native
  def CloneFrom(UserGroupAdmin: IUserGroupAdmin): Unit = js.native
}

object IUserGroupAdmin {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: () => IUserGroupAdmin,
    CloneFrom: IUserGroupAdmin => Unit,
    SemanticAliases: ISemanticAliases,
    UserGroup: IUserGroup
  ): IUserGroupAdmin = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), SemanticAliases = SemanticAliases.asInstanceOf[js.Any], UserGroup = UserGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserGroupAdmin]
  }
  @scala.inline
  implicit class IUserGroupAdminOps[Self <: IUserGroupAdmin] (val x: Self) extends AnyVal {
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
    def setAccessControlList(value: IAccessControlList): Self = this.set("AccessControlList", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => IUserGroupAdmin): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCloneFrom(value: IUserGroupAdmin => Unit): Self = this.set("CloneFrom", js.Any.fromFunction1(value))
    @scala.inline
    def setSemanticAliases(value: ISemanticAliases): Self = this.set("SemanticAliases", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserGroup(value: IUserGroup): Self = this.set("UserGroup", value.asInstanceOf[js.Any])
  }
  
}

