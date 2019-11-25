package typings.mfiles

import typings.mfiles.MFiles.MFLicenseType
import typings.mfiles.MFiles.MFLoginAccountType
import typings.mfiles.MFiles.MFLoginServerRole
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
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], AccountType = AccountType.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), DomainName = DomainName.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], LicenseType = LicenseType.asInstanceOf[js.Any], ServerRoles = ServerRoles.asInstanceOf[js.Any], Set = js.Any.fromFunction7(Set), UserName = UserName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILoginAccount]
  }
}

