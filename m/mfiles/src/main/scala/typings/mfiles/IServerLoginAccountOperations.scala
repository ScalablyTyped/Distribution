package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServerLoginAccountOperations extends StObject {
  
  def AddLoginAccount(LoginAccount: ILoginAccount, Password: String): Unit
  
  def ForceLogout(AccountNames: IStrings): Unit
  
  def GetLoginAccount(AccountName: String): ILoginAccount
  
  def GetLoginAccounts(): ILoginAccounts
  
  def GetLoginAccountsWithSessions(): ILoginAccounts
  
  def GetPersonalInformationFromDomain(AccountName: String): ILoginAccountPersonalInformation
  
  def ModifyLoginAccount(LoginAccount: ILoginAccount): Unit
  
  def RemoveLoginAccount(AccountName: String): Unit
  
  def UpdateLoginPassword(AccountName: String, NewPassword: String): Unit
}
object IServerLoginAccountOperations {
  
  inline def apply(
    AddLoginAccount: (ILoginAccount, String) => Unit,
    ForceLogout: IStrings => Unit,
    GetLoginAccount: String => ILoginAccount,
    GetLoginAccounts: () => ILoginAccounts,
    GetLoginAccountsWithSessions: () => ILoginAccounts,
    GetPersonalInformationFromDomain: String => ILoginAccountPersonalInformation,
    ModifyLoginAccount: ILoginAccount => Unit,
    RemoveLoginAccount: String => Unit,
    UpdateLoginPassword: (String, String) => Unit
  ): IServerLoginAccountOperations = {
    val __obj = js.Dynamic.literal(AddLoginAccount = js.Any.fromFunction2(AddLoginAccount), ForceLogout = js.Any.fromFunction1(ForceLogout), GetLoginAccount = js.Any.fromFunction1(GetLoginAccount), GetLoginAccounts = js.Any.fromFunction0(GetLoginAccounts), GetLoginAccountsWithSessions = js.Any.fromFunction0(GetLoginAccountsWithSessions), GetPersonalInformationFromDomain = js.Any.fromFunction1(GetPersonalInformationFromDomain), ModifyLoginAccount = js.Any.fromFunction1(ModifyLoginAccount), RemoveLoginAccount = js.Any.fromFunction1(RemoveLoginAccount), UpdateLoginPassword = js.Any.fromFunction2(UpdateLoginPassword))
    __obj.asInstanceOf[IServerLoginAccountOperations]
  }
  
  extension [Self <: IServerLoginAccountOperations](x: Self) {
    
    inline def setAddLoginAccount(value: (ILoginAccount, String) => Unit): Self = StObject.set(x, "AddLoginAccount", js.Any.fromFunction2(value))
    
    inline def setForceLogout(value: IStrings => Unit): Self = StObject.set(x, "ForceLogout", js.Any.fromFunction1(value))
    
    inline def setGetLoginAccount(value: String => ILoginAccount): Self = StObject.set(x, "GetLoginAccount", js.Any.fromFunction1(value))
    
    inline def setGetLoginAccounts(value: () => ILoginAccounts): Self = StObject.set(x, "GetLoginAccounts", js.Any.fromFunction0(value))
    
    inline def setGetLoginAccountsWithSessions(value: () => ILoginAccounts): Self = StObject.set(x, "GetLoginAccountsWithSessions", js.Any.fromFunction0(value))
    
    inline def setGetPersonalInformationFromDomain(value: String => ILoginAccountPersonalInformation): Self = StObject.set(x, "GetPersonalInformationFromDomain", js.Any.fromFunction1(value))
    
    inline def setModifyLoginAccount(value: ILoginAccount => Unit): Self = StObject.set(x, "ModifyLoginAccount", js.Any.fromFunction1(value))
    
    inline def setRemoveLoginAccount(value: String => Unit): Self = StObject.set(x, "RemoveLoginAccount", js.Any.fromFunction1(value))
    
    inline def setUpdateLoginPassword(value: (String, String) => Unit): Self = StObject.set(x, "UpdateLoginPassword", js.Any.fromFunction2(value))
  }
}
