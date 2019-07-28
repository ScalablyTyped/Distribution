package typings.mfiles

import typings.mfiles.MFilesNs.MFAuthType
import typings.mfiles.MFilesNs.MFVaultConnectionTestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultConnection extends js.Object {
  var AuthType: MFAuthType = js.native
  var AutoLogin: Boolean = js.native
  var EncryptedConnection: Boolean = js.native
  var Endpoint: String = js.native
  var Icon: js.Array[Double] = js.native
  var Name: String = js.native
  var NetworkAddress: String = js.native
  var ProtocolSequence: String = js.native
  var ServerVaultGUID: String = js.native
  var ServerVaultName: String = js.native
  var UserSpecific: Boolean = js.native
  def BindToVault(ParentWindow: Double, CanLogIn: Boolean, ReturnNULLIfCancelledByUser: Boolean): IVault = js.native
  def Clone(): IVaultConnection = js.native
  def GetGUID(): String = js.native
  def IsLoggedIn(): Boolean = js.native
  def LogInAs(ParentWindow: Double, DefaultAuthType: MFAuthType, ReturnNULLIfCancelledByUser: Boolean): IVault = js.native
  def LogInAsUser(AuthType: MFAuthType, UserName: String, Password: String): IVault = js.native
  def LogInAsUser(AuthType: MFAuthType, UserName: String, Password: String, Domain: String): IVault = js.native
  def LogInAsUser(AuthType: MFAuthType, UserName: String, Password: String, Domain: String, SPN: String): IVault = js.native
  def LogInAsUser(AuthType: MFAuthType, UserName: String, Password: String, Domain: Null, SPN: String): IVault = js.native
  def TestConnectionToVault(ParentWindow: Double): MFVaultConnectionTestResult = js.native
}

