package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultObjectPropertyOperations extends js.Object {
  def ApproveOrRejectAssignment(ObjVer: IObjVer, Approve: scala.Boolean): IObjectVersionAndProperties
  def ApproveOrRejectAssignmentByUser(ObjVer: IObjVer, Approve: scala.Boolean, UserID: scala.Double): IObjectVersionAndProperties
  def CreatePropertiesFromFileInformation(FileInformation: IFileInformation): IPropertyValues
  def GenerateAutomaticPermissionsFromPropertyValues(PropertyValues: IPropertyValues): IAccessControlList
  def GetProperties(ObjVer: IObjVer, UpdateFromServer: scala.Boolean): IPropertyValues
  def GetPropertiesAsXML(ObjVer: IObjVer, UpdateFromServer: scala.Boolean): java.lang.String
  def GetPropertiesForDisplay(ObjVer: IObjVer, UpdateFromServer: scala.Boolean): IPropertyValuesForDisplay
  def GetPropertiesForMetadataSync(ObjVer: IObjVer, Format: mfilesLib.MFilesNs.MFMetadataSyncFormat): INamedValues
  def GetPropertiesOfMultipleObjects(ObjectVersions: IObjVers): IPropertyValuesOfMultipleObjects
  def GetPropertiesWithIconClues(ObjVer: IObjVer, UpdateFromServer: scala.Boolean): IPropertyValuesWithIconClues
  def GetPropertiesWithIconCluesOfMultipleObjects(ObjectVersions: IObjVers): IPropertyValuesWithIconCluesOfMultipleObjects
  def GetProperty(ObjVer: IObjVer, Property: scala.Double): IPropertyValue
  def GetVersionComment(ObjVer: IObjVer): IVersionComment
  def GetVersionCommentHistory(ObjVer: IObjVer): IVersionComments
  def GetWorkflowState(ObjVer: IObjVer, UpdateFromServer: scala.Boolean): IObjectVersionWorkflowState
  def MarkAssignmentComplete(ObjVer: IObjVer): IObjectVersionAndProperties
  def MarkAssignmentCompleteByUser(ObjVer: IObjVer, UserID: scala.Double): IObjectVersionAndProperties
  def RemoveProperty(ObjVer: IObjVer, Property: scala.Double): IObjectVersionAndProperties
  def SetAllProperties(ObjVer: IObjVer, AllowModifyingCheckedInObject: scala.Boolean, PropertyValues: IPropertyValues): IObjectVersionAndProperties
  def SetAllPropertiesWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): IObjectVersionAndProperties
  def SetAllPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties
  def SetCreationInfoAdmin(
    ObjVer: IObjVer,
    UpdateCreatedBy: scala.Boolean,
    CreatedBy: ITypedValue,
    UpdateCreated: scala.Boolean,
    CreatedUtc: ITypedValue
  ): IObjectVersionAndProperties
  def SetLastModificationInfoAdmin(
    ObjVer: IObjVer,
    UpdateLastModifiedBy: scala.Boolean,
    LastModifiedBy: ITypedValue,
    UpdateLastModified: scala.Boolean,
    LastModifiedUtc: ITypedValue
  ): IObjectVersionAndProperties
  def SetProperties(ObjVer: IObjVer, PropertyValues: IPropertyValues): IObjectVersionAndProperties
  def SetPropertiesOfMultipleObjects(SetPropertiesParamsOfObjects: ISetPropertiesParamsOfMultipleObjects): IObjectVersionAndPropertiesOfMultipleObjects
  def SetPropertiesWithPermissions(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): IObjectVersionAndProperties
  def SetPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties
  def SetProperty(ObjVer: IObjVer, PropertyValue: IPropertyValue): IObjectVersionAndProperties
  def SetVersionComment(ObjVer: IObjVer, VersionComment: IPropertyValue): IObjectVersionAndProperties
  def SetWorkflowState(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState): IObjectVersionAndProperties
  def SetWorkflowStateEx(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState, ElectronicSignature: js.Any): IObjectVersionAndProperties
  def SetWorkflowStateTransition(
    ObjVer: IObjVer,
    Workflow: scala.Double,
    lStateTransition: scala.Double,
    lVersionComment: java.lang.String
  ): IObjectVersionAndProperties
  def SetWorkflowStateTransitionEx(
    ObjVer: IObjVer,
    Workflow: scala.Double,
    StateTransition: scala.Double,
    VersionComment: java.lang.String,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties
}

