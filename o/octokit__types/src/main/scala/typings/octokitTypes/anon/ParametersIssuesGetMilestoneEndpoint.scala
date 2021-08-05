package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesGetMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetMilestoneRequestOptions
import typings.octokitTypes.endpointsMod.IssuesGetMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesGetMilestoneEndpoint extends StObject {
  
  var parameters: IssuesGetMilestoneEndpoint
  
  var request: IssuesGetMilestoneRequestOptions
  
  var response: OctokitResponse[IssuesGetMilestoneResponseData]
}
object ParametersIssuesGetMilestoneEndpoint {
  
  inline def apply(
    parameters: IssuesGetMilestoneEndpoint,
    request: IssuesGetMilestoneRequestOptions,
    response: OctokitResponse[IssuesGetMilestoneResponseData]
  ): ParametersIssuesGetMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetMilestoneEndpoint]
  }
  
  extension [Self <: ParametersIssuesGetMilestoneEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesGetMilestoneEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IssuesGetMilestoneRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesGetMilestoneResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
