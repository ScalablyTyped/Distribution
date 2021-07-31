package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneRequestOptions
import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesCreateMilestoneEndpoint extends StObject {
  
  var parameters: IssuesCreateMilestoneEndpoint
  
  var request: IssuesCreateMilestoneRequestOptions
  
  var response: OctokitResponse[IssuesCreateMilestoneResponseData]
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
  implicit class ParametersIssuesCreateMilestoneEndpointMutableBuilder[Self <: ParametersIssuesCreateMilestoneEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesCreateMilestoneEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesCreateMilestoneRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesCreateMilestoneResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
