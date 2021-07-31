package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimUpdateAttributeForUserEndpoint
import typings.octokitTypes.endpointsMod.ScimUpdateAttributeForUserRequestOptions
import typings.octokitTypes.endpointsMod.ScimUpdateAttributeForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersScimUpdateAttributeForUserEndpoint extends StObject {
  
  var parameters: ScimUpdateAttributeForUserEndpoint
  
  var request: ScimUpdateAttributeForUserRequestOptions
  
  var response: OctokitResponse[ScimUpdateAttributeForUserResponseData]
}
object ParametersScimUpdateAttributeForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ScimUpdateAttributeForUserEndpoint,
    request: ScimUpdateAttributeForUserRequestOptions,
    response: OctokitResponse[ScimUpdateAttributeForUserResponseData]
  ): ParametersScimUpdateAttributeForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimUpdateAttributeForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersScimUpdateAttributeForUserEndpointMutableBuilder[Self <: ParametersScimUpdateAttributeForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ScimUpdateAttributeForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ScimUpdateAttributeForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ScimUpdateAttributeForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
