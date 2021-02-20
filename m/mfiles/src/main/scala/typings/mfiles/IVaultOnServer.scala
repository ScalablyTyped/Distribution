package typings.mfiles

import typings.mfiles.MFiles.MFAuthType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultOnServer extends StObject {
  
  val GUID: String = js.native
  
  def LogIn(): IVault = js.native
  
  def LogInAsUser(
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUser(
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUser(
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUser(
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUser(
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUser(
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUser(
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUser(AuthType: MFAuthType, UserName: Null, Password: Null, Domain: Null, TimeZone: ITimeZoneInformation): IVault = js.native
  
  def LogInAsUserWithAuthenticationData(
    PluginInfo: IPluginInfo,
    AuthenticationData: INamedValues,
    AttemptIdentifier: String,
    TimeZone: ITimeZoneInformation
  ): IAuthenticationResult = js.native
  
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: String,
    SPN: String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: String,
    SPN: Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: Null,
    SPN: String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: String,
    Password: String,
    Domain: Null,
    SPN: Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: String,
    SPN: String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: String,
    SPN: Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: Null,
    SPN: String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: String,
    Password: Null,
    Domain: Null,
    SPN: Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: String,
    SPN: String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: String,
    SPN: Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: Null,
    SPN: String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: Null,
    Password: String,
    Domain: Null,
    SPN: Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: String,
    SPN: String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: String,
    SPN: Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: Null,
    SPN: String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: MFAuthType,
    UserName: Null,
    Password: Null,
    Domain: Null,
    SPN: Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  
  val Name: String = js.native
}
