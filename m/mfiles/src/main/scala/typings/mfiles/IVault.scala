package typings.mfiles

import typings.mfiles.MFiles.MFMetadataStructureItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVault extends js.Object {
  
  val Async: IVaultAsync = js.native
  
  def ChangePassword(OldPassword: String, NewPassword: String): Unit = js.native
  
  val ClassGroupOperations: IVaultClassGroupOperations = js.native
  
  val ClassOperations: IVaultClassOperations = js.native
  
  val ClientOperations: IVaultClientOperations = js.native
  
  val CurrentLoggedInUserID: Double = js.native
  
  val CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperations = js.native
  
  val DataSetOperations: IVaultDataSetOperations = js.native
  
  val ElectronicSignatureOperations: IVaultElectronicSignatureOperations = js.native
  
  val EventLogOperations: IVaultEventLogOperations = js.native
  
  val ExtensionMethodOperations: IVaultExtensionMethodOperations = js.native
  
  val ExternalObjectOperations: IVaultExternalObjectOperations = js.native
  
  def GetAllTranslations(): String = js.native
  
  def GetGUID(): String = js.native
  
  def GetMFilesURLForVaultRoot(): String = js.native
  
  def GetMetadataStructureItemIDByAlias(MetadataStructureItemType: MFMetadataStructureItem, Alias: String, Unused: Boolean): Double = js.native
  
  def GetMetadataStructureVersionID(): Double = js.native
  
  def GetServerLicenseStatus(): ILicenseStatus = js.native
  
  def GetServerVersionOfVault(): IMFilesVersion = js.native
  
  def LogOutSilent(): Unit = js.native
  
  def LogOutWithDialogs(ParentWindow: Double): Boolean = js.native
  
  val LoggedIn: Boolean = js.native
  
  val LoginAccountOperations: IVaultLoginAccountOperations = js.native
  
  val LoginSessionID: String = js.native
  
  val ManagementOperations: IVaultManagementOperations = js.native
  
  val Name: String = js.native
  
  val NamedACLOperations: IVaultNamedACLOperations = js.native
  
  val NamedValueStorageOperations: IVaultNamedValueStorageOperations = js.native
  
  val NotificationOperations: IVaultNotificationOperations = js.native
  
  val ObjectFileOperations: IVaultObjectFileOperations = js.native
  
  val ObjectOperations: IVaultObjectOperations = js.native
  
  val ObjectPropertyOperations: IVaultObjectPropertyOperations = js.native
  
  val ObjectSearchOperations: IVaultObjectSearchOperations = js.native
  
  val ObjectTypeOperations: IVaultObjectTypeOperations = js.native
  
  val PropertyDefOperations: IVaultPropertyDefOperations = js.native
  
  val ReadOnlyAccess: Boolean = js.native
  
  val ScheduledJobManagementOperations: IVaultScheduledJobManagementOperations = js.native
  
  val ServerDataPushOperations: IVaultServerDataPushOperations = js.native
  
  val SessionInfo: ISessionInfo = js.native
  
  val SharedLinkOperations: IVaultSharedLinkOperations = js.native
  
  def TestConnectionToServer(): Unit = js.native
  
  def TestConnectionToVault(): Unit = js.native
  
  def TestConnectionToVaultWithTimeout(TimeoutInMilliseconds: Double): Unit = js.native
  
  val TraditionalFolderOperations: IVaultTraditionalFolderOperations = js.native
  
  val UserGroupOperations: IVaultUserGroupOperations = js.native
  
  val UserOperations: IVaultUserOperations = js.native
  
  val UserSettingOperations: IVaultUserSettingOperations = js.native
  
  val ValueListItemOperations: IVaultValueListItemOperations = js.native
  
  val ValueListOperations: IVaultValueListOperations = js.native
  
  val VaultLanguages: ILanguages = js.native
  
  val ViewOperations: IVaultViewOperations = js.native
  
  val WorkflowOperations: IVaultWorkflowOperations = js.native
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
  implicit class IVaultOps[Self <: IVault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAsync(value: IVaultAsync): Self = this.set("Async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangePassword(value: (String, String) => Unit): Self = this.set("ChangePassword", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClassGroupOperations(value: IVaultClassGroupOperations): Self = this.set("ClassGroupOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassOperations(value: IVaultClassOperations): Self = this.set("ClassOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOperations(value: IVaultClientOperations): Self = this.set("ClientOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentLoggedInUserID(value: Double): Self = this.set("CurrentLoggedInUserID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomApplicationManagementOperations(value: IVaultCustomApplicationManagementOperations): Self = this.set("CustomApplicationManagementOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetOperations(value: IVaultDataSetOperations): Self = this.set("DataSetOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectronicSignatureOperations(value: IVaultElectronicSignatureOperations): Self = this.set("ElectronicSignatureOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventLogOperations(value: IVaultEventLogOperations): Self = this.set("EventLogOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionMethodOperations(value: IVaultExtensionMethodOperations): Self = this.set("ExtensionMethodOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalObjectOperations(value: IVaultExternalObjectOperations): Self = this.set("ExternalObjectOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllTranslations(value: () => String): Self = this.set("GetAllTranslations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGUID(value: () => String): Self = this.set("GetGUID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMFilesURLForVaultRoot(value: () => String): Self = this.set("GetMFilesURLForVaultRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMetadataStructureItemIDByAlias(value: (MFMetadataStructureItem, String, Boolean) => Double): Self = this.set("GetMetadataStructureItemIDByAlias", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetMetadataStructureVersionID(value: () => Double): Self = this.set("GetMetadataStructureVersionID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetServerLicenseStatus(value: () => ILicenseStatus): Self = this.set("GetServerLicenseStatus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetServerVersionOfVault(value: () => IMFilesVersion): Self = this.set("GetServerVersionOfVault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogOutSilent(value: () => Unit): Self = this.set("LogOutSilent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogOutWithDialogs(value: Double => Boolean): Self = this.set("LogOutWithDialogs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoggedIn(value: Boolean): Self = this.set("LoggedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginAccountOperations(value: IVaultLoginAccountOperations): Self = this.set("LoginAccountOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginSessionID(value: String): Self = this.set("LoginSessionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementOperations(value: IVaultManagementOperations): Self = this.set("ManagementOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedACLOperations(value: IVaultNamedACLOperations): Self = this.set("NamedACLOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedValueStorageOperations(value: IVaultNamedValueStorageOperations): Self = this.set("NamedValueStorageOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationOperations(value: IVaultNotificationOperations): Self = this.set("NotificationOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectFileOperations(value: IVaultObjectFileOperations): Self = this.set("ObjectFileOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectOperations(value: IVaultObjectOperations): Self = this.set("ObjectOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectPropertyOperations(value: IVaultObjectPropertyOperations): Self = this.set("ObjectPropertyOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectSearchOperations(value: IVaultObjectSearchOperations): Self = this.set("ObjectSearchOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeOperations(value: IVaultObjectTypeOperations): Self = this.set("ObjectTypeOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDefOperations(value: IVaultPropertyDefOperations): Self = this.set("PropertyDefOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyAccess(value: Boolean): Self = this.set("ReadOnlyAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledJobManagementOperations(value: IVaultScheduledJobManagementOperations): Self = this.set("ScheduledJobManagementOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerDataPushOperations(value: IVaultServerDataPushOperations): Self = this.set("ServerDataPushOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionInfo(value: ISessionInfo): Self = this.set("SessionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedLinkOperations(value: IVaultSharedLinkOperations): Self = this.set("SharedLinkOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestConnectionToServer(value: () => Unit): Self = this.set("TestConnectionToServer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTestConnectionToVault(value: () => Unit): Self = this.set("TestConnectionToVault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTestConnectionToVaultWithTimeout(value: Double => Unit): Self = this.set("TestConnectionToVaultWithTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTraditionalFolderOperations(value: IVaultTraditionalFolderOperations): Self = this.set("TraditionalFolderOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroupOperations(value: IVaultUserGroupOperations): Self = this.set("UserGroupOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserOperations(value: IVaultUserOperations): Self = this.set("UserOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSettingOperations(value: IVaultUserSettingOperations): Self = this.set("UserSettingOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueListItemOperations(value: IVaultValueListItemOperations): Self = this.set("ValueListItemOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueListOperations(value: IVaultValueListOperations): Self = this.set("ValueListOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultLanguages(value: ILanguages): Self = this.set("VaultLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewOperations(value: IVaultViewOperations): Self = this.set("ViewOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowOperations(value: IVaultWorkflowOperations): Self = this.set("WorkflowOperations", value.asInstanceOf[js.Any])
  }
}
