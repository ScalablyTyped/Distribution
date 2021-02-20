package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHl7V2StoresResponse extends StObject {
  
  /** The returned HL7v2 stores. Won't be more HL7v2 stores than the value of page_size in the request. */
  var hl7V2Stores: js.UndefOr[js.Array[Hl7V2Store]] = js.native
  
  /** Token to retrieve the next page of results or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListHl7V2StoresResponse {
  
  @scala.inline
  def apply(): ListHl7V2StoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHl7V2StoresResponse]
  }
  
  @scala.inline
  implicit class ListHl7V2StoresResponseMutableBuilder[Self <: ListHl7V2StoresResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHl7V2Stores(value: js.Array[Hl7V2Store]): Self = StObject.set(x, "hl7V2Stores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHl7V2StoresUndefined: Self = StObject.set(x, "hl7V2Stores", js.undefined)
    
    @scala.inline
    def setHl7V2StoresVarargs(value: Hl7V2Store*): Self = StObject.set(x, "hl7V2Stores", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
