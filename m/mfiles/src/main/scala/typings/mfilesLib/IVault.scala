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

object IVault {
  @scala.inline
  def apply(
    Async: IVaultAsync,
    ChangePassword: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    ClassGroupOperations: IVaultClassGroupOperations,
    ClassOperations: IVaultClassOperations,
    ClientOperations: IVaultClientOperations,
    CurrentLoggedInUserID: scala.Double,
    CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperations,
    DataSetOperations: IVaultDataSetOperations,
    ElectronicSignatureOperations: IVaultElectronicSignatureOperations,
    EventLogOperations: IVaultEventLogOperations,
    ExtensionMethodOperations: IVaultExtensionMethodOperations,
    ExternalObjectOperations: IVaultExternalObjectOperations,
    GetAllTranslations: js.Function0[java.lang.String],
    GetGUID: js.Function0[java.lang.String],
    GetMFilesURLForVaultRoot: js.Function0[java.lang.String],
    GetMetadataStructureItemIDByAlias: js.Function3[
      mfilesLib.MFilesNs.MFMetadataStructureItem, 
      java.lang.String, 
      scala.Boolean, 
      scala.Double
    ],
    GetMetadataStructureVersionID: js.Function0[scala.Double],
    GetServerLicenseStatus: js.Function0[ILicenseStatus],
    GetServerVersionOfVault: js.Function0[IMFilesVersion],
    LogOutSilent: js.Function0[scala.Unit],
    LogOutWithDialogs: js.Function1[scala.Double, scala.Boolean],
    LoggedIn: scala.Boolean,
    LoginAccountOperations: IVaultLoginAccountOperations,
    LoginSessionID: java.lang.String,
    ManagementOperations: IVaultManagementOperations,
    Name: java.lang.String,
    NamedACLOperations: IVaultNamedACLOperations,
    NamedValueStorageOperations: IVaultNamedValueStorageOperations,
    NotificationOperations: IVaultNotificationOperations,
    ObjectFileOperations: IVaultObjectFileOperations,
    ObjectOperations: IVaultObjectOperations,
    ObjectPropertyOperations: IVaultObjectPropertyOperations,
    ObjectSearchOperations: IVaultObjectSearchOperations,
    ObjectTypeOperations: IVaultObjectTypeOperations,
    PropertyDefOperations: IVaultPropertyDefOperations,
    ReadOnlyAccess: scala.Boolean,
    ScheduledJobManagementOperations: IVaultScheduledJobManagementOperations,
    ServerDataPushOperations: IVaultServerDataPushOperations,
    SessionInfo: ISessionInfo,
    SharedLinkOperations: IVaultSharedLinkOperations,
    TestConnectionToServer: js.Function0[scala.Unit],
    TestConnectionToVault: js.Function0[scala.Unit],
    TestConnectionToVaultWithTimeout: js.Function1[scala.Double, scala.Unit],
    TraditionalFolderOperations: IVaultTraditionalFolderOperations,
    UserGroupOperations: IVaultUserGroupOperations,
    UserOperations: IVaultUserOperations,
    UserSettingOperations: IVaultUserSettingOperations,
    ValueListItemOperations: IVaultValueListItemOperations,
    ValueListOperations: IVaultValueListOperations,
    VaultLanguages: ILanguages,
    ViewOperations: IVaultViewOperations,
    WorkflowOperations: IVaultWorkflowOperations
  ): IVault = {
    val __obj = js.Dynamic.literal(Async = Async, ChangePassword = ChangePassword, ClassGroupOperations = ClassGroupOperations, ClassOperations = ClassOperations, ClientOperations = ClientOperations, CurrentLoggedInUserID = CurrentLoggedInUserID, CustomApplicationManagementOperations = CustomApplicationManagementOperations, DataSetOperations = DataSetOperations, ElectronicSignatureOperations = ElectronicSignatureOperations, EventLogOperations = EventLogOperations, ExtensionMethodOperations = ExtensionMethodOperations, ExternalObjectOperations = ExternalObjectOperations, GetAllTranslations = GetAllTranslations, GetGUID = GetGUID, GetMFilesURLForVaultRoot = GetMFilesURLForVaultRoot, GetMetadataStructureItemIDByAlias = GetMetadataStructureItemIDByAlias, GetMetadataStructureVersionID = GetMetadataStructureVersionID, GetServerLicenseStatus = GetServerLicenseStatus, GetServerVersionOfVault = GetServerVersionOfVault, LogOutSilent = LogOutSilent, LogOutWithDialogs = LogOutWithDialogs, LoggedIn = LoggedIn, LoginAccountOperations = LoginAccountOperations, LoginSessionID = LoginSessionID, ManagementOperations = ManagementOperations, Name = Name, NamedACLOperations = NamedACLOperations, NamedValueStorageOperations = NamedValueStorageOperations, NotificationOperations = NotificationOperations, ObjectFileOperations = ObjectFileOperations, ObjectOperations = ObjectOperations, ObjectPropertyOperations = ObjectPropertyOperations, ObjectSearchOperations = ObjectSearchOperations, ObjectTypeOperations = ObjectTypeOperations, PropertyDefOperations = PropertyDefOperations, ReadOnlyAccess = ReadOnlyAccess, ScheduledJobManagementOperations = ScheduledJobManagementOperations, ServerDataPushOperations = ServerDataPushOperations, SessionInfo = SessionInfo, SharedLinkOperations = SharedLinkOperations, TestConnectionToServer = TestConnectionToServer, TestConnectionToVault = TestConnectionToVault, TestConnectionToVaultWithTimeout = TestConnectionToVaultWithTimeout, TraditionalFolderOperations = TraditionalFolderOperations, UserGroupOperations = UserGroupOperations, UserOperations = UserOperations, UserSettingOperations = UserSettingOperations, ValueListItemOperations = ValueListItemOperations, ValueListOperations = ValueListOperations, VaultLanguages = VaultLanguages, ViewOperations = ViewOperations, WorkflowOperations = WorkflowOperations)
  
    __obj.asInstanceOf[IVault]
  }
}

