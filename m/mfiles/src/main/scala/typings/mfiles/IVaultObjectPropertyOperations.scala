package typings.mfiles

import typings.mfiles.MFiles.MFACLEnforcingMode
import typings.mfiles.MFiles.MFMetadataSyncFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultObjectPropertyOperations extends js.Object {
  def ApproveOrRejectAssignment(ObjVer: IObjVer, Approve: Boolean): IObjectVersionAndProperties
  def ApproveOrRejectAssignmentByUser(ObjVer: IObjVer, Approve: Boolean, UserID: Double): IObjectVersionAndProperties
  def CreatePropertiesFromFileInformation(FileInformation: IFileInformation): IPropertyValues
  def GenerateAutomaticPermissionsFromPropertyValues(PropertyValues: IPropertyValues): IAccessControlList
  def GetProperties(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValues
  def GetPropertiesAsXML(ObjVer: IObjVer, UpdateFromServer: Boolean): String
  def GetPropertiesForDisplay(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValuesForDisplay
  def GetPropertiesForMetadataSync(ObjVer: IObjVer, Format: MFMetadataSyncFormat): INamedValues
  def GetPropertiesOfMultipleObjects(ObjectVersions: IObjVers): IPropertyValuesOfMultipleObjects
  def GetPropertiesWithIconClues(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValuesWithIconClues
  def GetPropertiesWithIconCluesOfMultipleObjects(ObjectVersions: IObjVers): IPropertyValuesWithIconCluesOfMultipleObjects
  def GetProperty(ObjVer: IObjVer, Property: Double): IPropertyValue
  def GetVersionComment(ObjVer: IObjVer): IVersionComment
  def GetVersionCommentHistory(ObjVer: IObjVer): IVersionComments
  def GetWorkflowState(ObjVer: IObjVer, UpdateFromServer: Boolean): IObjectVersionWorkflowState
  def MarkAssignmentComplete(ObjVer: IObjVer): IObjectVersionAndProperties
  def MarkAssignmentCompleteByUser(ObjVer: IObjVer, UserID: Double): IObjectVersionAndProperties
  def RemoveProperty(ObjVer: IObjVer, Property: Double): IObjectVersionAndProperties
  def SetAllProperties(ObjVer: IObjVer, AllowModifyingCheckedInObject: Boolean, PropertyValues: IPropertyValues): IObjectVersionAndProperties
  def SetAllPropertiesWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): IObjectVersionAndProperties
  def SetAllPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties
  def SetCreationInfoAdmin(
    ObjVer: IObjVer,
    UpdateCreatedBy: Boolean,
    CreatedBy: ITypedValue,
    UpdateCreated: Boolean,
    CreatedUtc: ITypedValue
  ): IObjectVersionAndProperties
  def SetLastModificationInfoAdmin(
    ObjVer: IObjVer,
    UpdateLastModifiedBy: Boolean,
    LastModifiedBy: ITypedValue,
    UpdateLastModified: Boolean,
    LastModifiedUtc: ITypedValue
  ): IObjectVersionAndProperties
  def SetProperties(ObjVer: IObjVer, PropertyValues: IPropertyValues): IObjectVersionAndProperties
  def SetPropertiesOfMultipleObjects(SetPropertiesParamsOfObjects: ISetPropertiesParamsOfMultipleObjects): IObjectVersionAndPropertiesOfMultipleObjects
  def SetPropertiesWithPermissions(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): IObjectVersionAndProperties
  def SetPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties
  def SetProperty(ObjVer: IObjVer, PropertyValue: IPropertyValue): IObjectVersionAndProperties
  def SetVersionComment(ObjVer: IObjVer, VersionComment: IPropertyValue): IObjectVersionAndProperties
  def SetWorkflowState(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState): IObjectVersionAndProperties
  def SetWorkflowStateEx(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState, ElectronicSignature: js.Any): IObjectVersionAndProperties
  def SetWorkflowStateTransition(ObjVer: IObjVer, Workflow: Double, lStateTransition: Double, lVersionComment: String): IObjectVersionAndProperties
  def SetWorkflowStateTransitionEx(
    ObjVer: IObjVer,
    Workflow: Double,
    StateTransition: Double,
    VersionComment: String,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties
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
}

