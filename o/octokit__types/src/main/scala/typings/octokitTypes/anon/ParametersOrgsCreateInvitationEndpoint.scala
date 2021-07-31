package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCreateInvitationEndpoint
import typings.octokitTypes.endpointsMod.OrgsCreateInvitationRequestOptions
import typings.octokitTypes.endpointsMod.OrgsCreateInvitationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsCreateInvitationEndpoint extends StObject {
  
  var parameters: OrgsCreateInvitationEndpoint
  
  var request: OrgsCreateInvitationRequestOptions
  
  var response: OctokitResponse[OrgsCreateInvitationResponseData]
}
object ParametersOrgsCreateInvitationEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsCreateInvitationEndpoint,
    request: OrgsCreateInvitationRequestOptions,
    response: OctokitResponse[OrgsCreateInvitationResponseData]
  ): ParametersOrgsCreateInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCreateInvitationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsCreateInvitationEndpointMutableBuilder[Self <: ParametersOrgsCreateInvitationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsCreateInvitationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsCreateInvitationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsCreateInvitationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
