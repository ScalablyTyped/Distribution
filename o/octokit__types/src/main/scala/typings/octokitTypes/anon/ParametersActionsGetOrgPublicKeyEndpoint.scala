package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetOrgPublicKeyEndpoint extends StObject {
  
  var parameters: ActionsGetOrgPublicKeyEndpoint = js.native
  
  var request: ActionsGetOrgPublicKeyRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetOrgPublicKeyResponseData] = js.native
}
object ParametersActionsGetOrgPublicKeyEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetOrgPublicKeyEndpoint,
    request: ActionsGetOrgPublicKeyRequestOptions,
    response: OctokitResponse[ActionsGetOrgPublicKeyResponseData]
  ): ParametersActionsGetOrgPublicKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetOrgPublicKeyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetOrgPublicKeyEndpointMutableBuilder[Self <: ParametersActionsGetOrgPublicKeyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsGetOrgPublicKeyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetOrgPublicKeyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetOrgPublicKeyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
