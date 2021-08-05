package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssignedInventorySourcesResponse extends StObject {
  
  /** The list of assigned inventory sources. This list will be absent if empty. */
  var assignedInventorySources: js.UndefOr[js.Array[AssignedInventorySource]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListAssignedInventorySources` method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListAssignedInventorySourcesResponse {
  
  inline def apply(): ListAssignedInventorySourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssignedInventorySourcesResponse]
  }
  
  extension [Self <: ListAssignedInventorySourcesResponse](x: Self) {
    
    inline def setAssignedInventorySources(value: js.Array[AssignedInventorySource]): Self = StObject.set(x, "assignedInventorySources", value.asInstanceOf[js.Any])
    
    inline def setAssignedInventorySourcesUndefined: Self = StObject.set(x, "assignedInventorySources", js.undefined)
    
    inline def setAssignedInventorySourcesVarargs(value: AssignedInventorySource*): Self = StObject.set(x, "assignedInventorySources", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
