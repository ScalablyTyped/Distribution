package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCheckPublicMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsCheckPublicMembershipForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsCheckPublicMembershipForUserEndpoint extends StObject {
  
  var parameters: OrgsCheckPublicMembershipForUserEndpoint
  
  var request: OrgsCheckPublicMembershipForUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersOrgsCheckPublicMembershipForUserEndpoint {
  
  inline def apply(
    parameters: OrgsCheckPublicMembershipForUserEndpoint,
    request: OrgsCheckPublicMembershipForUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersOrgsCheckPublicMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCheckPublicMembershipForUserEndpoint]
  }
  
  extension [Self <: ParametersOrgsCheckPublicMembershipForUserEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsCheckPublicMembershipForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsCheckPublicMembershipForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
