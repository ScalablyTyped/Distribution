package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAcceptInvitationEndpoint
import typings.octokitTypes.endpointsMod.ReposAcceptInvitationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposAcceptInvitationEndpoint extends StObject {
  
  var parameters: ReposAcceptInvitationEndpoint
  
  var request: ReposAcceptInvitationRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposAcceptInvitationEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposAcceptInvitationEndpoint,
    request: ReposAcceptInvitationRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposAcceptInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAcceptInvitationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposAcceptInvitationEndpointMutableBuilder[Self <: ParametersReposAcceptInvitationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposAcceptInvitationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposAcceptInvitationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
