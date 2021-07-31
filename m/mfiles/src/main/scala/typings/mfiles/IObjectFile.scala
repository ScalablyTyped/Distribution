package typings.mfiles

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectFile extends StObject {
  
  val ChangeTimeUtc: Date
  
  val CreationTimeUtc: Date
  
  val Extension: String
  
  val FileGUID: String
  
  val FileVer: IFileVer
  
  def GetNameForFileSystem(): String
  
  val ID: Double
  
  val LastAccessTimeUtc: Date
  
  val LastWriteTimeUtc: Date
  
  val LogicalSize: Double
  
  val LogicalSize_32bit: Double
  
  val Title: String
  
  def ToJSON(): String
  
  val Version: Double
}
object IObjectFile {
  
  @scala.inline
  def apply(
    ChangeTimeUtc: Date,
    CreationTimeUtc: Date,
    Extension: String,
    FileGUID: String,
    FileVer: IFileVer,
    GetNameForFileSystem: () => String,
    ID: Double,
    LastAccessTimeUtc: Date,
    LastWriteTimeUtc: Date,
    LogicalSize: Double,
    LogicalSize_32bit: Double,
    Title: String,
    ToJSON: () => String,
    Version: Double
  ): IObjectFile = {
    val __obj = js.Dynamic.literal(ChangeTimeUtc = ChangeTimeUtc.asInstanceOf[js.Any], CreationTimeUtc = CreationTimeUtc.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], FileGUID = FileGUID.asInstanceOf[js.Any], FileVer = FileVer.asInstanceOf[js.Any], GetNameForFileSystem = js.Any.fromFunction0(GetNameForFileSystem), ID = ID.asInstanceOf[js.Any], LastAccessTimeUtc = LastAccessTimeUtc.asInstanceOf[js.Any], LastWriteTimeUtc = LastWriteTimeUtc.asInstanceOf[js.Any], LogicalSize = LogicalSize.asInstanceOf[js.Any], LogicalSize_32bit = LogicalSize_32bit.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], ToJSON = js.Any.fromFunction0(ToJSON), Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectFile]
  }
  
  @scala.inline
  implicit class IObjectFileMutableBuilder[Self <: IObjectFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeTimeUtc(value: Date): Self = StObject.set(x, "ChangeTimeUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUtc(value: Date): Self = StObject.set(x, "CreationTimeUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileGUID(value: String): Self = StObject.set(x, "FileGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileVer(value: IFileVer): Self = StObject.set(x, "FileVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNameForFileSystem(value: () => String): Self = StObject.set(x, "GetNameForFileSystem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessTimeUtc(value: Date): Self = StObject.set(x, "LastAccessTimeUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastWriteTimeUtc(value: Date): Self = StObject.set(x, "LastWriteTimeUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalSize(value: Double): Self = StObject.set(x, "LogicalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalSize_32bit(value: Double): Self = StObject.set(x, "LogicalSize_32bit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => String): Self = StObject.set(x, "ToJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
