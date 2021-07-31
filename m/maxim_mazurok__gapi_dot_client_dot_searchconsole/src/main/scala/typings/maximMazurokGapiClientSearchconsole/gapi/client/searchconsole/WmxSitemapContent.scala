package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WmxSitemapContent extends StObject {
  
  /** The number of URLs from the sitemap that were indexed (of the content type). */
  var indexed: js.UndefOr[String] = js.undefined
  
  /** The number of URLs in the sitemap (of the content type). */
  var submitted: js.UndefOr[String] = js.undefined
  
  /** The specific type of content in this sitemap. For example: `web`. */
  var `type`: js.UndefOr[String] = js.undefined
}
object WmxSitemapContent {
  
  @scala.inline
  def apply(): WmxSitemapContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WmxSitemapContent]
  }
  
  @scala.inline
  implicit class WmxSitemapContentMutableBuilder[Self <: WmxSitemapContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexed(value: String): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
    
    @scala.inline
    def setSubmitted(value: String): Self = StObject.set(x, "submitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedUndefined: Self = StObject.set(x, "submitted", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
