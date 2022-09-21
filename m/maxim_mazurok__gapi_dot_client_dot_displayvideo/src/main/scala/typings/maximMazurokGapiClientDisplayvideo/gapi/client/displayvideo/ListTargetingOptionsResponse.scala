package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetingOptionsResponse extends StObject {
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListTargetingOptions` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of targeting options. This list will be absent if empty. */
  var targetingOptions: js.UndefOr[js.Array[TargetingOption]] = js.undefined
}
object ListTargetingOptionsResponse {
  
  inline def apply(): ListTargetingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetingOptionsResponse]
  }
  
  extension [Self <: ListTargetingOptionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTargetingOptions(value: js.Array[TargetingOption]): Self = StObject.set(x, "targetingOptions", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionsUndefined: Self = StObject.set(x, "targetingOptions", js.undefined)
    
    inline def setTargetingOptionsVarargs(value: TargetingOption*): Self = StObject.set(x, "targetingOptions", js.Array(value*))
  }
}
