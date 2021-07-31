package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListInvitationsEndpoint
import typings.octokitTypes.endpointsMod.ReposListInvitationsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListInvitationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListInvitationsEndpoint extends StObject {
  
  var parameters: ReposListInvitationsEndpoint
  
  var request: ReposListInvitationsRequestOptions
  
  var response: OctokitResponse[ReposListInvitationsResponseData]
}
object ParametersReposListInvitationsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListInvitationsEndpoint,
    request: ReposListInvitationsRequestOptions,
    response: OctokitResponse[ReposListInvitationsResponseData]
  ): ParametersReposListInvitationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListInvitationsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListInvitationsEndpointMutableBuilder[Self <: ParametersReposListInvitationsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListInvitationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListInvitationsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListInvitationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
