package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultAsync extends js.Object {
  val ClassGroupOperations: IVaultClassGroupOperationsAsync = js.native
  val ClassOperations: IVaultClassOperationsAsync = js.native
  val ClientOperations: IVaultClientOperationsAsync = js.native
  val CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperationsAsync = js.native
  val DataSetOperations: IVaultDataSetOperationsAsync = js.native
  val ElectronicSignatureOperations: IVaultElectronicSignatureOperationsAsync = js.native
  val EventLogOperations: IVaultEventLogOperationsAsync = js.native
  val ExtensionMethodOperations: IVaultExtensionMethodOperationsAsync = js.native
  val ExternalObjectOperations: IVaultExternalObjectOperationsAsync = js.native
  val LoginAccountOperations: IVaultLoginAccountOperationsAsync = js.native
  val ManagementOperations: IVaultManagementOperationsAsync = js.native
  val NamedACLOperations: IVaultNamedACLOperationsAsync = js.native
  val NamedValueStorageOperations: IVaultNamedValueStorageOperationsAsync = js.native
  val NotificationOperations: IVaultNotificationOperationsAsync = js.native
  val ObjectFileOperations: IVaultObjectFileOperationsAsync = js.native
  val ObjectOperations: IVaultObjectOperationsAsync = js.native
  val ObjectPropertyOperations: IVaultObjectPropertyOperationsAsync = js.native
  val ObjectSearchOperations: IVaultObjectSearchOperationsAsync = js.native
  val ObjectTypeOperations: IVaultObjectTypeOperationsAsync = js.native
  val PropertyDefOperations: IVaultPropertyDefOperationsAsync = js.native
  val ScheduledJobManagementOperations: IVaultScheduledJobManagementOperationsAsync = js.native
  val ServerDataPushOperations: IVaultServerDataPushOperationsAsync = js.native
  val SharedLinkOperations: IVaultSharedLinkOperationsAsync = js.native
  val TraditionalFolderOperations: IVaultTraditionalFolderOperationsAsync = js.native
  val UserGroupOperations: IVaultUserGroupOperationsAsync = js.native
  val UserOperations: IVaultUserOperationsAsync = js.native
  val UserSettingOperations: IVaultUserSettingOperationsAsync = js.native
  val ValueListItemOperations: IVaultValueListItemOperationsAsync = js.native
  val ValueListOperations: IVaultValueListOperationsAsync = js.native
  val ViewOperations: IVaultViewOperationsAsync = js.native
  val WorkflowOperations: IVaultWorkflowOperationsAsync = js.native
}

