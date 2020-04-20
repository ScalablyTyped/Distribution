package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserGroupAdmin extends js.Object {
  var AccessControlList: IAccessControlList
  var SemanticAliases: ISemanticAliases
  var UserGroup: IUserGroup
  def Clone(): IUserGroupAdmin
  def CloneFrom(UserGroupAdmin: IUserGroupAdmin): Unit
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
}

