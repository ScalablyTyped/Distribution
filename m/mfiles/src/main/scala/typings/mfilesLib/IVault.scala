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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Async")(Async)
    __obj.updateDynamic("ChangePassword")(ChangePassword)
    __obj.updateDynamic("ClassGroupOperations")(ClassGroupOperations)
    __obj.updateDynamic("ClassOperations")(ClassOperations)
    __obj.updateDynamic("ClientOperations")(ClientOperations)
    __obj.updateDynamic("CurrentLoggedInUserID")(CurrentLoggedInUserID)
    __obj.updateDynamic("CustomApplicationManagementOperations")(CustomApplicationManagementOperations)
    __obj.updateDynamic("DataSetOperations")(DataSetOperations)
    __obj.updateDynamic("ElectronicSignatureOperations")(ElectronicSignatureOperations)
    __obj.updateDynamic("EventLogOperations")(EventLogOperations)
    __obj.updateDynamic("ExtensionMethodOperations")(ExtensionMethodOperations)
    __obj.updateDynamic("ExternalObjectOperations")(ExternalObjectOperations)
    __obj.updateDynamic("GetAllTranslations")(GetAllTranslations)
    __obj.updateDynamic("GetGUID")(GetGUID)
    __obj.updateDynamic("GetMFilesURLForVaultRoot")(GetMFilesURLForVaultRoot)
    __obj.updateDynamic("GetMetadataStructureItemIDByAlias")(GetMetadataStructureItemIDByAlias)
    __obj.updateDynamic("GetMetadataStructureVersionID")(GetMetadataStructureVersionID)
    __obj.updateDynamic("GetServerLicenseStatus")(GetServerLicenseStatus)
    __obj.updateDynamic("GetServerVersionOfVault")(GetServerVersionOfVault)
    __obj.updateDynamic("LogOutSilent")(LogOutSilent)
    __obj.updateDynamic("LogOutWithDialogs")(LogOutWithDialogs)
    __obj.updateDynamic("LoggedIn")(LoggedIn)
    __obj.updateDynamic("LoginAccountOperations")(LoginAccountOperations)
    __obj.updateDynamic("LoginSessionID")(LoginSessionID)
    __obj.updateDynamic("ManagementOperations")(ManagementOperations)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NamedACLOperations")(NamedACLOperations)
    __obj.updateDynamic("NamedValueStorageOperations")(NamedValueStorageOperations)
    __obj.updateDynamic("NotificationOperations")(NotificationOperations)
    __obj.updateDynamic("ObjectFileOperations")(ObjectFileOperations)
    __obj.updateDynamic("ObjectOperations")(ObjectOperations)
    __obj.updateDynamic("ObjectPropertyOperations")(ObjectPropertyOperations)
    __obj.updateDynamic("ObjectSearchOperations")(ObjectSearchOperations)
    __obj.updateDynamic("ObjectTypeOperations")(ObjectTypeOperations)
    __obj.updateDynamic("PropertyDefOperations")(PropertyDefOperations)
    __obj.updateDynamic("ReadOnlyAccess")(ReadOnlyAccess)
    __obj.updateDynamic("ScheduledJobManagementOperations")(ScheduledJobManagementOperations)
    __obj.updateDynamic("ServerDataPushOperations")(ServerDataPushOperations)
    __obj.updateDynamic("SessionInfo")(SessionInfo)
    __obj.updateDynamic("SharedLinkOperations")(SharedLinkOperations)
    __obj.updateDynamic("TestConnectionToServer")(TestConnectionToServer)
    __obj.updateDynamic("TestConnectionToVault")(TestConnectionToVault)
    __obj.updateDynamic("TestConnectionToVaultWithTimeout")(TestConnectionToVaultWithTimeout)
    __obj.updateDynamic("TraditionalFolderOperations")(TraditionalFolderOperations)
    __obj.updateDynamic("UserGroupOperations")(UserGroupOperations)
    __obj.updateDynamic("UserOperations")(UserOperations)
    __obj.updateDynamic("UserSettingOperations")(UserSettingOperations)
    __obj.updateDynamic("ValueListItemOperations")(ValueListItemOperations)
    __obj.updateDynamic("ValueListOperations")(ValueListOperations)
    __obj.updateDynamic("VaultLanguages")(VaultLanguages)
    __obj.updateDynamic("ViewOperations")(ViewOperations)
    __obj.updateDynamic("WorkflowOperations")(WorkflowOperations)
    __obj.asInstanceOf[IVault]
  }
}

