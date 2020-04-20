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
    val __obj = js.Dynamic.literal(AccessedByMeUtc = AccessedByMeUtc.asInstanceOf[js.Any], CheckedOutAtUtc = CheckedOutAtUtc.asInstanceOf[js.Any], CheckedOutTo = CheckedOutTo.asInstanceOf[js.Any], CheckedOutToHostName = CheckedOutToHostName.asInstanceOf[js.Any], CheckedOutToUserName = CheckedOutToUserName.asInstanceOf[js.Any], CheckedOutVersion = CheckedOutVersion.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CreatedUtc = CreatedUtc.asInstanceOf[js.Any], Deleted = Deleted.asInstanceOf[js.Any], DisplayID = DisplayID.asInstanceOf[js.Any], DisplayIDAvailable = DisplayIDAvailable.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], FilesCount = FilesCount.asInstanceOf[js.Any], GetNameForFileSystem = js.Any.fromFunction1(GetNameForFileSystem), GetNameForFileSystemEx = js.Any.fromFunction2(GetNameForFileSystemEx), HasAssignments = HasAssignments.asInstanceOf[js.Any], HasSharedFiles = HasSharedFiles.asInstanceOf[js.Any], IsAccessedByMeValid = IsAccessedByMeValid.asInstanceOf[js.Any], IsObjectConflict = IsObjectConflict.asInstanceOf[js.Any], IsObjectShortcut = IsObjectShortcut.asInstanceOf[js.Any], LastModifiedUtc = LastModifiedUtc.asInstanceOf[js.Any], LatestCheckedInVersion = LatestCheckedInVersion.asInstanceOf[js.Any], LatestCheckedInVersionOrCheckedOutVersion = LatestCheckedInVersionOrCheckedOutVersion.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], ObjectCheckedOut = ObjectCheckedOut.asInstanceOf[js.Any], ObjectCheckedOutToThisUserOnAnyComputer = ObjectCheckedOutToThisUserOnAnyComputer.asInstanceOf[js.Any], ObjectCheckedOutToThisUserOnThisComputer = ObjectCheckedOutToThisUserOnThisComputer.asInstanceOf[js.Any], ObjectFlags = ObjectFlags.asInstanceOf[js.Any], ObjectGUID = ObjectGUID.asInstanceOf[js.Any], ObjectVersionFlags = ObjectVersionFlags.asInstanceOf[js.Any], OriginalObjID = OriginalObjID.asInstanceOf[js.Any], OriginalVaultGUID = OriginalVaultGUID.asInstanceOf[js.Any], SingleFile = SingleFile.asInstanceOf[js.Any], ThisVersionCheckedOut = ThisVersionCheckedOut.asInstanceOf[js.Any], ThisVersionLatestToThisUser = ThisVersionLatestToThisUser.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], VersionGUID = VersionGUID.asInstanceOf[js.Any], VisibleAfterOperation = VisibleAfterOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectVersion]
  }
}

