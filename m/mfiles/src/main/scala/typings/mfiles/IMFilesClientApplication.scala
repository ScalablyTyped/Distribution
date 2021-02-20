package typings.mfiles

import typings.mfiles.MFiles.MFAuthType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMFilesClientApplication extends StObject {
  
  def AddVaultConnection(VaultConnection: IVaultConnection): Unit = js.native
  
  def BindToVault(
    VaultConnection: String,
    ParentWindow: Double,
    CanLogIn: Boolean,
    ReturnNULLIfCancelledByUser: Boolean
  ): IVault = js.native
  
  def FindFile(Path: String, UpdateFromServer: Boolean): IObjectFileAndVersion = js.native
  
  def FindObjectVersionAndProperties(Path: String, UpdateFromServer: Boolean): IObjectVersionAndProperties = js.native
  
  def GetAPIVersion(): IMFilesVersion = js.native
  
  def GetClientLanguage(): String = js.native
  
  def GetClientVersion(): IMFilesVersion = js.native
  
  def GetDriveLetter(): String = js.native
  
  def GetVaultConnection(VaultConnection: String): IVaultConnection = js.native
  
  def GetVaultConnections(): IVaultConnections = js.native
  
  def GetVaultConnectionsWithGUID(GUID: String): IVaultConnections = js.native
  
  def IsObjectPathInMFiles(Path: String): Boolean = js.native
  
  def LogInAs(
    VaultConnection: String,
    ParentWindow: Double,
    DefaultAuthType: MFAuthType,
    ReturnNULLIfCancelledByUser: Boolean
  ): IVault = js.native
  
  def LogInAsUser(VaultConnection: String, AuthType: MFAuthType, UserName: String, Password: String): IVault = js.native
  def LogInAsUser(VaultConnection: String, AuthType: MFAuthType, UserName: String, Password: String, Domain: String): IVault = js.native
  def LogInAsUser(
    VaultConnection: String,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: String,
    SPN: String
  ): IVault = js.native
  def LogInAsUser(
    VaultConnection: String,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: Null,
    SPN: String
  ): IVault = js.native
  
  def RemoveVaultConnection(VaultConnectionName: String, UserSpecific: Boolean): Unit = js.native
  
  def ShowBalloonTip(Msg: String, Title: String, Timeout: Double, InfoFlags: Double, RemovePrevious: Boolean): Unit = js.native
  
  def TestConnectionToServerEx(Server: String, Port: String, ProtocolSequence: String, EncryptedConnection: Boolean): Double = js.native
}
