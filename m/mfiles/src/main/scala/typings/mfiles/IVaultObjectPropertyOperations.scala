package typings.mfiles

import typings.mfiles.MFiles.MFACLEnforcingMode
import typings.mfiles.MFiles.MFMetadataSyncFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultObjectPropertyOperations extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: IVaultObjectPropertyOperations](x: Self) {
    
    inline def setApproveOrRejectAssignment(value: (IObjVer, Boolean) => IObjectVersionAndProperties): Self = StObject.set(x, "ApproveOrRejectAssignment", js.Any.fromFunction2(value))
    
    inline def setApproveOrRejectAssignmentByUser(value: (IObjVer, Boolean, Double) => IObjectVersionAndProperties): Self = StObject.set(x, "ApproveOrRejectAssignmentByUser", js.Any.fromFunction3(value))
    
    inline def setCreatePropertiesFromFileInformation(value: IFileInformation => IPropertyValues): Self = StObject.set(x, "CreatePropertiesFromFileInformation", js.Any.fromFunction1(value))
    
    inline def setGenerateAutomaticPermissionsFromPropertyValues(value: IPropertyValues => IAccessControlList): Self = StObject.set(x, "GenerateAutomaticPermissionsFromPropertyValues", js.Any.fromFunction1(value))
    
    inline def setGetProperties(value: (IObjVer, Boolean) => IPropertyValues): Self = StObject.set(x, "GetProperties", js.Any.fromFunction2(value))
    
    inline def setGetPropertiesAsXML(value: (IObjVer, Boolean) => String): Self = StObject.set(x, "GetPropertiesAsXML", js.Any.fromFunction2(value))
    
    inline def setGetPropertiesForDisplay(value: (IObjVer, Boolean) => IPropertyValuesForDisplay): Self = StObject.set(x, "GetPropertiesForDisplay", js.Any.fromFunction2(value))
    
    inline def setGetPropertiesForMetadataSync(value: (IObjVer, MFMetadataSyncFormat) => INamedValues): Self = StObject.set(x, "GetPropertiesForMetadataSync", js.Any.fromFunction2(value))
    
    inline def setGetPropertiesOfMultipleObjects(value: IObjVers => IPropertyValuesOfMultipleObjects): Self = StObject.set(x, "GetPropertiesOfMultipleObjects", js.Any.fromFunction1(value))
    
    inline def setGetPropertiesWithIconClues(value: (IObjVer, Boolean) => IPropertyValuesWithIconClues): Self = StObject.set(x, "GetPropertiesWithIconClues", js.Any.fromFunction2(value))
    
    inline def setGetPropertiesWithIconCluesOfMultipleObjects(value: IObjVers => IPropertyValuesWithIconCluesOfMultipleObjects): Self = StObject.set(x, "GetPropertiesWithIconCluesOfMultipleObjects", js.Any.fromFunction1(value))
    
    inline def setGetProperty(value: (IObjVer, Double) => IPropertyValue): Self = StObject.set(x, "GetProperty", js.Any.fromFunction2(value))
    
    inline def setGetVersionComment(value: IObjVer => IVersionComment): Self = StObject.set(x, "GetVersionComment", js.Any.fromFunction1(value))
    
    inline def setGetVersionCommentHistory(value: IObjVer => IVersionComments): Self = StObject.set(x, "GetVersionCommentHistory", js.Any.fromFunction1(value))
    
    inline def setGetWorkflowState(value: (IObjVer, Boolean) => IObjectVersionWorkflowState): Self = StObject.set(x, "GetWorkflowState", js.Any.fromFunction2(value))
    
    inline def setMarkAssignmentComplete(value: IObjVer => IObjectVersionAndProperties): Self = StObject.set(x, "MarkAssignmentComplete", js.Any.fromFunction1(value))
    
    inline def setMarkAssignmentCompleteByUser(value: (IObjVer, Double) => IObjectVersionAndProperties): Self = StObject.set(x, "MarkAssignmentCompleteByUser", js.Any.fromFunction2(value))
    
    inline def setRemoveProperty(value: (IObjVer, Double) => IObjectVersionAndProperties): Self = StObject.set(x, "RemoveProperty", js.Any.fromFunction2(value))
    
    inline def setSetAllProperties(value: (IObjVer, Boolean, IPropertyValues) => IObjectVersionAndProperties): Self = StObject.set(x, "SetAllProperties", js.Any.fromFunction3(value))
    
    inline def setSetAllPropertiesWithPermissions(
      value: (IObjVer, Boolean, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties
    ): Self = StObject.set(x, "SetAllPropertiesWithPermissions", js.Any.fromFunction5(value))
    
    inline def setSetAllPropertiesWithPermissionsEx(
      value: (IObjVer, Boolean, IPropertyValues, MFACLEnforcingMode, IAccessControlList, js.Any) => IObjectVersionAndProperties
    ): Self = StObject.set(x, "SetAllPropertiesWithPermissionsEx", js.Any.fromFunction6(value))
    
    inline def setSetCreationInfoAdmin(value: (IObjVer, Boolean, ITypedValue, Boolean, ITypedValue) => IObjectVersionAndProperties): Self = StObject.set(x, "SetCreationInfoAdmin", js.Any.fromFunction5(value))
    
    inline def setSetLastModificationInfoAdmin(value: (IObjVer, Boolean, ITypedValue, Boolean, ITypedValue) => IObjectVersionAndProperties): Self = StObject.set(x, "SetLastModificationInfoAdmin", js.Any.fromFunction5(value))
    
    inline def setSetProperties(value: (IObjVer, IPropertyValues) => IObjectVersionAndProperties): Self = StObject.set(x, "SetProperties", js.Any.fromFunction2(value))
    
    inline def setSetPropertiesOfMultipleObjects(value: ISetPropertiesParamsOfMultipleObjects => IObjectVersionAndPropertiesOfMultipleObjects): Self = StObject.set(x, "SetPropertiesOfMultipleObjects", js.Any.fromFunction1(value))
    
    inline def setSetPropertiesWithPermissions(
      value: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties
    ): Self = StObject.set(x, "SetPropertiesWithPermissions", js.Any.fromFunction4(value))
    
    inline def setSetPropertiesWithPermissionsEx(
      value: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList, js.Any) => IObjectVersionAndProperties
    ): Self = StObject.set(x, "SetPropertiesWithPermissionsEx", js.Any.fromFunction5(value))
    
    inline def setSetProperty(value: (IObjVer, IPropertyValue) => IObjectVersionAndProperties): Self = StObject.set(x, "SetProperty", js.Any.fromFunction2(value))
    
    inline def setSetVersionComment(value: (IObjVer, IPropertyValue) => IObjectVersionAndProperties): Self = StObject.set(x, "SetVersionComment", js.Any.fromFunction2(value))
    
    inline def setSetWorkflowState(value: (IObjVer, IObjectVersionWorkflowState) => IObjectVersionAndProperties): Self = StObject.set(x, "SetWorkflowState", js.Any.fromFunction2(value))
    
    inline def setSetWorkflowStateEx(value: (IObjVer, IObjectVersionWorkflowState, js.Any) => IObjectVersionAndProperties): Self = StObject.set(x, "SetWorkflowStateEx", js.Any.fromFunction3(value))
    
    inline def setSetWorkflowStateTransition(value: (IObjVer, Double, Double, String) => IObjectVersionAndProperties): Self = StObject.set(x, "SetWorkflowStateTransition", js.Any.fromFunction4(value))
    
    inline def setSetWorkflowStateTransitionEx(value: (IObjVer, Double, Double, String, js.Any) => IObjectVersionAndProperties): Self = StObject.set(x, "SetWorkflowStateTransitionEx", js.Any.fromFunction5(value))
  }
}
