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
    ApproveOrRejectAssignment: js.Function2[IObjVer, scala.Boolean, IObjectVersionAndProperties],
    ApproveOrRejectAssignmentByUser: js.Function3[IObjVer, scala.Boolean, scala.Double, IObjectVersionAndProperties],
    CreatePropertiesFromFileInformation: js.Function1[IFileInformation, IPropertyValues],
    GenerateAutomaticPermissionsFromPropertyValues: js.Function1[IPropertyValues, IAccessControlList],
    GetProperties: js.Function2[IObjVer, scala.Boolean, IPropertyValues],
    GetPropertiesAsXML: js.Function2[IObjVer, scala.Boolean, java.lang.String],
    GetPropertiesForDisplay: js.Function2[IObjVer, scala.Boolean, IPropertyValuesForDisplay],
    GetPropertiesForMetadataSync: js.Function2[IObjVer, mfilesLib.MFilesNs.MFMetadataSyncFormat, INamedValues],
    GetPropertiesOfMultipleObjects: js.Function1[IObjVers, IPropertyValuesOfMultipleObjects],
    GetPropertiesWithIconClues: js.Function2[IObjVer, scala.Boolean, IPropertyValuesWithIconClues],
    GetPropertiesWithIconCluesOfMultipleObjects: js.Function1[IObjVers, IPropertyValuesWithIconCluesOfMultipleObjects],
    GetProperty: js.Function2[IObjVer, scala.Double, IPropertyValue],
    GetVersionComment: js.Function1[IObjVer, IVersionComment],
    GetVersionCommentHistory: js.Function1[IObjVer, IVersionComments],
    GetWorkflowState: js.Function2[IObjVer, scala.Boolean, IObjectVersionWorkflowState],
    MarkAssignmentComplete: js.Function1[IObjVer, IObjectVersionAndProperties],
    MarkAssignmentCompleteByUser: js.Function2[IObjVer, scala.Double, IObjectVersionAndProperties],
    RemoveProperty: js.Function2[IObjVer, scala.Double, IObjectVersionAndProperties],
    SetAllProperties: js.Function3[IObjVer, scala.Boolean, IPropertyValues, IObjectVersionAndProperties],
    SetAllPropertiesWithPermissions: js.Function5[
      IObjVer, 
      scala.Boolean, 
      IPropertyValues, 
      mfilesLib.MFilesNs.MFACLEnforcingMode, 
      IAccessControlList, 
      IObjectVersionAndProperties
    ],
    SetAllPropertiesWithPermissionsEx: js.Function6[
      IObjVer, 
      scala.Boolean, 
      IPropertyValues, 
      mfilesLib.MFilesNs.MFACLEnforcingMode, 
      IAccessControlList, 
      js.Any, 
      IObjectVersionAndProperties
    ],
    SetCreationInfoAdmin: js.Function5[
      IObjVer, 
      scala.Boolean, 
      ITypedValue, 
      scala.Boolean, 
      ITypedValue, 
      IObjectVersionAndProperties
    ],
    SetLastModificationInfoAdmin: js.Function5[
      IObjVer, 
      scala.Boolean, 
      ITypedValue, 
      scala.Boolean, 
      ITypedValue, 
      IObjectVersionAndProperties
    ],
    SetProperties: js.Function2[IObjVer, IPropertyValues, IObjectVersionAndProperties],
    SetPropertiesOfMultipleObjects: js.Function1[
      ISetPropertiesParamsOfMultipleObjects, 
      IObjectVersionAndPropertiesOfMultipleObjects
    ],
    SetPropertiesWithPermissions: js.Function4[
      IObjVer, 
      IPropertyValues, 
      mfilesLib.MFilesNs.MFACLEnforcingMode, 
      IAccessControlList, 
      IObjectVersionAndProperties
    ],
    SetPropertiesWithPermissionsEx: js.Function5[
      IObjVer, 
      IPropertyValues, 
      mfilesLib.MFilesNs.MFACLEnforcingMode, 
      IAccessControlList, 
      js.Any, 
      IObjectVersionAndProperties
    ],
    SetProperty: js.Function2[IObjVer, IPropertyValue, IObjectVersionAndProperties],
    SetVersionComment: js.Function2[IObjVer, IPropertyValue, IObjectVersionAndProperties],
    SetWorkflowState: js.Function2[IObjVer, IObjectVersionWorkflowState, IObjectVersionAndProperties],
    SetWorkflowStateEx: js.Function3[IObjVer, IObjectVersionWorkflowState, js.Any, IObjectVersionAndProperties],
    SetWorkflowStateTransition: js.Function4[IObjVer, scala.Double, scala.Double, java.lang.String, IObjectVersionAndProperties],
    SetWorkflowStateTransitionEx: js.Function5[IObjVer, scala.Double, scala.Double, java.lang.String, js.Any, IObjectVersionAndProperties]
  ): IVaultObjectPropertyOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ApproveOrRejectAssignment")(ApproveOrRejectAssignment)
    __obj.updateDynamic("ApproveOrRejectAssignmentByUser")(ApproveOrRejectAssignmentByUser)
    __obj.updateDynamic("CreatePropertiesFromFileInformation")(CreatePropertiesFromFileInformation)
    __obj.updateDynamic("GenerateAutomaticPermissionsFromPropertyValues")(GenerateAutomaticPermissionsFromPropertyValues)
    __obj.updateDynamic("GetProperties")(GetProperties)
    __obj.updateDynamic("GetPropertiesAsXML")(GetPropertiesAsXML)
    __obj.updateDynamic("GetPropertiesForDisplay")(GetPropertiesForDisplay)
    __obj.updateDynamic("GetPropertiesForMetadataSync")(GetPropertiesForMetadataSync)
    __obj.updateDynamic("GetPropertiesOfMultipleObjects")(GetPropertiesOfMultipleObjects)
    __obj.updateDynamic("GetPropertiesWithIconClues")(GetPropertiesWithIconClues)
    __obj.updateDynamic("GetPropertiesWithIconCluesOfMultipleObjects")(GetPropertiesWithIconCluesOfMultipleObjects)
    __obj.updateDynamic("GetProperty")(GetProperty)
    __obj.updateDynamic("GetVersionComment")(GetVersionComment)
    __obj.updateDynamic("GetVersionCommentHistory")(GetVersionCommentHistory)
    __obj.updateDynamic("GetWorkflowState")(GetWorkflowState)
    __obj.updateDynamic("MarkAssignmentComplete")(MarkAssignmentComplete)
    __obj.updateDynamic("MarkAssignmentCompleteByUser")(MarkAssignmentCompleteByUser)
    __obj.updateDynamic("RemoveProperty")(RemoveProperty)
    __obj.updateDynamic("SetAllProperties")(SetAllProperties)
    __obj.updateDynamic("SetAllPropertiesWithPermissions")(SetAllPropertiesWithPermissions)
    __obj.updateDynamic("SetAllPropertiesWithPermissionsEx")(SetAllPropertiesWithPermissionsEx)
    __obj.updateDynamic("SetCreationInfoAdmin")(SetCreationInfoAdmin)
    __obj.updateDynamic("SetLastModificationInfoAdmin")(SetLastModificationInfoAdmin)
    __obj.updateDynamic("SetProperties")(SetProperties)
    __obj.updateDynamic("SetPropertiesOfMultipleObjects")(SetPropertiesOfMultipleObjects)
    __obj.updateDynamic("SetPropertiesWithPermissions")(SetPropertiesWithPermissions)
    __obj.updateDynamic("SetPropertiesWithPermissionsEx")(SetPropertiesWithPermissionsEx)
    __obj.updateDynamic("SetProperty")(SetProperty)
    __obj.updateDynamic("SetVersionComment")(SetVersionComment)
    __obj.updateDynamic("SetWorkflowState")(SetWorkflowState)
    __obj.updateDynamic("SetWorkflowStateEx")(SetWorkflowStateEx)
    __obj.updateDynamic("SetWorkflowStateTransition")(SetWorkflowStateTransition)
    __obj.updateDynamic("SetWorkflowStateTransitionEx")(SetWorkflowStateTransitionEx)
    __obj.asInstanceOf[IVaultObjectPropertyOperations]
  }
}

