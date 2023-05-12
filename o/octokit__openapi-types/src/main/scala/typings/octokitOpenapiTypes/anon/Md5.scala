package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Md5 extends StObject {
  
  var content_type: String
  
  var created_at: String
  
  var download_url: String
  
  var id: Double
  
  var md5: String | Null
  
  var name: String
  
  var sha1: String | Null
  
  var sha256: String | Null
  
  var size: Double
  
  var state: String | Null
  
  var updated_at: String
}
object Md5 {
  
  inline def apply(
    content_type: String,
    created_at: String,
    download_url: String,
    id: Double,
    name: String,
    size: Double,
    updated_at: String
  ): Md5 = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], download_url = download_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], md5 = null, sha1 = null, sha256 = null, state = null)
    __obj.asInstanceOf[Md5]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Md5] (val x: Self) extends AnyVal {
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDownload_url(value: String): Self = StObject.set(x, "download_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    inline def setMd5Null: Self = StObject.set(x, "md5", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def setSha1Null: Self = StObject.set(x, "sha1", null)
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Null: Self = StObject.set(x, "sha256", null)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
