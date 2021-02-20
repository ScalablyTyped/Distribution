package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsAddSelectedRepoToOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsAddSelectedRepoToOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsAddSelectedRepoToOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsAddSelectedRepoToOrgSecretEndpoint = js.native
  
  var request: ActionsAddSelectedRepoToOrgSecretRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsAddSelectedRepoToOrgSecretEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsAddSelectedRepoToOrgSecretEndpoint,
    request: ActionsAddSelectedRepoToOrgSecretRequestOptions,
    response: OctokitResponse[_]
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
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
