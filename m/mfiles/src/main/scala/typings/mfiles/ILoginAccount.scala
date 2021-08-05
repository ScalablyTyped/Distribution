package typings.mfiles

import typings.mfiles.MFiles.MFLicenseType
import typings.mfiles.MFiles.MFLoginAccountType
import typings.mfiles.MFiles.MFLoginServerRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILoginAccount extends StObject {
  
  val AccountName: String
  
  var AccountType: MFLoginAccountType
  
  def Clone(): ILoginAccount
  
  def CloneFrom(LoginAccount: ILoginAccount): Unit
  
  var DomainName: String
  
  var EmailAddress: String
  
  var Enabled: Boolean
  
  var FullName: String
  
  var LicenseType: MFLicenseType
  
  var ServerRoles: MFLoginServerRole
  
  def Set(
    LoginAccountType: MFLoginAccountType,
    DomainName: String,
    UserName: String,
    ServerRoles: MFLoginServerRole,
    FullName: String,
    EmailAddress: String,
    LicenseType: MFLicenseType
  ): Unit
  
  var UserName: String
}
object ILoginAccount {
  
  inline def apply(
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
  
  extension [Self <: ILoginAccount](x: Self) {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    inline def setAccountType(value: MFLoginAccountType): Self = StObject.set(x, "AccountType", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => ILoginAccount): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCloneFrom(value: ILoginAccount => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    inline def setLicenseType(value: MFLicenseType): Self = StObject.set(x, "LicenseType", value.asInstanceOf[js.Any])
    
    inline def setServerRoles(value: MFLoginServerRole): Self = StObject.set(x, "ServerRoles", value.asInstanceOf[js.Any])
    
    inline def setSet(
      value: (MFLoginAccountType, String, String, MFLoginServerRole, String, String, MFLicenseType) => Unit
    ): Self = StObject.set(x, "Set", js.Any.fromFunction7(value))
    
    inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
