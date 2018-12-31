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

