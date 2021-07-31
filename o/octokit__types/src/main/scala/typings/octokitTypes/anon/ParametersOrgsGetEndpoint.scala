package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsGetEndpoint extends StObject {
  
  var parameters: OrgsGetEndpoint
  
  var request: OrgsGetRequestOptions
  
  var response: OctokitResponse[OrgsGetResponseData]
}
object ParametersOrgsGetEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsGetEndpoint,
    request: OrgsGetRequestOptions,
    response: OctokitResponse[OrgsGetResponseData]
  ): ParametersOrgsGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsGetEndpointMutableBuilder[Self <: ParametersOrgsGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
