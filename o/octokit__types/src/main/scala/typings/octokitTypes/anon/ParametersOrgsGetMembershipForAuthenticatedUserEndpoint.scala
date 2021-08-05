package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetMembershipForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsGetMembershipForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: OrgsGetMembershipForAuthenticatedUserEndpoint
  
  var request: OrgsGetMembershipForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[OrgsGetMembershipForAuthenticatedUserResponseData]
}
object ParametersOrgsGetMembershipForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: OrgsGetMembershipForAuthenticatedUserEndpoint,
    request: OrgsGetMembershipForAuthenticatedUserRequestOptions,
    response: OctokitResponse[OrgsGetMembershipForAuthenticatedUserResponseData]
  ): ParametersOrgsGetMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetMembershipForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersOrgsGetMembershipForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsGetMembershipForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsGetMembershipForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsGetMembershipForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
