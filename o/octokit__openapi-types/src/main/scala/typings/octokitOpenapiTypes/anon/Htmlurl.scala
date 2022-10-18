package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Htmlurl extends StObject {
  
  /** Format: uri */
  var html_url: js.UndefOr[String] = js.undefined
  
  /** @example mit */
  var key: String
  
  /** @example MIT License */
  var name: String
  
  /** @example MDc6TGljZW5zZW1pdA== */
  var node_id: String
  
  /** @example MIT */
  var spdx_id: String | Null
  
  /**
    * Format: uri
    * @example https://api.github.com/licenses/mit
    */
  var url: String | Null
}
object Htmlurl {
  
  inline def apply(key: String, name: String, node_id: String): Htmlurl = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], spdx_id = null, url = null)
    __obj.asInstanceOf[Htmlurl]
  }
  
  extension [Self <: Htmlurl](x: Self) {
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setSpdx_id(value: String): Self = StObject.set(x, "spdx_id", value.asInstanceOf[js.Any])
    
    inline def setSpdx_idNull: Self = StObject.set(x, "spdx_id", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
  }
}
