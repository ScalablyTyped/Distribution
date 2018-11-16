package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultObjectPropertyOperationsAsync extends js.Object {
  def ApproveOrRejectAssignment(ObjVer: IObjVer, Approve: scala.Boolean): scala.Unit = js.native
  def ApproveOrRejectAssignment(
    ObjVer: IObjVer,
    Approve: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def ApproveOrRejectAssignment(
    ObjVer: IObjVer,
    Approve: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ApproveOrRejectAssignment(
    ObjVer: IObjVer,
    Approve: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ApproveOrRejectAssignmentByUser(ObjVer: IObjVer, Approve: scala.Boolean, UserID: scala.Double): scala.Unit = js.native
  def ApproveOrRejectAssignmentByUser(
    ObjVer: IObjVer,
    Approve: scala.Boolean,
    UserID: scala.Double,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def ApproveOrRejectAssignmentByUser(
    ObjVer: IObjVer,
    Approve: scala.Boolean,
    UserID: scala.Double,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ApproveOrRejectAssignmentByUser(
    ObjVer: IObjVer,
    Approve: scala.Boolean,
    UserID: scala.Double,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CreatePropertiesFromFileInformation(FileInformation: IFileInformation): scala.Unit = js.native
  def CreatePropertiesFromFileInformation(
    FileInformation: IFileInformation,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit]
  ): scala.Unit = js.native
  def CreatePropertiesFromFileInformation(
    FileInformation: IFileInformation,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CreatePropertiesFromFileInformation(
    FileInformation: IFileInformation,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GenerateAutomaticPermissionsFromPropertyValues(PropertyValues: IPropertyValues): scala.Unit = js.native
  def GenerateAutomaticPermissionsFromPropertyValues(
    PropertyValues: IPropertyValues,
    successCallback: js.Function1[/* result */ IAccessControlList, scala.Unit]
  ): scala.Unit = js.native
  def GenerateAutomaticPermissionsFromPropertyValues(
    PropertyValues: IPropertyValues,
    successCallback: js.Function1[/* result */ IAccessControlList, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GenerateAutomaticPermissionsFromPropertyValues(
    PropertyValues: IPropertyValues,
    successCallback: js.Function1[/* result */ IAccessControlList, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetProperties(ObjVer: IObjVer, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def GetProperties(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit]
  ): scala.Unit = js.native
  def GetProperties(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetProperties(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetPropertiesAsXML(ObjVer: IObjVer, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def GetPropertiesAsXML(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def GetPropertiesAsXML(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetPropertiesAsXML(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetPropertiesForDisplay(ObjVer: IObjVer, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def GetPropertiesForDisplay(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IPropertyValuesForDisplay, scala.Unit]
  ): scala.Unit = js.native
  def GetPropertiesForDisplay(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IPropertyValuesForDisplay, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetPropertiesForDisplay(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IPropertyValuesForDisplay, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetPropertiesForMetadataSync(ObjVer: IObjVer, Format: mfilesLib.MFilesNs.MFMetadataSyncFormat): scala.Unit = js.native
  def GetPropertiesForMetadataSync(
    ObjVer: IObjVer,
    Format: mfilesLib.MFilesNs.MFMetadataSyncFormat,
    successCallback: js.Function1[/* result */ INamedValues, scala.Unit]
  ): scala.Unit = js.native
  def GetPropertiesForMetadataSync(
    ObjVer: IObjVer,
    Format: mfilesLib.MFilesNs.MFMetadataSyncFormat,
    successCallback: js.Function1[/* result */ INamedValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetPropertiesForMetadataSync(
    ObjVer: IObjVer,
    Format: mfilesLib.MFilesNs.MFMetadataSyncFormat,
    successCallback: js.Function1[/* result */ INamedValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetPropertiesOfMultipleObjects(ObjectVersions: IObjVers): scala.Unit = js.native
  def GetPropertiesOfMultipleObjects(
    ObjectVersions: IObjVers,
    successCallback: js.Function1[/* result */ IPropertyValuesOfMultipleObjects, scala.Unit]
  ): scala.Unit = js.native
  def GetPropertiesOfMultipleObjects(
    ObjectVersions: IObjVers,
    successCallback: js.Function1[/* result */ IPropertyValuesOfMultipleObjects, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetPropertiesOfMultipleObjects(
    ObjectVersions: IObjVers,
    successCallback: js.Function1[/* result */ IPropertyValuesOfMultipleObjects, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetPropertiesWithIconClues(ObjVer: IObjVer, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def GetPropertiesWithIconClues(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IPropertyValuesWithIconClues, scala.Unit]
  ): scala.Unit = js.native
  def GetPropertiesWithIconClues(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IPropertyValuesWithIconClues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetPropertiesWithIconClues(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IPropertyValuesWithIconClues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetPropertiesWithIconCluesOfMultipleObjects(ObjectVersions: IObjVers): scala.Unit = js.native
  def GetPropertiesWithIconCluesOfMultipleObjects(
    ObjectVersions: IObjVers,
    successCallback: js.Function1[/* result */ IPropertyValuesWithIconCluesOfMultipleObjects, scala.Unit]
  ): scala.Unit = js.native
  def GetPropertiesWithIconCluesOfMultipleObjects(
    ObjectVersions: IObjVers,
    successCallback: js.Function1[/* result */ IPropertyValuesWithIconCluesOfMultipleObjects, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetPropertiesWithIconCluesOfMultipleObjects(
    ObjectVersions: IObjVers,
    successCallback: js.Function1[/* result */ IPropertyValuesWithIconCluesOfMultipleObjects, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetProperty(ObjVer: IObjVer, Property: scala.Double): scala.Unit = js.native
  def GetProperty(
    ObjVer: IObjVer,
    Property: scala.Double,
    successCallback: js.Function1[/* result */ IPropertyValue, scala.Unit]
  ): scala.Unit = js.native
  def GetProperty(
    ObjVer: IObjVer,
    Property: scala.Double,
    successCallback: js.Function1[/* result */ IPropertyValue, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetProperty(
    ObjVer: IObjVer,
    Property: scala.Double,
    successCallback: js.Function1[/* result */ IPropertyValue, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetVersionComment(ObjVer: IObjVer): scala.Unit = js.native
  def GetVersionComment(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IVersionComment, scala.Unit]): scala.Unit = js.native
  def GetVersionComment(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IVersionComment, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetVersionComment(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IVersionComment, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetVersionCommentHistory(ObjVer: IObjVer): scala.Unit = js.native
  def GetVersionCommentHistory(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IVersionComments, scala.Unit]): scala.Unit = js.native
  def GetVersionCommentHistory(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IVersionComments, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetVersionCommentHistory(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IVersionComments, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowState(ObjVer: IObjVer, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def GetWorkflowState(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionWorkflowState, scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowState(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionWorkflowState, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowState(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionWorkflowState, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def MarkAssignmentComplete(ObjVer: IObjVer): scala.Unit = js.native
  def MarkAssignmentComplete(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def MarkAssignmentComplete(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def MarkAssignmentComplete(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def MarkAssignmentCompleteByUser(ObjVer: IObjVer, UserID: scala.Double): scala.Unit = js.native
  def MarkAssignmentCompleteByUser(
    ObjVer: IObjVer,
    UserID: scala.Double,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def MarkAssignmentCompleteByUser(
    ObjVer: IObjVer,
    UserID: scala.Double,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def MarkAssignmentCompleteByUser(
    ObjVer: IObjVer,
    UserID: scala.Double,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveProperty(ObjVer: IObjVer, Property: scala.Double): scala.Unit = js.native
  def RemoveProperty(
    ObjVer: IObjVer,
    Property: scala.Double,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def RemoveProperty(
    ObjVer: IObjVer,
    Property: scala.Double,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveProperty(
    ObjVer: IObjVer,
    Property: scala.Double,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetAllProperties(ObjVer: IObjVer, AllowModifyingCheckedInObject: scala.Boolean, PropertyValues: IPropertyValues): scala.Unit = js.native
  def SetAllProperties(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: IPropertyValues,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def SetAllProperties(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: IPropertyValues,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetAllProperties(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: IPropertyValues,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetAllPropertiesWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): scala.Unit = js.native
  def SetAllPropertiesWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def SetAllPropertiesWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetAllPropertiesWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetAllPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any
  ): scala.Unit = js.native
  def SetAllPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def SetAllPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetAllPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: scala.Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetCreationInfoAdmin(
    ObjVer: IObjVer,
    UpdateCreatedBy: scala.Boolean,
    CreatedBy: ITypedValue,
    UpdateCreated: scala.Boolean,
    CreatedUtc: ITypedValue
  ): scala.Unit = js.native
  def SetCreationInfoAdmin(
    ObjVer: IObjVer,
    UpdateCreatedBy: scala.Boolean,
    CreatedBy: ITypedValue,
    UpdateCreated: scala.Boolean,
    CreatedUtc: ITypedValue,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def SetCreationInfoAdmin(
    ObjVer: IObjVer,
    UpdateCreatedBy: scala.Boolean,
    CreatedBy: ITypedValue,
    UpdateCreated: scala.Boolean,
    CreatedUtc: ITypedValue,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetCreationInfoAdmin(
    ObjVer: IObjVer,
    UpdateCreatedBy: scala.Boolean,
    CreatedBy: ITypedValue,
    UpdateCreated: scala.Boolean,
    CreatedUtc: ITypedValue,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetLastModificationInfoAdmin(
    ObjVer: IObjVer,
    UpdateLastModifiedBy: scala.Boolean,
    LastModifiedBy: ITypedValue,
    UpdateLastModified: scala.Boolean,
    LastModifiedUtc: ITypedValue
  ): scala.Unit = js.native
  def SetLastModificationInfoAdmin(
    ObjVer: IObjVer,
    UpdateLastModifiedBy: scala.Boolean,
    LastModifiedBy: ITypedValue,
    UpdateLastModified: scala.Boolean,
    LastModifiedUtc: ITypedValue,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def SetLastModificationInfoAdmin(
    ObjVer: IObjVer,
    UpdateLastModifiedBy: scala.Boolean,
    LastModifiedBy: ITypedValue,
    UpdateLastModified: scala.Boolean,
    LastModifiedUtc: ITypedValue,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetLastModificationInfoAdmin(
    ObjVer: IObjVer,
    UpdateLastModifiedBy: scala.Boolean,
    LastModifiedBy: ITypedValue,
    UpdateLastModified: scala.Boolean,
    LastModifiedUtc: ITypedValue,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetProperties(ObjVer: IObjVer, PropertyValues: IPropertyValues): scala.Unit = js.native
  def SetProperties(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def SetProperties(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetProperties(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetPropertiesOfMultipleObjects(SetPropertiesParamsOfObjects: ISetPropertiesParamsOfMultipleObjects): scala.Unit = js.native
  def SetPropertiesOfMultipleObjects(
    SetPropertiesParamsOfObjects: ISetPropertiesParamsOfMultipleObjects,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, scala.Unit]
  ): scala.Unit = js.native
  def SetPropertiesOfMultipleObjects(
    SetPropertiesParamsOfObjects: ISetPropertiesParamsOfMultipleObjects,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetPropertiesOfMultipleObjects(
    SetPropertiesParamsOfObjects: ISetPropertiesParamsOfMultipleObjects,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetPropertiesWithPermissions(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): scala.Unit = js.native
  def SetPropertiesWithPermissions(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def SetPropertiesWithPermissions(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetPropertiesWithPermissions(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any
  ): scala.Unit = js.native
  def SetPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def SetPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: mfilesLib.MFilesNs.MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetProperty(ObjVer: IObjVer, PropertyValue: IPropertyValue): scala.Unit = js.native
  def SetProperty(
    ObjVer: IObjVer,
    PropertyValue: IPropertyValue,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def SetProperty(
    ObjVer: IObjVer,
    PropertyValue: IPropertyValue,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetProperty(
    ObjVer: IObjVer,
    PropertyValue: IPropertyValue,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetVersionComment(ObjVer: IObjVer, VersionComment: IPropertyValue): scala.Unit = js.native
  def SetVersionComment(
    ObjVer: IObjVer,
    VersionComment: IPropertyValue,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def SetVersionComment(
    ObjVer: IObjVer,
    VersionComment: IPropertyValue,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetVersionComment(
    ObjVer: IObjVer,
    VersionComment: IPropertyValue,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetWorkflowState(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState): scala.Unit = js.native
  def SetWorkflowState(
    ObjVer: IObjVer,
    WorkflowState: IObjectVersionWorkflowState,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def SetWorkflowState(
    ObjVer: IObjVer,
    WorkflowState: IObjectVersionWorkflowState,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetWorkflowState(
    ObjVer: IObjVer,
    WorkflowState: IObjectVersionWorkflowState,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetWorkflowStateEx(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState, ElectronicSignature: js.Any): scala.Unit = js.native
  def SetWorkflowStateEx(
    ObjVer: IObjVer,
    WorkflowState: IObjectVersionWorkflowState,
    ElectronicSignature: js.Any,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def SetWorkflowStateEx(
    ObjVer: IObjVer,
    WorkflowState: IObjectVersionWorkflowState,
    ElectronicSignature: js.Any,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetWorkflowStateEx(
    ObjVer: IObjVer,
    WorkflowState: IObjectVersionWorkflowState,
    ElectronicSignature: js.Any,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetWorkflowStateTransition(
    ObjVer: IObjVer,
    Workflow: scala.Double,
    lStateTransition: scala.Double,
    lVersionComment: java.lang.String
  ): scala.Unit = js.native
  def SetWorkflowStateTransition(
    ObjVer: IObjVer,
    Workflow: scala.Double,
    lStateTransition: scala.Double,
    lVersionComment: java.lang.String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def SetWorkflowStateTransition(
    ObjVer: IObjVer,
    Workflow: scala.Double,
    lStateTransition: scala.Double,
    lVersionComment: java.lang.String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetWorkflowStateTransition(
    ObjVer: IObjVer,
    Workflow: scala.Double,
    lStateTransition: scala.Double,
    lVersionComment: java.lang.String,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetWorkflowStateTransitionEx(
    ObjVer: IObjVer,
    Workflow: scala.Double,
    StateTransition: scala.Double,
    VersionComment: java.lang.String,
    ElectronicSignature: js.Any
  ): scala.Unit = js.native
  def SetWorkflowStateTransitionEx(
    ObjVer: IObjVer,
    Workflow: scala.Double,
    StateTransition: scala.Double,
    VersionComment: java.lang.String,
    ElectronicSignature: js.Any,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def SetWorkflowStateTransitionEx(
    ObjVer: IObjVer,
    Workflow: scala.Double,
    StateTransition: scala.Double,
    VersionComment: java.lang.String,
    ElectronicSignature: js.Any,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetWorkflowStateTransitionEx(
    ObjVer: IObjVer,
    Workflow: scala.Double,
    StateTransition: scala.Double,
    VersionComment: java.lang.String,
    ElectronicSignature: js.Any,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

