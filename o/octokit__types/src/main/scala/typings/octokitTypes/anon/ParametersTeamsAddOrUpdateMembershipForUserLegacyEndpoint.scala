package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint extends js.Object {
  
  var parameters: TeamsAddOrUpdateMembershipForUserLegacyEndpoint = js.native
  
  var request: TeamsAddOrUpdateMembershipForUserLegacyRequestOptions = js.native
  
  var response: OctokitResponse[
    TeamsAddOrUpdateMembershipForUserLegacyResponseData | TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
  ] = js.native
}
object ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateMembershipForUserLegacyEndpoint,
    request: TeamsAddOrUpdateMembershipForUserLegacyRequestOptions,
    response: OctokitResponse[
      TeamsAddOrUpdateMembershipForUserLegacyResponseData | TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
    ]
  ): ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpointOps[Self <: ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsAddOrUpdateMembershipForUserLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsAddOrUpdateMembershipForUserLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          TeamsAddOrUpdateMembershipForUserLegacyResponseData | TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
        ]
    ): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
