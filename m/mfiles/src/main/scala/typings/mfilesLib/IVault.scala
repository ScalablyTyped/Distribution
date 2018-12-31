package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVault extends js.Object {
  val Async: IVaultAsync
  val ClassGroupOperations: IVaultClassGroupOperations
  val ClassOperations: IVaultClassOperations
  val ClientOperations: IVaultClientOperations
  val CurrentLoggedInUserID: scala.Double
  val CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperations
  val DataSetOperations: IVaultDataSetOperations
  val ElectronicSignatureOperations: IVaultElectronicSignatureOperations
  val EventLogOperations: IVaultEventLogOperations
  val ExtensionMethodOperations: IVaultExtensionMethodOperations
  val ExternalObjectOperations: IVaultExternalObjectOperations
  val LoggedIn: scala.Boolean
  val LoginAccountOperations: IVaultLoginAccountOperations
  val LoginSessionID: java.lang.String
  val ManagementOperations: IVaultManagementOperations
  val Name: java.lang.String
  val NamedACLOperations: IVaultNamedACLOperations
  val NamedValueStorageOperations: IVaultNamedValueStorageOperations
  val NotificationOperations: IVaultNotificationOperations
  val ObjectFileOperations: IVaultObjectFileOperations
  val ObjectOperations: IVaultObjectOperations
  val ObjectPropertyOperations: IVaultObjectPropertyOperations
  val ObjectSearchOperations: IVaultObjectSearchOperations
  val ObjectTypeOperations: IVaultObjectTypeOperations
  val PropertyDefOperations: IVaultPropertyDefOperations
  val ReadOnlyAccess: scala.Boolean
  val ScheduledJobManagementOperations: IVaultScheduledJobManagementOperations
  val ServerDataPushOperations: IVaultServerDataPushOperations
  val SessionInfo: ISessionInfo
  val SharedLinkOperations: IVaultSharedLinkOperations
  val TraditionalFolderOperations: IVaultTraditionalFolderOperations
  val UserGroupOperations: IVaultUserGroupOperations
  val UserOperations: IVaultUserOperations
  val UserSettingOperations: IVaultUserSettingOperations
  val ValueListItemOperations: IVaultValueListItemOperations
  val ValueListOperations: IVaultValueListOperations
  val VaultLanguages: ILanguages
  val ViewOperations: IVaultViewOperations
  val WorkflowOperations: IVaultWorkflowOperations
  def ChangePassword(OldPassword: java.lang.String, NewPassword: java.lang.String): scala.Unit
  def GetAllTranslations(): java.lang.String
  def GetGUID(): java.lang.String
  def GetMFilesURLForVaultRoot(): java.lang.String
  def GetMetadataStructureItemIDByAlias(
    MetadataStructureItemType: mfilesLib.MFilesNs.MFMetadataStructureItem,
    Alias: java.lang.String,
    Unused: scala.Boolean
  ): scala.Double
  def GetMetadataStructureVersionID(): scala.Double
  def GetServerLicenseStatus(): ILicenseStatus
  def GetServerVersionOfVault(): IMFilesVersion
  def LogOutSilent(): scala.Unit
  def LogOutWithDialogs(ParentWindow: scala.Double): scala.Boolean
  def TestConnectionToServer(): scala.Unit
  def TestConnectionToVault(): scala.Unit
  def TestConnectionToVaultWithTimeout(TimeoutInMilliseconds: scala.Double): scala.Unit
}

