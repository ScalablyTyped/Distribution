package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveMembershipForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveMembershipForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsRemoveMembershipForUserEndpoint extends StObject {
  
  var parameters: OrgsRemoveMembershipForUserEndpoint = js.native
  
  var request: OrgsRemoveMembershipForUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersOrgsRemoveMembershipForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsRemoveMembershipForUserEndpoint,
    request: OrgsRemoveMembershipForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsRemoveMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveMembershipForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsRemoveMembershipForUserEndpointMutableBuilder[Self <: ParametersOrgsRemoveMembershipForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsRemoveMembershipForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsRemoveMembershipForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
