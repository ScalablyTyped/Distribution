package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlurlUrl extends StObject {
  
  var html_url: String
  
  var url: String
}
object HtmlurlUrl {
  
  @scala.inline
  def apply(html_url: String, url: String): HtmlurlUrl = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlurlUrl]
  }
  
  @scala.inline
  implicit class HtmlurlUrlMutableBuilder[Self <: HtmlurlUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
