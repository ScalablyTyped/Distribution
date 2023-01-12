package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.uploaded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Browserdownloadurl extends StObject {
  
  /** Format: uri */
  var browser_download_url: String
  
  var content_type: String
  
  /** Format: date-time */
  var created_at: String
  
  var download_count: Double
  
  var id: Double
  
  var label: String | Null
  
  /**
    * @description The file name of the asset.
    * @example Team Environment
    */
  var name: String
  
  var node_id: String
  
  var size: Double
  
  /**
    * @description State of the release asset.
    * @enum {string}
    */
  var state: uploaded | open
  
  /** Format: date-time */
  var updated_at: String
  
  var uploader: Avatarurl | Null
  
  /** Format: uri */
  var url: String
}
object Browserdownloadurl {
  
  inline def apply(
    browser_download_url: String,
    content_type: String,
    created_at: String,
    download_count: Double,
    id: Double,
    name: String,
    node_id: String,
    size: Double,
    state: uploaded | open,
    updated_at: String,
    url: String
  ): Browserdownloadurl = {
    val __obj = js.Dynamic.literal(browser_download_url = browser_download_url.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], download_count = download_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], label = null, uploader = null)
    __obj.asInstanceOf[Browserdownloadurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Browserdownloadurl] (val x: Self) extends AnyVal {
    
    inline def setBrowser_download_url(value: String): Self = StObject.set(x, "browser_download_url", value.asInstanceOf[js.Any])
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDownload_count(value: Double): Self = StObject.set(x, "download_count", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setState(value: uploaded | open): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUploader(value: Avatarurl): Self = StObject.set(x, "uploader", value.asInstanceOf[js.Any])
    
    inline def setUploaderNull: Self = StObject.set(x, "uploader", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
