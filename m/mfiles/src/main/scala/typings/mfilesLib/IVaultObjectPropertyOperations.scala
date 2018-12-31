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

