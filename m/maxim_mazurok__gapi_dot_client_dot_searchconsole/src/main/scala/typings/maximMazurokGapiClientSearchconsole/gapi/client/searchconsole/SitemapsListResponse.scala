package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SitemapsListResponse extends StObject {
  
  /** Contains detailed information about a specific URL submitted as a [sitemap](https://support.google.com/webmasters/answer/156184). */
  var sitemap: js.UndefOr[js.Array[WmxSitemap]] = js.undefined
}
object SitemapsListResponse {
  
  inline def apply(): SitemapsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SitemapsListResponse]
  }
  
  extension [Self <: SitemapsListResponse](x: Self) {
    
    inline def setSitemap(value: js.Array[WmxSitemap]): Self = StObject.set(x, "sitemap", value.asInstanceOf[js.Any])
    
    inline def setSitemapUndefined: Self = StObject.set(x, "sitemap", js.undefined)
    
    inline def setSitemapVarargs(value: WmxSitemap*): Self = StObject.set(x, "sitemap", js.Array(value*))
  }
}
