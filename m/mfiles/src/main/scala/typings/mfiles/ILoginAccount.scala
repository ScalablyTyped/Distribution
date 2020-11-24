package typings.mfiles

import typings.mfiles.MFiles.MFLicenseType
import typings.mfiles.MFiles.MFLoginAccountType
import typings.mfiles.MFiles.MFLoginServerRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoginAccount extends js.Object {
  
  val AccountName: String = js.native
  
  var AccountType: MFLoginAccountType = js.native
  
  def Clone(): ILoginAccount = js.native
  
  def CloneFrom(LoginAccount: ILoginAccount): Unit = js.native
  
  var DomainName: String = js.native
  
  var EmailAddress: String = js.native
  
  var Enabled: Boolean = js.native
  
  var FullName: String = js.native
  
  var LicenseType: MFLicenseType = js.native
  
  var ServerRoles: MFLoginServerRole = js.native
  
  def Set(
    LoginAccountType: MFLoginAccountType,
    DomainName: String,
    UserName: String,
    ServerRoles: MFLoginServerRole,
    FullName: String,
    EmailAddress: String,
    LicenseType: MFLicenseType
  ): Unit = js.native
  
  var UserName: String = js.native
}
object ILoginAccount {
  
  @scala.inline
  def apply(
    AccountName: String,
    AccountType: MFLoginAccountType,
    Clone: () => ILoginAccount,
    CloneFrom: ILoginAccount => Unit,
    DomainName: String,
    EmailAddress: String,
    Enabled: Boolean,
    FullName: String,
    LicenseType: MFLicenseType,
    ServerRoles: MFLoginServerRole,
    Set: (MFLoginAccountType, String, String, MFLoginServerRole, String, String, MFLicenseType) => Unit,
    UserName: String
  ): ILoginAccount = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], AccountType = AccountType.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), DomainName = DomainName.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], LicenseType = LicenseType.asInstanceOf[js.Any], ServerRoles = ServerRoles.asInstanceOf[js.Any], Set = js.Any.fromFunction7(Set), UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginAccount]
  }
  
  @scala.inline
  implicit class ILoginAccountOps[Self <: ILoginAccount] (val x: Self) extends AnyVal {
    
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
    def setAccountName(value: String): Self = this.set("AccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountType(value: MFLoginAccountType): Self = this.set("AccountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => ILoginAccount): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: ILoginAccount => Unit): Self = this.set("CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = this.set("FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseType(value: MFLicenseType): Self = this.set("LicenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerRoles(value: MFLoginServerRole): Self = this.set("ServerRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(
      value: (MFLoginAccountType, String, String, MFLoginServerRole, String, String, MFLicenseType) => Unit
    ): Self = this.set("Set", js.Any.fromFunction7(value))
    
    @scala.inline
    def setUserName(value: String): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
}
