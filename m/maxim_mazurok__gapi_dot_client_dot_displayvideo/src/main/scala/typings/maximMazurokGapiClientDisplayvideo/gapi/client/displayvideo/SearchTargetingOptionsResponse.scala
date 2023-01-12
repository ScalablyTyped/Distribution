package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTargetingOptionsResponse extends StObject {
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `SearchTargetingOptions` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of targeting options that match the search criteria. This list will be absent if empty. */
  var targetingOptions: js.UndefOr[js.Array[TargetingOption]] = js.undefined
}
object SearchTargetingOptionsResponse {
  
  inline def apply(): SearchTargetingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTargetingOptionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchTargetingOptionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTargetingOptions(value: js.Array[TargetingOption]): Self = StObject.set(x, "targetingOptions", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionsUndefined: Self = StObject.set(x, "targetingOptions", js.undefined)
    
    inline def setTargetingOptionsVarargs(value: TargetingOption*): Self = StObject.set(x, "targetingOptions", js.Array(value*))
  }
}
