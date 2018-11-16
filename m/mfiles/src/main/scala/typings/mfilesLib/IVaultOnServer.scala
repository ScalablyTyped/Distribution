package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultOnServer extends js.Object {
  val GUID: java.lang.String = js.native
  val Name: java.lang.String = js.native
  def LogIn(): IVault = js.native
  def LogInAsUser(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: java.lang.String,
    Domain: java.lang.String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUser(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: java.lang.String,
    Domain: scala.Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUser(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: scala.Null,
    Domain: java.lang.String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUser(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: scala.Null,
    Domain: scala.Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUser(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: scala.Null,
    Password: java.lang.String,
    Domain: java.lang.String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUser(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: scala.Null,
    Password: java.lang.String,
    Domain: scala.Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUser(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: scala.Null,
    Password: scala.Null,
    Domain: java.lang.String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUser(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: scala.Null,
    Password: scala.Null,
    Domain: scala.Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithAuthenticationData(
    PluginInfo: IPluginInfo,
    AuthenticationData: INamedValues,
    AttemptIdentifier: java.lang.String,
    TimeZone: ITimeZoneInformation
  ): IAuthenticationResult = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: java.lang.String,
    Domain: java.lang.String,
    SPN: java.lang.String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: java.lang.String,
    Domain: java.lang.String,
    SPN: scala.Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: java.lang.String,
    Domain: scala.Null,
    SPN: java.lang.String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: java.lang.String,
    Domain: scala.Null,
    SPN: scala.Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: scala.Null,
    Domain: java.lang.String,
    SPN: java.lang.String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: scala.Null,
    Domain: java.lang.String,
    SPN: scala.Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: scala.Null,
    Domain: scala.Null,
    SPN: java.lang.String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: java.lang.String,
    Password: scala.Null,
    Domain: scala.Null,
    SPN: scala.Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: scala.Null,
    Password: java.lang.String,
    Domain: java.lang.String,
    SPN: java.lang.String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: scala.Null,
    Password: java.lang.String,
    Domain: java.lang.String,
    SPN: scala.Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: scala.Null,
    Password: java.lang.String,
    Domain: scala.Null,
    SPN: java.lang.String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: scala.Null,
    Password: java.lang.String,
    Domain: scala.Null,
    SPN: scala.Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: scala.Null,
    Password: scala.Null,
    Domain: java.lang.String,
    SPN: java.lang.String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: scala.Null,
    Password: scala.Null,
    Domain: java.lang.String,
    SPN: scala.Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: scala.Null,
    Password: scala.Null,
    Domain: scala.Null,
    SPN: java.lang.String,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
  def LogInAsUserWithSPN(
    AuthType: mfilesLib.MFilesNs.MFAuthType,
    UserName: scala.Null,
    Password: scala.Null,
    Domain: scala.Null,
    SPN: scala.Null,
    TimeZone: ITimeZoneInformation
  ): IVault = js.native
}

