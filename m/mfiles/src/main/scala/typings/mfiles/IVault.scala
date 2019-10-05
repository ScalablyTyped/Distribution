package typings.mfiles

import typings.mfiles.MFiles.MFMetadataStructureItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVault extends js.Object {
  val Async: IVaultAsync
  val ClassGroupOperations: IVaultClassGroupOperations
  val ClassOperations: IVaultClassOperations
  val ClientOperations: IVaultClientOperations
  val CurrentLoggedInUserID: Double
  val CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperations
  val DataSetOperations: IVaultDataSetOperations
  val ElectronicSignatureOperations: IVaultElectronicSignatureOperations
  val EventLogOperations: IVaultEventLogOperations
  val ExtensionMethodOperations: IVaultExtensionMethodOperations
  val ExternalObjectOperations: IVaultExternalObjectOperations
  val LoggedIn: Boolean
  val LoginAccountOperations: IVaultLoginAccountOperations
  val LoginSessionID: String
  val ManagementOperations: IVaultManagementOperations
  val Name: String
  val NamedACLOperations: IVaultNamedACLOperations
  val NamedValueStorageOperations: IVaultNamedValueStorageOperations
  val NotificationOperations: IVaultNotificationOperations
  val ObjectFileOperations: IVaultObjectFileOperations
  val ObjectOperations: IVaultObjectOperations
  val ObjectPropertyOperations: IVaultObjectPropertyOperations
  val ObjectSearchOperations: IVaultObjectSearchOperations
  val ObjectTypeOperations: IVaultObjectTypeOperations
  val PropertyDefOperations: IVaultPropertyDefOperations
  val ReadOnlyAccess: Boolean
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
  def ChangePassword(OldPassword: String, NewPassword: String): Unit
  def GetAllTranslations(): String
  def GetGUID(): String
  def GetMFilesURLForVaultRoot(): String
  def GetMetadataStructureItemIDByAlias(MetadataStructureItemType: MFMetadataStructureItem, Alias: String, Unused: Boolean): Double
  def GetMetadataStructureVersionID(): Double
  def GetServerLicenseStatus(): ILicenseStatus
  def GetServerVersionOfVault(): IMFilesVersion
  def LogOutSilent(): Unit
  def LogOutWithDialogs(ParentWindow: Double): Boolean
  def TestConnectionToServer(): Unit
  def TestConnectionToVault(): Unit
  def TestConnectionToVaultWithTimeout(TimeoutInMilliseconds: Double): Unit
}

