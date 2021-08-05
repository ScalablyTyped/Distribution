package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileUploadOptions extends StObject {
  
  var chunkedMode: js.UndefOr[Boolean] = js.undefined
  
  var fileKey: js.UndefOr[String] = js.undefined
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Any] = js.undefined
  
  var mimeType: js.UndefOr[String] = js.undefined
  
  var params: js.UndefOr[js.Any] = js.undefined
}
object FileUploadOptions {
  
  inline def apply(): FileUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadOptions]
  }
  
  extension [Self <: FileUploadOptions](x: Self) {
    
    inline def setChunkedMode(value: Boolean): Self = StObject.set(x, "chunkedMode", value.asInstanceOf[js.Any])
    
    inline def setChunkedModeUndefined: Self = StObject.set(x, "chunkedMode", js.undefined)
    
    inline def setFileKey(value: String): Self = StObject.set(x, "fileKey", value.asInstanceOf[js.Any])
    
    inline def setFileKeyUndefined: Self = StObject.set(x, "fileKey", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
