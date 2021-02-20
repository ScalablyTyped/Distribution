package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUserGroupAdmin extends StObject {
  
  var AccessControlList: IAccessControlList = js.native
  
  def Clone(): IUserGroupAdmin = js.native
  
  def CloneFrom(UserGroupAdmin: IUserGroupAdmin): Unit = js.native
  
  var SemanticAliases: ISemanticAliases = js.native
  
  var UserGroup: IUserGroup = js.native
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
  implicit class IUserGroupAdminMutableBuilder[Self <: IUserGroupAdmin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IUserGroupAdmin): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: IUserGroupAdmin => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSemanticAliases(value: ISemanticAliases): Self = StObject.set(x, "SemanticAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroup(value: IUserGroup): Self = StObject.set(x, "UserGroup", value.asInstanceOf[js.Any])
  }
}
