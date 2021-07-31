package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlurlSha extends StObject {
  
  var html_url: String
  
  var sha: String
  
  var url: String
}
object HtmlurlSha {
  
  @scala.inline
  def apply(html_url: String, sha: String, url: String): HtmlurlSha = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlurlSha]
  }
  
  @scala.inline
  implicit class HtmlurlShaMutableBuilder[Self <: HtmlurlSha] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
