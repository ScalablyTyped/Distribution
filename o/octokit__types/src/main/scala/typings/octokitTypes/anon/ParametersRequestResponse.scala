package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsRevokeAuthorizationForApplicationEndpoint
import typings.octokitTypes.endpointsMod.AppsRevokeAuthorizationForApplicationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersRequestResponse extends StObject {
  
  var parameters: AppsRevokeAuthorizationForApplicationEndpoint
  
  var request: AppsRevokeAuthorizationForApplicationRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersRequestResponse {
  
  @scala.inline
  def apply(
    parameters: AppsRevokeAuthorizationForApplicationEndpoint,
    request: AppsRevokeAuthorizationForApplicationRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersRequestResponse = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRequestResponse]
  }
  
  @scala.inline
  implicit class ParametersRequestResponseMutableBuilder[Self <: ParametersRequestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsRevokeAuthorizationForApplicationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsRevokeAuthorizationForApplicationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
