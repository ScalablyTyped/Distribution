package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListInvitationsEndpoint
import typings.octokitTypes.endpointsMod.ReposListInvitationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListInvitationsEndpoint extends StObject {
  
  var parameters: ReposListInvitationsEndpoint
  
  var response: OctokitResponse[ReposListInvitationsResponseData]
}
object ParametersReposListInvitationsEndpoint {
  
  inline def apply(
    parameters: ReposListInvitationsEndpoint,
    response: OctokitResponse[ReposListInvitationsResponseData]
  ): ParametersReposListInvitationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListInvitationsEndpoint]
  }
  
  extension [Self <: ParametersReposListInvitationsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListInvitationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListInvitationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
