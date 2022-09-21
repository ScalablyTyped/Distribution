package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveImportableDomainsResponse extends StObject {
  
  /** A list of domains that the calling user manages in Google Domains. */
  var domains: js.UndefOr[js.Array[Domain]] = js.undefined
  
  /** When present, there are more results to retrieve. Set `page_token` to this value on a subsequent call to get the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object RetrieveImportableDomainsResponse {
  
  inline def apply(): RetrieveImportableDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveImportableDomainsResponse]
  }
  
  extension [Self <: RetrieveImportableDomainsResponse](x: Self) {
    
    inline def setDomains(value: js.Array[Domain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
