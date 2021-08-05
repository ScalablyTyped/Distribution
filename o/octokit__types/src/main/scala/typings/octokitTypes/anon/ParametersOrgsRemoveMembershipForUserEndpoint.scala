package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveMembershipForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsRemoveMembershipForUserEndpoint extends StObject {
  
  var parameters: OrgsRemoveMembershipForUserEndpoint
  
  var request: OrgsRemoveMembershipForUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersOrgsRemoveMembershipForUserEndpoint {
  
  inline def apply(
    parameters: OrgsRemoveMembershipForUserEndpoint,
    request: OrgsRemoveMembershipForUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersOrgsRemoveMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveMembershipForUserEndpoint]
  }
  
  extension [Self <: ParametersOrgsRemoveMembershipForUserEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsRemoveMembershipForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsRemoveMembershipForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
