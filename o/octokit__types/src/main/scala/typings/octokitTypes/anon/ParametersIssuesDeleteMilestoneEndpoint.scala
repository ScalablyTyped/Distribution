package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesDeleteMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesDeleteMilestoneRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesDeleteMilestoneEndpoint extends StObject {
  
  var parameters: IssuesDeleteMilestoneEndpoint
  
  var request: IssuesDeleteMilestoneRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersIssuesDeleteMilestoneEndpoint {
  
  inline def apply(
    parameters: IssuesDeleteMilestoneEndpoint,
    request: IssuesDeleteMilestoneRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersIssuesDeleteMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesDeleteMilestoneEndpoint]
  }
  
  extension [Self <: ParametersIssuesDeleteMilestoneEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesDeleteMilestoneEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IssuesDeleteMilestoneRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
