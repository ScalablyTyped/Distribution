package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListManualTriggersResponse extends js.Object {
  
  /** The list of manual triggers. This list will be absent if empty. */
  var manualTriggers: js.UndefOr[js.Array[ManualTrigger]] = js.native
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListManualTriggers` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListManualTriggersResponse {
  
  @scala.inline
  def apply(): ListManualTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListManualTriggersResponse]
  }
  
  @scala.inline
  implicit class ListManualTriggersResponseOps[Self <: ListManualTriggersResponse] (val x: Self) extends AnyVal {
    
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
    def setManualTriggersVarargs(value: ManualTrigger*): Self = this.set("manualTriggers", js.Array(value :_*))
    
    @scala.inline
    def setManualTriggers(value: js.Array[ManualTrigger]): Self = this.set("manualTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualTriggers: Self = this.set("manualTriggers", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
