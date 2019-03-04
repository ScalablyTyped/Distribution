package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectVersion extends js.Object {
  val AccessedByMeUtc: stdLib.Date
  val CheckedOutAtUtc: stdLib.Date
  val CheckedOutTo: scala.Double
  val CheckedOutToHostName: java.lang.String
  val CheckedOutToUserName: java.lang.String
  val CheckedOutVersion: scala.Double
  val Class: mfilesLib.MFilesNs.MFBuiltInDocumentClass | mfilesLib.MFilesNs.MFBuiltInObjectClass | scala.Double
  val CreatedUtc: stdLib.Date
  val Deleted: scala.Boolean
  val DisplayID: java.lang.String
  val DisplayIDAvailable: scala.Boolean
  val Files: IObjectFiles
  val FilesCount: scala.Double
  val HasAssignments: scala.Boolean
  val HasSharedFiles: scala.Boolean
  val IsAccessedByMeValid: scala.Boolean
  val IsObjectConflict: scala.Boolean
  val IsObjectShortcut: scala.Boolean
  val LastModifiedUtc: stdLib.Date
  val LatestCheckedInVersion: scala.Double
  val LatestCheckedInVersionOrCheckedOutVersion: scala.Boolean
  val ObjVer: IObjVer
  val ObjectCheckedOut: scala.Boolean
  val ObjectCheckedOutToThisUserOnAnyComputer: scala.Boolean
  val ObjectCheckedOutToThisUserOnThisComputer: scala.Boolean
  val ObjectFlags: mfilesLib.MFilesNs.MFSpecialObjectFlag
  val ObjectGUID: java.lang.String
  val ObjectVersionFlags: mfilesLib.MFilesNs.MFObjectVersionFlag
  val OriginalObjID: IObjID
  val OriginalVaultGUID: java.lang.String
  val SingleFile: scala.Boolean
  val ThisVersionCheckedOut: scala.Boolean
  val ThisVersionLatestToThisUser: scala.Boolean
  val Title: java.lang.String
  val VersionGUID: java.lang.String
  val VisibleAfterOperation: scala.Boolean
  def Clone(): IObjectVersion
  def GetNameForFileSystem(IncludeID: scala.Boolean): java.lang.String
  def GetNameForFileSystemEx(IncludeID: scala.Boolean, UseOriginalID: scala.Boolean): java.lang.String
}

object IObjectVersion {
  @scala.inline
  def apply(
    AccessedByMeUtc: stdLib.Date,
    CheckedOutAtUtc: stdLib.Date,
    CheckedOutTo: scala.Double,
    CheckedOutToHostName: java.lang.String,
    CheckedOutToUserName: java.lang.String,
    CheckedOutVersion: scala.Double,
    Class: mfilesLib.MFilesNs.MFBuiltInDocumentClass | mfilesLib.MFilesNs.MFBuiltInObjectClass | scala.Double,
    Clone: js.Function0[IObjectVersion],
    CreatedUtc: stdLib.Date,
    Deleted: scala.Boolean,
    DisplayID: java.lang.String,
    DisplayIDAvailable: scala.Boolean,
    Files: IObjectFiles,
    FilesCount: scala.Double,
    GetNameForFileSystem: js.Function1[scala.Boolean, java.lang.String],
    GetNameForFileSystemEx: js.Function2[scala.Boolean, scala.Boolean, java.lang.String],
    HasAssignments: scala.Boolean,
    HasSharedFiles: scala.Boolean,
    IsAccessedByMeValid: scala.Boolean,
    IsObjectConflict: scala.Boolean,
    IsObjectShortcut: scala.Boolean,
    LastModifiedUtc: stdLib.Date,
    LatestCheckedInVersion: scala.Double,
    LatestCheckedInVersionOrCheckedOutVersion: scala.Boolean,
    ObjVer: IObjVer,
    ObjectCheckedOut: scala.Boolean,
    ObjectCheckedOutToThisUserOnAnyComputer: scala.Boolean,
    ObjectCheckedOutToThisUserOnThisComputer: scala.Boolean,
    ObjectFlags: mfilesLib.MFilesNs.MFSpecialObjectFlag,
    ObjectGUID: java.lang.String,
    ObjectVersionFlags: mfilesLib.MFilesNs.MFObjectVersionFlag,
    OriginalObjID: IObjID,
    OriginalVaultGUID: java.lang.String,
    SingleFile: scala.Boolean,
    ThisVersionCheckedOut: scala.Boolean,
    ThisVersionLatestToThisUser: scala.Boolean,
    Title: java.lang.String,
    VersionGUID: java.lang.String,
    VisibleAfterOperation: scala.Boolean
  ): IObjectVersion = {
    val __obj = js.Dynamic.literal(AccessedByMeUtc = AccessedByMeUtc, CheckedOutAtUtc = CheckedOutAtUtc, CheckedOutTo = CheckedOutTo, CheckedOutToHostName = CheckedOutToHostName, CheckedOutToUserName = CheckedOutToUserName, CheckedOutVersion = CheckedOutVersion, Class = Class.asInstanceOf[js.Any], Clone = Clone, CreatedUtc = CreatedUtc, Deleted = Deleted, DisplayID = DisplayID, DisplayIDAvailable = DisplayIDAvailable, Files = Files, FilesCount = FilesCount, GetNameForFileSystem = GetNameForFileSystem, GetNameForFileSystemEx = GetNameForFileSystemEx, HasAssignments = HasAssignments, HasSharedFiles = HasSharedFiles, IsAccessedByMeValid = IsAccessedByMeValid, IsObjectConflict = IsObjectConflict, IsObjectShortcut = IsObjectShortcut, LastModifiedUtc = LastModifiedUtc, LatestCheckedInVersion = LatestCheckedInVersion, LatestCheckedInVersionOrCheckedOutVersion = LatestCheckedInVersionOrCheckedOutVersion, ObjVer = ObjVer, ObjectCheckedOut = ObjectCheckedOut, ObjectCheckedOutToThisUserOnAnyComputer = ObjectCheckedOutToThisUserOnAnyComputer, ObjectCheckedOutToThisUserOnThisComputer = ObjectCheckedOutToThisUserOnThisComputer, ObjectFlags = ObjectFlags, ObjectGUID = ObjectGUID, ObjectVersionFlags = ObjectVersionFlags, OriginalObjID = OriginalObjID, OriginalVaultGUID = OriginalVaultGUID, SingleFile = SingleFile, ThisVersionCheckedOut = ThisVersionCheckedOut, ThisVersionLatestToThisUser = ThisVersionLatestToThisUser, Title = Title, VersionGUID = VersionGUID, VisibleAfterOperation = VisibleAfterOperation)
  
    __obj.asInstanceOf[IObjectVersion]
  }
}

