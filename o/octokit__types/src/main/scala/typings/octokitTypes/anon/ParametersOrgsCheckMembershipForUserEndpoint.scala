package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCheckMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsCheckMembershipForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsCheckMembershipForUserEndpoint extends StObject {
  
  var parameters: OrgsCheckMembershipForUserEndpoint
  
  var request: OrgsCheckMembershipForUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersOrgsCheckMembershipForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsCheckMembershipForUserEndpoint,
    request: OrgsCheckMembershipForUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersOrgsCheckMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCheckMembershipForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsCheckMembershipForUserEndpointMutableBuilder[Self <: ParametersOrgsCheckMembershipForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsCheckMembershipForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsCheckMembershipForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
