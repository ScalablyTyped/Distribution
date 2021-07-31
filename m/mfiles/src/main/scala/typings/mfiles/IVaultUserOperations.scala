package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultUserOperations extends StObject {
  
  def AddOrUndeleteUserAccount(User: IUserAccount): IUserAccount
  
  def AddUserAccount(User: IUserAccount): IUserAccount
  
  def GetLoginAccountOfUser(UserID: Double): ILoginAccount
  
  def GetLoginAccounts(): ILoginAccounts
  
  def GetUserAccount(UserID: Double): IUserAccount
  
  def GetUserAccounts(): IUserAccounts
  
  def GetUserIDByGUID(UserGUID: String): Double
  
  def GetUserList(): IKeyNamePairs
  
  def ModifyUserAccount(User: IUserAccount): Unit
  
  def RemoveUserAccount(UserID: Double): Unit
}
object IVaultUserOperations {
  
  @scala.inline
  def apply(
    AddOrUndeleteUserAccount: IUserAccount => IUserAccount,
    AddUserAccount: IUserAccount => IUserAccount,
    GetLoginAccountOfUser: Double => ILoginAccount,
    GetLoginAccounts: () => ILoginAccounts,
    GetUserAccount: Double => IUserAccount,
    GetUserAccounts: () => IUserAccounts,
    GetUserIDByGUID: String => Double,
    GetUserList: () => IKeyNamePairs,
    ModifyUserAccount: IUserAccount => Unit,
    RemoveUserAccount: Double => Unit
  ): IVaultUserOperations = {
    val __obj = js.Dynamic.literal(AddOrUndeleteUserAccount = js.Any.fromFunction1(AddOrUndeleteUserAccount), AddUserAccount = js.Any.fromFunction1(AddUserAccount), GetLoginAccountOfUser = js.Any.fromFunction1(GetLoginAccountOfUser), GetLoginAccounts = js.Any.fromFunction0(GetLoginAccounts), GetUserAccount = js.Any.fromFunction1(GetUserAccount), GetUserAccounts = js.Any.fromFunction0(GetUserAccounts), GetUserIDByGUID = js.Any.fromFunction1(GetUserIDByGUID), GetUserList = js.Any.fromFunction0(GetUserList), ModifyUserAccount = js.Any.fromFunction1(ModifyUserAccount), RemoveUserAccount = js.Any.fromFunction1(RemoveUserAccount))
    __obj.asInstanceOf[IVaultUserOperations]
  }
  
  @scala.inline
  implicit class IVaultUserOperationsMutableBuilder[Self <: IVaultUserOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOrUndeleteUserAccount(value: IUserAccount => IUserAccount): Self = StObject.set(x, "AddOrUndeleteUserAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddUserAccount(value: IUserAccount => IUserAccount): Self = StObject.set(x, "AddUserAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLoginAccountOfUser(value: Double => ILoginAccount): Self = StObject.set(x, "GetLoginAccountOfUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLoginAccounts(value: () => ILoginAccounts): Self = StObject.set(x, "GetLoginAccounts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserAccount(value: Double => IUserAccount): Self = StObject.set(x, "GetUserAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUserAccounts(value: () => IUserAccounts): Self = StObject.set(x, "GetUserAccounts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserIDByGUID(value: String => Double): Self = StObject.set(x, "GetUserIDByGUID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUserList(value: () => IKeyNamePairs): Self = StObject.set(x, "GetUserList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModifyUserAccount(value: IUserAccount => Unit): Self = StObject.set(x, "ModifyUserAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUserAccount(value: Double => Unit): Self = StObject.set(x, "RemoveUserAccount", js.Any.fromFunction1(value))
  }
}
