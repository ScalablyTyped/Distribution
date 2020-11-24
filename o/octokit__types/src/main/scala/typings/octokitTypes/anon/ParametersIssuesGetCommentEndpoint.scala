package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesGetCommentEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetCommentRequestOptions
import typings.octokitTypes.endpointsMod.IssuesGetCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesGetCommentEndpoint extends js.Object {
  
  var parameters: IssuesGetCommentEndpoint = js.native
  
  var request: IssuesGetCommentRequestOptions = js.native
  
  var response: OctokitResponse[IssuesGetCommentResponseData] = js.native
}
object ParametersIssuesGetCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesGetCommentEndpoint,
    request: IssuesGetCommentRequestOptions,
    response: OctokitResponse[IssuesGetCommentResponseData]
  ): ParametersIssuesGetCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesGetCommentEndpointOps[Self <: ParametersIssuesGetCommentEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesGetCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesGetCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
