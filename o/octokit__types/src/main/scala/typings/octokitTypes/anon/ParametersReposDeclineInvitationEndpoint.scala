package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeclineInvitationEndpoint
import typings.octokitTypes.endpointsMod.ReposDeclineInvitationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeclineInvitationEndpoint extends StObject {
  
  var parameters: ReposDeclineInvitationEndpoint = js.native
  
  var request: ReposDeclineInvitationRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeclineInvitationEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeclineInvitationEndpoint,
    request: ReposDeclineInvitationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeclineInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeclineInvitationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeclineInvitationEndpointMutableBuilder[Self <: ParametersReposDeclineInvitationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeclineInvitationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeclineInvitationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
