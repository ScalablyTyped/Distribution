package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListSelectedReposForOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsListSelectedReposForOrgSecretEndpoint
  
  var response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData] & `5`
}
object ParametersActionsListSelectedReposForOrgSecretEndpoint {
  
  inline def apply(
    parameters: ActionsListSelectedReposForOrgSecretEndpoint,
    response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData] & `5`
  ): ParametersActionsListSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelectedReposForOrgSecretEndpoint]
  }
  
  extension [Self <: ParametersActionsListSelectedReposForOrgSecretEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsListSelectedReposForOrgSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData] & `5`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
