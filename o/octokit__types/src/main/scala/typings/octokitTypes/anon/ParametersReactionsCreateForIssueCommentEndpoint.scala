package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueCommentRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsCreateForIssueCommentEndpoint extends js.Object {
  
  var parameters: ReactionsCreateForIssueCommentEndpoint = js.native
  
  var request: ReactionsCreateForIssueCommentRequestOptions = js.native
  
  var response: OctokitResponse[ReactionsCreateForIssueCommentResponseData] = js.native
}
object ParametersReactionsCreateForIssueCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsCreateForIssueCommentEndpoint,
    request: ReactionsCreateForIssueCommentRequestOptions,
    response: OctokitResponse[ReactionsCreateForIssueCommentResponseData]
  ): ParametersReactionsCreateForIssueCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForIssueCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsCreateForIssueCommentEndpointOps[Self <: ParametersReactionsCreateForIssueCommentEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReactionsCreateForIssueCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsCreateForIssueCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForIssueCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
