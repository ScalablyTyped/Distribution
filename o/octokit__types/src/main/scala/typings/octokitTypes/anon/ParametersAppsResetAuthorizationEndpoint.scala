package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsResetAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.AppsResetAuthorizationRequestOptions
import typings.octokitTypes.endpointsMod.AppsResetAuthorizationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsResetAuthorizationEndpoint extends StObject {
  
  var parameters: AppsResetAuthorizationEndpoint = js.native
  
  var request: AppsResetAuthorizationRequestOptions = js.native
  
  var response: OctokitResponse[AppsResetAuthorizationResponseData] = js.native
}
object ParametersAppsResetAuthorizationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsResetAuthorizationEndpoint,
    request: AppsResetAuthorizationRequestOptions,
    response: OctokitResponse[AppsResetAuthorizationResponseData]
  ): ParametersAppsResetAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsResetAuthorizationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsResetAuthorizationEndpointMutableBuilder[Self <: ParametersAppsResetAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsResetAuthorizationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsResetAuthorizationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsResetAuthorizationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
