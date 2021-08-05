package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsUpdateMembershipForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsUpdateMembershipForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsUpdateMembershipForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: OrgsUpdateMembershipForAuthenticatedUserEndpoint
  
  var request: OrgsUpdateMembershipForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[OrgsUpdateMembershipForAuthenticatedUserResponseData]
}
object ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: OrgsUpdateMembershipForAuthenticatedUserEndpoint,
    request: OrgsUpdateMembershipForAuthenticatedUserRequestOptions,
    response: OctokitResponse[OrgsUpdateMembershipForAuthenticatedUserResponseData]
  ): ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsUpdateMembershipForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsUpdateMembershipForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsUpdateMembershipForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
