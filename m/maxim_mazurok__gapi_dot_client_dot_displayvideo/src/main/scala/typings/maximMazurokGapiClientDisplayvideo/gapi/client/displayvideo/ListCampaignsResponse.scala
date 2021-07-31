package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCampaignsResponse extends StObject {
  
  /** The list of campaigns. This list will be absent if empty. */
  var campaigns: js.UndefOr[js.Array[Campaign]] = js.undefined
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCampaigns` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCampaignsResponse {
  
  @scala.inline
  def apply(): ListCampaignsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCampaignsResponse]
  }
  
  @scala.inline
  implicit class ListCampaignsResponseMutableBuilder[Self <: ListCampaignsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaigns(value: js.Array[Campaign]): Self = StObject.set(x, "campaigns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignsUndefined: Self = StObject.set(x, "campaigns", js.undefined)
    
    @scala.inline
    def setCampaignsVarargs(value: Campaign*): Self = StObject.set(x, "campaigns", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
