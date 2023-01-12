package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadFileResponse extends StObject {
  
  var created_at: String
  
  var download_href: String
  
  var file_name: String
  
  var file_size: Double
  
  var file_type: String
  
  var href: String
  
  var id: String
}
object UploadFileResponse {
  
  inline def apply(
    created_at: String,
    download_href: String,
    file_name: String,
    file_size: Double,
    file_type: String,
    href: String,
    id: String
  ): UploadFileResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], download_href = download_href.asInstanceOf[js.Any], file_name = file_name.asInstanceOf[js.Any], file_size = file_size.asInstanceOf[js.Any], file_type = file_type.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadFileResponse] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDownload_href(value: String): Self = StObject.set(x, "download_href", value.asInstanceOf[js.Any])
    
    inline def setFile_name(value: String): Self = StObject.set(x, "file_name", value.asInstanceOf[js.Any])
    
    inline def setFile_size(value: Double): Self = StObject.set(x, "file_size", value.asInstanceOf[js.Any])
    
    inline def setFile_type(value: String): Self = StObject.set(x, "file_type", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
