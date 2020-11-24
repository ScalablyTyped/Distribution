package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLineItemAssignedTargetingOptionsResponse extends js.Object {
  
  /** The list of assigned targeting options. This list will be absent if empty. */
  var assignedTargetingOptions: js.UndefOr[js.Array[AssignedTargetingOption]] = js.native
  
  /**
    * A token identifying the next page of results. This value should be specified as the pageToken in a subsequent ListLineItemAssignedTargetingOptionsRequest to fetch the next page of
    * results. This token will be absent if there are no more assigned_targeting_options to return.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListLineItemAssignedTargetingOptionsResponse {
  
  @scala.inline
  def apply(): ListLineItemAssignedTargetingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLineItemAssignedTargetingOptionsResponse]
  }
  
  @scala.inline
  implicit class ListLineItemAssignedTargetingOptionsResponseOps[Self <: ListLineItemAssignedTargetingOptionsResponse] (val x: Self) extends AnyVal {
    
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
    def setAssignedTargetingOptionsVarargs(value: AssignedTargetingOption*): Self = this.set("assignedTargetingOptions", js.Array(value :_*))
    
    @scala.inline
    def setAssignedTargetingOptions(value: js.Array[AssignedTargetingOption]): Self = this.set("assignedTargetingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedTargetingOptions: Self = this.set("assignedTargetingOptions", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
