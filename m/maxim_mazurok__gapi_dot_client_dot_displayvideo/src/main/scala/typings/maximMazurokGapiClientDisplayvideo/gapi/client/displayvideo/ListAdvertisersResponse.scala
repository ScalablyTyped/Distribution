package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAdvertisersResponse extends StObject {
  
  /** The list of advertisers. This list will be absent if empty. */
  var advertisers: js.UndefOr[js.Array[Advertiser]] = js.undefined
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListAdvertisers` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListAdvertisersResponse {
  
  @scala.inline
  def apply(): ListAdvertisersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAdvertisersResponse]
  }
  
  @scala.inline
  implicit class ListAdvertisersResponseMutableBuilder[Self <: ListAdvertisersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisers(value: js.Array[Advertiser]): Self = StObject.set(x, "advertisers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisersUndefined: Self = StObject.set(x, "advertisers", js.undefined)
    
    @scala.inline
    def setAdvertisersVarargs(value: Advertiser*): Self = StObject.set(x, "advertisers", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
