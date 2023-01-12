package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveItemUploadableProperties extends StObject {
  
  // Provides a user-visible description of the item. Read-write. Only on OneDrive Personal.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Provides an expected file size to perform a quota check prior to upload. Only on OneDrive Personal.
  var fileSize: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // File system information on client. Read-write.
  var fileSystemInfo: js.UndefOr[NullableOption[FileSystemInfo]] = js.undefined
  
  // The name of the item (filename and extension). Read-write.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
}
object DriveItemUploadableProperties {
  
  inline def apply(): DriveItemUploadableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveItemUploadableProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DriveItemUploadableProperties] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFileSize(value: NullableOption[Double]): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeNull: Self = StObject.set(x, "fileSize", null)
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setFileSystemInfo(value: NullableOption[FileSystemInfo]): Self = StObject.set(x, "fileSystemInfo", value.asInstanceOf[js.Any])
    
    inline def setFileSystemInfoNull: Self = StObject.set(x, "fileSystemInfo", null)
    
    inline def setFileSystemInfoUndefined: Self = StObject.set(x, "fileSystemInfo", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
