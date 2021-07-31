package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCreativesResponse extends StObject {
  
  /** The list of creatives. This list will be absent if empty. */
  var creatives: js.UndefOr[js.Array[Creative]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCreativesRequest` method to retrieve the next page of results.
    * If this field is null, it means this is the last page.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCreativesResponse {
  
  @scala.inline
  def apply(): ListCreativesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreativesResponse]
  }
  
  @scala.inline
  implicit class ListCreativesResponseMutableBuilder[Self <: ListCreativesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatives(value: js.Array[Creative]): Self = StObject.set(x, "creatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativesUndefined: Self = StObject.set(x, "creatives", js.undefined)
    
    @scala.inline
    def setCreativesVarargs(value: Creative*): Self = StObject.set(x, "creatives", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
