package typings.mfiles

import typings.mfiles.MFilesNs.MFBuiltInObjectType
import typings.mfiles.MFilesNs.MFBuiltInView
import typings.mfiles.MFilesNs.MFLatestSpecificBehavior
import typings.mfiles.MFilesNs.MFObjectWindowMode
import typings.mfiles.MFilesNs.MFRelationshipsMode
import typings.mfiles.MFilesNs.MFilesURLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultObjectOperations extends js.Object {
  def AddFavorite(ObjID: IObjID): IObjectVersionAndProperties = js.native
  def AddFavorites(ObjIDs: IObjIDs): IObjectVersionAndPropertiesOfMultipleObjects = js.native
  def ChangePermissionsToACL(ObjVer: IObjVer, AccessControlList: IAccessControlList, ChangeAllVersions: Boolean): IObjectVersion = js.native
  def ChangePermissionsToNamedACL(ObjVer: IObjVer, NamedACL: Double, ChangeAllVersions: Boolean): IObjectVersion = js.native
  def CheckIn(ObjVer: IObjVer): IObjectVersion = js.native
  def CheckInMultipleObjects(ObjVers: IObjVers): IObjectVersions = js.native
  def CheckOut(ObjID: IObjID): IObjectVersion = js.native
  def CheckOutMultipleObjects(ObjIDs: IObjIDs): IObjectVersions = js.native
  def CreateNewAssignment(
    AssignmentName: String,
    AssignmentDescription: String,
    AssignedToUser: ITypedValue,
    Deadline: ITypedValue,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewEmptySingleFileDocument(
    PropertyValues: IPropertyValues,
    Title: String,
    Extension: String,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewObject(
    ObjectType: Double,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewObject(
    ObjectType: MFBuiltInObjectType,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewObjectEx(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewObjectEx(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewObjectExQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): Double = js.native
  def CreateNewObjectExQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): Double = js.native
  def CreateNewSFDObject(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewSFDObject(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): Double = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): Double = js.native
  def DelayedCheckIn(ObjVer: IObjVer): Unit = js.native
  def DeleteObject(ObjID: IObjID): IObjectVersion = js.native
  def DestroyObject(ObjID: IObjID, DestroyAllVersions: Boolean, ObjectVersion: Double): Unit = js.native
  def DestroyObjects(ObjIDs: IObjIDs): Unit = js.native
  def FollowObject(ObjID: IObjID, Follow: Boolean): Unit = js.native
  def ForceUndoCheckout(ObjVer: IObjVer): IObjectVersion = js.native
  def GetCollectionMembers(ObjVer: IObjVer): IObjectVersions = js.native
  def GetHistory(ObjID: IObjID): IObjectVersions = js.native
  def GetLatestObjVer(ObjID: IObjID, AllowCheckedOut: Boolean, UpdateFromServer: Boolean): IObjVer = js.native
  def GetLatestObjVerEx(ObjID: IObjID, AllowCheckedOut: Boolean, UpdateFromServer: Boolean, NotifyViews: Boolean): IObjVer = js.native
  def GetLatestObjectVersionAndProperties(ObjID: IObjID, AllowCheckedOut: Boolean, UpdateFromServer: Boolean): IObjectVersionAndProperties = js.native
  def GetMFilesURLForObject(ObjID: IObjID, TargetVersion: Double, SpecificVersion: Boolean, URLType: MFilesURLType): String = js.native
  def GetMFilesURLForObjectOrFile(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    File: Double,
    URLType: MFilesURLType
  ): String = js.native
  def GetObjIDByGUID(ObjectGUID: String): IObjID = js.native
  def GetObjIDByOriginalObjID(OriginalVaultGUID: String, OriginalObjID: IObjID): IObjID = js.native
  def GetObjectGUID(ObjID: IObjID): String = js.native
  def GetObjectInfo(ObjVer: IObjVer, LatestVersion: Boolean, UpdateFromServer: Boolean): IObjectVersion = js.native
  def GetObjectInfoEx(ObjVer: IObjVer, LatestVersion: Boolean, UpdateFromServer: Boolean, NotifyViews: Boolean): IObjectVersion = js.native
  def GetObjectLocationsInView(View: Double, LatestSpecificBehavior: MFLatestSpecificBehavior, ObjectVersion: IObjVer): IStrings = js.native
  def GetObjectLocationsInView(View: MFBuiltInView, LatestSpecificBehavior: MFLatestSpecificBehavior, ObjectVersion: IObjVer): IStrings = js.native
  def GetObjectPermissions(ObjVer: IObjVer): IObjectVersionPermissions = js.native
  def GetObjectVersionAndProperties(ObjVer: IObjVer, UpdateFromServer: Boolean): IObjectVersionAndProperties = js.native
  def GetObjectVersionAndPropertiesOfMultipleObjects(
    ObjVers: IObjVers,
    LatestVersions: Boolean,
    AllowCheckedOut: Boolean,
    AllowMissingObjectVersions: Boolean,
    UpdateFromServer: Boolean
  ): IObjectVersionAndPropertiesOfMultipleObjects = js.native
  def GetOfflineAvailability(ObjID: IObjID): Boolean = js.native
  def GetOfflineObjIDs(): IObjIDs = js.native
  def GetRelationships(ObjVer: IObjVer, Mode: MFRelationshipsMode): IObjectVersions = js.native
  def GetThumbnailAsBytes(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Width: Double,
    Height: Double,
    GetFileIconThumbnailIfRealThumbnailNotAvailable: Boolean
  ): js.Array[Double] = js.native
  def IsObjectCheckedOut(ObjID: IObjID, UpdateFromServer: Boolean): Boolean = js.native
  def IsObjectCheckedOutToThisUserOnThisComputer(ObjID: IObjID, UpdateFromServer: Boolean): Boolean = js.native
  def IsObjectFollowed(ObjID: IObjID): Boolean = js.native
  def IsSingleFileObject(ObjVer: IObjVer): Boolean = js.native
  def MatchesSearchConditions(pIObjVer: IObjVer, pISearchConditions: ISearchConditions): Boolean = js.native
  def MatchesSearchConditionsEx(
    pIObjectVersion: IObjectVersion,
    pISearchConditions: ISearchConditions,
    pIPropertyValues: IPropertyValues,
    pIObjectVersionAndPropertiesOfMultipleObjects: IObjectVersionAndPropertiesOfMultipleObjects
  ): Boolean = js.native
  def NotifyObjectAccess(ObjID: IObjID): IObjectVersionAndProperties = js.native
  def ProposeCheckOutForFile(ParentWindow: Double, ObjVersionFile: IObjectFileAndVersion, CanCancel: Boolean): Boolean = js.native
  def RejectCheckInReminder(ObjVer: IObjVer): Unit = js.native
  def RemoveFavorite(ObjID: IObjID): IObjectVersionAndProperties = js.native
  def RemoveFavorites(ObjIDs: IObjIDs): IObjectVersionAndPropertiesOfMultipleObjects = js.native
  def ResolveConflict(ParticipantObjID: IObjID, KeepThis: Boolean): IObjectVersions = js.native
  def Rollback(ObjID: IObjID, RollbackToVersion: Double): IObjectVersion = js.native
  def SetExternalID(ObjID: IObjID, ExtID: String): Unit = js.native
  def SetObjectGUID(ObjID: IObjID, ObjectGUID: String): Unit = js.native
  def SetOfflineAvailability(ObjID: IObjID, AvailableInOfflineMode: Boolean): Unit = js.native
  def SetSingleFileObject(ObjVer: IObjVer, SingleFile: Boolean): Unit = js.native
  def ShowBasicEditObjectWindow(ParentWindow: Double, ObjVer: IObjVer): IObjectWindowResult = js.native
  def ShowBasicNewObjectWindow(ParentWindow: Double, ObjectType: IObjectType): IObjectWindowResult = js.native
  def ShowChangeStateDialogModal(ParentWindow: Double, ObjectID: IObjID): Unit = js.native
  def ShowCheckInReminder(ParentWindow: Double, ObjVer: IObjVer, Asynchronous: Boolean): IObjectVersion = js.native
  def ShowCheckInReminderDialogModal(ParentWindow: Double, ObjVer: IObjVer, ApplyEnvironmentConditions: Boolean): Boolean = js.native
  def ShowCheckoutPrompt(
    ParentWindow: Double,
    Message: String,
    ObjID: IObjID,
    ShowCancel: Boolean,
    AutoRejectConsequentPrompts: Boolean
  ): IObjectVersion = js.native
  def ShowCollectionMembersDialog(ParentWindow: Double, ObjectVersion: IObjVer, Modeless: Boolean): Unit = js.native
  def ShowCommentsDialogModal(ParentWindow: Double, ObjectID: IObjID): Unit = js.native
  def ShowEditObjectWindow(ParentWindow: Double, Mode: MFObjectWindowMode, ObjVer: IObjVer): IObjectWindowResult = js.native
  def ShowHistoryDialogModal(ParentWindow: Double, ObjectID: IObjID): Unit = js.native
  def ShowNewObjectWindow(ParentWindow: Double, Mode: MFObjectWindowMode, ObjectCreationInfo: IObjectCreationInfo): IObjectWindowResult = js.native
  def ShowPrefilledNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    PrefilledPropertyValues: IPropertyValues,
    AccessControlList: IAccessControlList
  ): IObjectWindowResult = js.native
  def ShowRelatedObjects(
    ParentWindow: Double,
    SourceObject: IObjID,
    ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing,
    ViewSelectionDialogInfoText: String
  ): Unit = js.native
  def ShowRelationshipsDialog(ParentWindow: Double, ObjectVersion: IObjVer, Modeless: Boolean): Unit = js.native
  def ShowSelectObjectHistoryDialogModal(ParentWindow: Double, ObjectID: IObjID, WindowTitle: String): IObjOrFileVer = js.native
  def ShowSubObjectsDialogModal(ParentWindow: Double, ObjectVersion: IObjVer): Unit = js.native
  def UndeleteObject(ObjID: IObjID): IObjectVersion = js.native
  def UndoCheckout(ObjVer: IObjVer): IObjectVersion = js.native
  def UndoCheckoutMultipleObjects(ObjVers: IObjVers): IObjectVersions = js.native
}

