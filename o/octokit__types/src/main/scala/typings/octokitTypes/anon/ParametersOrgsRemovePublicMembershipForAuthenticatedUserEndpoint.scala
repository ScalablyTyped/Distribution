package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemovePublicMembershipForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemovePublicMembershipForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: OrgsRemovePublicMembershipForAuthenticatedUserEndpoint
  
  var request: OrgsRemovePublicMembershipForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: OrgsRemovePublicMembershipForAuthenticatedUserEndpoint,
    request: OrgsRemovePublicMembershipForAuthenticatedUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersOrgsRemovePublicMembershipForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsRemovePublicMembershipForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsRemovePublicMembershipForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
