package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsCreateForIssueEndpoint extends js.Object {
  
  var parameters: ReactionsCreateForIssueEndpoint = js.native
  
  var request: ReactionsCreateForIssueRequestOptions = js.native
  
  var response: OctokitResponse[ReactionsCreateForIssueResponseData] = js.native
}
object ParametersReactionsCreateForIssueEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsCreateForIssueEndpoint,
    request: ReactionsCreateForIssueRequestOptions,
    response: OctokitResponse[ReactionsCreateForIssueResponseData]
  ): ParametersReactionsCreateForIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForIssueEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsCreateForIssueEndpointOps[Self <: ParametersReactionsCreateForIssueEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReactionsCreateForIssueEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsCreateForIssueRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForIssueResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
