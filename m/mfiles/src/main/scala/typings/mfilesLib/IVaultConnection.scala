package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultConnection extends js.Object {
  var AuthType: mfilesLib.MFilesNs.MFAuthType = js.native
  var AutoLogin: scala.Boolean = js.native
  var EncryptedConnection: scala.Boolean = js.native
  var Endpoint: java.lang.String = js.native
  var Icon: js.Array[scala.Double] = js.native
  var Name: java.lang.String = js.native
  var NetworkAddress: java.lang.String = js.native
  var ProtocolSequence: java.lang.String = js.native
  var ServerVaultGUID: java.lang.String = js.native
  var ServerVaultName: java.lang.String = js.native
  var UserSpecific: scala.Boolean = js.native
  def BindToVault(ParentWindow: scala.Double, CanLogIn: scala.Boolean, ReturnNULLIfCancelledByUser: scala.Boolean): IVault = js.native
  def Clone(): IVaultConnection = js.native
  def GetGUID(): java.lang.String = js.native
  def IsLoggedIn(): scala.Boolean = js.native
  def LogInAs(
    ParentWindow: scala.Double,
    DefaultAuthType: mfilesLib.MFilesNs.MFAuthType,
    ReturnNULLIfCancelledByUser: scala.Boolean
  ): IVault = js.native
  def LogInAsUser(AuthType: mfilesLib.MFilesNs.MFAuthType, UserName: java.lang.String, Password: java.lang.String): IVault = js.native
  def LogInAsUser(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: java.lang.String,
    Domain: java.lang.String
  ): IVault = js.native
  def LogInAsUser(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: java.lang.String,
    Domain: java.lang.String,
    SPN: java.lang.String
  ): IVault = js.native
  def LogInAsUser(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: java.lang.String,
    Domain: scala.Null,
    SPN: java.lang.String
  ): IVault = js.native
  def TestConnectionToVault(ParentWindow: scala.Double): mfilesLib.MFilesNs.MFVaultConnectionTestResult = js.native
}

