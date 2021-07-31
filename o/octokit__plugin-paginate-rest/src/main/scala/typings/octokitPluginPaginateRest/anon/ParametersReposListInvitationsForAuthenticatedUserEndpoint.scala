package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListInvitationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ReposListInvitationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListInvitationsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ReposListInvitationsForAuthenticatedUserEndpoint
  
  var response: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData]
}
object ParametersReposListInvitationsForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListInvitationsForAuthenticatedUserEndpoint,
    response: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData]
  ): ParametersReposListInvitationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListInvitationsForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListInvitationsForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersReposListInvitationsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListInvitationsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
