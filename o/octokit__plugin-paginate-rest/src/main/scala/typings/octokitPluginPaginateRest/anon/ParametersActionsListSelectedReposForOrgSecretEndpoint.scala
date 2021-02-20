package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListSelectedReposForOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsListSelectedReposForOrgSecretEndpoint = js.native
  
  var response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData] with `5` = js.native
}
object ParametersActionsListSelectedReposForOrgSecretEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelectedReposForOrgSecretEndpoint,
    response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData] with `5`
  ): ParametersActionsListSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelectedReposForOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelectedReposForOrgSecretEndpointMutableBuilder[Self <: ParametersActionsListSelectedReposForOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListSelectedReposForOrgSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData] with `5`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
