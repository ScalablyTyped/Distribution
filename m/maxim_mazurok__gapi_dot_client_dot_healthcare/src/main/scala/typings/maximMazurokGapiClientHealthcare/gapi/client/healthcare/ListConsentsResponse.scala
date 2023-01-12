package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConsentsResponse extends StObject {
  
  /** The returned Consents. The maximum number of Consents returned is determined by the value of page_size in the ListConsentsRequest. */
  var consents: js.UndefOr[js.Array[Consent]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListConsentsResponse {
  
  inline def apply(): ListConsentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConsentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConsentsResponse] (val x: Self) extends AnyVal {
    
    inline def setConsents(value: js.Array[Consent]): Self = StObject.set(x, "consents", value.asInstanceOf[js.Any])
    
    inline def setConsentsUndefined: Self = StObject.set(x, "consents", js.undefined)
    
    inline def setConsentsVarargs(value: Consent*): Self = StObject.set(x, "consents", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
