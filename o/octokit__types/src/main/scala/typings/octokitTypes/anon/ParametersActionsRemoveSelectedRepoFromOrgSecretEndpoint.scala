package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsRemoveSelectedRepoFromOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsRemoveSelectedRepoFromOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsRemoveSelectedRepoFromOrgSecretEndpoint
  
  var request: ActionsRemoveSelectedRepoFromOrgSecretRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsRemoveSelectedRepoFromOrgSecretEndpoint,
    request: ActionsRemoveSelectedRepoFromOrgSecretRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsRemoveSelectedRepoFromOrgSecretEndpointMutableBuilder[Self <: ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsRemoveSelectedRepoFromOrgSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsRemoveSelectedRepoFromOrgSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
