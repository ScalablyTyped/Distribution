package typings.mfiles

import typings.mfiles.MFiles.MFLicenseType
import typings.mfiles.MFiles.MFLoginAccountType
import typings.mfiles.MFiles.MFLoginServerRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoginAccount extends StObject {
  
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
  implicit class ILoginAccountMutableBuilder[Self <: ILoginAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountName(value: String): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountType(value: MFLoginAccountType): Self = StObject.set(x, "AccountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => ILoginAccount): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: ILoginAccount => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseType(value: MFLicenseType): Self = StObject.set(x, "LicenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerRoles(value: MFLoginServerRole): Self = StObject.set(x, "ServerRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(
      value: (MFLoginAccountType, String, String, MFLoginServerRole, String, String, MFLicenseType) => Unit
    ): Self = StObject.set(x, "Set", js.Any.fromFunction7(value))
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
