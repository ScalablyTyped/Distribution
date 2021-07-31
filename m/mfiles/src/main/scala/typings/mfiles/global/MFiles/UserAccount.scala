package typings.mfiles.global.MFiles

import typings.mfiles.IAccessControlList
import typings.mfiles.IUserAccount
import typings.mfiles.MFiles.MFUserAccountVaultRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.UserAccount")
@js.native
class UserAccount ()
  extends StObject
     with IUserAccount {
  
  /* CompleteClass */
  var AccessControlList: IAccessControlList = js.native
  
  /* CompleteClass */
  override def AddVaultRoles(VaultRolesToAdd: MFUserAccountVaultRole): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IUserAccount = js.native
  
  /* CompleteClass */
  override def CloneFrom(UserAccount: IUserAccount): Unit = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var InternalUser: Boolean = js.native
  
  /* CompleteClass */
  var LoginName: String = js.native
  
  /* CompleteClass */
  override def RemoveVaultRoles(VaultRolesToRemove: MFUserAccountVaultRole): Unit = js.native
  
  /* CompleteClass */
  var VaultLanguage: Double = js.native
  
  /* CompleteClass */
  var VaultRoles: MFUserAccountVaultRole = js.native
}
