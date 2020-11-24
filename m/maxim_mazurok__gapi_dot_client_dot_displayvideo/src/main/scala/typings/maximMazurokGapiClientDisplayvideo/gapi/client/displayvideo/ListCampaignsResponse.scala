package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCampaignsResponse extends js.Object {
  
  /** The list of campaigns. This list will be absent if empty. */
  var campaigns: js.UndefOr[js.Array[Campaign]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCampaigns` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCampaignsResponse {
  
  @scala.inline
  def apply(): ListCampaignsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCampaignsResponse]
  }
  
  @scala.inline
  implicit class ListCampaignsResponseOps[Self <: ListCampaignsResponse] (val x: Self) extends AnyVal {
    
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
    def setCampaignsVarargs(value: Campaign*): Self = this.set("campaigns", js.Array(value :_*))
    
    @scala.inline
    def setCampaigns(value: js.Array[Campaign]): Self = this.set("campaigns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaigns: Self = this.set("campaigns", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
