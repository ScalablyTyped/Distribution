package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.LoginAccount")
@js.native
class LoginAccount ()
  extends mfilesLib.ILoginAccount {
  /* CompleteClass */
  override val AccountName: java.lang.String = js.native
  /* CompleteClass */
  override var AccountType: MFLoginAccountType = js.native
  /* CompleteClass */
  override var DomainName: java.lang.String = js.native
  /* CompleteClass */
  override var EmailAddress: java.lang.String = js.native
  /* CompleteClass */
  override var Enabled: scala.Boolean = js.native
  /* CompleteClass */
  override var FullName: java.lang.String = js.native
  /* CompleteClass */
  override var LicenseType: MFLicenseType = js.native
  /* CompleteClass */
  override var ServerRoles: MFLoginServerRole = js.native
  /* CompleteClass */
  override var UserName: java.lang.String = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.ILoginAccount = js.native
  /* CompleteClass */
  override def CloneFrom(LoginAccount: mfilesLib.ILoginAccount): scala.Unit = js.native
  /* CompleteClass */
  override def Set(
    LoginAccountType: MFLoginAccountType,
    DomainName: java.lang.String,
    UserName: java.lang.String,
    ServerRoles: MFLoginServerRole,
    FullName: java.lang.String,
    EmailAddress: java.lang.String,
    LicenseType: MFLicenseType
  ): scala.Unit = js.native
}

