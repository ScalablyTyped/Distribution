package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveSamlSsoAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveSamlSsoAuthorizationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsRemoveSamlSsoAuthorizationEndpoint extends StObject {
  
  var parameters: OrgsRemoveSamlSsoAuthorizationEndpoint = js.native
  
  var request: OrgsRemoveSamlSsoAuthorizationRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersOrgsRemoveSamlSsoAuthorizationEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsRemoveSamlSsoAuthorizationEndpoint,
    request: OrgsRemoveSamlSsoAuthorizationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsRemoveSamlSsoAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveSamlSsoAuthorizationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsRemoveSamlSsoAuthorizationEndpointMutableBuilder[Self <: ParametersOrgsRemoveSamlSsoAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsRemoveSamlSsoAuthorizationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsRemoveSamlSsoAuthorizationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
