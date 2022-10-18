package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileType extends StObject {
  
  /**
    * The name of a file to be uploaded.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * The file ending of a file to be uploaded.
    */
  var fileType: js.UndefOr[String] = js.undefined
  
  /**
    * The MIME type of a file to be uploaded.
    */
  var mimeType: js.UndefOr[String] = js.undefined
}
object FileType {
  
  inline def apply(): FileType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileType]
  }
  
  extension [Self <: FileType](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
