package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SitemapsListResponse extends StObject {
  
  /** Contains detailed information about a specific URL submitted as a [sitemap](https://support.google.com/webmasters/answer/156184). */
  var sitemap: js.UndefOr[js.Array[WmxSitemap]] = js.undefined
}
object SitemapsListResponse {
  
  @scala.inline
  def apply(): SitemapsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SitemapsListResponse]
  }
  
  @scala.inline
  implicit class SitemapsListResponseMutableBuilder[Self <: SitemapsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSitemap(value: js.Array[WmxSitemap]): Self = StObject.set(x, "sitemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSitemapUndefined: Self = StObject.set(x, "sitemap", js.undefined)
    
    @scala.inline
    def setSitemapVarargs(value: WmxSitemap*): Self = StObject.set(x, "sitemap", js.Array(value :_*))
  }
}
