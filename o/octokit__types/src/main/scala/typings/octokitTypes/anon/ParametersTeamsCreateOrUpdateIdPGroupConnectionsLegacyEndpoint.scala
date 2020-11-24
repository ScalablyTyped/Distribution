package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint extends js.Object {
  
  var parameters: TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint = js.native
  
  var request: TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData] = js.native
}
object ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint,
    request: TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions,
    response: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData]
  ): ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpointOps[Self <: ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
