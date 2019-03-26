package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.Vault")
@js.native
class Vault ()
  extends mfilesLib.IVault {
  /* CompleteClass */
  override val Async: mfilesLib.IVaultAsync = js.native
  /* CompleteClass */
  override val ClassGroupOperations: mfilesLib.IVaultClassGroupOperations = js.native
  /* CompleteClass */
  override val ClassOperations: mfilesLib.IVaultClassOperations = js.native
  /* CompleteClass */
  override val ClientOperations: mfilesLib.IVaultClientOperations = js.native
  /* CompleteClass */
  override val CurrentLoggedInUserID: scala.Double = js.native
  /* CompleteClass */
  override val CustomApplicationManagementOperations: mfilesLib.IVaultCustomApplicationManagementOperations = js.native
  /* CompleteClass */
  override val DataSetOperations: mfilesLib.IVaultDataSetOperations = js.native
  /* CompleteClass */
  override val ElectronicSignatureOperations: mfilesLib.IVaultElectronicSignatureOperations = js.native
  /* CompleteClass */
  override val EventLogOperations: mfilesLib.IVaultEventLogOperations = js.native
  /* CompleteClass */
  override val ExtensionMethodOperations: mfilesLib.IVaultExtensionMethodOperations = js.native
  /* CompleteClass */
  override val ExternalObjectOperations: mfilesLib.IVaultExternalObjectOperations = js.native
  /* CompleteClass */
  override val LoggedIn: scala.Boolean = js.native
  /* CompleteClass */
  override val LoginAccountOperations: mfilesLib.IVaultLoginAccountOperations = js.native
  /* CompleteClass */
  override val LoginSessionID: java.lang.String = js.native
  /* CompleteClass */
  override val ManagementOperations: mfilesLib.IVaultManagementOperations = js.native
  /* CompleteClass */
  override val Name: java.lang.String = js.native
  /* CompleteClass */
  override val NamedACLOperations: mfilesLib.IVaultNamedACLOperations = js.native
  /* CompleteClass */
  override val NamedValueStorageOperations: mfilesLib.IVaultNamedValueStorageOperations = js.native
  /* CompleteClass */
  override val NotificationOperations: mfilesLib.IVaultNotificationOperations = js.native
  /* CompleteClass */
  override val ObjectFileOperations: mfilesLib.IVaultObjectFileOperations = js.native
  /* CompleteClass */
  override val ObjectOperations: mfilesLib.IVaultObjectOperations = js.native
  /* CompleteClass */
  override val ObjectPropertyOperations: mfilesLib.IVaultObjectPropertyOperations = js.native
  /* CompleteClass */
  override val ObjectSearchOperations: mfilesLib.IVaultObjectSearchOperations = js.native
  /* CompleteClass */
  override val ObjectTypeOperations: mfilesLib.IVaultObjectTypeOperations = js.native
  /* CompleteClass */
  override val PropertyDefOperations: mfilesLib.IVaultPropertyDefOperations = js.native
  /* CompleteClass */
  override val ReadOnlyAccess: scala.Boolean = js.native
  /* CompleteClass */
  override val ScheduledJobManagementOperations: mfilesLib.IVaultScheduledJobManagementOperations = js.native
  /* CompleteClass */
  override val ServerDataPushOperations: mfilesLib.IVaultServerDataPushOperations = js.native
  /* CompleteClass */
  override val SessionInfo: mfilesLib.ISessionInfo = js.native
  /* CompleteClass */
  override val SharedLinkOperations: mfilesLib.IVaultSharedLinkOperations = js.native
  /* CompleteClass */
  override val TraditionalFolderOperations: mfilesLib.IVaultTraditionalFolderOperations = js.native
  /* CompleteClass */
  override val UserGroupOperations: mfilesLib.IVaultUserGroupOperations = js.native
  /* CompleteClass */
  override val UserOperations: mfilesLib.IVaultUserOperations = js.native
  /* CompleteClass */
  override val UserSettingOperations: mfilesLib.IVaultUserSettingOperations = js.native
  /* CompleteClass */
  override val ValueListItemOperations: mfilesLib.IVaultValueListItemOperations = js.native
  /* CompleteClass */
  override val ValueListOperations: mfilesLib.IVaultValueListOperations = js.native
  /* CompleteClass */
  override val VaultLanguages: mfilesLib.ILanguages = js.native
  /* CompleteClass */
  override val ViewOperations: mfilesLib.IVaultViewOperations = js.native
  /* CompleteClass */
  override val WorkflowOperations: mfilesLib.IVaultWorkflowOperations = js.native
  /* CompleteClass */
  override def ChangePassword(OldPassword: java.lang.String, NewPassword: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def GetAllTranslations(): java.lang.String = js.native
  /* CompleteClass */
  override def GetGUID(): java.lang.String = js.native
  /* CompleteClass */
  override def GetMFilesURLForVaultRoot(): java.lang.String = js.native
  /* CompleteClass */
  override def GetMetadataStructureItemIDByAlias(MetadataStructureItemType: MFMetadataStructureItem, Alias: java.lang.String, Unused: scala.Boolean): scala.Double = js.native
  /* CompleteClass */
  override def GetMetadataStructureVersionID(): scala.Double = js.native
  /* CompleteClass */
  override def GetServerLicenseStatus(): mfilesLib.ILicenseStatus = js.native
  /* CompleteClass */
  override def GetServerVersionOfVault(): mfilesLib.IMFilesVersion = js.native
  /* CompleteClass */
  override def LogOutSilent(): scala.Unit = js.native
  /* CompleteClass */
  override def LogOutWithDialogs(ParentWindow: scala.Double): scala.Boolean = js.native
  /* CompleteClass */
  override def TestConnectionToServer(): scala.Unit = js.native
  /* CompleteClass */
  override def TestConnectionToVault(): scala.Unit = js.native
  /* CompleteClass */
  override def TestConnectionToVaultWithTimeout(TimeoutInMilliseconds: scala.Double): scala.Unit = js.native
}

