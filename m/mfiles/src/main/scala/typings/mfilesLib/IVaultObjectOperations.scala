package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultObjectOperations extends js.Object {
  def AddFavorite(ObjID: IObjID): IObjectVersionAndProperties = js.native
  def AddFavorites(ObjIDs: IObjIDs): IObjectVersionAndPropertiesOfMultipleObjects = js.native
  def ChangePermissionsToACL(ObjVer: IObjVer, AccessControlList: IAccessControlList, ChangeAllVersions: scala.Boolean): IObjectVersion = js.native
  def ChangePermissionsToNamedACL(ObjVer: IObjVer, NamedACL: scala.Double, ChangeAllVersions: scala.Boolean): IObjectVersion = js.native
  def CheckIn(ObjVer: IObjVer): IObjectVersion = js.native
  def CheckInMultipleObjects(ObjVers: IObjVers): IObjectVersions = js.native
  def CheckOut(ObjID: IObjID): IObjectVersion = js.native
  def CheckOutMultipleObjects(ObjIDs: IObjIDs): IObjectVersions = js.native
  def CreateNewAssignment(
    AssignmentName: java.lang.String,
    AssignmentDescription: java.lang.String,
    AssignedToUser: ITypedValue,
    Deadline: ITypedValue,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewEmptySingleFileDocument(
    PropertyValues: IPropertyValues,
    Title: java.lang.String,
    Extension: java.lang.String,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewObject(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewObject(
    ObjectType: scala.Double,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewObjectEx(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewObjectEx(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewObjectExQuick(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): scala.Double = js.native
  def CreateNewObjectExQuick(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): scala.Double = js.native
  def CreateNewSFDObject(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewSFDObject(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): scala.Double = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): scala.Double = js.native
  def DelayedCheckIn(ObjVer: IObjVer): scala.Unit = js.native
  def DeleteObject(ObjID: IObjID): IObjectVersion = js.native
  def DestroyObject(ObjID: IObjID, DestroyAllVersions: scala.Boolean, ObjectVersion: scala.Double): scala.Unit = js.native
  def DestroyObjects(ObjIDs: IObjIDs): scala.Unit = js.native
  def FollowObject(ObjID: IObjID, Follow: scala.Boolean): scala.Unit = js.native
  def ForceUndoCheckout(ObjVer: IObjVer): IObjectVersion = js.native
  def GetCollectionMembers(ObjVer: IObjVer): IObjectVersions = js.native
  def GetHistory(ObjID: IObjID): IObjectVersions = js.native
  def GetLatestObjVer(ObjID: IObjID, AllowCheckedOut: scala.Boolean, UpdateFromServer: scala.Boolean): IObjVer = js.native
  def GetLatestObjVerEx(
    ObjID: IObjID,
    AllowCheckedOut: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    NotifyViews: scala.Boolean
  ): IObjVer = js.native
  def GetLatestObjectVersionAndProperties(ObjID: IObjID, AllowCheckedOut: scala.Boolean, UpdateFromServer: scala.Boolean): IObjectVersionAndProperties = js.native
  def GetMFilesURLForObject(
    ObjID: IObjID,
    TargetVersion: scala.Double,
    SpecificVersion: scala.Boolean,
    URLType: mfilesLib.MFilesNs.MFilesURLType
  ): java.lang.String = js.native
  def GetMFilesURLForObjectOrFile(
    ObjID: IObjID,
    TargetVersion: scala.Double,
    SpecificVersion: scala.Boolean,
    File: scala.Double,
    URLType: mfilesLib.MFilesNs.MFilesURLType
  ): java.lang.String = js.native
  def GetObjIDByGUID(ObjectGUID: java.lang.String): IObjID = js.native
  def GetObjIDByOriginalObjID(OriginalVaultGUID: java.lang.String, OriginalObjID: IObjID): IObjID = js.native
  def GetObjectGUID(ObjID: IObjID): java.lang.String = js.native
  def GetObjectInfo(ObjVer: IObjVer, LatestVersion: scala.Boolean, UpdateFromServer: scala.Boolean): IObjectVersion = js.native
  def GetObjectInfoEx(
    ObjVer: IObjVer,
    LatestVersion: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    NotifyViews: scala.Boolean
  ): IObjectVersion = js.native
  def GetObjectLocationsInView(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    ObjectVersion: IObjVer
  ): IStrings = js.native
  def GetObjectLocationsInView(
    View: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    ObjectVersion: IObjVer
  ): IStrings = js.native
  def GetObjectPermissions(ObjVer: IObjVer): IObjectVersionPermissions = js.native
  def GetObjectVersionAndProperties(ObjVer: IObjVer, UpdateFromServer: scala.Boolean): IObjectVersionAndProperties = js.native
  def GetObjectVersionAndPropertiesOfMultipleObjects(
    ObjVers: IObjVers,
    LatestVersions: scala.Boolean,
    AllowCheckedOut: scala.Boolean,
    AllowMissingObjectVersions: scala.Boolean,
    UpdateFromServer: scala.Boolean
  ): IObjectVersionAndPropertiesOfMultipleObjects = js.native
  def GetOfflineAvailability(ObjID: IObjID): scala.Boolean = js.native
  def GetOfflineObjIDs(): IObjIDs = js.native
  def GetRelationships(ObjVer: IObjVer, Mode: mfilesLib.MFilesNs.MFRelationshipsMode): IObjectVersions = js.native
  def GetThumbnailAsBytes(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Width: scala.Double,
    Height: scala.Double,
    GetFileIconThumbnailIfRealThumbnailNotAvailable: scala.Boolean
  ): js.Array[scala.Double] = js.native
  def IsObjectCheckedOut(ObjID: IObjID, UpdateFromServer: scala.Boolean): scala.Boolean = js.native
  def IsObjectCheckedOutToThisUserOnThisComputer(ObjID: IObjID, UpdateFromServer: scala.Boolean): scala.Boolean = js.native
  def IsObjectFollowed(ObjID: IObjID): scala.Boolean = js.native
  def IsSingleFileObject(ObjVer: IObjVer): scala.Boolean = js.native
  def MatchesSearchConditions(pIObjVer: IObjVer, pISearchConditions: ISearchConditions): scala.Boolean = js.native
  def MatchesSearchConditionsEx(
    pIObjectVersion: IObjectVersion,
    pISearchConditions: ISearchConditions,
    pIPropertyValues: IPropertyValues,
    pIObjectVersionAndPropertiesOfMultipleObjects: IObjectVersionAndPropertiesOfMultipleObjects
  ): scala.Boolean = js.native
  def NotifyObjectAccess(ObjID: IObjID): IObjectVersionAndProperties = js.native
  def ProposeCheckOutForFile(ParentWindow: scala.Double, ObjVersionFile: IObjectFileAndVersion, CanCancel: scala.Boolean): scala.Boolean = js.native
  def RejectCheckInReminder(ObjVer: IObjVer): scala.Unit = js.native
  def RemoveFavorite(ObjID: IObjID): IObjectVersionAndProperties = js.native
  def RemoveFavorites(ObjIDs: IObjIDs): IObjectVersionAndPropertiesOfMultipleObjects = js.native
  def ResolveConflict(ParticipantObjID: IObjID, KeepThis: scala.Boolean): IObjectVersions = js.native
  def Rollback(ObjID: IObjID, RollbackToVersion: scala.Double): IObjectVersion = js.native
  def SetExternalID(ObjID: IObjID, ExtID: java.lang.String): scala.Unit = js.native
  def SetObjectGUID(ObjID: IObjID, ObjectGUID: java.lang.String): scala.Unit = js.native
  def SetOfflineAvailability(ObjID: IObjID, AvailableInOfflineMode: scala.Boolean): scala.Unit = js.native
  def SetSingleFileObject(ObjVer: IObjVer, SingleFile: scala.Boolean): scala.Unit = js.native
  def ShowBasicEditObjectWindow(ParentWindow: scala.Double, ObjVer: IObjVer): IObjectWindowResult = js.native
  def ShowBasicNewObjectWindow(ParentWindow: scala.Double, ObjectType: IObjectType): IObjectWindowResult = js.native
  def ShowChangeStateDialogModal(ParentWindow: scala.Double, ObjectID: IObjID): scala.Unit = js.native
  def ShowCheckInReminder(ParentWindow: scala.Double, ObjVer: IObjVer, Asynchronous: scala.Boolean): IObjectVersion = js.native
  def ShowCheckInReminderDialogModal(ParentWindow: scala.Double, ObjVer: IObjVer, ApplyEnvironmentConditions: scala.Boolean): scala.Boolean = js.native
  def ShowCheckoutPrompt(
    ParentWindow: scala.Double,
    Message: java.lang.String,
    ObjID: IObjID,
    ShowCancel: scala.Boolean,
    AutoRejectConsequentPrompts: scala.Boolean
  ): IObjectVersion = js.native
  def ShowCollectionMembersDialog(ParentWindow: scala.Double, ObjectVersion: IObjVer, Modeless: scala.Boolean): scala.Unit = js.native
  def ShowCommentsDialogModal(ParentWindow: scala.Double, ObjectID: IObjID): scala.Unit = js.native
  def ShowEditObjectWindow(ParentWindow: scala.Double, Mode: mfilesLib.MFilesNs.MFObjectWindowMode, ObjVer: IObjVer): IObjectWindowResult = js.native
  def ShowHistoryDialogModal(ParentWindow: scala.Double, ObjectID: IObjID): scala.Unit = js.native
  def ShowNewObjectWindow(
    ParentWindow: scala.Double,
    Mode: mfilesLib.MFilesNs.MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo
  ): IObjectWindowResult = js.native
  def ShowPrefilledNewObjectWindow(
    ParentWindow: scala.Double,
    Mode: mfilesLib.MFilesNs.MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    PrefilledPropertyValues: IPropertyValues,
    AccessControlList: IAccessControlList
  ): IObjectWindowResult = js.native
  def ShowRelatedObjects(
    ParentWindow: scala.Double,
    SourceObject: IObjID,
    ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing,
    ViewSelectionDialogInfoText: java.lang.String
  ): scala.Unit = js.native
  def ShowRelationshipsDialog(ParentWindow: scala.Double, ObjectVersion: IObjVer, Modeless: scala.Boolean): scala.Unit = js.native
  def ShowSelectObjectHistoryDialogModal(ParentWindow: scala.Double, ObjectID: IObjID, WindowTitle: java.lang.String): IObjOrFileVer = js.native
  def ShowSubObjectsDialogModal(ParentWindow: scala.Double, ObjectVersion: IObjVer): scala.Unit = js.native
  def UndeleteObject(ObjID: IObjID): IObjectVersion = js.native
  def UndoCheckout(ObjVer: IObjVer): IObjectVersion = js.native
  def UndoCheckoutMultipleObjects(ObjVers: IObjVers): IObjectVersions = js.native
}

