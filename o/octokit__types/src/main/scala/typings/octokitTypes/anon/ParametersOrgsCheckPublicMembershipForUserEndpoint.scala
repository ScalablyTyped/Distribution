package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCheckPublicMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsCheckPublicMembershipForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsCheckPublicMembershipForUserEndpoint extends StObject {
  
  var parameters: OrgsCheckPublicMembershipForUserEndpoint = js.native
  
  var request: OrgsCheckPublicMembershipForUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersOrgsCheckPublicMembershipForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsCheckPublicMembershipForUserEndpoint,
    request: OrgsCheckPublicMembershipForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsCheckPublicMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCheckPublicMembershipForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsCheckPublicMembershipForUserEndpointMutableBuilder[Self <: ParametersOrgsCheckPublicMembershipForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsCheckPublicMembershipForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsCheckPublicMembershipForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
