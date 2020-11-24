package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTargetingOptionsResponse extends js.Object {
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListTargetingOptions` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of targeting options. This list will be absent if empty. */
  var targetingOptions: js.UndefOr[js.Array[TargetingOption]] = js.native
}
object ListTargetingOptionsResponse {
  
  @scala.inline
  def apply(): ListTargetingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetingOptionsResponse]
  }
  
  @scala.inline
  implicit class ListTargetingOptionsResponseOps[Self <: ListTargetingOptionsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTargetingOptionsVarargs(value: TargetingOption*): Self = this.set("targetingOptions", js.Array(value :_*))
    
    @scala.inline
    def setTargetingOptions(value: js.Array[TargetingOption]): Self = this.set("targetingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingOptions: Self = this.set("targetingOptions", js.undefined)
  }
}
