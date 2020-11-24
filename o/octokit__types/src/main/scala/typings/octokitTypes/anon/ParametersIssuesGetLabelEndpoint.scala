package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesGetLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetLabelRequestOptions
import typings.octokitTypes.endpointsMod.IssuesGetLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesGetLabelEndpoint extends js.Object {
  
  var parameters: IssuesGetLabelEndpoint = js.native
  
  var request: IssuesGetLabelRequestOptions = js.native
  
  var response: OctokitResponse[IssuesGetLabelResponseData] = js.native
}
object ParametersIssuesGetLabelEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesGetLabelEndpoint,
    request: IssuesGetLabelRequestOptions,
    response: OctokitResponse[IssuesGetLabelResponseData]
  ): ParametersIssuesGetLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetLabelEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesGetLabelEndpointOps[Self <: ParametersIssuesGetLabelEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesGetLabelEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesGetLabelRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetLabelResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
