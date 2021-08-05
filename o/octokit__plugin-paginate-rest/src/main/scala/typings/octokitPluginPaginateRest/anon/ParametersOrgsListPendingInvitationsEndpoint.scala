package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListPendingInvitationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListPendingInvitationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListPendingInvitationsEndpoint extends StObject {
  
  var parameters: OrgsListPendingInvitationsEndpoint
  
  var response: OctokitResponse[OrgsListPendingInvitationsResponseData]
}
object ParametersOrgsListPendingInvitationsEndpoint {
  
  inline def apply(
    parameters: OrgsListPendingInvitationsEndpoint,
    response: OctokitResponse[OrgsListPendingInvitationsResponseData]
  ): ParametersOrgsListPendingInvitationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListPendingInvitationsEndpoint]
  }
  
  extension [Self <: ParametersOrgsListPendingInvitationsEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsListPendingInvitationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsListPendingInvitationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
