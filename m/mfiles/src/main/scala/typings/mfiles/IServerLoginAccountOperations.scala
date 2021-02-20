package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServerLoginAccountOperations extends StObject {
  
  def AddLoginAccount(LoginAccount: ILoginAccount, Password: String): Unit = js.native
  
  def ForceLogout(AccountNames: IStrings): Unit = js.native
  
  def GetLoginAccount(AccountName: String): ILoginAccount = js.native
  
  def GetLoginAccounts(): ILoginAccounts = js.native
  
  def GetLoginAccountsWithSessions(): ILoginAccounts = js.native
  
  def GetPersonalInformationFromDomain(AccountName: String): ILoginAccountPersonalInformation = js.native
  
  def ModifyLoginAccount(LoginAccount: ILoginAccount): Unit = js.native
  
  def RemoveLoginAccount(AccountName: String): Unit = js.native
  
  def UpdateLoginPassword(AccountName: String, NewPassword: String): Unit = js.native
}
object IServerLoginAccountOperations {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IServerLoginAccountOperationsMutableBuilder[Self <: IServerLoginAccountOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddLoginAccount(value: (ILoginAccount, String) => Unit): Self = StObject.set(x, "AddLoginAccount", js.Any.fromFunction2(value))
    
    @scala.inline
    def setForceLogout(value: IStrings => Unit): Self = StObject.set(x, "ForceLogout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLoginAccount(value: String => ILoginAccount): Self = StObject.set(x, "GetLoginAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLoginAccounts(value: () => ILoginAccounts): Self = StObject.set(x, "GetLoginAccounts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLoginAccountsWithSessions(value: () => ILoginAccounts): Self = StObject.set(x, "GetLoginAccountsWithSessions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPersonalInformationFromDomain(value: String => ILoginAccountPersonalInformation): Self = StObject.set(x, "GetPersonalInformationFromDomain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setModifyLoginAccount(value: ILoginAccount => Unit): Self = StObject.set(x, "ModifyLoginAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveLoginAccount(value: String => Unit): Self = StObject.set(x, "RemoveLoginAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateLoginPassword(value: (String, String) => Unit): Self = StObject.set(x, "UpdateLoginPassword", js.Any.fromFunction2(value))
  }
}