object IVaultObjectPropertyOperations {
  @scala.inline
  def apply(
    ApproveOrRejectAssignment: (IObjVer, scala.Boolean) => IObjectVersionAndProperties,
    ApproveOrRejectAssignmentByUser: (IObjVer, scala.Boolean, scala.Double) => IObjectVersionAndProperties,
    CreatePropertiesFromFileInformation: IFileInformation => IPropertyValues,
    GenerateAutomaticPermissionsFromPropertyValues: IPropertyValues => IAccessControlList,
    GetProperties: (IObjVer, scala.Boolean) => IPropertyValues,
    GetPropertiesAsXML: (IObjVer, scala.Boolean) => java.lang.String,
    GetPropertiesForDisplay: (IObjVer, scala.Boolean) => IPropertyValuesForDisplay,
    GetPropertiesForMetadataSync: (IObjVer, mfilesLib.MFilesNs.MFMetadataSyncFormat) => INamedValues,
    GetPropertiesOfMultipleObjects: IObjVers => IPropertyValuesOfMultipleObjects,
    GetPropertiesWithIconClues: (IObjVer, scala.Boolean) => IPropertyValuesWithIconClues,
    GetPropertiesWithIconCluesOfMultipleObjects: IObjVers => IPropertyValuesWithIconCluesOfMultipleObjects,
    GetProperty: (IObjVer, scala.Double) => IPropertyValue,
    GetVersionComment: IObjVer => IVersionComment,
    GetVersionCommentHistory: IObjVer => IVersionComments,
    GetWorkflowState: (IObjVer, scala.Boolean) => IObjectVersionWorkflowState,
    MarkAssignmentComplete: IObjVer => IObjectVersionAndProperties,
    MarkAssignmentCompleteByUser: (IObjVer, scala.Double) => IObjectVersionAndProperties,
    RemoveProperty: (IObjVer, scala.Double) => IObjectVersionAndProperties,
    SetAllProperties: (IObjVer, scala.Boolean, IPropertyValues) => IObjectVersionAndProperties,
    SetAllPropertiesWithPermissions: (IObjVer, scala.Boolean, IPropertyValues, mfilesLib.MFilesNs.MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties,
    SetAllPropertiesWithPermissionsEx: (IObjVer, scala.Boolean, IPropertyValues, mfilesLib.MFilesNs.MFACLEnforcingMode, IAccessControlList, js.Any) => IObjectVersionAndProperties,
    SetCreationInfoAdmin: (IObjVer, scala.Boolean, ITypedValue, scala.Boolean, ITypedValue) => IObjectVersionAndProperties,
    SetLastModificationInfoAdmin: (IObjVer, scala.Boolean, ITypedValue, scala.Boolean, ITypedValue) => IObjectVersionAndProperties,
    SetProperties: (IObjVer, IPropertyValues) => IObjectVersionAndProperties,
    SetPropertiesOfMultipleObjects: ISetPropertiesParamsOfMultipleObjects => IObjectVersionAndPropertiesOfMultipleObjects,
    SetPropertiesWithPermissions: (IObjVer, IPropertyValues, mfilesLib.MFilesNs.MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties,
    SetPropertiesWithPermissionsEx: (IObjVer, IPropertyValues, mfilesLib.MFilesNs.MFACLEnforcingMode, IAccessControlList, js.Any) => IObjectVersionAndProperties,
    SetProperty: (IObjVer, IPropertyValue) => IObjectVersionAndProperties,
    SetVersionComment: (IObjVer, IPropertyValue) => IObjectVersionAndProperties,
    SetWorkflowState: (IObjVer, IObjectVersionWorkflowState) => IObjectVersionAndProperties,
    SetWorkflowStateEx: (IObjVer, IObjectVersionWorkflowState, js.Any) => IObjectVersionAndProperties,
    SetWorkflowStateTransition: (IObjVer, scala.Double, scala.Double, java.lang.String) => IObjectVersionAndProperties,
    SetWorkflowStateTransitionEx: (IObjVer, scala.Double, scala.Double, java.lang.String, js.Any) => IObjectVersionAndProperties
  ): IVaultObjectPropertyOperations = {
    val __obj = js.Dynamic.literal(ApproveOrRejectAssignment = js.Any.fromFunction2(ApproveOrRejectAssignment), ApproveOrRejectAssignmentByUser = js.Any.fromFunction3(ApproveOrRejectAssignmentByUser), CreatePropertiesFromFileInformation = js.Any.fromFunction1(CreatePropertiesFromFileInformation), GenerateAutomaticPermissionsFromPropertyValues = js.Any.fromFunction1(GenerateAutomaticPermissionsFromPropertyValues), GetProperties = js.Any.fromFunction2(GetProperties), GetPropertiesAsXML = js.Any.fromFunction2(GetPropertiesAsXML), GetPropertiesForDisplay = js.Any.fromFunction2(GetPropertiesForDisplay), GetPropertiesForMetadataSync = js.Any.fromFunction2(GetPropertiesForMetadataSync), GetPropertiesOfMultipleObjects = js.Any.fromFunction1(GetPropertiesOfMultipleObjects), GetPropertiesWithIconClues = js.Any.fromFunction2(GetPropertiesWithIconClues), GetPropertiesWithIconCluesOfMultipleObjects = js.Any.fromFunction1(GetPropertiesWithIconCluesOfMultipleObjects), GetProperty = js.Any.fromFunction2(GetProperty), GetVersionComment = js.Any.fromFunction1(GetVersionComment), GetVersionCommentHistory = js.Any.fromFunction1(GetVersionCommentHistory), GetWorkflowState = js.Any.fromFunction2(GetWorkflowState), MarkAssignmentComplete = js.Any.fromFunction1(MarkAssignmentComplete), MarkAssignmentCompleteByUser = js.Any.fromFunction2(MarkAssignmentCompleteByUser), RemoveProperty = js.Any.fromFunction2(RemoveProperty), SetAllProperties = js.Any.fromFunction3(SetAllProperties), SetAllPropertiesWithPermissions = js.Any.fromFunction5(SetAllPropertiesWithPermissions), SetAllPropertiesWithPermissionsEx = js.Any.fromFunction6(SetAllPropertiesWithPermissionsEx), SetCreationInfoAdmin = js.Any.fromFunction5(SetCreationInfoAdmin), SetLastModificationInfoAdmin = js.Any.fromFunction5(SetLastModificationInfoAdmin), SetProperties = js.Any.fromFunction2(SetProperties), SetPropertiesOfMultipleObjects = js.Any.fromFunction1(SetPropertiesOfMultipleObjects), SetPropertiesWithPermissions = js.Any.fromFunction4(SetPropertiesWithPermissions), SetPropertiesWithPermissionsEx = js.Any.fromFunction5(SetPropertiesWithPermissionsEx), SetProperty = js.Any.fromFunction2(SetProperty), SetVersionComment = js.Any.fromFunction2(SetVersionComment), SetWorkflowState = js.Any.fromFunction2(SetWorkflowState), SetWorkflowStateEx = js.Any.fromFunction3(SetWorkflowStateEx), SetWorkflowStateTransition = js.Any.fromFunction4(SetWorkflowStateTransition), SetWorkflowStateTransitionEx = js.Any.fromFunction5(SetWorkflowStateTransitionEx))
  
    __obj.asInstanceOf[IVaultObjectPropertyOperations]
  }
}

