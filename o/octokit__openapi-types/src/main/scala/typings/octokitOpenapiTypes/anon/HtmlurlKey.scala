package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlurlKey extends StObject {
  
  /**
    * Format: uri
    * @example https://github.com/github/docs/blob/main/CODE_OF_CONDUCT.md
    */
  var html_url: String | Null
  
  /** @example citizen_code_of_conduct */
  var key: String
  
  /** @example Citizen Code of Conduct */
  var name: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/github/docs/community/code_of_conduct
    */
  var url: String
}
object HtmlurlKey {
  
  inline def apply(key: String, name: String, url: String): HtmlurlKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], html_url = null)
    __obj.asInstanceOf[HtmlurlKey]
  }
  
  extension [Self <: HtmlurlKey](x: Self) {
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlNull: Self = StObject.set(x, "html_url", null)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
