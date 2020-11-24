package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryRequest extends js.Object {
  
  /** Required. Third-party user ID. */
  var agentUserId: js.UndefOr[String] = js.native
  
  /** Required. Inputs containing third-party device IDs for which to get the device states. */
  var inputs: js.UndefOr[js.Array[QueryRequestInput]] = js.native
  
  /** Request ID used for debugging. */
  var requestId: js.UndefOr[String] = js.native
}
object QueryRequest {
  
  @scala.inline
  def apply(): QueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequest]
  }
  
  @scala.inline
  implicit class QueryRequestOps[Self <: QueryRequest] (val x: Self) extends AnyVal {
    
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
    def setAgentUserId(value: String): Self = this.set("agentUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentUserId: Self = this.set("agentUserId", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: QueryRequestInput*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: js.Array[QueryRequestInput]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
}
