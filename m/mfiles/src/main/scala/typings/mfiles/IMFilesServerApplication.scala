package typings.mfiles

import typings.mfiles.MFiles.MFAuthType
import typings.mfiles.MFiles.MFLoginAccountType
import typings.mfiles.MFiles.MFServerConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMFilesServerApplication extends js.Object {
  
  def Connect(
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean
  ): MFServerConnection = js.native
  def Connect(
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean
  ): MFServerConnection = js.native
  def Connect(
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean
  ): MFServerConnection = js.native
  def Connect(
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean
  ): MFServerConnection = js.native
  def Connect(
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean
  ): MFServerConnection = js.native
  def Connect(
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean
  ): MFServerConnection = js.native
  def Connect(
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean
  ): MFServerConnection = js.native
  def Connect(
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean
  ): MFServerConnection = js.native
  
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: String,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: String,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: Null,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: Null,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: String,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: String,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: Null,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: Null,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: String,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: String,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: Null,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: Null,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: String,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: String,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: Null,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  def ConnectAdministrativeEx(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: Null,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String
  ): MFServerConnection = js.native
  
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: String,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: String,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: Null,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: Null,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: String,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: String,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: Null,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: Null,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: String,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: String,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: Null,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: Null,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: String,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: String,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: Null,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  def ConnectEx3(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: Null,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String
  ): MFServerConnection = js.native
  
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: String,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: String,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: Null,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: Null,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: String,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: String,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: Null,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: Null,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: String,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: String,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: Null,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: Null,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: String,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: String,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: Null,
    SPN: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  def ConnectEx4(
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: Null,
    SPN: Null,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    AllowUsingAuthenticationPlugins: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  
  def ConnectWithAuthenticationDataEx2(
    PluginInfo: IPluginInfo,
    AuthenticationData: INamedValues,
    AttemptIdentifier: String,
    TimeZone: ITimeZoneInformation,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    LogicalTargetServer: String
  ): IAuthenticationResult = js.native
  
  def ConnectWithAuthenticationDataEx3(
    PluginInfo: IPluginInfo,
    AuthenticationData: INamedValues,
    AttemptIdentifier: String,
    TimeZone: ITimeZoneInformation,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean,
    LocalComputerName: String,
    AllowAnonymousConnection: Boolean,
    LogicalTargetServer: String,
    ClientCulture: String
  ): IAuthenticationResult = js.native
  
  def ConnectWithoutLogin(
    TimeZone: ITimeZoneInformation,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    LocalComputerName: String,
    LogicalTargetServer: String,
    ClientCulture: String
  ): MFServerConnection = js.native
  
  def Disconnect(): Unit = js.native
  
  def GetAPIVersion(): IMFilesVersion = js.native
  
  def GetAuthenticationPluginInformationEx(
    UserName: String,
    Domain: String,
    VaultGUID: String,
    HostName: String,
    AccountType: MFLoginAccountType,
    TargetPluginName: String,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean
  ): IPluginInfos = js.native
  
  def GetAuthenticationPluginsEx(
    ScopeIndependentOnly: Boolean,
    ProtocolSequence: String,
    NetworkAddress: String,
    Endpoint: String,
    EncryptedConnection: Boolean
  ): IPluginInfos = js.native
  
  def GetOnlineVaults(): IVaultsOnServer = js.native
  
  def GetServerVersion(): IMFilesVersion = js.native
  
  def GetTokenAsAuthenticationData(Token: String): INamedValues = js.native
  
  def GetVaults(): IVaultsOnServer = js.native
  
  val LicenseManagementOperations: IServerLicenseManagementOperations = js.native
  
  def LogInAsUserToVault(VaultGUID: String, TimeZone: ITimeZoneInformation, AuthType: MFAuthType): IVault = js.native
  def LogInAsUserToVault(VaultGUID: String, TimeZone: ITimeZoneInformation, AuthType: MFAuthType, UserName: String): IVault = js.native
  def LogInAsUserToVault(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String
  ): IVault = js.native
  def LogInAsUserToVault(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: String
  ): IVault = js.native
  def LogInAsUserToVault(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: String
  ): IVault = js.native
  def LogInAsUserToVault(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String
  ): IVault = js.native
  def LogInAsUserToVault(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: String
  ): IVault = js.native
  def LogInAsUserToVault(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: String
  ): IVault = js.native
  
  def LogInAsUserToVaultWithSPN(VaultGUID: String, TimeZone: ITimeZoneInformation, AuthType: MFAuthType): IVault = js.native
  def LogInAsUserToVaultWithSPN(VaultGUID: String, TimeZone: ITimeZoneInformation, AuthType: MFAuthType, UserName: String): IVault = js.native
  def LogInAsUserToVaultWithSPN(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String
  ): IVault = js.native
  def LogInAsUserToVaultWithSPN(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: String
  ): IVault = js.native
  def LogInAsUserToVaultWithSPN(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: String,
    SPN: String
  ): IVault = js.native
  def LogInAsUserToVaultWithSPN(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: Null,
    SPN: String
  ): IVault = js.native
  def LogInAsUserToVaultWithSPN(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: String
  ): IVault = js.native
  def LogInAsUserToVaultWithSPN(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: String,
    SPN: String
  ): IVault = js.native
  def LogInAsUserToVaultWithSPN(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: Null,
    SPN: String
  ): IVault = js.native
  def LogInAsUserToVaultWithSPN(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String
  ): IVault = js.native
  def LogInAsUserToVaultWithSPN(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: String
  ): IVault = js.native
  def LogInAsUserToVaultWithSPN(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: String,
    SPN: String
  ): IVault = js.native
  def LogInAsUserToVaultWithSPN(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: Null,
    SPN: String
  ): IVault = js.native
  def LogInAsUserToVaultWithSPN(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: String
  ): IVault = js.native
  def LogInAsUserToVaultWithSPN(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: String,
    SPN: String
  ): IVault = js.native
  def LogInAsUserToVaultWithSPN(
    VaultGUID: String,
    TimeZone: ITimeZoneInformation,
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: Null,
    SPN: String
  ): IVault = js.native
  
  def LogInToVault(VaultGUID: String): IVault = js.native
  
  def LogInToVaultAdministrative(VaultGUID: String): IVault = js.native
  
  def LogInToVaultAdministrativeWithExistingSession(VaultGUID: String): IVault = js.native
  
  def LogInToVaultEx(VaultGUID: String, AllowUsingAuthenticationPlugins: Boolean): IVault = js.native
  
  def LogInToVaultWithExistingSession(VaultGUID: String): IVault = js.native
  
  val LoginAccountOperations: IServerLoginAccountOperations = js.native
  
  val ScheduledJobManagementOperations: IServerScheduledJobManagementOperations = js.native
  
  val ServerManagementOperations: IServerManagementOperations = js.native
  
  val SharedLinkPublicOperations: ISharedLinkPublicOperations = js.native
  
  def TestConnectionToServerEx(Server: String, Port: String, ProtocolSequence: String, EncryptedConnection: Boolean): Double = js.native
  
  val VaultManagementOperations: IServerVaultManagementOperations = js.native
}
