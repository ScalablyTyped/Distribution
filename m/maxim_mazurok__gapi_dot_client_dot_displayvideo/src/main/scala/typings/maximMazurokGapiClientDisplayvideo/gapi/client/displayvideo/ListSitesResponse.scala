package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSitesResponse extends StObject {
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListSites` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of sites. This list will be absent if empty. */
  var sites: js.UndefOr[js.Array[Site]] = js.undefined
}
object ListSitesResponse {
  
  inline def apply(): ListSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSitesResponse]
  }
  
  extension [Self <: ListSitesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSites(value: js.Array[Site]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    inline def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    inline def setSitesVarargs(value: Site*): Self = StObject.set(x, "sites", js.Array(value*))
  }
}
