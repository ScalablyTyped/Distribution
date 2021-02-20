package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateRepoSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateRepoSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsCreateOrUpdateRepoSecretEndpoint extends StObject {
  
  var parameters: ActionsCreateOrUpdateRepoSecretEndpoint = js.native
  
  var request: ActionsCreateOrUpdateRepoSecretRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsCreateOrUpdateRepoSecretEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsCreateOrUpdateRepoSecretEndpoint,
    request: ActionsCreateOrUpdateRepoSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsCreateOrUpdateRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateOrUpdateRepoSecretEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsCreateOrUpdateRepoSecretEndpointMutableBuilder[Self <: ParametersActionsCreateOrUpdateRepoSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsCreateOrUpdateRepoSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsCreateOrUpdateRepoSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
