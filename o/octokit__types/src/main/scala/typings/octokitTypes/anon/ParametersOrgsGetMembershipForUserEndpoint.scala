package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetMembershipForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsGetMembershipForUserEndpoint extends StObject {
  
  var parameters: OrgsGetMembershipForUserEndpoint = js.native
  
  var request: OrgsGetMembershipForUserRequestOptions = js.native
  
  var response: OctokitResponse[OrgsGetMembershipForUserResponseData] = js.native
}
object ParametersOrgsGetMembershipForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsGetMembershipForUserEndpoint,
    request: OrgsGetMembershipForUserRequestOptions,
    response: OctokitResponse[OrgsGetMembershipForUserResponseData]
  ): ParametersOrgsGetMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetMembershipForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsGetMembershipForUserEndpointMutableBuilder[Self <: ParametersOrgsGetMembershipForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsGetMembershipForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsGetMembershipForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsGetMembershipForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
