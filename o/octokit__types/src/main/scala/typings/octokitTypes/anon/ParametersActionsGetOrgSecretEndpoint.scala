package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetOrgSecretRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetOrgSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsGetOrgSecretEndpoint = js.native
  
  var request: ActionsGetOrgSecretRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetOrgSecretResponseData] = js.native
}
object ParametersActionsGetOrgSecretEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetOrgSecretEndpoint,
    request: ActionsGetOrgSecretRequestOptions,
    response: OctokitResponse[ActionsGetOrgSecretResponseData]
  ): ParametersActionsGetOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetOrgSecretEndpointMutableBuilder[Self <: ParametersActionsGetOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsGetOrgSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetOrgSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetOrgSecretResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
