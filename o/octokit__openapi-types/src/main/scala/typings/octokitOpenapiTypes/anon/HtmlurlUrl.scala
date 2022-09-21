package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlurlUrl extends StObject {
  
  /** Format: uri */
  var html_url: String
  
  /** Format: uri */
  var url: String
}
object HtmlurlUrl {
  
  inline def apply(html_url: String, url: String): HtmlurlUrl = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlurlUrl]
  }
  
  extension [Self <: HtmlurlUrl](x: Self) {
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
