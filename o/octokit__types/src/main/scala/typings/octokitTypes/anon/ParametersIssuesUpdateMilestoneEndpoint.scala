package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesUpdateMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateMilestoneRequestOptions
import typings.octokitTypes.endpointsMod.IssuesUpdateMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesUpdateMilestoneEndpoint extends StObject {
  
  var parameters: IssuesUpdateMilestoneEndpoint
  
  var request: IssuesUpdateMilestoneRequestOptions
  
  var response: OctokitResponse[IssuesUpdateMilestoneResponseData]
}
object ParametersIssuesUpdateMilestoneEndpoint {
  
  inline def apply(
    parameters: IssuesUpdateMilestoneEndpoint,
    request: IssuesUpdateMilestoneRequestOptions,
    response: OctokitResponse[IssuesUpdateMilestoneResponseData]
  ): ParametersIssuesUpdateMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateMilestoneEndpoint]
  }
  
  extension [Self <: ParametersIssuesUpdateMilestoneEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesUpdateMilestoneEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IssuesUpdateMilestoneRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesUpdateMilestoneResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
