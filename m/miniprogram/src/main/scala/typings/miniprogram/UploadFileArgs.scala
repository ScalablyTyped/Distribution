package typings.miniprogram

import typings.miniprogram.anon.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadFileArgs
  extends StObject
     with AsyncCallback[Header] {
  
  var fileName: String
  
  var filePath: String
  
  var fileType: String
  
  var formData: js.UndefOr[js.Any] = js.undefined
  
  var header: js.UndefOr[js.Any] = js.undefined
  
  var url: String
}
object UploadFileArgs {
  
  inline def apply(fileName: String, filePath: String, fileType: String, url: String): UploadFileArgs = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileArgs]
  }
  
  extension [Self <: UploadFileArgs](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: js.Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
