package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailableLocationsResponse extends StObject {
  
  /** One page of results from a call to `ListAvailableLocations`. */
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  
  /**
    * If the result list is too large to fit in a single response, then a token is returned. If the string is empty, then this response is the last page of results and all available
    * locations have been listed. This token can be used in a subsequent call to `ListAvailableLocations` to find more locations. Page tokens are short-lived and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListAvailableLocationsResponse {
  
  @scala.inline
  def apply(): ListAvailableLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableLocationsResponse]
  }
  
  @scala.inline
  implicit class ListAvailableLocationsResponseMutableBuilder[Self <: ListAvailableLocationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
