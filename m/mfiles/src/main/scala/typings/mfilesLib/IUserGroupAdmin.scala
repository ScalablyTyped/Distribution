package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserGroupAdmin extends js.Object {
  var AccessControlList: IAccessControlList
  var SemanticAliases: ISemanticAliases
  var UserGroup: IUserGroup
  def Clone(): IUserGroupAdmin
  def CloneFrom(UserGroupAdmin: IUserGroupAdmin): scala.Unit
}

object IUserGroupAdmin {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: js.Function0[IUserGroupAdmin],
    CloneFrom: js.Function1[IUserGroupAdmin, scala.Unit],
    SemanticAliases: ISemanticAliases,
    UserGroup: IUserGroup
  ): IUserGroupAdmin = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, Clone = Clone, CloneFrom = CloneFrom, SemanticAliases = SemanticAliases, UserGroup = UserGroup)
  
    __obj.asInstanceOf[IUserGroupAdmin]
  }
}

