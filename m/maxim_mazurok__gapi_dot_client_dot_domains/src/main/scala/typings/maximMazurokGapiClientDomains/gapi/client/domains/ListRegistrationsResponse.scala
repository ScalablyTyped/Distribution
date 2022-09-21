package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRegistrationsResponse extends StObject {
  
  /** When present, there are more results to retrieve. Set `page_token` to this value on a subsequent call to get the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of `Registration`s. */
  var registrations: js.UndefOr[js.Array[Registration]] = js.undefined
}
object ListRegistrationsResponse {
  
  inline def apply(): ListRegistrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegistrationsResponse]
  }
  
  extension [Self <: ListRegistrationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRegistrations(value: js.Array[Registration]): Self = StObject.set(x, "registrations", value.asInstanceOf[js.Any])
    
    inline def setRegistrationsUndefined: Self = StObject.set(x, "registrations", js.undefined)
    
    inline def setRegistrationsVarargs(value: Registration*): Self = StObject.set(x, "registrations", js.Array(value*))
  }
}
