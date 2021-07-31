package typings.mfiles.global.MFiles

import typings.mfiles.ILanguages
import typings.mfiles.ILicenseStatus
import typings.mfiles.IMFilesVersion
import typings.mfiles.ISessionInfo
import typings.mfiles.IVault
import typings.mfiles.IVaultAsync
import typings.mfiles.IVaultClassGroupOperations
import typings.mfiles.IVaultClassOperations
import typings.mfiles.IVaultClientOperations
import typings.mfiles.IVaultCustomApplicationManagementOperations
import typings.mfiles.IVaultDataSetOperations
import typings.mfiles.IVaultElectronicSignatureOperations
import typings.mfiles.IVaultEventLogOperations
import typings.mfiles.IVaultExtensionMethodOperations
import typings.mfiles.IVaultExternalObjectOperations
import typings.mfiles.IVaultLoginAccountOperations
import typings.mfiles.IVaultManagementOperations
import typings.mfiles.IVaultNamedACLOperations
import typings.mfiles.IVaultNamedValueStorageOperations
import typings.mfiles.IVaultNotificationOperations
import typings.mfiles.IVaultObjectFileOperations
import typings.mfiles.IVaultObjectOperations
import typings.mfiles.IVaultObjectPropertyOperations
import typings.mfiles.IVaultObjectSearchOperations
import typings.mfiles.IVaultObjectTypeOperations
import typings.mfiles.IVaultPropertyDefOperations
import typings.mfiles.IVaultScheduledJobManagementOperations
import typings.mfiles.IVaultServerDataPushOperations
import typings.mfiles.IVaultSharedLinkOperations
import typings.mfiles.IVaultTraditionalFolderOperations
import typings.mfiles.IVaultUserGroupOperations
import typings.mfiles.IVaultUserOperations
import typings.mfiles.IVaultUserSettingOperations
import typings.mfiles.IVaultValueListItemOperations
import typings.mfiles.IVaultValueListOperations
import typings.mfiles.IVaultViewOperations
import typings.mfiles.IVaultWorkflowOperations
import typings.mfiles.MFiles.MFMetadataStructureItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.Vault")
@js.native
class Vault ()
  extends StObject
     with IVault {
  
  /* CompleteClass */
  override val Async: IVaultAsync = js.native
  
  /* CompleteClass */
  override def ChangePassword(OldPassword: String, NewPassword: String): Unit = js.native
  
  /* CompleteClass */
  override val ClassGroupOperations: IVaultClassGroupOperations = js.native
  
  /* CompleteClass */
  override val ClassOperations: IVaultClassOperations = js.native
  
  /* CompleteClass */
  override val ClientOperations: IVaultClientOperations = js.native
  
  /* CompleteClass */
  override val CurrentLoggedInUserID: Double = js.native
  
  /* CompleteClass */
  override val CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperations = js.native
  
  /* CompleteClass */
  override val DataSetOperations: IVaultDataSetOperations = js.native
  
  /* CompleteClass */
  override val ElectronicSignatureOperations: IVaultElectronicSignatureOperations = js.native
  
  /* CompleteClass */
  override val EventLogOperations: IVaultEventLogOperations = js.native
  
  /* CompleteClass */
  override val ExtensionMethodOperations: IVaultExtensionMethodOperations = js.native
  
  /* CompleteClass */
  override val ExternalObjectOperations: IVaultExternalObjectOperations = js.native
  
  /* CompleteClass */
  override def GetAllTranslations(): String = js.native
  
  /* CompleteClass */
  override def GetGUID(): String = js.native
  
  /* CompleteClass */
  override def GetMFilesURLForVaultRoot(): String = js.native
  
  /* CompleteClass */
  override def GetMetadataStructureItemIDByAlias(MetadataStructureItemType: MFMetadataStructureItem, Alias: String, Unused: Boolean): Double = js.native
  
  /* CompleteClass */
  override def GetMetadataStructureVersionID(): Double = js.native
  
  /* CompleteClass */
  override def GetServerLicenseStatus(): ILicenseStatus = js.native
  
  /* CompleteClass */
  override def GetServerVersionOfVault(): IMFilesVersion = js.native
  
  /* CompleteClass */
  override def LogOutSilent(): Unit = js.native
  
  /* CompleteClass */
  override def LogOutWithDialogs(ParentWindow: Double): Boolean = js.native
  
  /* CompleteClass */
  override val LoggedIn: Boolean = js.native
  
  /* CompleteClass */
  override val LoginAccountOperations: IVaultLoginAccountOperations = js.native
  
  /* CompleteClass */
  override val LoginSessionID: String = js.native
  
  /* CompleteClass */
  override val ManagementOperations: IVaultManagementOperations = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val NamedACLOperations: IVaultNamedACLOperations = js.native
  
  /* CompleteClass */
  override val NamedValueStorageOperations: IVaultNamedValueStorageOperations = js.native
  
  /* CompleteClass */
  override val NotificationOperations: IVaultNotificationOperations = js.native
  
  /* CompleteClass */
  override val ObjectFileOperations: IVaultObjectFileOperations = js.native
  
  /* CompleteClass */
  override val ObjectOperations: IVaultObjectOperations = js.native
  
  /* CompleteClass */
  override val ObjectPropertyOperations: IVaultObjectPropertyOperations = js.native
  
  /* CompleteClass */
  override val ObjectSearchOperations: IVaultObjectSearchOperations = js.native
  
  /* CompleteClass */
  override val ObjectTypeOperations: IVaultObjectTypeOperations = js.native
  
  /* CompleteClass */
  override val PropertyDefOperations: IVaultPropertyDefOperations = js.native
  
  /* CompleteClass */
  override val ReadOnlyAccess: Boolean = js.native
  
  /* CompleteClass */
  override val ScheduledJobManagementOperations: IVaultScheduledJobManagementOperations = js.native
  
  /* CompleteClass */
  override val ServerDataPushOperations: IVaultServerDataPushOperations = js.native
  
  /* CompleteClass */
  override val SessionInfo: ISessionInfo = js.native
  
  /* CompleteClass */
  override val SharedLinkOperations: IVaultSharedLinkOperations = js.native
  
  /* CompleteClass */
  override def TestConnectionToServer(): Unit = js.native
  
  /* CompleteClass */
  override def TestConnectionToVault(): Unit = js.native
  
  /* CompleteClass */
  override def TestConnectionToVaultWithTimeout(TimeoutInMilliseconds: Double): Unit = js.native
  
  /* CompleteClass */
  override val TraditionalFolderOperations: IVaultTraditionalFolderOperations = js.native
  
  /* CompleteClass */
  override val UserGroupOperations: IVaultUserGroupOperations = js.native
  
  /* CompleteClass */
  override val UserOperations: IVaultUserOperations = js.native
  
  /* CompleteClass */
  override val UserSettingOperations: IVaultUserSettingOperations = js.native
  
  /* CompleteClass */
  override val ValueListItemOperations: IVaultValueListItemOperations = js.native
  
  /* CompleteClass */
  override val ValueListOperations: IVaultValueListOperations = js.native
  
  /* CompleteClass */
  override val VaultLanguages: ILanguages = js.native
  
  /* CompleteClass */
  override val ViewOperations: IVaultViewOperations = js.native
  
  /* CompleteClass */
  override val WorkflowOperations: IVaultWorkflowOperations = js.native
}