object IVaultAsync {
  @scala.inline
  def apply(
    ClassGroupOperations: IVaultClassGroupOperationsAsync,
    ClassOperations: IVaultClassOperationsAsync,
    ClientOperations: IVaultClientOperationsAsync,
    CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperationsAsync,
    DataSetOperations: IVaultDataSetOperationsAsync,
    ElectronicSignatureOperations: IVaultElectronicSignatureOperationsAsync,
    EventLogOperations: IVaultEventLogOperationsAsync,
    ExtensionMethodOperations: IVaultExtensionMethodOperationsAsync,
    ExternalObjectOperations: IVaultExternalObjectOperationsAsync,
    LoginAccountOperations: IVaultLoginAccountOperationsAsync,
    ManagementOperations: IVaultManagementOperationsAsync,
    NamedACLOperations: IVaultNamedACLOperationsAsync,
    NamedValueStorageOperations: IVaultNamedValueStorageOperationsAsync,
    NotificationOperations: IVaultNotificationOperationsAsync,
    ObjectFileOperations: IVaultObjectFileOperationsAsync,
    ObjectOperations: IVaultObjectOperationsAsync,
    ObjectPropertyOperations: IVaultObjectPropertyOperationsAsync,
    ObjectSearchOperations: IVaultObjectSearchOperationsAsync,
    ObjectTypeOperations: IVaultObjectTypeOperationsAsync,
    PropertyDefOperations: IVaultPropertyDefOperationsAsync,
    ScheduledJobManagementOperations: IVaultScheduledJobManagementOperationsAsync,
    ServerDataPushOperations: IVaultServerDataPushOperationsAsync,
    SharedLinkOperations: IVaultSharedLinkOperationsAsync,
    TraditionalFolderOperations: IVaultTraditionalFolderOperationsAsync,
    UserGroupOperations: IVaultUserGroupOperationsAsync,
    UserOperations: IVaultUserOperationsAsync,
    UserSettingOperations: IVaultUserSettingOperationsAsync,
    ValueListItemOperations: IVaultValueListItemOperationsAsync,
    ValueListOperations: IVaultValueListOperationsAsync,
    ViewOperations: IVaultViewOperationsAsync,
    WorkflowOperations: IVaultWorkflowOperationsAsync
  ): IVaultAsync = {
    val __obj = js.Dynamic.literal(ClassGroupOperations = ClassGroupOperations.asInstanceOf[js.Any], ClassOperations = ClassOperations.asInstanceOf[js.Any], ClientOperations = ClientOperations.asInstanceOf[js.Any], CustomApplicationManagementOperations = CustomApplicationManagementOperations.asInstanceOf[js.Any], DataSetOperations = DataSetOperations.asInstanceOf[js.Any], ElectronicSignatureOperations = ElectronicSignatureOperations.asInstanceOf[js.Any], EventLogOperations = EventLogOperations.asInstanceOf[js.Any], ExtensionMethodOperations = ExtensionMethodOperations.asInstanceOf[js.Any], ExternalObjectOperations = ExternalObjectOperations.asInstanceOf[js.Any], LoginAccountOperations = LoginAccountOperations.asInstanceOf[js.Any], ManagementOperations = ManagementOperations.asInstanceOf[js.Any], NamedACLOperations = NamedACLOperations.asInstanceOf[js.Any], NamedValueStorageOperations = NamedValueStorageOperations.asInstanceOf[js.Any], NotificationOperations = NotificationOperations.asInstanceOf[js.Any], ObjectFileOperations = ObjectFileOperations.asInstanceOf[js.Any], ObjectOperations = ObjectOperations.asInstanceOf[js.Any], ObjectPropertyOperations = ObjectPropertyOperations.asInstanceOf[js.Any], ObjectSearchOperations = ObjectSearchOperations.asInstanceOf[js.Any], ObjectTypeOperations = ObjectTypeOperations.asInstanceOf[js.Any], PropertyDefOperations = PropertyDefOperations.asInstanceOf[js.Any], ScheduledJobManagementOperations = ScheduledJobManagementOperations.asInstanceOf[js.Any], ServerDataPushOperations = ServerDataPushOperations.asInstanceOf[js.Any], SharedLinkOperations = SharedLinkOperations.asInstanceOf[js.Any], TraditionalFolderOperations = TraditionalFolderOperations.asInstanceOf[js.Any], UserGroupOperations = UserGroupOperations.asInstanceOf[js.Any], UserOperations = UserOperations.asInstanceOf[js.Any], UserSettingOperations = UserSettingOperations.asInstanceOf[js.Any], ValueListItemOperations = ValueListItemOperations.asInstanceOf[js.Any], ValueListOperations = ValueListOperations.asInstanceOf[js.Any], ViewOperations = ViewOperations.asInstanceOf[js.Any], WorkflowOperations = WorkflowOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVaultAsync]
  }
  @scala.inline
  implicit class IVaultAsyncOps[Self <: IVaultAsync] (val x: Self) extends AnyVal {
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
    def setClassGroupOperations(value: IVaultClassGroupOperationsAsync): Self = this.set("ClassGroupOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassOperations(value: IVaultClassOperationsAsync): Self = this.set("ClassOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientOperations(value: IVaultClientOperationsAsync): Self = this.set("ClientOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomApplicationManagementOperations(value: IVaultCustomApplicationManagementOperationsAsync): Self = this.set("CustomApplicationManagementOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSetOperations(value: IVaultDataSetOperationsAsync): Self = this.set("DataSetOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setElectronicSignatureOperations(value: IVaultElectronicSignatureOperationsAsync): Self = this.set("ElectronicSignatureOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventLogOperations(value: IVaultEventLogOperationsAsync): Self = this.set("EventLogOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionMethodOperations(value: IVaultExtensionMethodOperationsAsync): Self = this.set("ExtensionMethodOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalObjectOperations(value: IVaultExternalObjectOperationsAsync): Self = this.set("ExternalObjectOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoginAccountOperations(value: IVaultLoginAccountOperationsAsync): Self = this.set("LoginAccountOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setManagementOperations(value: IVaultManagementOperationsAsync): Self = this.set("ManagementOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamedACLOperations(value: IVaultNamedACLOperationsAsync): Self = this.set("NamedACLOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamedValueStorageOperations(value: IVaultNamedValueStorageOperationsAsync): Self = this.set("NamedValueStorageOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationOperations(value: IVaultNotificationOperationsAsync): Self = this.set("NotificationOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectFileOperations(value: IVaultObjectFileOperationsAsync): Self = this.set("ObjectFileOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectOperations(value: IVaultObjectOperationsAsync): Self = this.set("ObjectOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectPropertyOperations(value: IVaultObjectPropertyOperationsAsync): Self = this.set("ObjectPropertyOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectSearchOperations(value: IVaultObjectSearchOperationsAsync): Self = this.set("ObjectSearchOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectTypeOperations(value: IVaultObjectTypeOperationsAsync): Self = this.set("ObjectTypeOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyDefOperations(value: IVaultPropertyDefOperationsAsync): Self = this.set("PropertyDefOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduledJobManagementOperations(value: IVaultScheduledJobManagementOperationsAsync): Self = this.set("ScheduledJobManagementOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerDataPushOperations(value: IVaultServerDataPushOperationsAsync): Self = this.set("ServerDataPushOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharedLinkOperations(value: IVaultSharedLinkOperationsAsync): Self = this.set("SharedLinkOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setTraditionalFolderOperations(value: IVaultTraditionalFolderOperationsAsync): Self = this.set("TraditionalFolderOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserGroupOperations(value: IVaultUserGroupOperationsAsync): Self = this.set("UserGroupOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserOperations(value: IVaultUserOperationsAsync): Self = this.set("UserOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserSettingOperations(value: IVaultUserSettingOperationsAsync): Self = this.set("UserSettingOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueListItemOperations(value: IVaultValueListItemOperationsAsync): Self = this.set("ValueListItemOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueListOperations(value: IVaultValueListOperationsAsync): Self = this.set("ValueListOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewOperations(value: IVaultViewOperationsAsync): Self = this.set("ViewOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowOperations(value: IVaultWorkflowOperationsAsync): Self = this.set("WorkflowOperations", value.asInstanceOf[js.Any])
  }
  
}

