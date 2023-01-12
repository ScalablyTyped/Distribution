package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssignedLocationsResponse extends StObject {
  
  /** The list of assigned locations. This list will be absent if empty. */
  var assignedLocations: js.UndefOr[js.Array[AssignedLocation]] = js.undefined
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListAssignedLocations` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListAssignedLocationsResponse {
  
  inline def apply(): ListAssignedLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssignedLocationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssignedLocationsResponse] (val x: Self) extends AnyVal {
    
    inline def setAssignedLocations(value: js.Array[AssignedLocation]): Self = StObject.set(x, "assignedLocations", value.asInstanceOf[js.Any])
    
    inline def setAssignedLocationsUndefined: Self = StObject.set(x, "assignedLocations", js.undefined)
    
    inline def setAssignedLocationsVarargs(value: AssignedLocation*): Self = StObject.set(x, "assignedLocations", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
