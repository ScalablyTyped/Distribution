package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSize extends StObject {
  
  /**
    * The name of a file to be uploaded.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * The size in MB of a file to be uploaded.
    */
  var fileSize: js.UndefOr[String] = js.undefined
}
object FileSize {
  
  inline def apply(): FileSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSize]
  }
  
  extension [Self <: FileSize](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
  }
}
