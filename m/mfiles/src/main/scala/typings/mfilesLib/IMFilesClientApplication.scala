package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMFilesClientApplication extends js.Object {
  def AddVaultConnection(VaultConnection: IVaultConnection): scala.Unit = js.native
  def BindToVault(
    VaultConnection: java.lang.String,
    ParentWindow: scala.Double,
    CanLogIn: scala.Boolean,
    ReturnNULLIfCancelledByUser: scala.Boolean
  ): IVault = js.native
  def FindFile(Path: java.lang.String, UpdateFromServer: scala.Boolean): IObjectFileAndVersion = js.native
  def FindObjectVersionAndProperties(Path: java.lang.String, UpdateFromServer: scala.Boolean): IObjectVersionAndProperties = js.native
  def GetAPIVersion(): IMFilesVersion = js.native
  def GetClientLanguage(): java.lang.String = js.native
  def GetClientVersion(): IMFilesVersion = js.native
  def GetDriveLetter(): java.lang.String = js.native
  def GetVaultConnection(VaultConnection: java.lang.String): IVaultConnection = js.native
  def GetVaultConnections(): IVaultConnections = js.native
  def GetVaultConnectionsWithGUID(GUID: java.lang.String): IVaultConnections = js.native
  def IsObjectPathInMFiles(Path: java.lang.String): scala.Boolean = js.native
  def LogInAs(
    VaultConnection: java.lang.String,
    ParentWindow: scala.Double,
    DefaultAuthType: mfilesLib.MFilesNs.MFAuthType,
    ReturnNULLIfCancelledByUser: scala.Boolean
  ): IVault = js.native
  def LogInAsUser(
    VaultConnection: java.lang.String,
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: java.lang.String
  ): IVault = js.native
  def LogInAsUser(
    VaultConnection: java.lang.String,
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: java.lang.String,
    Domain: java.lang.String
  ): IVault = js.native
  def LogInAsUser(
    VaultConnection: java.lang.String,
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: java.lang.String,
    Domain: java.lang.String,
    SPN: java.lang.String
  ): IVault = js.native
  def LogInAsUser(
    VaultConnection: java.lang.String,
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: java.lang.String,
    Domain: scala.Null,
    SPN: java.lang.String
  ): IVault = js.native
  def RemoveVaultConnection(VaultConnectionName: java.lang.String, UserSpecific: scala.Boolean): scala.Unit = js.native
  def ShowBalloonTip(
    Msg: java.lang.String,
    Title: java.lang.String,
    Timeout: scala.Double,
    InfoFlags: scala.Double,
    RemovePrevious: scala.Boolean
  ): scala.Unit = js.native
  def TestConnectionToServerEx(
    Server: java.lang.String,
    Port: java.lang.String,
    ProtocolSequence: java.lang.String,
    EncryptedConnection: scala.Boolean
  ): scala.Double = js.native
}

