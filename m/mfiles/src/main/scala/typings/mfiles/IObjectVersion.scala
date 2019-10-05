package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInDocumentClass
import typings.mfiles.MFiles.MFBuiltInObjectClass
import typings.mfiles.MFiles.MFObjectVersionFlag
import typings.mfiles.MFiles.MFSpecialObjectFlag
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectVersion extends js.Object {
  val AccessedByMeUtc: Date
  val CheckedOutAtUtc: Date
  val CheckedOutTo: Double
  val CheckedOutToHostName: String
  val CheckedOutToUserName: String
  val CheckedOutVersion: Double
  val Class: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double
  val CreatedUtc: Date
  val Deleted: Boolean
  val DisplayID: String
  val DisplayIDAvailable: Boolean
  val Files: IObjectFiles
  val FilesCount: Double
  val HasAssignments: Boolean
  val HasSharedFiles: Boolean
  val IsAccessedByMeValid: Boolean
  val IsObjectConflict: Boolean
  val IsObjectShortcut: Boolean
  val LastModifiedUtc: Date
  val LatestCheckedInVersion: Double
  val LatestCheckedInVersionOrCheckedOutVersion: Boolean
  val ObjVer: IObjVer
  val ObjectCheckedOut: Boolean
  val ObjectCheckedOutToThisUserOnAnyComputer: Boolean
  val ObjectCheckedOutToThisUserOnThisComputer: Boolean
  val ObjectFlags: MFSpecialObjectFlag
  val ObjectGUID: String
  val ObjectVersionFlags: MFObjectVersionFlag
  val OriginalObjID: IObjID
  val OriginalVaultGUID: String
  val SingleFile: Boolean
  val ThisVersionCheckedOut: Boolean
  val ThisVersionLatestToThisUser: Boolean
  val Title: String
  val VersionGUID: String
  val VisibleAfterOperation: Boolean
  def Clone(): IObjectVersion
  def GetNameForFileSystem(IncludeID: Boolean): String
  def GetNameForFileSystemEx(IncludeID: Boolean, UseOriginalID: Boolean): String
}

object IObjectVersion {
  @scala.inline
  def apply(
    AccessedByMeUtc: Date,
    CheckedOutAtUtc: Date,
    CheckedOutTo: Double,
    CheckedOutToHostName: String,
    CheckedOutToUserName: String,
    CheckedOutVersion: Double,
    Class: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double,
    Clone: () => IObjectVersion,
    CreatedUtc: Date,
    Deleted: Boolean,
    DisplayID: String,
    DisplayIDAvailable: Boolean,
    Files: IObjectFiles,
    FilesCount: Double,
    GetNameForFileSystem: Boolean => String,
    GetNameForFileSystemEx: (Boolean, Boolean) => String,
    HasAssignments: Boolean,
    HasSharedFiles: Boolean,
    IsAccessedByMeValid: Boolean,
    IsObjectConflict: Boolean,
    IsObjectShortcut: Boolean,
    LastModifiedUtc: Date,
    LatestCheckedInVersion: Double,
    LatestCheckedInVersionOrCheckedOutVersion: Boolean,
    ObjVer: IObjVer,
    ObjectCheckedOut: Boolean,
    ObjectCheckedOutToThisUserOnAnyComputer: Boolean,
    ObjectCheckedOutToThisUserOnThisComputer: Boolean,
    ObjectFlags: MFSpecialObjectFlag,
    ObjectGUID: String,
    ObjectVersionFlags: MFObjectVersionFlag,
    OriginalObjID: IObjID,
    OriginalVaultGUID: String,
    SingleFile: Boolean,
    ThisVersionCheckedOut: Boolean,
    ThisVersionLatestToThisUser: Boolean,
    Title: String,
    VersionGUID: String,
    VisibleAfterOperation: Boolean
  ): IObjectVersion = {
    val __obj = js.Dynamic.literal(AccessedByMeUtc = AccessedByMeUtc, CheckedOutAtUtc = CheckedOutAtUtc, CheckedOutTo = CheckedOutTo, CheckedOutToHostName = CheckedOutToHostName, CheckedOutToUserName = CheckedOutToUserName, CheckedOutVersion = CheckedOutVersion, Class = Class.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CreatedUtc = CreatedUtc, Deleted = Deleted, DisplayID = DisplayID, DisplayIDAvailable = DisplayIDAvailable, Files = Files, FilesCount = FilesCount, GetNameForFileSystem = js.Any.fromFunction1(GetNameForFileSystem), GetNameForFileSystemEx = js.Any.fromFunction2(GetNameForFileSystemEx), HasAssignments = HasAssignments, HasSharedFiles = HasSharedFiles, IsAccessedByMeValid = IsAccessedByMeValid, IsObjectConflict = IsObjectConflict, IsObjectShortcut = IsObjectShortcut, LastModifiedUtc = LastModifiedUtc, LatestCheckedInVersion = LatestCheckedInVersion, LatestCheckedInVersionOrCheckedOutVersion = LatestCheckedInVersionOrCheckedOutVersion, ObjVer = ObjVer, ObjectCheckedOut = ObjectCheckedOut, ObjectCheckedOutToThisUserOnAnyComputer = ObjectCheckedOutToThisUserOnAnyComputer, ObjectCheckedOutToThisUserOnThisComputer = ObjectCheckedOutToThisUserOnThisComputer, ObjectFlags = ObjectFlags, ObjectGUID = ObjectGUID, ObjectVersionFlags = ObjectVersionFlags, OriginalObjID = OriginalObjID, OriginalVaultGUID = OriginalVaultGUID, SingleFile = SingleFile, ThisVersionCheckedOut = ThisVersionCheckedOut, ThisVersionLatestToThisUser = ThisVersionLatestToThisUser, Title = Title, VersionGUID = VersionGUID, VisibleAfterOperation = VisibleAfterOperation)
  
    __obj.asInstanceOf[IObjectVersion]
  }
}