object IVault {
  @scala.inline
  def apply(
    Async: IVaultAsync,
    ChangePassword: (String, String) => Unit,
    ClassGroupOperations: IVaultClassGroupOperations,
    ClassOperations: IVaultClassOperations,
    ClientOperations: IVaultClientOperations,
    CurrentLoggedInUserID: Double,
    CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperations,
    DataSetOperations: IVaultDataSetOperations,
    ElectronicSignatureOperations: IVaultElectronicSignatureOperations,
    EventLogOperations: IVaultEventLogOperations,
    ExtensionMethodOperations: IVaultExtensionMethodOperations,
    ExternalObjectOperations: IVaultExternalObjectOperations,
    GetAllTranslations: () => String,
    GetGUID: () => String,
    GetMFilesURLForVaultRoot: () => String,
    GetMetadataStructureItemIDByAlias: (MFMetadataStructureItem, String, Boolean) => Double,
    GetMetadataStructureVersionID: () => Double,
    GetServerLicenseStatus: () => ILicenseStatus,
    GetServerVersionOfVault: () => IMFilesVersion,
    LogOutSilent: () => Unit,
    LogOutWithDialogs: Double => Boolean,
    LoggedIn: Boolean,
    LoginAccountOperations: IVaultLoginAccountOperations,
    LoginSessionID: String,
    ManagementOperations: IVaultManagementOperations,
    Name: String,
    NamedACLOperations: IVaultNamedACLOperations,
    NamedValueStorageOperations: IVaultNamedValueStorageOperations,
    NotificationOperations: IVaultNotificationOperations,
    ObjectFileOperations: IVaultObjectFileOperations,
    ObjectOperations: IVaultObjectOperations,
    ObjectPropertyOperations: IVaultObjectPropertyOperations,
    ObjectSearchOperations: IVaultObjectSearchOperations,
    ObjectTypeOperations: IVaultObjectTypeOperations,
    PropertyDefOperations: IVaultPropertyDefOperations,
    ReadOnlyAccess: Boolean,
    ScheduledJobManagementOperations: IVaultScheduledJobManagementOperations,
    ServerDataPushOperations: IVaultServerDataPushOperations,
    SessionInfo: ISessionInfo,
    SharedLinkOperations: IVaultSharedLinkOperations,
    TestConnectionToServer: () => Unit,
    TestConnectionToVault: () => Unit,
    TestConnectionToVaultWithTimeout: Double => Unit,
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
    val __obj = js.Dynamic.literal(Async = Async, ChangePassword = js.Any.fromFunction2(ChangePassword), ClassGroupOperations = ClassGroupOperations, ClassOperations = ClassOperations, ClientOperations = ClientOperations, CurrentLoggedInUserID = CurrentLoggedInUserID, CustomApplicationManagementOperations = CustomApplicationManagementOperations, DataSetOperations = DataSetOperations, ElectronicSignatureOperations = ElectronicSignatureOperations, EventLogOperations = EventLogOperations, ExtensionMethodOperations = ExtensionMethodOperations, ExternalObjectOperations = ExternalObjectOperations, GetAllTranslations = js.Any.fromFunction0(GetAllTranslations), GetGUID = js.Any.fromFunction0(GetGUID), GetMFilesURLForVaultRoot = js.Any.fromFunction0(GetMFilesURLForVaultRoot), GetMetadataStructureItemIDByAlias = js.Any.fromFunction3(GetMetadataStructureItemIDByAlias), GetMetadataStructureVersionID = js.Any.fromFunction0(GetMetadataStructureVersionID), GetServerLicenseStatus = js.Any.fromFunction0(GetServerLicenseStatus), GetServerVersionOfVault = js.Any.fromFunction0(GetServerVersionOfVault), LogOutSilent = js.Any.fromFunction0(LogOutSilent), LogOutWithDialogs = js.Any.fromFunction1(LogOutWithDialogs), LoggedIn = LoggedIn, LoginAccountOperations = LoginAccountOperations, LoginSessionID = LoginSessionID, ManagementOperations = ManagementOperations, Name = Name, NamedACLOperations = NamedACLOperations, NamedValueStorageOperations = NamedValueStorageOperations, NotificationOperations = NotificationOperations, ObjectFileOperations = ObjectFileOperations, ObjectOperations = ObjectOperations, ObjectPropertyOperations = ObjectPropertyOperations, ObjectSearchOperations = ObjectSearchOperations, ObjectTypeOperations = ObjectTypeOperations, PropertyDefOperations = PropertyDefOperations, ReadOnlyAccess = ReadOnlyAccess, ScheduledJobManagementOperations = ScheduledJobManagementOperations, ServerDataPushOperations = ServerDataPushOperations, SessionInfo = SessionInfo, SharedLinkOperations = SharedLinkOperations, TestConnectionToServer = js.Any.fromFunction0(TestConnectionToServer), TestConnectionToVault = js.Any.fromFunction0(TestConnectionToVault), TestConnectionToVaultWithTimeout = js.Any.fromFunction1(TestConnectionToVaultWithTimeout), TraditionalFolderOperations = TraditionalFolderOperations, UserGroupOperations = UserGroupOperations, UserOperations = UserOperations, UserSettingOperations = UserSettingOperations, ValueListItemOperations = ValueListItemOperations, ValueListOperations = ValueListOperations, VaultLanguages = VaultLanguages, ViewOperations = ViewOperations, WorkflowOperations = WorkflowOperations)
  
    __obj.asInstanceOf[IVault]
  }
}

