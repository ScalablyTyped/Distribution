package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsSetPublicMembershipForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsSetPublicMembershipForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsSetPublicMembershipForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: OrgsSetPublicMembershipForAuthenticatedUserEndpoint
  
  var request: OrgsSetPublicMembershipForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersOrgsSetPublicMembershipForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: OrgsSetPublicMembershipForAuthenticatedUserEndpoint,
    request: OrgsSetPublicMembershipForAuthenticatedUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersOrgsSetPublicMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsSetPublicMembershipForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersOrgsSetPublicMembershipForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsSetPublicMembershipForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsSetPublicMembershipForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
