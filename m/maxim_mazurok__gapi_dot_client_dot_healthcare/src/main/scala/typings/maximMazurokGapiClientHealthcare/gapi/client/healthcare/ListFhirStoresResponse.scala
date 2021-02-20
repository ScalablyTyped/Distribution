package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFhirStoresResponse extends StObject {
  
  /** The returned FHIR stores. Won't be more FHIR stores than the value of page_size in the request. */
  var fhirStores: js.UndefOr[js.Array[FhirStore]] = js.native
  
  /** Token to retrieve the next page of results or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListFhirStoresResponse {
  
  @scala.inline
  def apply(): ListFhirStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFhirStoresResponse]
  }
  
  @scala.inline
  implicit class ListFhirStoresResponseMutableBuilder[Self <: ListFhirStoresResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFhirStores(value: js.Array[FhirStore]): Self = StObject.set(x, "fhirStores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFhirStoresUndefined: Self = StObject.set(x, "fhirStores", js.undefined)
    
    @scala.inline
    def setFhirStoresVarargs(value: FhirStore*): Self = StObject.set(x, "fhirStores", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
