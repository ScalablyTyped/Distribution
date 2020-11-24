package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultLoginAccountOperations extends js.Object {
  
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
object IVaultLoginAccountOperations {
  
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
  ): IVaultLoginAccountOperations = {
    val __obj = js.Dynamic.literal(AddLoginAccount = js.Any.fromFunction2(AddLoginAccount), ForceLogout = js.Any.fromFunction1(ForceLogout), GetLoginAccount = js.Any.fromFunction1(GetLoginAccount), GetLoginAccounts = js.Any.fromFunction0(GetLoginAccounts), GetLoginAccountsWithSessions = js.Any.fromFunction0(GetLoginAccountsWithSessions), GetPersonalInformationFromDomain = js.Any.fromFunction1(GetPersonalInformationFromDomain), ModifyLoginAccount = js.Any.fromFunction1(ModifyLoginAccount), RemoveLoginAccount = js.Any.fromFunction1(RemoveLoginAccount), UpdateLoginPassword = js.Any.fromFunction2(UpdateLoginPassword))
    __obj.asInstanceOf[IVaultLoginAccountOperations]
  }
  
  @scala.inline
  implicit class IVaultLoginAccountOperationsOps[Self <: IVaultLoginAccountOperations] (val x: Self) extends AnyVal {
    
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
    def setAddLoginAccount(value: (ILoginAccount, String) => Unit): Self = this.set("AddLoginAccount", js.Any.fromFunction2(value))
    
    @scala.inline
    def setForceLogout(value: IStrings => Unit): Self = this.set("ForceLogout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLoginAccount(value: String => ILoginAccount): Self = this.set("GetLoginAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLoginAccounts(value: () => ILoginAccounts): Self = this.set("GetLoginAccounts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLoginAccountsWithSessions(value: () => ILoginAccounts): Self = this.set("GetLoginAccountsWithSessions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPersonalInformationFromDomain(value: String => ILoginAccountPersonalInformation): Self = this.set("GetPersonalInformationFromDomain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setModifyLoginAccount(value: ILoginAccount => Unit): Self = this.set("ModifyLoginAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveLoginAccount(value: String => Unit): Self = this.set("RemoveLoginAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateLoginPassword(value: (String, String) => Unit): Self = this.set("UpdateLoginPassword", js.Any.fromFunction2(value))
  }
}
