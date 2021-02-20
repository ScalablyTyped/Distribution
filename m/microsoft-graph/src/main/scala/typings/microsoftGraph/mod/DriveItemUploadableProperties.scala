package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveItemUploadableProperties extends StObject {
  
  // Provides a user-visible description of the item. Read-write. Only on OneDrive Personal.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Provides an expected file size to perform a quota check prior to upload. Only on OneDrive Personal.
  var fileSize: js.UndefOr[NullableOption[Double]] = js.native
  
  // File system information on client. Read-write.
  var fileSystemInfo: js.UndefOr[NullableOption[FileSystemInfo]] = js.native
  
  // The name of the item (filename and extension). Read-write.
  var name: js.UndefOr[NullableOption[String]] = js.native
}
object DriveItemUploadableProperties {
  
  @scala.inline
  def apply(): DriveItemUploadableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveItemUploadableProperties]
  }
  
  @scala.inline
  implicit class DriveItemUploadablePropertiesMutableBuilder[Self <: DriveItemUploadableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFileSize(value: NullableOption[Double]): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSizeNull: Self = StObject.set(x, "fileSize", null)
    
    @scala.inline
    def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    @scala.inline
    def setFileSystemInfo(value: NullableOption[FileSystemInfo]): Self = StObject.set(x, "fileSystemInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemInfoNull: Self = StObject.set(x, "fileSystemInfo", null)
    
    @scala.inline
    def setFileSystemInfoUndefined: Self = StObject.set(x, "fileSystemInfo", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
