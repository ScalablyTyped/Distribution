package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCombinedAudiencesResponse extends StObject {
  
  /** The list of combined audiences. This list will be absent if empty. */
  var combinedAudiences: js.UndefOr[js.Array[CombinedAudience]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCombinedAudiences` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCombinedAudiencesResponse {
  
  @scala.inline
  def apply(): ListCombinedAudiencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCombinedAudiencesResponse]
  }
  
  @scala.inline
  implicit class ListCombinedAudiencesResponseMutableBuilder[Self <: ListCombinedAudiencesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCombinedAudiences(value: js.Array[CombinedAudience]): Self = StObject.set(x, "combinedAudiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombinedAudiencesUndefined: Self = StObject.set(x, "combinedAudiences", js.undefined)
    
    @scala.inline
    def setCombinedAudiencesVarargs(value: CombinedAudience*): Self = StObject.set(x, "combinedAudiences", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
