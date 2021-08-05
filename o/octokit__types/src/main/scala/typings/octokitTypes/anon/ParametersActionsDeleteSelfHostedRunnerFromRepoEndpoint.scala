package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteSelfHostedRunnerFromRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteSelfHostedRunnerFromRepoRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsDeleteSelfHostedRunnerFromRepoEndpoint extends StObject {
  
  var parameters: ActionsDeleteSelfHostedRunnerFromRepoEndpoint
  
  var request: ActionsDeleteSelfHostedRunnerFromRepoRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsDeleteSelfHostedRunnerFromRepoEndpoint {
  
  inline def apply(
    parameters: ActionsDeleteSelfHostedRunnerFromRepoEndpoint,
    request: ActionsDeleteSelfHostedRunnerFromRepoRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsDeleteSelfHostedRunnerFromRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteSelfHostedRunnerFromRepoEndpoint]
  }
  
  extension [Self <: ParametersActionsDeleteSelfHostedRunnerFromRepoEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsDeleteSelfHostedRunnerFromRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsDeleteSelfHostedRunnerFromRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
