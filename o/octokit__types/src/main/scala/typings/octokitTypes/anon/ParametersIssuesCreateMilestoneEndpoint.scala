package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneRequestOptions
import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesCreateMilestoneEndpoint extends js.Object {
  
  var parameters: IssuesCreateMilestoneEndpoint = js.native
  
  var request: IssuesCreateMilestoneRequestOptions = js.native
  
  var response: OctokitResponse[IssuesCreateMilestoneResponseData] = js.native
}
object ParametersIssuesCreateMilestoneEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesCreateMilestoneEndpoint,
    request: IssuesCreateMilestoneRequestOptions,
    response: OctokitResponse[IssuesCreateMilestoneResponseData]
  ): ParametersIssuesCreateMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCreateMilestoneEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesCreateMilestoneEndpointOps[Self <: ParametersIssuesCreateMilestoneEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesCreateMilestoneEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesCreateMilestoneRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesCreateMilestoneResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
