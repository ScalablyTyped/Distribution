package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListPendingInvitationsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListPendingInvitationsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListPendingInvitationsLegacyEndpoint extends js.Object {
  
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
  implicit class ParametersTeamsListPendingInvitationsLegacyEndpointOps[Self <: ParametersTeamsListPendingInvitationsLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: TeamsListPendingInvitationsLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListPendingInvitationsLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
