package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListPendingInvitationsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListPendingInvitationsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListPendingInvitationsInOrgEndpoint extends StObject {
  
  var parameters: TeamsListPendingInvitationsInOrgEndpoint
  
  var response: OctokitResponse[TeamsListPendingInvitationsInOrgResponseData]
}
object ParametersTeamsListPendingInvitationsInOrgEndpoint {
  
  inline def apply(
    parameters: TeamsListPendingInvitationsInOrgEndpoint,
    response: OctokitResponse[TeamsListPendingInvitationsInOrgResponseData]
  ): ParametersTeamsListPendingInvitationsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListPendingInvitationsInOrgEndpoint]
  }
  
  extension [Self <: ParametersTeamsListPendingInvitationsInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsListPendingInvitationsInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsListPendingInvitationsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
