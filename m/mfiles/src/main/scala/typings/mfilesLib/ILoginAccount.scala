package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoginAccount extends js.Object {
  val AccountName: java.lang.String
  var AccountType: mfilesLib.MFilesNs.MFLoginAccountType
  var DomainName: java.lang.String
  var EmailAddress: java.lang.String
  var Enabled: scala.Boolean
  var FullName: java.lang.String
  var LicenseType: mfilesLib.MFilesNs.MFLicenseType
  var ServerRoles: mfilesLib.MFilesNs.MFLoginServerRole
  var UserName: java.lang.String
  def Clone(): ILoginAccount
  def CloneFrom(LoginAccount: ILoginAccount): scala.Unit
  def Set(
    LoginAccountType: mfilesLib.MFilesNs.MFLoginAccountType,
    DomainName: java.lang.String,
    UserName: java.lang.String,
    ServerRoles: mfilesLib.MFilesNs.MFLoginServerRole,
    FullName: java.lang.String,
    EmailAddress: java.lang.String,
    LicenseType: mfilesLib.MFilesNs.MFLicenseType
  ): scala.Unit
}

object ILoginAccount {
  @scala.inline
  def apply(
    AccountName: java.lang.String,
    AccountType: mfilesLib.MFilesNs.MFLoginAccountType,
    Clone: () => ILoginAccount,
    CloneFrom: ILoginAccount => scala.Unit,
    DomainName: java.lang.String,
    EmailAddress: java.lang.String,
    Enabled: scala.Boolean,
    FullName: java.lang.String,
    LicenseType: mfilesLib.MFilesNs.MFLicenseType,
    ServerRoles: mfilesLib.MFilesNs.MFLoginServerRole,
    Set: (mfilesLib.MFilesNs.MFLoginAccountType, java.lang.String, java.lang.String, mfilesLib.MFilesNs.MFLoginServerRole, java.lang.String, java.lang.String, mfilesLib.MFilesNs.MFLicenseType) => scala.Unit,
    UserName: java.lang.String
  ): ILoginAccount = {
    val __obj = js.Dynamic.literal(AccountName = AccountName, AccountType = AccountType, Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), DomainName = DomainName, EmailAddress = EmailAddress, Enabled = Enabled, FullName = FullName, LicenseType = LicenseType, ServerRoles = ServerRoles, Set = js.Any.fromFunction7(Set), UserName = UserName)
  
    __obj.asInstanceOf[ILoginAccount]
  }
}

