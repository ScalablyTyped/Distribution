package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemInfo extends StObject {
  
  // The UTC date and time the file was created on a client.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The UTC date and time the file was last accessed. Available for the recent file list only.
  var lastAccessedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The UTC date and time the file was last modified on a client.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
}
object FileSystemInfo {
  
  @scala.inline
  def apply(): FileSystemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemInfo]
  }
  
  @scala.inline
  implicit class FileSystemInfoMutableBuilder[Self <: FileSystemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setLastAccessedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastAccessedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessedDateTimeNull: Self = StObject.set(x, "lastAccessedDateTime", null)
    
    @scala.inline
    def setLastAccessedDateTimeUndefined: Self = StObject.set(x, "lastAccessedDateTime", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
  }
}
