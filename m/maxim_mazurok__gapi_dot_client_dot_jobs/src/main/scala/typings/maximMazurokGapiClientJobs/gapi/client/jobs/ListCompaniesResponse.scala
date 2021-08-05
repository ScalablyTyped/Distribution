package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCompaniesResponse extends StObject {
  
  /** Companies for the current client. */
  var companies: js.UndefOr[js.Array[Company]] = js.undefined
  
  /** Additional information for the API invocation, such as the request tracking id. */
  var metadata: js.UndefOr[ResponseMetadata] = js.undefined
  
  /** A token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCompaniesResponse {
  
  inline def apply(): ListCompaniesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCompaniesResponse]
  }
  
  extension [Self <: ListCompaniesResponse](x: Self) {
    
    inline def setCompanies(value: js.Array[Company]): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
    
    inline def setCompaniesUndefined: Self = StObject.set(x, "companies", js.undefined)
    
    inline def setCompaniesVarargs(value: Company*): Self = StObject.set(x, "companies", js.Array(value :_*))
    
    inline def setMetadata(value: ResponseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
