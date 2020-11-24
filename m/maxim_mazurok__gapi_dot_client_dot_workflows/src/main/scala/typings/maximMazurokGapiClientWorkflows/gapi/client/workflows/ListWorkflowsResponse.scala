package typings.maximMazurokGapiClientWorkflows.gapi.client.workflows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorkflowsResponse extends js.Object {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Unreachable resources. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
  
  /** The workflows which match the request. */
  var workflows: js.UndefOr[js.Array[Workflow]] = js.native
}
object ListWorkflowsResponse {
  
  @scala.inline
  def apply(): ListWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkflowsResponse]
  }
  
  @scala.inline
  implicit class ListWorkflowsResponseOps[Self <: ListWorkflowsResponse] (val x: Self) extends AnyVal {
    
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
    def setUnreachableVarargs(value: String*): Self = this.set("unreachable", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = this.set("unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreachable: Self = this.set("unreachable", js.undefined)
    
    @scala.inline
    def setWorkflowsVarargs(value: Workflow*): Self = this.set("workflows", js.Array(value :_*))
    
    @scala.inline
    def setWorkflows(value: js.Array[Workflow]): Self = this.set("workflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkflows: Self = this.set("workflows", js.undefined)
  }
}
