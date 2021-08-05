package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteSelfHostedRunnerFromOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteSelfHostedRunnerFromOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsDeleteSelfHostedRunnerFromOrgEndpoint extends StObject {
  
  var parameters: ActionsDeleteSelfHostedRunnerFromOrgEndpoint
  
  var request: ActionsDeleteSelfHostedRunnerFromOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsDeleteSelfHostedRunnerFromOrgEndpoint {
  
  inline def apply(
    parameters: ActionsDeleteSelfHostedRunnerFromOrgEndpoint,
    request: ActionsDeleteSelfHostedRunnerFromOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsDeleteSelfHostedRunnerFromOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteSelfHostedRunnerFromOrgEndpoint]
  }
  
  extension [Self <: ParametersActionsDeleteSelfHostedRunnerFromOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsDeleteSelfHostedRunnerFromOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsDeleteSelfHostedRunnerFromOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
