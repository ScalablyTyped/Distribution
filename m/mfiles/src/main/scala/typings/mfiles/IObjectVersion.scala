package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInDocumentClass
import typings.mfiles.MFiles.MFBuiltInObjectClass
import typings.mfiles.MFiles.MFObjectVersionFlag
import typings.mfiles.MFiles.MFSpecialObjectFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectVersion extends StObject {
  
  val AccessedByMeUtc: js.Date
  
  val CheckedOutAtUtc: js.Date
  
  val CheckedOutTo: Double
  
  val CheckedOutToHostName: String
  
  val CheckedOutToUserName: String
  
  val CheckedOutVersion: Double
  
  val Class: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double
  
  def Clone(): IObjectVersion
  
  val CreatedUtc: js.Date
  
  val Deleted: Boolean
  
  val DisplayID: String
  
  val DisplayIDAvailable: Boolean
  
  val Files: IObjectFiles
  
  val FilesCount: Double
  
  def GetNameForFileSystem(IncludeID: Boolean): String
  
  def GetNameForFileSystemEx(IncludeID: Boolean, UseOriginalID: Boolean): String
  
  val HasAssignments: Boolean
  
  val HasSharedFiles: Boolean
  
  val IsAccessedByMeValid: Boolean
  
  val IsObjectConflict: Boolean
  
  val IsObjectShortcut: Boolean
  
  val LastModifiedUtc: js.Date
  
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
}
object IObjectVersion {
  
  inline def apply(
    AccessedByMeUtc: js.Date,
    CheckedOutAtUtc: js.Date,
    CheckedOutTo: Double,
    CheckedOutToHostName: String,
    CheckedOutToUserName: String,
    CheckedOutVersion: Double,
    Class: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double,
    Clone: () => IObjectVersion,
    CreatedUtc: js.Date,
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
    LastModifiedUtc: js.Date,
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
  implicit open class MutableBuilder[Self <: IObjectVersion] (val x: Self) extends AnyVal {
    
    inline def setAccessedByMeUtc(value: js.Date): Self = StObject.set(x, "AccessedByMeUtc", value.asInstanceOf[js.Any])
    
    inline def setCheckedOutAtUtc(value: js.Date): Self = StObject.set(x, "CheckedOutAtUtc", value.asInstanceOf[js.Any])
    
    inline def setCheckedOutTo(value: Double): Self = StObject.set(x, "CheckedOutTo", value.asInstanceOf[js.Any])
    
    inline def setCheckedOutToHostName(value: String): Self = StObject.set(x, "CheckedOutToHostName", value.asInstanceOf[js.Any])
    
    inline def setCheckedOutToUserName(value: String): Self = StObject.set(x, "CheckedOutToUserName", value.asInstanceOf[js.Any])
    
    inline def setCheckedOutVersion(value: Double): Self = StObject.set(x, "CheckedOutVersion", value.asInstanceOf[js.Any])
    
    inline def setClass(value: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => IObjectVersion): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCreatedUtc(value: js.Date): Self = StObject.set(x, "CreatedUtc", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
    
    inline def setDisplayID(value: String): Self = StObject.set(x, "DisplayID", value.asInstanceOf[js.Any])
    
    inline def setDisplayIDAvailable(value: Boolean): Self = StObject.set(x, "DisplayIDAvailable", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: IObjectFiles): Self = StObject.set(x, "Files", value.asInstanceOf[js.Any])
    
    inline def setFilesCount(value: Double): Self = StObject.set(x, "FilesCount", value.asInstanceOf[js.Any])
    
    inline def setGetNameForFileSystem(value: Boolean => String): Self = StObject.set(x, "GetNameForFileSystem", js.Any.fromFunction1(value))
    
    inline def setGetNameForFileSystemEx(value: (Boolean, Boolean) => String): Self = StObject.set(x, "GetNameForFileSystemEx", js.Any.fromFunction2(value))
    
    inline def setHasAssignments(value: Boolean): Self = StObject.set(x, "HasAssignments", value.asInstanceOf[js.Any])
    
    inline def setHasSharedFiles(value: Boolean): Self = StObject.set(x, "HasSharedFiles", value.asInstanceOf[js.Any])
    
    inline def setIsAccessedByMeValid(value: Boolean): Self = StObject.set(x, "IsAccessedByMeValid", value.asInstanceOf[js.Any])
    
    inline def setIsObjectConflict(value: Boolean): Self = StObject.set(x, "IsObjectConflict", value.asInstanceOf[js.Any])
    
    inline def setIsObjectShortcut(value: Boolean): Self = StObject.set(x, "IsObjectShortcut", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUtc(value: js.Date): Self = StObject.set(x, "LastModifiedUtc", value.asInstanceOf[js.Any])
    
    inline def setLatestCheckedInVersion(value: Double): Self = StObject.set(x, "LatestCheckedInVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestCheckedInVersionOrCheckedOutVersion(value: Boolean): Self = StObject.set(x, "LatestCheckedInVersionOrCheckedOutVersion", value.asInstanceOf[js.Any])
    
    inline def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    inline def setObjectCheckedOut(value: Boolean): Self = StObject.set(x, "ObjectCheckedOut", value.asInstanceOf[js.Any])
    
    inline def setObjectCheckedOutToThisUserOnAnyComputer(value: Boolean): Self = StObject.set(x, "ObjectCheckedOutToThisUserOnAnyComputer", value.asInstanceOf[js.Any])
    
    inline def setObjectCheckedOutToThisUserOnThisComputer(value: Boolean): Self = StObject.set(x, "ObjectCheckedOutToThisUserOnThisComputer", value.asInstanceOf[js.Any])
    
    inline def setObjectFlags(value: MFSpecialObjectFlag): Self = StObject.set(x, "ObjectFlags", value.asInstanceOf[js.Any])
    
    inline def setObjectGUID(value: String): Self = StObject.set(x, "ObjectGUID", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionFlags(value: MFObjectVersionFlag): Self = StObject.set(x, "ObjectVersionFlags", value.asInstanceOf[js.Any])
    
    inline def setOriginalObjID(value: IObjID): Self = StObject.set(x, "OriginalObjID", value.asInstanceOf[js.Any])
    
    inline def setOriginalVaultGUID(value: String): Self = StObject.set(x, "OriginalVaultGUID", value.asInstanceOf[js.Any])
    
    inline def setSingleFile(value: Boolean): Self = StObject.set(x, "SingleFile", value.asInstanceOf[js.Any])
    
    inline def setThisVersionCheckedOut(value: Boolean): Self = StObject.set(x, "ThisVersionCheckedOut", value.asInstanceOf[js.Any])
    
    inline def setThisVersionLatestToThisUser(value: Boolean): Self = StObject.set(x, "ThisVersionLatestToThisUser", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setVersionGUID(value: String): Self = StObject.set(x, "VersionGUID", value.asInstanceOf[js.Any])
    
    inline def setVisibleAfterOperation(value: Boolean): Self = StObject.set(x, "VisibleAfterOperation", value.asInstanceOf[js.Any])
  }
}
