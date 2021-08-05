package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateInvitationEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateInvitationRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateInvitationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposUpdateInvitationEndpoint extends StObject {
  
  var parameters: ReposUpdateInvitationEndpoint
  
  var request: ReposUpdateInvitationRequestOptions
  
  var response: OctokitResponse[ReposUpdateInvitationResponseData]
}
object ParametersReposUpdateInvitationEndpoint {
  
  inline def apply(
    parameters: ReposUpdateInvitationEndpoint,
    request: ReposUpdateInvitationRequestOptions,
    response: OctokitResponse[ReposUpdateInvitationResponseData]
  ): ParametersReposUpdateInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateInvitationEndpoint]
  }
  
  extension [Self <: ParametersReposUpdateInvitationEndpoint](x: Self) {
    
    inline def setParameters(value: ReposUpdateInvitationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposUpdateInvitationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposUpdateInvitationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
