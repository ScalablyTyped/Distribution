package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListPendingInvitationsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListPendingInvitationsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListPendingInvitationsLegacyEndpoint extends StObject {
  
  var parameters: TeamsListPendingInvitationsLegacyEndpoint = js.native
  
  var response: OctokitResponse[TeamsListPendingInvitationsLegacyResponseData] = js.native
}
object ParametersTeamsListPendingInvitationsLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListPendingInvitationsLegacyEndpoint,
    response: OctokitResponse[TeamsListPendingInvitationsLegacyResponseData]
  ): ParametersTeamsListPendingInvitationsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListPendingInvitationsLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListPendingInvitationsLegacyEndpointMutableBuilder[Self <: ParametersTeamsListPendingInvitationsLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListPendingInvitationsLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListPendingInvitationsLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
