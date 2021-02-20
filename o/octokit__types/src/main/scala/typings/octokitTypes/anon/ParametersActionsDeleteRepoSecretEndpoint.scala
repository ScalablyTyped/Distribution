package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteRepoSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteRepoSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsDeleteRepoSecretEndpoint extends StObject {
  
  var parameters: ActionsDeleteRepoSecretEndpoint = js.native
  
  var request: ActionsDeleteRepoSecretRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsDeleteRepoSecretEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsDeleteRepoSecretEndpoint,
    request: ActionsDeleteRepoSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteRepoSecretEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsDeleteRepoSecretEndpointMutableBuilder[Self <: ParametersActionsDeleteRepoSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsDeleteRepoSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDeleteRepoSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
