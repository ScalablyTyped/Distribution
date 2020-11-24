package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListCommentsEndpoint
import typings.octokitTypes.endpointsMod.IssuesListCommentsRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListCommentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListCommentsEndpoint extends js.Object {
  
  var parameters: IssuesListCommentsEndpoint = js.native
  
  var request: IssuesListCommentsRequestOptions = js.native
  
  var response: OctokitResponse[IssuesListCommentsResponseData] = js.native
}
object ParametersIssuesListCommentsEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListCommentsEndpoint,
    request: IssuesListCommentsRequestOptions,
    response: OctokitResponse[IssuesListCommentsResponseData]
  ): ParametersIssuesListCommentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListCommentsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListCommentsEndpointOps[Self <: ParametersIssuesListCommentsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesListCommentsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListCommentsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListCommentsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
