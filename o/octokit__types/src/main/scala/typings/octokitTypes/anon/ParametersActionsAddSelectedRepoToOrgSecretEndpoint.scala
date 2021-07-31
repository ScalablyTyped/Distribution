package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsAddSelectedRepoToOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsAddSelectedRepoToOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsAddSelectedRepoToOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsAddSelectedRepoToOrgSecretEndpoint
  
  var request: ActionsAddSelectedRepoToOrgSecretRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsAddSelectedRepoToOrgSecretEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsAddSelectedRepoToOrgSecretEndpoint,
    request: ActionsAddSelectedRepoToOrgSecretRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsAddSelectedRepoToOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsAddSelectedRepoToOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsAddSelectedRepoToOrgSecretEndpointMutableBuilder[Self <: ParametersActionsAddSelectedRepoToOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsAddSelectedRepoToOrgSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsAddSelectedRepoToOrgSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
