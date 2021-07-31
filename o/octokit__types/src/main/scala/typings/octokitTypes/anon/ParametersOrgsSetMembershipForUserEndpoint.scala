package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsSetMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsSetMembershipForUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsSetMembershipForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsSetMembershipForUserEndpoint extends StObject {
  
  var parameters: OrgsSetMembershipForUserEndpoint
  
  var request: OrgsSetMembershipForUserRequestOptions
  
  var response: OctokitResponse[OrgsSetMembershipForUserResponseData]
}
object ParametersOrgsSetMembershipForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsSetMembershipForUserEndpoint,
    request: OrgsSetMembershipForUserRequestOptions,
    response: OctokitResponse[OrgsSetMembershipForUserResponseData]
  ): ParametersOrgsSetMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsSetMembershipForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsSetMembershipForUserEndpointMutableBuilder[Self <: ParametersOrgsSetMembershipForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsSetMembershipForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsSetMembershipForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsSetMembershipForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
