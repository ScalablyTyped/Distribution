package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlurlString extends StObject {
  
  /** Format: uri */
  var html_url: String
  
  /**
    * @description SHA for the commit
    * @example 7638417db6d59f3c431d3e1f261cc637155684cd
    */
  var sha: String
  
  /** Format: uri */
  var url: String
}
object HtmlurlString {
  
  inline def apply(html_url: String, sha: String, url: String): HtmlurlString = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlurlString]
  }
  
  extension [Self <: HtmlurlString](x: Self) {
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
