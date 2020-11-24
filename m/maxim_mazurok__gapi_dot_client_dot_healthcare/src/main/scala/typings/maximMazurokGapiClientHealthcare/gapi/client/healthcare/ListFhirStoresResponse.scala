package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFhirStoresResponse extends js.Object {
  
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
  implicit class ListFhirStoresResponseOps[Self <: ListFhirStoresResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFhirStoresVarargs(value: FhirStore*): Self = this.set("fhirStores", js.Array(value :_*))
    
    @scala.inline
    def setFhirStores(value: js.Array[FhirStore]): Self = this.set("fhirStores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFhirStores: Self = this.set("fhirStores", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
