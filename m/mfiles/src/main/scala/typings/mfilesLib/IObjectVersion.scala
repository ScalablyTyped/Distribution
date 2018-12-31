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

