package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveMemberEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveMemberRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsRemoveMemberEndpoint extends StObject {
  
  var parameters: OrgsRemoveMemberEndpoint
  
  var request: OrgsRemoveMemberRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersOrgsRemoveMemberEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsRemoveMemberEndpoint,
    request: OrgsRemoveMemberRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersOrgsRemoveMemberEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveMemberEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsRemoveMemberEndpointMutableBuilder[Self <: ParametersOrgsRemoveMemberEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsRemoveMemberEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsRemoveMemberRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
