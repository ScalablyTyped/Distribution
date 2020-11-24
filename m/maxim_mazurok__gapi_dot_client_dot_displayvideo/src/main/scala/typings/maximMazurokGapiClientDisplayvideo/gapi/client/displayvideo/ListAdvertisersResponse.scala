package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAdvertisersResponse extends js.Object {
  
  /** The list of advertisers. This list will be absent if empty. */
  var advertisers: js.UndefOr[js.Array[Advertiser]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListAdvertisers` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAdvertisersResponse {
  
  @scala.inline
  def apply(): ListAdvertisersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAdvertisersResponse]
  }
  
  @scala.inline
  implicit class ListAdvertisersResponseOps[Self <: ListAdvertisersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdvertisersVarargs(value: Advertiser*): Self = this.set("advertisers", js.Array(value :_*))
    
    @scala.inline
    def setAdvertisers(value: js.Array[Advertiser]): Self = this.set("advertisers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertisers: Self = this.set("advertisers", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
