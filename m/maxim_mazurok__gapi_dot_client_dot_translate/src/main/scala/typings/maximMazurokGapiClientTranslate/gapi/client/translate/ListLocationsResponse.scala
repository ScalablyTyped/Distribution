package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLocationsResponse extends StObject {
  
  /** A list of locations that matches the specified filter in the request. */
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListLocationsResponse {
  
  @scala.inline
  def apply(): ListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLocationsResponse]
  }
  
  @scala.inline
  implicit class ListLocationsResponseMutableBuilder[Self <: ListLocationsResponse] (val x: Self) extends AnyVal {
    
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
