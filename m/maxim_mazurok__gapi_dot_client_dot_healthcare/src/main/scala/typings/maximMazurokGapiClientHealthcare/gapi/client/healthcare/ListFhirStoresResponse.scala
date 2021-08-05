package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFhirStoresResponse extends StObject {
  
  /** The returned FHIR stores. Won't be more FHIR stores than the value of page_size in the request. */
  var fhirStores: js.UndefOr[js.Array[FhirStore]] = js.undefined
  
  /** Token to retrieve the next page of results or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListFhirStoresResponse {
  
  inline def apply(): ListFhirStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFhirStoresResponse]
  }
  
  extension [Self <: ListFhirStoresResponse](x: Self) {
    
    inline def setFhirStores(value: js.Array[FhirStore]): Self = StObject.set(x, "fhirStores", value.asInstanceOf[js.Any])
    
    inline def setFhirStoresUndefined: Self = StObject.set(x, "fhirStores", js.undefined)
    
    inline def setFhirStoresVarargs(value: FhirStore*): Self = StObject.set(x, "fhirStores", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
