package typings.mfiles

import typings.mfiles.MFilesNs.MFLicenseType
import typings.mfiles.MFilesNs.MFLoginAccountType
import typings.mfiles.MFilesNs.MFLoginServerRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoginAccount extends js.Object {
  val AccountName: String
  var AccountType: MFLoginAccountType
  var DomainName: String
  var EmailAddress: String
  var Enabled: Boolean
  var FullName: String
  var LicenseType: MFLicenseType
  var ServerRoles: MFLoginServerRole
  var UserName: String
  def Clone(): ILoginAccount
  def CloneFrom(LoginAccount: ILoginAccount): Unit
  def Set(
    LoginAccountType: MFLoginAccountType,
    DomainName: String,
    UserName: String,
    ServerRoles: MFLoginServerRole,
    FullName: String,
    EmailAddress: String,
    LicenseType: MFLicenseType
  ): Unit
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
    val __obj = js.Dynamic.literal(AccountName = AccountName, AccountType = AccountType, Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), DomainName = DomainName, EmailAddress = EmailAddress, Enabled = Enabled, FullName = FullName, LicenseType = LicenseType, ServerRoles = ServerRoles, Set = js.Any.fromFunction7(Set), UserName = UserName)
  
    __obj.asInstanceOf[ILoginAccount]
  }
}

