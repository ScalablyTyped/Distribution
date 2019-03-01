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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessedByMeUtc")(AccessedByMeUtc)
    __obj.updateDynamic("CheckedOutAtUtc")(CheckedOutAtUtc)
    __obj.updateDynamic("CheckedOutTo")(CheckedOutTo)
    __obj.updateDynamic("CheckedOutToHostName")(CheckedOutToHostName)
    __obj.updateDynamic("CheckedOutToUserName")(CheckedOutToUserName)
    __obj.updateDynamic("CheckedOutVersion")(CheckedOutVersion)
    __obj.updateDynamic("Class")(Class.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("CreatedUtc")(CreatedUtc)
    __obj.updateDynamic("Deleted")(Deleted)
    __obj.updateDynamic("DisplayID")(DisplayID)
    __obj.updateDynamic("DisplayIDAvailable")(DisplayIDAvailable)
    __obj.updateDynamic("Files")(Files)
    __obj.updateDynamic("FilesCount")(FilesCount)
    __obj.updateDynamic("GetNameForFileSystem")(GetNameForFileSystem)
    __obj.updateDynamic("GetNameForFileSystemEx")(GetNameForFileSystemEx)
    __obj.updateDynamic("HasAssignments")(HasAssignments)
    __obj.updateDynamic("HasSharedFiles")(HasSharedFiles)
    __obj.updateDynamic("IsAccessedByMeValid")(IsAccessedByMeValid)
    __obj.updateDynamic("IsObjectConflict")(IsObjectConflict)
    __obj.updateDynamic("IsObjectShortcut")(IsObjectShortcut)
    __obj.updateDynamic("LastModifiedUtc")(LastModifiedUtc)
    __obj.updateDynamic("LatestCheckedInVersion")(LatestCheckedInVersion)
    __obj.updateDynamic("LatestCheckedInVersionOrCheckedOutVersion")(LatestCheckedInVersionOrCheckedOutVersion)
    __obj.updateDynamic("ObjVer")(ObjVer)
    __obj.updateDynamic("ObjectCheckedOut")(ObjectCheckedOut)
    __obj.updateDynamic("ObjectCheckedOutToThisUserOnAnyComputer")(ObjectCheckedOutToThisUserOnAnyComputer)
    __obj.updateDynamic("ObjectCheckedOutToThisUserOnThisComputer")(ObjectCheckedOutToThisUserOnThisComputer)
    __obj.updateDynamic("ObjectFlags")(ObjectFlags)
    __obj.updateDynamic("ObjectGUID")(ObjectGUID)
    __obj.updateDynamic("ObjectVersionFlags")(ObjectVersionFlags)
    __obj.updateDynamic("OriginalObjID")(OriginalObjID)
    __obj.updateDynamic("OriginalVaultGUID")(OriginalVaultGUID)
    __obj.updateDynamic("SingleFile")(SingleFile)
    __obj.updateDynamic("ThisVersionCheckedOut")(ThisVersionCheckedOut)
    __obj.updateDynamic("ThisVersionLatestToThisUser")(ThisVersionLatestToThisUser)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("VersionGUID")(VersionGUID)
    __obj.updateDynamic("VisibleAfterOperation")(VisibleAfterOperation)
    __obj.asInstanceOf[IObjectVersion]
  }
}

