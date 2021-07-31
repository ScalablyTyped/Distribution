package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesListLabelsForMilestoneEndpoint extends StObject {
  
  var parameters: IssuesListLabelsForMilestoneEndpoint
  
  var request: IssuesListLabelsForMilestoneRequestOptions
  
  var response: OctokitResponse[IssuesListLabelsForMilestoneResponseData]
}
object ParametersIssuesListLabelsForMilestoneEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListLabelsForMilestoneEndpoint,
    request: IssuesListLabelsForMilestoneRequestOptions,
    response: OctokitResponse[IssuesListLabelsForMilestoneResponseData]
  ): ParametersIssuesListLabelsForMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListLabelsForMilestoneEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListLabelsForMilestoneEndpointMutableBuilder[Self <: ParametersIssuesListLabelsForMilestoneEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListLabelsForMilestoneEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListLabelsForMilestoneRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListLabelsForMilestoneResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
