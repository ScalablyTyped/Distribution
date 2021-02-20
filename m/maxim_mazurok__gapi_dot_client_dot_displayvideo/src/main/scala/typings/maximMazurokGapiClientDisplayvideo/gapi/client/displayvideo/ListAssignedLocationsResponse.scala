package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssignedLocationsResponse extends StObject {
  
  /** The list of assigned locations. This list will be absent if empty. */
  var assignedLocations: js.UndefOr[js.Array[AssignedLocation]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListAssignedLocations` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAssignedLocationsResponse {
  
  @scala.inline
  def apply(): ListAssignedLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssignedLocationsResponse]
  }
  
  @scala.inline
  implicit class ListAssignedLocationsResponseMutableBuilder[Self <: ListAssignedLocationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedLocations(value: js.Array[AssignedLocation]): Self = StObject.set(x, "assignedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedLocationsUndefined: Self = StObject.set(x, "assignedLocations", js.undefined)
    
    @scala.inline
    def setAssignedLocationsVarargs(value: AssignedLocation*): Self = StObject.set(x, "assignedLocations", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
