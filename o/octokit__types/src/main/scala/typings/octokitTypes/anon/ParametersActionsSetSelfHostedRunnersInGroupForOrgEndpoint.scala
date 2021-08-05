package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsSetSelfHostedRunnersInGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsSetSelfHostedRunnersInGroupForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsSetSelfHostedRunnersInGroupForOrgEndpoint extends StObject {
  
  var parameters: ActionsSetSelfHostedRunnersInGroupForOrgEndpoint
  
  var request: ActionsSetSelfHostedRunnersInGroupForOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsSetSelfHostedRunnersInGroupForOrgEndpoint {
  
  inline def apply(
    parameters: ActionsSetSelfHostedRunnersInGroupForOrgEndpoint,
    request: ActionsSetSelfHostedRunnersInGroupForOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsSetSelfHostedRunnersInGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsSetSelfHostedRunnersInGroupForOrgEndpoint]
  }
  
  extension [Self <: ParametersActionsSetSelfHostedRunnersInGroupForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsSetSelfHostedRunnersInGroupForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsSetSelfHostedRunnersInGroupForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
