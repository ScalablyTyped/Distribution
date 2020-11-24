package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCustomBiddingAlgorithmsResponse extends js.Object {
  
  /** The list of custom bidding algorithms. This list will be absent if empty. */
  var customBiddingAlgorithms: js.UndefOr[js.Array[CustomBiddingAlgorithm]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCustomBiddingAlgorithmsRequest` method to retrieve the next page
    * of results. If this field is null, it means this is the last page.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCustomBiddingAlgorithmsResponse {
  
  @scala.inline
  def apply(): ListCustomBiddingAlgorithmsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomBiddingAlgorithmsResponse]
  }
  
  @scala.inline
  implicit class ListCustomBiddingAlgorithmsResponseOps[Self <: ListCustomBiddingAlgorithmsResponse] (val x: Self) extends AnyVal {
    
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
    def setCustomBiddingAlgorithmsVarargs(value: CustomBiddingAlgorithm*): Self = this.set("customBiddingAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setCustomBiddingAlgorithms(value: js.Array[CustomBiddingAlgorithm]): Self = this.set("customBiddingAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomBiddingAlgorithms: Self = this.set("customBiddingAlgorithms", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
