package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultObjectPropertyOperations")
@js.native
class VaultObjectPropertyOperations ()
  extends mfilesLib.IVaultObjectPropertyOperations {
  /* CompleteClass */
  override def ApproveOrRejectAssignment(ObjVer: mfilesLib.IObjVer, Approve: scala.Boolean): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def ApproveOrRejectAssignmentByUser(ObjVer: mfilesLib.IObjVer, Approve: scala.Boolean, UserID: scala.Double): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def CreatePropertiesFromFileInformation(FileInformation: mfilesLib.IFileInformation): mfilesLib.IPropertyValues = js.native
  /* CompleteClass */
  override def GenerateAutomaticPermissionsFromPropertyValues(PropertyValues: mfilesLib.IPropertyValues): mfilesLib.IAccessControlList = js.native
  /* CompleteClass */
  override def GetProperties(ObjVer: mfilesLib.IObjVer, UpdateFromServer: scala.Boolean): mfilesLib.IPropertyValues = js.native
  /* CompleteClass */
  override def GetPropertiesAsXML(ObjVer: mfilesLib.IObjVer, UpdateFromServer: scala.Boolean): java.lang.String = js.native
  /* CompleteClass */
  override def GetPropertiesForDisplay(ObjVer: mfilesLib.IObjVer, UpdateFromServer: scala.Boolean): mfilesLib.IPropertyValuesForDisplay = js.native
  /* CompleteClass */
  override def GetPropertiesForMetadataSync(ObjVer: mfilesLib.IObjVer, Format: MFMetadataSyncFormat): mfilesLib.INamedValues = js.native
  /* CompleteClass */
  override def GetPropertiesOfMultipleObjects(ObjectVersions: mfilesLib.IObjVers): mfilesLib.IPropertyValuesOfMultipleObjects = js.native
  /* CompleteClass */
  override def GetPropertiesWithIconClues(ObjVer: mfilesLib.IObjVer, UpdateFromServer: scala.Boolean): mfilesLib.IPropertyValuesWithIconClues = js.native
  /* CompleteClass */
  override def GetPropertiesWithIconCluesOfMultipleObjects(ObjectVersions: mfilesLib.IObjVers): mfilesLib.IPropertyValuesWithIconCluesOfMultipleObjects = js.native
  /* CompleteClass */
  override def GetProperty(ObjVer: mfilesLib.IObjVer, Property: scala.Double): mfilesLib.IPropertyValue = js.native
  /* CompleteClass */
  override def GetVersionComment(ObjVer: mfilesLib.IObjVer): mfilesLib.IVersionComment = js.native
  /* CompleteClass */
  override def GetVersionCommentHistory(ObjVer: mfilesLib.IObjVer): mfilesLib.IVersionComments = js.native
  /* CompleteClass */
  override def GetWorkflowState(ObjVer: mfilesLib.IObjVer, UpdateFromServer: scala.Boolean): mfilesLib.IObjectVersionWorkflowState = js.native
  /* CompleteClass */
  override def MarkAssignmentComplete(ObjVer: mfilesLib.IObjVer): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def MarkAssignmentCompleteByUser(ObjVer: mfilesLib.IObjVer, UserID: scala.Double): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def RemoveProperty(ObjVer: mfilesLib.IObjVer, Property: scala.Double): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetAllProperties(
    ObjVer: mfilesLib.IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: mfilesLib.IPropertyValues
  ): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetAllPropertiesWithPermissions(
    ObjVer: mfilesLib.IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: mfilesLib.IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: mfilesLib.IAccessControlList
  ): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetAllPropertiesWithPermissionsEx(
    ObjVer: mfilesLib.IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: mfilesLib.IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: mfilesLib.IAccessControlList,
    ElectronicSignature: js.Any
  ): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetCreationInfoAdmin(
    ObjVer: mfilesLib.IObjVer,
    UpdateCreatedBy: scala.Boolean,
    CreatedBy: mfilesLib.ITypedValue,
    UpdateCreated: scala.Boolean,
    CreatedUtc: mfilesLib.ITypedValue
  ): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetLastModificationInfoAdmin(
    ObjVer: mfilesLib.IObjVer,
    UpdateLastModifiedBy: scala.Boolean,
    LastModifiedBy: mfilesLib.ITypedValue,
    UpdateLastModified: scala.Boolean,
    LastModifiedUtc: mfilesLib.ITypedValue
  ): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetProperties(ObjVer: mfilesLib.IObjVer, PropertyValues: mfilesLib.IPropertyValues): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetPropertiesOfMultipleObjects(SetPropertiesParamsOfObjects: mfilesLib.ISetPropertiesParamsOfMultipleObjects): mfilesLib.IObjectVersionAndPropertiesOfMultipleObjects = js.native
  /* CompleteClass */
  override def SetPropertiesWithPermissions(
    ObjVer: mfilesLib.IObjVer,
    PropertyValues: mfilesLib.IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: mfilesLib.IAccessControlList
  ): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetPropertiesWithPermissionsEx(
    ObjVer: mfilesLib.IObjVer,
    PropertyValues: mfilesLib.IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: mfilesLib.IAccessControlList,
    ElectronicSignature: js.Any
  ): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetProperty(ObjVer: mfilesLib.IObjVer, PropertyValue: mfilesLib.IPropertyValue): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetVersionComment(ObjVer: mfilesLib.IObjVer, VersionComment: mfilesLib.IPropertyValue): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetWorkflowState(ObjVer: mfilesLib.IObjVer, WorkflowState: mfilesLib.IObjectVersionWorkflowState): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetWorkflowStateEx(
    ObjVer: mfilesLib.IObjVer,
    WorkflowState: mfilesLib.IObjectVersionWorkflowState,
    ElectronicSignature: js.Any
  ): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetWorkflowStateTransition(
    ObjVer: mfilesLib.IObjVer,
    Workflow: scala.Double,
    lStateTransition: scala.Double,
    lVersionComment: java.lang.String
  ): mfilesLib.IObjectVersionAndProperties = js.native
  /* CompleteClass */
  override def SetWorkflowStateTransitionEx(
    ObjVer: mfilesLib.IObjVer,
    Workflow: scala.Double,
    StateTransition: scala.Double,
    VersionComment: java.lang.String,
    ElectronicSignature: js.Any
  ): mfilesLib.IObjectVersionAndProperties = js.native
}

