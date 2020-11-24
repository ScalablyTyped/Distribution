package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInDocumentClass
import typings.mfiles.MFiles.MFBuiltInObjectClass
import typings.mfiles.MFiles.MFObjectVersionFlag
import typings.mfiles.MFiles.MFSpecialObjectFlag
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectVersion extends js.Object {
  
  val AccessedByMeUtc: Date = js.native
  
  val CheckedOutAtUtc: Date = js.native
  
  val CheckedOutTo: Double = js.native
  
  val CheckedOutToHostName: String = js.native
  
  val CheckedOutToUserName: String = js.native
  
  val CheckedOutVersion: Double = js.native
  
  val Class: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double = js.native
  
  def Clone(): IObjectVersion = js.native
  
  val CreatedUtc: Date = js.native
  
  val Deleted: Boolean = js.native
  
  val DisplayID: String = js.native
  
  val DisplayIDAvailable: Boolean = js.native
  
  val Files: IObjectFiles = js.native
  
  val FilesCount: Double = js.native
  
  def GetNameForFileSystem(IncludeID: Boolean): String = js.native
  
  def GetNameForFileSystemEx(IncludeID: Boolean, UseOriginalID: Boolean): String = js.native
  
  val HasAssignments: Boolean = js.native
  
  val HasSharedFiles: Boolean = js.native
  
  val IsAccessedByMeValid: Boolean = js.native
  
  val IsObjectConflict: Boolean = js.native
  
  val IsObjectShortcut: Boolean = js.native
  
  val LastModifiedUtc: Date = js.native
  
  val LatestCheckedInVersion: Double = js.native
  
  val LatestCheckedInVersionOrCheckedOutVersion: Boolean = js.native
  
  val ObjVer: IObjVer = js.native
  
  val ObjectCheckedOut: Boolean = js.native
  
  val ObjectCheckedOutToThisUserOnAnyComputer: Boolean = js.native
  
  val ObjectCheckedOutToThisUserOnThisComputer: Boolean = js.native
  
  val ObjectFlags: MFSpecialObjectFlag = js.native
  
  val ObjectGUID: String = js.native
  
  val ObjectVersionFlags: MFObjectVersionFlag = js.native
  
  val OriginalObjID: IObjID = js.native
  
  val OriginalVaultGUID: String = js.native
  
  val SingleFile: Boolean = js.native
  
  val ThisVersionCheckedOut: Boolean = js.native
  
  val ThisVersionLatestToThisUser: Boolean = js.native
  
  val Title: String = js.native
  
  val VersionGUID: String = js.native
  
  val VisibleAfterOperation: Boolean = js.native
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
  
  @scala.inline
  implicit class IObjectVersionOps[Self <: IObjectVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessedByMeUtc(value: Date): Self = this.set("AccessedByMeUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedOutAtUtc(value: Date): Self = this.set("CheckedOutAtUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedOutTo(value: Double): Self = this.set("CheckedOutTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedOutToHostName(value: String): Self = this.set("CheckedOutToHostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedOutToUserName(value: String): Self = this.set("CheckedOutToUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedOutVersion(value: Double): Self = this.set("CheckedOutVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IObjectVersion): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreatedUtc(value: Date): Self = this.set("CreatedUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("Deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayID(value: String): Self = this.set("DisplayID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayIDAvailable(value: Boolean): Self = this.set("DisplayIDAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: IObjectFiles): Self = this.set("Files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesCount(value: Double): Self = this.set("FilesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNameForFileSystem(value: Boolean => String): Self = this.set("GetNameForFileSystem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNameForFileSystemEx(value: (Boolean, Boolean) => String): Self = this.set("GetNameForFileSystemEx", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasAssignments(value: Boolean): Self = this.set("HasAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSharedFiles(value: Boolean): Self = this.set("HasSharedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAccessedByMeValid(value: Boolean): Self = this.set("IsAccessedByMeValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsObjectConflict(value: Boolean): Self = this.set("IsObjectConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsObjectShortcut(value: Boolean): Self = this.set("IsObjectShortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUtc(value: Date): Self = this.set("LastModifiedUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestCheckedInVersion(value: Double): Self = this.set("LatestCheckedInVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestCheckedInVersionOrCheckedOutVersion(value: Boolean): Self = this.set("LatestCheckedInVersionOrCheckedOutVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjVer(value: IObjVer): Self = this.set("ObjVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectCheckedOut(value: Boolean): Self = this.set("ObjectCheckedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectCheckedOutToThisUserOnAnyComputer(value: Boolean): Self = this.set("ObjectCheckedOutToThisUserOnAnyComputer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectCheckedOutToThisUserOnThisComputer(value: Boolean): Self = this.set("ObjectCheckedOutToThisUserOnThisComputer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectFlags(value: MFSpecialObjectFlag): Self = this.set("ObjectFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectGUID(value: String): Self = this.set("ObjectGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersionFlags(value: MFObjectVersionFlag): Self = this.set("ObjectVersionFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalObjID(value: IObjID): Self = this.set("OriginalObjID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalVaultGUID(value: String): Self = this.set("OriginalVaultGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleFile(value: Boolean): Self = this.set("SingleFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThisVersionCheckedOut(value: Boolean): Self = this.set("ThisVersionCheckedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThisVersionLatestToThisUser(value: Boolean): Self = this.set("ThisVersionLatestToThisUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionGUID(value: String): Self = this.set("VersionGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleAfterOperation(value: Boolean): Self = this.set("VisibleAfterOperation", value.asInstanceOf[js.Any])
  }
}
