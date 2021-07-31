package typings.mfiles

import typings.mfiles.MFiles.MFUserAccountVaultRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserAccount extends StObject {
  
  var AccessControlList: IAccessControlList
  
  def AddVaultRoles(VaultRolesToAdd: MFUserAccountVaultRole): Unit
  
  def Clone(): IUserAccount
  
  def CloneFrom(UserAccount: IUserAccount): Unit
  
  var Enabled: Boolean
  
  var ID: Double
  
  var InternalUser: Boolean
  
  var LoginName: String
  
  def RemoveVaultRoles(VaultRolesToRemove: MFUserAccountVaultRole): Unit
  
  var VaultLanguage: Double
  
  var VaultRoles: MFUserAccountVaultRole
}
object IUserAccount {
  
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AddVaultRoles: MFUserAccountVaultRole => Unit,
    Clone: () => IUserAccount,
    CloneFrom: IUserAccount => Unit,
    Enabled: Boolean,
    ID: Double,
    InternalUser: Boolean,
    LoginName: String,
    RemoveVaultRoles: MFUserAccountVaultRole => Unit,
    VaultLanguage: Double,
    VaultRoles: MFUserAccountVaultRole
  ): IUserAccount = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], AddVaultRoles = js.Any.fromFunction1(AddVaultRoles), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Enabled = Enabled.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], InternalUser = InternalUser.asInstanceOf[js.Any], LoginName = LoginName.asInstanceOf[js.Any], RemoveVaultRoles = js.Any.fromFunction1(RemoveVaultRoles), VaultLanguage = VaultLanguage.asInstanceOf[js.Any], VaultRoles = VaultRoles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserAccount]
  }
  
  @scala.inline
  implicit class IUserAccountMutableBuilder[Self <: IUserAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddVaultRoles(value: MFUserAccountVaultRole => Unit): Self = StObject.set(x, "AddVaultRoles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClone(value: () => IUserAccount): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: IUserAccount => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalUser(value: Boolean): Self = StObject.set(x, "InternalUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginName(value: String): Self = StObject.set(x, "LoginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveVaultRoles(value: MFUserAccountVaultRole => Unit): Self = StObject.set(x, "RemoveVaultRoles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVaultLanguage(value: Double): Self = StObject.set(x, "VaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultRoles(value: MFUserAccountVaultRole): Self = StObject.set(x, "VaultRoles", value.asInstanceOf[js.Any])
  }
}
