package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListInvitationTeamsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListInvitationTeamsRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListInvitationTeamsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListInvitationTeamsEndpoint extends StObject {
  
  var parameters: OrgsListInvitationTeamsEndpoint
  
  var request: OrgsListInvitationTeamsRequestOptions
  
  var response: OctokitResponse[OrgsListInvitationTeamsResponseData]
}
object ParametersOrgsListInvitationTeamsEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListInvitationTeamsEndpoint,
    request: OrgsListInvitationTeamsRequestOptions,
    response: OctokitResponse[OrgsListInvitationTeamsResponseData]
  ): ParametersOrgsListInvitationTeamsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListInvitationTeamsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListInvitationTeamsEndpointMutableBuilder[Self <: ParametersOrgsListInvitationTeamsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListInvitationTeamsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListInvitationTeamsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListInvitationTeamsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
