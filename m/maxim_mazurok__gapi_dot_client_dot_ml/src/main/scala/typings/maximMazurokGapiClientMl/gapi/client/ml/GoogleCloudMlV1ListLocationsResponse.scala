package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1ListLocationsResponse extends StObject {
  
  /** Locations where at least one type of CMLE capability is available. */
  var locations: js.UndefOr[js.Array[GoogleCloudMlV1Location]] = js.undefined
  
  /** Optional. Pass this token as the `page_token` field of the request for a subsequent call. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1ListLocationsResponse {
  
  inline def apply(): GoogleCloudMlV1ListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ListLocationsResponse]
  }
  
  extension [Self <: GoogleCloudMlV1ListLocationsResponse](x: Self) {
    
    inline def setLocations(value: js.Array[GoogleCloudMlV1Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: GoogleCloudMlV1Location*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
