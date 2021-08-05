package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteInvitationEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteInvitationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposDeleteInvitationEndpoint extends StObject {
  
  var parameters: ReposDeleteInvitationEndpoint
  
  var request: ReposDeleteInvitationRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposDeleteInvitationEndpoint {
  
  inline def apply(
    parameters: ReposDeleteInvitationEndpoint,
    request: ReposDeleteInvitationRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposDeleteInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteInvitationEndpoint]
  }
  
  extension [Self <: ParametersReposDeleteInvitationEndpoint](x: Self) {
    
    inline def setParameters(value: ReposDeleteInvitationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposDeleteInvitationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
