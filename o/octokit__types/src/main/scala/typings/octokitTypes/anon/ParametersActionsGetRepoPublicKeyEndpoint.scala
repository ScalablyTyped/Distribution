package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetRepoPublicKeyEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetRepoPublicKeyRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetRepoPublicKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetRepoPublicKeyEndpoint extends StObject {
  
  var parameters: ActionsGetRepoPublicKeyEndpoint = js.native
  
  var request: ActionsGetRepoPublicKeyRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetRepoPublicKeyResponseData] = js.native
}
object ParametersActionsGetRepoPublicKeyEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetRepoPublicKeyEndpoint,
    request: ActionsGetRepoPublicKeyRequestOptions,
    response: OctokitResponse[ActionsGetRepoPublicKeyResponseData]
  ): ParametersActionsGetRepoPublicKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetRepoPublicKeyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetRepoPublicKeyEndpointMutableBuilder[Self <: ParametersActionsGetRepoPublicKeyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsGetRepoPublicKeyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetRepoPublicKeyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetRepoPublicKeyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
