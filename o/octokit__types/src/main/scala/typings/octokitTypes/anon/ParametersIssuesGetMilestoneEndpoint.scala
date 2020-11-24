package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesGetMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetMilestoneRequestOptions
import typings.octokitTypes.endpointsMod.IssuesGetMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesGetMilestoneEndpoint extends js.Object {
  
  var parameters: IssuesGetMilestoneEndpoint = js.native
  
  var request: IssuesGetMilestoneRequestOptions = js.native
  
  var response: OctokitResponse[IssuesGetMilestoneResponseData] = js.native
}
object ParametersIssuesGetMilestoneEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesGetMilestoneEndpoint,
    request: IssuesGetMilestoneRequestOptions,
    response: OctokitResponse[IssuesGetMilestoneResponseData]
  ): ParametersIssuesGetMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetMilestoneEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesGetMilestoneEndpointOps[Self <: ParametersIssuesGetMilestoneEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesGetMilestoneEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesGetMilestoneRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetMilestoneResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
