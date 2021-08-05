package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsGetMembershipForUserEndpoint extends StObject {
  
  var parameters: OrgsGetMembershipForUserEndpoint
  
  var request: OrgsGetMembershipForUserRequestOptions
  
  var response: OctokitResponse[OrgsGetMembershipForUserResponseData]
}
object ParametersOrgsGetMembershipForUserEndpoint {
  
  inline def apply(
    parameters: OrgsGetMembershipForUserEndpoint,
    request: OrgsGetMembershipForUserRequestOptions,
    response: OctokitResponse[OrgsGetMembershipForUserResponseData]
  ): ParametersOrgsGetMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetMembershipForUserEndpoint]
  }
  
  extension [Self <: ParametersOrgsGetMembershipForUserEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsGetMembershipForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsGetMembershipForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsGetMembershipForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
