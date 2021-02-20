package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteInvitationEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteInvitationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeleteInvitationEndpoint extends StObject {
  
  var parameters: ReposDeleteInvitationEndpoint = js.native
  
  var request: ReposDeleteInvitationRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeleteInvitationEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteInvitationEndpoint,
    request: ReposDeleteInvitationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteInvitationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteInvitationEndpointMutableBuilder[Self <: ParametersReposDeleteInvitationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteInvitationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteInvitationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
