package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectFile extends StObject {
  
  val ChangeTimeUtc: js.Date
  
  val CreationTimeUtc: js.Date
  
  val Extension: String
  
  val FileGUID: String
  
  val FileVer: IFileVer
  
  def GetNameForFileSystem(): String
  
  val ID: Double
  
  val LastAccessTimeUtc: js.Date
  
  val LastWriteTimeUtc: js.Date
  
  val LogicalSize: Double
  
  val LogicalSize_32bit: Double
  
  val Title: String
  
  def ToJSON(): String
  
  val Version: Double
}
object IObjectFile {
  
  inline def apply(
    ChangeTimeUtc: js.Date,
    CreationTimeUtc: js.Date,
    Extension: String,
    FileGUID: String,
    FileVer: IFileVer,
    GetNameForFileSystem: () => String,
    ID: Double,
    LastAccessTimeUtc: js.Date,
    LastWriteTimeUtc: js.Date,
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
  implicit open class MutableBuilder[Self <: IObjectFile] (val x: Self) extends AnyVal {
    
    inline def setChangeTimeUtc(value: js.Date): Self = StObject.set(x, "ChangeTimeUtc", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUtc(value: js.Date): Self = StObject.set(x, "CreationTimeUtc", value.asInstanceOf[js.Any])
    
    inline def setExtension(value: String): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    inline def setFileGUID(value: String): Self = StObject.set(x, "FileGUID", value.asInstanceOf[js.Any])
    
    inline def setFileVer(value: IFileVer): Self = StObject.set(x, "FileVer", value.asInstanceOf[js.Any])
    
    inline def setGetNameForFileSystem(value: () => String): Self = StObject.set(x, "GetNameForFileSystem", js.Any.fromFunction0(value))
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setLastAccessTimeUtc(value: js.Date): Self = StObject.set(x, "LastAccessTimeUtc", value.asInstanceOf[js.Any])
    
    inline def setLastWriteTimeUtc(value: js.Date): Self = StObject.set(x, "LastWriteTimeUtc", value.asInstanceOf[js.Any])
    
    inline def setLogicalSize(value: Double): Self = StObject.set(x, "LogicalSize", value.asInstanceOf[js.Any])
    
    inline def setLogicalSize_32bit(value: Double): Self = StObject.set(x, "LogicalSize_32bit", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => String): Self = StObject.set(x, "ToJSON", js.Any.fromFunction0(value))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
