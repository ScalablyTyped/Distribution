package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCrawledUrlsResponse extends StObject {
  
  /** The list of CrawledUrls returned. */
  var crawledUrls: js.UndefOr[js.Array[CrawledUrl]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCrawledUrlsResponse {
  
  inline def apply(): ListCrawledUrlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCrawledUrlsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCrawledUrlsResponse] (val x: Self) extends AnyVal {
    
    inline def setCrawledUrls(value: js.Array[CrawledUrl]): Self = StObject.set(x, "crawledUrls", value.asInstanceOf[js.Any])
    
    inline def setCrawledUrlsUndefined: Self = StObject.set(x, "crawledUrls", js.undefined)
    
    inline def setCrawledUrlsVarargs(value: CrawledUrl*): Self = StObject.set(x, "crawledUrls", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
