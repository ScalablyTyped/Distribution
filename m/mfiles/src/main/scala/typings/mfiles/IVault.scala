package typings.mfiles

import typings.mfiles.MFiles.MFMetadataStructureItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVault extends StObject {
  
  val Async: IVaultAsync
  
  def ChangePassword(OldPassword: String, NewPassword: String): Unit
  
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
  
  def GetAllTranslations(): String
  
  def GetGUID(): String
  
  def GetMFilesURLForVaultRoot(): String
  
  def GetMetadataStructureItemIDByAlias(MetadataStructureItemType: MFMetadataStructureItem, Alias: String, Unused: Boolean): Double
  
  def GetMetadataStructureVersionID(): Double
  
  def GetServerLicenseStatus(): ILicenseStatus
  
  def GetServerVersionOfVault(): IMFilesVersion
  
  def LogOutSilent(): Unit
  
  def LogOutWithDialogs(ParentWindow: Double): Boolean
  
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
  
  def TestConnectionToServer(): Unit
  
  def TestConnectionToVault(): Unit
  
  def TestConnectionToVaultWithTimeout(TimeoutInMilliseconds: Double): Unit
  
  val TraditionalFolderOperations: IVaultTraditionalFolderOperations
  
  val UserGroupOperations: IVaultUserGroupOperations
  
  val UserOperations: IVaultUserOperations
  
  val UserSettingOperations: IVaultUserSettingOperations
  
  val ValueListItemOperations: IVaultValueListItemOperations
  
  val ValueListOperations: IVaultValueListOperations
  
  val VaultLanguages: ILanguages
  
  val ViewOperations: IVaultViewOperations
  
  val WorkflowOperations: IVaultWorkflowOperations
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
    val __obj = js.Dynamic.literal(Async = Async.asInstanceOf[js.Any], ChangePassword = js.Any.fromFunction2(ChangePassword), ClassGroupOperations = ClassGroupOperations.asInstanceOf[js.Any], ClassOperations = ClassOperations.asInstanceOf[js.Any], ClientOperations = ClientOperations.asInstanceOf[js.Any], CurrentLoggedInUserID = CurrentLoggedInUserID.asInstanceOf[js.Any], CustomApplicationManagementOperations = CustomApplicationManagementOperations.asInstanceOf[js.Any], DataSetOperations = DataSetOperations.asInstanceOf[js.Any], ElectronicSignatureOperations = ElectronicSignatureOperations.asInstanceOf[js.Any], EventLogOperations = EventLogOperations.asInstanceOf[js.Any], ExtensionMethodOperations = ExtensionMethodOperations.asInstanceOf[js.Any], ExternalObjectOperations = ExternalObjectOperations.asInstanceOf[js.Any], GetAllTranslations = js.Any.fromFunction0(GetAllTranslations), GetGUID = js.Any.fromFunction0(GetGUID), GetMFilesURLForVaultRoot = js.Any.fromFunction0(GetMFilesURLForVaultRoot), GetMetadataStructureItemIDByAlias = js.Any.fromFunction3(GetMetadataStructureItemIDByAlias), GetMetadataStructureVersionID = js.Any.fromFunction0(GetMetadataStructureVersionID), GetServerLicenseStatus = js.Any.fromFunction0(GetServerLicenseStatus), GetServerVersionOfVault = js.Any.fromFunction0(GetServerVersionOfVault), LogOutSilent = js.Any.fromFunction0(LogOutSilent), LogOutWithDialogs = js.Any.fromFunction1(LogOutWithDialogs), LoggedIn = LoggedIn.asInstanceOf[js.Any], LoginAccountOperations = LoginAccountOperations.asInstanceOf[js.Any], LoginSessionID = LoginSessionID.asInstanceOf[js.Any], ManagementOperations = ManagementOperations.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamedACLOperations = NamedACLOperations.asInstanceOf[js.Any], NamedValueStorageOperations = NamedValueStorageOperations.asInstanceOf[js.Any], NotificationOperations = NotificationOperations.asInstanceOf[js.Any], ObjectFileOperations = ObjectFileOperations.asInstanceOf[js.Any], ObjectOperations = ObjectOperations.asInstanceOf[js.Any], ObjectPropertyOperations = ObjectPropertyOperations.asInstanceOf[js.Any], ObjectSearchOperations = ObjectSearchOperations.asInstanceOf[js.Any], ObjectTypeOperations = ObjectTypeOperations.asInstanceOf[js.Any], PropertyDefOperations = PropertyDefOperations.asInstanceOf[js.Any], ReadOnlyAccess = ReadOnlyAccess.asInstanceOf[js.Any], ScheduledJobManagementOperations = ScheduledJobManagementOperations.asInstanceOf[js.Any], ServerDataPushOperations = ServerDataPushOperations.asInstanceOf[js.Any], SessionInfo = SessionInfo.asInstanceOf[js.Any], SharedLinkOperations = SharedLinkOperations.asInstanceOf[js.Any], TestConnectionToServer = js.Any.fromFunction0(TestConnectionToServer), TestConnectionToVault = js.Any.fromFunction0(TestConnectionToVault), TestConnectionToVaultWithTimeout = js.Any.fromFunction1(TestConnectionToVaultWithTimeout), TraditionalFolderOperations = TraditionalFolderOperations.asInstanceOf[js.Any], UserGroupOperations = UserGroupOperations.asInstanceOf[js.Any], UserOperations = UserOperations.asInstanceOf[js.Any], UserSettingOperations = UserSettingOperations.asInstanceOf[js.Any], ValueListItemOperations = ValueListItemOperations.asInstanceOf[js.Any], ValueListOperations = ValueListOperations.asInstanceOf[js.Any], VaultLanguages = VaultLanguages.asInstanceOf[js.Any], ViewOperations = ViewOperations.asInstanceOf[js.Any], WorkflowOperations = WorkflowOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVault]
  }
  
  @scala.inline
  implicit class IVaultMutableBuilder[Self <: IVault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: IVaultAsync): Self = StObject.set(x, "Async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangePassword(value: (String, String) => Unit): Self = StObject.set(x, "ChangePassword", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClassGroupOperations(value: IVaultClassGroupOperations): Self = StObject.set(x, "ClassGroupOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassOperations(value: IVaultClassOperations): Self = StObject.set(x, "ClassOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOperations(value: IVaultClientOperations): Self = StObject.set(x, "ClientOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentLoggedInUserID(value: Double): Self = StObject.set(x, "CurrentLoggedInUserID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomApplicationManagementOperations(value: IVaultCustomApplicationManagementOperations): Self = StObject.set(x, "CustomApplicationManagementOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetOperations(value: IVaultDataSetOperations): Self = StObject.set(x, "DataSetOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectronicSignatureOperations(value: IVaultElectronicSignatureOperations): Self = StObject.set(x, "ElectronicSignatureOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventLogOperations(value: IVaultEventLogOperations): Self = StObject.set(x, "EventLogOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionMethodOperations(value: IVaultExtensionMethodOperations): Self = StObject.set(x, "ExtensionMethodOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalObjectOperations(value: IVaultExternalObjectOperations): Self = StObject.set(x, "ExternalObjectOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllTranslations(value: () => String): Self = StObject.set(x, "GetAllTranslations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGUID(value: () => String): Self = StObject.set(x, "GetGUID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMFilesURLForVaultRoot(value: () => String): Self = StObject.set(x, "GetMFilesURLForVaultRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMetadataStructureItemIDByAlias(value: (MFMetadataStructureItem, String, Boolean) => Double): Self = StObject.set(x, "GetMetadataStructureItemIDByAlias", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetMetadataStructureVersionID(value: () => Double): Self = StObject.set(x, "GetMetadataStructureVersionID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetServerLicenseStatus(value: () => ILicenseStatus): Self = StObject.set(x, "GetServerLicenseStatus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetServerVersionOfVault(value: () => IMFilesVersion): Self = StObject.set(x, "GetServerVersionOfVault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogOutSilent(value: () => Unit): Self = StObject.set(x, "LogOutSilent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogOutWithDialogs(value: Double => Boolean): Self = StObject.set(x, "LogOutWithDialogs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoggedIn(value: Boolean): Self = StObject.set(x, "LoggedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginAccountOperations(value: IVaultLoginAccountOperations): Self = StObject.set(x, "LoginAccountOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginSessionID(value: String): Self = StObject.set(x, "LoginSessionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementOperations(value: IVaultManagementOperations): Self = StObject.set(x, "ManagementOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedACLOperations(value: IVaultNamedACLOperations): Self = StObject.set(x, "NamedACLOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedValueStorageOperations(value: IVaultNamedValueStorageOperations): Self = StObject.set(x, "NamedValueStorageOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationOperations(value: IVaultNotificationOperations): Self = StObject.set(x, "NotificationOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectFileOperations(value: IVaultObjectFileOperations): Self = StObject.set(x, "ObjectFileOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectOperations(value: IVaultObjectOperations): Self = StObject.set(x, "ObjectOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectPropertyOperations(value: IVaultObjectPropertyOperations): Self = StObject.set(x, "ObjectPropertyOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectSearchOperations(value: IVaultObjectSearchOperations): Self = StObject.set(x, "ObjectSearchOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeOperations(value: IVaultObjectTypeOperations): Self = StObject.set(x, "ObjectTypeOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDefOperations(value: IVaultPropertyDefOperations): Self = StObject.set(x, "PropertyDefOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyAccess(value: Boolean): Self = StObject.set(x, "ReadOnlyAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledJobManagementOperations(value: IVaultScheduledJobManagementOperations): Self = StObject.set(x, "ScheduledJobManagementOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerDataPushOperations(value: IVaultServerDataPushOperations): Self = StObject.set(x, "ServerDataPushOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionInfo(value: ISessionInfo): Self = StObject.set(x, "SessionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedLinkOperations(value: IVaultSharedLinkOperations): Self = StObject.set(x, "SharedLinkOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestConnectionToServer(value: () => Unit): Self = StObject.set(x, "TestConnectionToServer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTestConnectionToVault(value: () => Unit): Self = StObject.set(x, "TestConnectionToVault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTestConnectionToVaultWithTimeout(value: Double => Unit): Self = StObject.set(x, "TestConnectionToVaultWithTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTraditionalFolderOperations(value: IVaultTraditionalFolderOperations): Self = StObject.set(x, "TraditionalFolderOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroupOperations(value: IVaultUserGroupOperations): Self = StObject.set(x, "UserGroupOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserOperations(value: IVaultUserOperations): Self = StObject.set(x, "UserOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSettingOperations(value: IVaultUserSettingOperations): Self = StObject.set(x, "UserSettingOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueListItemOperations(value: IVaultValueListItemOperations): Self = StObject.set(x, "ValueListItemOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueListOperations(value: IVaultValueListOperations): Self = StObject.set(x, "ValueListOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultLanguages(value: ILanguages): Self = StObject.set(x, "VaultLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewOperations(value: IVaultViewOperations): Self = StObject.set(x, "ViewOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowOperations(value: IVaultWorkflowOperations): Self = StObject.set(x, "WorkflowOperations", value.asInstanceOf[js.Any])
  }
}
