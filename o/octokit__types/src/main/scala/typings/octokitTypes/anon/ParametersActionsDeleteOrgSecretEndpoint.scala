package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsDeleteOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsDeleteOrgSecretEndpoint = js.native
  
  var request: ActionsDeleteOrgSecretRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsDeleteOrgSecretEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsDeleteOrgSecretEndpoint,
    request: ActionsDeleteOrgSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsDeleteOrgSecretEndpointMutableBuilder[Self <: ParametersActionsDeleteOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsDeleteOrgSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDeleteOrgSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
