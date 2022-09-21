package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlurlSha extends StObject {
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/commit/7638417db6d59f3c431d3e1f261cc637155684cd
    */
  var html_url: js.UndefOr[String] = js.undefined
  
  /** @example 7638417db6d59f3c431d3e1f261cc637155684cd */
  var sha: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/commits/7638417db6d59f3c431d3e1f261cc637155684cd
    */
  var url: String
}
object HtmlurlSha {
  
  inline def apply(sha: String, url: String): HtmlurlSha = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlurlSha]
  }
  
  extension [Self <: HtmlurlSha](x: Self) {
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
