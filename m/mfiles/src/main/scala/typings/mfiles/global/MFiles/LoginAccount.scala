package typings.mfiles.global.MFiles

import typings.mfiles.ILoginAccount
import typings.mfiles.MFiles.MFLicenseType
import typings.mfiles.MFiles.MFLoginAccountType
import typings.mfiles.MFiles.MFLoginServerRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.LoginAccount")
@js.native
class LoginAccount ()
  extends StObject
     with ILoginAccount {
  
  /* CompleteClass */
  override val AccountName: String = js.native
  
  /* CompleteClass */
  var AccountType: MFLoginAccountType = js.native
  
  /* CompleteClass */
  override def Clone(): ILoginAccount = js.native
  
  /* CompleteClass */
  override def CloneFrom(LoginAccount: ILoginAccount): Unit = js.native
  
  /* CompleteClass */
  var DomainName: String = js.native
  
  /* CompleteClass */
  var EmailAddress: String = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* CompleteClass */
  var FullName: String = js.native
  
  /* CompleteClass */
  var LicenseType: MFLicenseType = js.native
  
  /* CompleteClass */
  var ServerRoles: MFLoginServerRole = js.native
  
  /* CompleteClass */
  override def Set(
    LoginAccountType: MFLoginAccountType,
    DomainName: String,
    UserName: String,
    ServerRoles: MFLoginServerRole,
    FullName: String,
    EmailAddress: String,
    LicenseType: MFLicenseType
  ): Unit = js.native
  
  /* CompleteClass */
  var UserName: String = js.native
}
