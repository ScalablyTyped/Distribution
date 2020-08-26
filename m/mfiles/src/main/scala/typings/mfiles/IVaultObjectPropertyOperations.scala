package typings.mfiles

import typings.mfiles.MFiles.MFACLEnforcingMode
import typings.mfiles.MFiles.MFMetadataSyncFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultObjectPropertyOperations extends js.Object {
  def ApproveOrRejectAssignment(ObjVer: IObjVer, Approve: Boolean): IObjectVersionAndProperties = js.native
  def ApproveOrRejectAssignmentByUser(ObjVer: IObjVer, Approve: Boolean, UserID: Double): IObjectVersionAndProperties = js.native
  def CreatePropertiesFromFileInformation(FileInformation: IFileInformation): IPropertyValues = js.native
  def GenerateAutomaticPermissionsFromPropertyValues(PropertyValues: IPropertyValues): IAccessControlList = js.native
  def GetProperties(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValues = js.native
  def GetPropertiesAsXML(ObjVer: IObjVer, UpdateFromServer: Boolean): String = js.native
  def GetPropertiesForDisplay(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValuesForDisplay = js.native
  def GetPropertiesForMetadataSync(ObjVer: IObjVer, Format: MFMetadataSyncFormat): INamedValues = js.native
  def GetPropertiesOfMultipleObjects(ObjectVersions: IObjVers): IPropertyValuesOfMultipleObjects = js.native
  def GetPropertiesWithIconClues(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValuesWithIconClues = js.native
  def GetPropertiesWithIconCluesOfMultipleObjects(ObjectVersions: IObjVers): IPropertyValuesWithIconCluesOfMultipleObjects = js.native
  def GetProperty(ObjVer: IObjVer, Property: Double): IPropertyValue = js.native
  def GetVersionComment(ObjVer: IObjVer): IVersionComment = js.native
  def GetVersionCommentHistory(ObjVer: IObjVer): IVersionComments = js.native
  def GetWorkflowState(ObjVer: IObjVer, UpdateFromServer: Boolean): IObjectVersionWorkflowState = js.native
  def MarkAssignmentComplete(ObjVer: IObjVer): IObjectVersionAndProperties = js.native
  def MarkAssignmentCompleteByUser(ObjVer: IObjVer, UserID: Double): IObjectVersionAndProperties = js.native
  def RemoveProperty(ObjVer: IObjVer, Property: Double): IObjectVersionAndProperties = js.native
  def SetAllProperties(ObjVer: IObjVer, AllowModifyingCheckedInObject: Boolean, PropertyValues: IPropertyValues): IObjectVersionAndProperties = js.native
  def SetAllPropertiesWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def SetAllPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties = js.native
  def SetCreationInfoAdmin(
    ObjVer: IObjVer,
    UpdateCreatedBy: Boolean,
    CreatedBy: ITypedValue,
    UpdateCreated: Boolean,
    CreatedUtc: ITypedValue
  ): IObjectVersionAndProperties = js.native
  def SetLastModificationInfoAdmin(
    ObjVer: IObjVer,
    UpdateLastModifiedBy: Boolean,
    LastModifiedBy: ITypedValue,
    UpdateLastModified: Boolean,
    LastModifiedUtc: ITypedValue
  ): IObjectVersionAndProperties = js.native
  def SetProperties(ObjVer: IObjVer, PropertyValues: IPropertyValues): IObjectVersionAndProperties = js.native
  def SetPropertiesOfMultipleObjects(SetPropertiesParamsOfObjects: ISetPropertiesParamsOfMultipleObjects): IObjectVersionAndPropertiesOfMultipleObjects = js.native
  def SetPropertiesWithPermissions(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def SetPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties = js.native
  def SetProperty(ObjVer: IObjVer, PropertyValue: IPropertyValue): IObjectVersionAndProperties = js.native
  def SetVersionComment(ObjVer: IObjVer, VersionComment: IPropertyValue): IObjectVersionAndProperties = js.native
  def SetWorkflowState(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState): IObjectVersionAndProperties = js.native
  def SetWorkflowStateEx(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState, ElectronicSignature: js.Any): IObjectVersionAndProperties = js.native
  def SetWorkflowStateTransition(ObjVer: IObjVer, Workflow: Double, lStateTransition: Double, lVersionComment: String): IObjectVersionAndProperties = js.native
  def SetWorkflowStateTransitionEx(
    ObjVer: IObjVer,
    Workflow: Double,
    StateTransition: Double,
    VersionComment: String,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties = js.native
}

object IVaultObjectPropertyOperations {
  @scala.inline
  def apply(
    ApproveOrRejectAssignment: (IObjVer, Boolean) => IObjectVersionAndProperties,
    ApproveOrRejectAssignmentByUser: (IObjVer, Boolean, Double) => IObjectVersionAndProperties,
    CreatePropertiesFromFileInformation: IFileInformation => IPropertyValues,
    GenerateAutomaticPermissionsFromPropertyValues: IPropertyValues => IAccessControlList,
    GetProperties: (IObjVer, Boolean) => IPropertyValues,
    GetPropertiesAsXML: (IObjVer, Boolean) => String,
    GetPropertiesForDisplay: (IObjVer, Boolean) => IPropertyValuesForDisplay,
    GetPropertiesForMetadataSync: (IObjVer, MFMetadataSyncFormat) => INamedValues,
    GetPropertiesOfMultipleObjects: IObjVers => IPropertyValuesOfMultipleObjects,
    GetPropertiesWithIconClues: (IObjVer, Boolean) => IPropertyValuesWithIconClues,
    GetPropertiesWithIconCluesOfMultipleObjects: IObjVers => IPropertyValuesWithIconCluesOfMultipleObjects,
    GetProperty: (IObjVer, Double) => IPropertyValue,
    GetVersionComment: IObjVer => IVersionComment,
    GetVersionCommentHistory: IObjVer => IVersionComments,
    GetWorkflowState: (IObjVer, Boolean) => IObjectVersionWorkflowState,
    MarkAssignmentComplete: IObjVer => IObjectVersionAndProperties,
    MarkAssignmentCompleteByUser: (IObjVer, Double) => IObjectVersionAndProperties,
    RemoveProperty: (IObjVer, Double) => IObjectVersionAndProperties,
    SetAllProperties: (IObjVer, Boolean, IPropertyValues) => IObjectVersionAndProperties,
    SetAllPropertiesWithPermissions: (IObjVer, Boolean, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties,
    SetAllPropertiesWithPermissionsEx: (IObjVer, Boolean, IPropertyValues, MFACLEnforcingMode, IAccessControlList, js.Any) => IObjectVersionAndProperties,
    SetCreationInfoAdmin: (IObjVer, Boolean, ITypedValue, Boolean, ITypedValue) => IObjectVersionAndProperties,
    SetLastModificationInfoAdmin: (IObjVer, Boolean, ITypedValue, Boolean, ITypedValue) => IObjectVersionAndProperties,
    SetProperties: (IObjVer, IPropertyValues) => IObjectVersionAndProperties,
    SetPropertiesOfMultipleObjects: ISetPropertiesParamsOfMultipleObjects => IObjectVersionAndPropertiesOfMultipleObjects,
    SetPropertiesWithPermissions: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties,
    SetPropertiesWithPermissionsEx: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList, js.Any) => IObjectVersionAndProperties,
    SetProperty: (IObjVer, IPropertyValue) => IObjectVersionAndProperties,
    SetVersionComment: (IObjVer, IPropertyValue) => IObjectVersionAndProperties,
    SetWorkflowState: (IObjVer, IObjectVersionWorkflowState) => IObjectVersionAndProperties,
    SetWorkflowStateEx: (IObjVer, IObjectVersionWorkflowState, js.Any) => IObjectVersionAndProperties,
    SetWorkflowStateTransition: (IObjVer, Double, Double, String) => IObjectVersionAndProperties,
    SetWorkflowStateTransitionEx: (IObjVer, Double, Double, String, js.Any) => IObjectVersionAndProperties
  ): IVaultObjectPropertyOperations = {
    val __obj = js.Dynamic.literal(ApproveOrRejectAssignment = js.Any.fromFunction2(ApproveOrRejectAssignment), ApproveOrRejectAssignmentByUser = js.Any.fromFunction3(ApproveOrRejectAssignmentByUser), CreatePropertiesFromFileInformation = js.Any.fromFunction1(CreatePropertiesFromFileInformation), GenerateAutomaticPermissionsFromPropertyValues = js.Any.fromFunction1(GenerateAutomaticPermissionsFromPropertyValues), GetProperties = js.Any.fromFunction2(GetProperties), GetPropertiesAsXML = js.Any.fromFunction2(GetPropertiesAsXML), GetPropertiesForDisplay = js.Any.fromFunction2(GetPropertiesForDisplay), GetPropertiesForMetadataSync = js.Any.fromFunction2(GetPropertiesForMetadataSync), GetPropertiesOfMultipleObjects = js.Any.fromFunction1(GetPropertiesOfMultipleObjects), GetPropertiesWithIconClues = js.Any.fromFunction2(GetPropertiesWithIconClues), GetPropertiesWithIconCluesOfMultipleObjects = js.Any.fromFunction1(GetPropertiesWithIconCluesOfMultipleObjects), GetProperty = js.Any.fromFunction2(GetProperty), GetVersionComment = js.Any.fromFunction1(GetVersionComment), GetVersionCommentHistory = js.Any.fromFunction1(GetVersionCommentHistory), GetWorkflowState = js.Any.fromFunction2(GetWorkflowState), MarkAssignmentComplete = js.Any.fromFunction1(MarkAssignmentComplete), MarkAssignmentCompleteByUser = js.Any.fromFunction2(MarkAssignmentCompleteByUser), RemoveProperty = js.Any.fromFunction2(RemoveProperty), SetAllProperties = js.Any.fromFunction3(SetAllProperties), SetAllPropertiesWithPermissions = js.Any.fromFunction5(SetAllPropertiesWithPermissions), SetAllPropertiesWithPermissionsEx = js.Any.fromFunction6(SetAllPropertiesWithPermissionsEx), SetCreationInfoAdmin = js.Any.fromFunction5(SetCreationInfoAdmin), SetLastModificationInfoAdmin = js.Any.fromFunction5(SetLastModificationInfoAdmin), SetProperties = js.Any.fromFunction2(SetProperties), SetPropertiesOfMultipleObjects = js.Any.fromFunction1(SetPropertiesOfMultipleObjects), SetPropertiesWithPermissions = js.Any.fromFunction4(SetPropertiesWithPermissions), SetPropertiesWithPermissionsEx = js.Any.fromFunction5(SetPropertiesWithPermissionsEx), SetProperty = js.Any.fromFunction2(SetProperty), SetVersionComment = js.Any.fromFunction2(SetVersionComment), SetWorkflowState = js.Any.fromFunction2(SetWorkflowState), SetWorkflowStateEx = js.Any.fromFunction3(SetWorkflowStateEx), SetWorkflowStateTransition = js.Any.fromFunction4(SetWorkflowStateTransition), SetWorkflowStateTransitionEx = js.Any.fromFunction5(SetWorkflowStateTransitionEx))
    __obj.asInstanceOf[IVaultObjectPropertyOperations]
  }
  @scala.inline
  implicit class IVaultObjectPropertyOperationsOps[Self <: IVaultObjectPropertyOperations] (val x: Self) extends AnyVal {
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
    def setApproveOrRejectAssignment(value: (IObjVer, Boolean) => IObjectVersionAndProperties): Self = this.set("ApproveOrRejectAssignment", js.Any.fromFunction2(value))
    @scala.inline
    def setApproveOrRejectAssignmentByUser(value: (IObjVer, Boolean, Double) => IObjectVersionAndProperties): Self = this.set("ApproveOrRejectAssignmentByUser", js.Any.fromFunction3(value))
    @scala.inline
    def setCreatePropertiesFromFileInformation(value: IFileInformation => IPropertyValues): Self = this.set("CreatePropertiesFromFileInformation", js.Any.fromFunction1(value))
    @scala.inline
    def setGenerateAutomaticPermissionsFromPropertyValues(value: IPropertyValues => IAccessControlList): Self = this.set("GenerateAutomaticPermissionsFromPropertyValues", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProperties(value: (IObjVer, Boolean) => IPropertyValues): Self = this.set("GetProperties", js.Any.fromFunction2(value))
    @scala.inline
    def setGetPropertiesAsXML(value: (IObjVer, Boolean) => String): Self = this.set("GetPropertiesAsXML", js.Any.fromFunction2(value))
    @scala.inline
    def setGetPropertiesForDisplay(value: (IObjVer, Boolean) => IPropertyValuesForDisplay): Self = this.set("GetPropertiesForDisplay", js.Any.fromFunction2(value))
    @scala.inline
    def setGetPropertiesForMetadataSync(value: (IObjVer, MFMetadataSyncFormat) => INamedValues): Self = this.set("GetPropertiesForMetadataSync", js.Any.fromFunction2(value))
    @scala.inline
    def setGetPropertiesOfMultipleObjects(value: IObjVers => IPropertyValuesOfMultipleObjects): Self = this.set("GetPropertiesOfMultipleObjects", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPropertiesWithIconClues(value: (IObjVer, Boolean) => IPropertyValuesWithIconClues): Self = this.set("GetPropertiesWithIconClues", js.Any.fromFunction2(value))
    @scala.inline
    def setGetPropertiesWithIconCluesOfMultipleObjects(value: IObjVers => IPropertyValuesWithIconCluesOfMultipleObjects): Self = this.set("GetPropertiesWithIconCluesOfMultipleObjects", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProperty(value: (IObjVer, Double) => IPropertyValue): Self = this.set("GetProperty", js.Any.fromFunction2(value))
    @scala.inline
    def setGetVersionComment(value: IObjVer => IVersionComment): Self = this.set("GetVersionComment", js.Any.fromFunction1(value))
    @scala.inline
    def setGetVersionCommentHistory(value: IObjVer => IVersionComments): Self = this.set("GetVersionCommentHistory", js.Any.fromFunction1(value))
    @scala.inline
    def setGetWorkflowState(value: (IObjVer, Boolean) => IObjectVersionWorkflowState): Self = this.set("GetWorkflowState", js.Any.fromFunction2(value))
    @scala.inline
    def setMarkAssignmentComplete(value: IObjVer => IObjectVersionAndProperties): Self = this.set("MarkAssignmentComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setMarkAssignmentCompleteByUser(value: (IObjVer, Double) => IObjectVersionAndProperties): Self = this.set("MarkAssignmentCompleteByUser", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveProperty(value: (IObjVer, Double) => IObjectVersionAndProperties): Self = this.set("RemoveProperty", js.Any.fromFunction2(value))
    @scala.inline
    def setSetAllProperties(value: (IObjVer, Boolean, IPropertyValues) => IObjectVersionAndProperties): Self = this.set("SetAllProperties", js.Any.fromFunction3(value))
    @scala.inline
    def setSetAllPropertiesWithPermissions(
      value: (IObjVer, Boolean, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties
    ): Self = this.set("SetAllPropertiesWithPermissions", js.Any.fromFunction5(value))
    @scala.inline
    def setSetAllPropertiesWithPermissionsEx(
      value: (IObjVer, Boolean, IPropertyValues, MFACLEnforcingMode, IAccessControlList, js.Any) => IObjectVersionAndProperties
    ): Self = this.set("SetAllPropertiesWithPermissionsEx", js.Any.fromFunction6(value))
    @scala.inline
    def setSetCreationInfoAdmin(value: (IObjVer, Boolean, ITypedValue, Boolean, ITypedValue) => IObjectVersionAndProperties): Self = this.set("SetCreationInfoAdmin", js.Any.fromFunction5(value))
    @scala.inline
    def setSetLastModificationInfoAdmin(value: (IObjVer, Boolean, ITypedValue, Boolean, ITypedValue) => IObjectVersionAndProperties): Self = this.set("SetLastModificationInfoAdmin", js.Any.fromFunction5(value))
    @scala.inline
    def setSetProperties(value: (IObjVer, IPropertyValues) => IObjectVersionAndProperties): Self = this.set("SetProperties", js.Any.fromFunction2(value))
    @scala.inline
    def setSetPropertiesOfMultipleObjects(value: ISetPropertiesParamsOfMultipleObjects => IObjectVersionAndPropertiesOfMultipleObjects): Self = this.set("SetPropertiesOfMultipleObjects", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPropertiesWithPermissions(
      value: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties
    ): Self = this.set("SetPropertiesWithPermissions", js.Any.fromFunction4(value))
    @scala.inline
    def setSetPropertiesWithPermissionsEx(
      value: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList, js.Any) => IObjectVersionAndProperties
    ): Self = this.set("SetPropertiesWithPermissionsEx", js.Any.fromFunction5(value))
    @scala.inline
    def setSetProperty(value: (IObjVer, IPropertyValue) => IObjectVersionAndProperties): Self = this.set("SetProperty", js.Any.fromFunction2(value))
    @scala.inline
    def setSetVersionComment(value: (IObjVer, IPropertyValue) => IObjectVersionAndProperties): Self = this.set("SetVersionComment", js.Any.fromFunction2(value))
    @scala.inline
    def setSetWorkflowState(value: (IObjVer, IObjectVersionWorkflowState) => IObjectVersionAndProperties): Self = this.set("SetWorkflowState", js.Any.fromFunction2(value))
    @scala.inline
    def setSetWorkflowStateEx(value: (IObjVer, IObjectVersionWorkflowState, js.Any) => IObjectVersionAndProperties): Self = this.set("SetWorkflowStateEx", js.Any.fromFunction3(value))
    @scala.inline
    def setSetWorkflowStateTransition(value: (IObjVer, Double, Double, String) => IObjectVersionAndProperties): Self = this.set("SetWorkflowStateTransition", js.Any.fromFunction4(value))
    @scala.inline
    def setSetWorkflowStateTransitionEx(value: (IObjVer, Double, Double, String, js.Any) => IObjectVersionAndProperties): Self = this.set("SetWorkflowStateTransitionEx", js.Any.fromFunction5(value))
  }
  
}

