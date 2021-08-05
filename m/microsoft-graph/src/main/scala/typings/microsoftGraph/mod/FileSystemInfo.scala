package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemInfo extends StObject {
  
  // The UTC date and time the file was created on a client.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The UTC date and time the file was last accessed. Available for the recent file list only.
  var lastAccessedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The UTC date and time the file was last modified on a client.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object FileSystemInfo {
  
  inline def apply(): FileSystemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemInfo]
  }
  
  extension [Self <: FileSystemInfo](x: Self) {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setLastAccessedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastAccessedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastAccessedDateTimeNull: Self = StObject.set(x, "lastAccessedDateTime", null)
    
    inline def setLastAccessedDateTimeUndefined: Self = StObject.set(x, "lastAccessedDateTime", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
  }
}
