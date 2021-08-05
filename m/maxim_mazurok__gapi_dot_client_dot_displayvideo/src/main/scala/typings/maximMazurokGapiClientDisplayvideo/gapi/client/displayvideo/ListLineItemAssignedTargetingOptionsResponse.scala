package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLineItemAssignedTargetingOptionsResponse extends StObject {
  
  /** The list of assigned targeting options. This list will be absent if empty. */
  var assignedTargetingOptions: js.UndefOr[js.Array[AssignedTargetingOption]] = js.undefined
  
  /**
    * A token identifying the next page of results. This value should be specified as the pageToken in a subsequent ListLineItemAssignedTargetingOptionsRequest to fetch the next page of
    * results. This token will be absent if there are no more assigned_targeting_options to return.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListLineItemAssignedTargetingOptionsResponse {
  
  inline def apply(): ListLineItemAssignedTargetingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLineItemAssignedTargetingOptionsResponse]
  }
  
  extension [Self <: ListLineItemAssignedTargetingOptionsResponse](x: Self) {
    
    inline def setAssignedTargetingOptions(value: js.Array[AssignedTargetingOption]): Self = StObject.set(x, "assignedTargetingOptions", value.asInstanceOf[js.Any])
    
    inline def setAssignedTargetingOptionsUndefined: Self = StObject.set(x, "assignedTargetingOptions", js.undefined)
    
    inline def setAssignedTargetingOptionsVarargs(value: AssignedTargetingOption*): Self = StObject.set(x, "assignedTargetingOptions", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
