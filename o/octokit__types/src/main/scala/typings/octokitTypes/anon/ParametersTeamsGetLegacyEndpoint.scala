package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsGetLegacyEndpoint extends js.Object {
  
  var parameters: TeamsGetLegacyEndpoint = js.native
  
  var request: TeamsGetLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsGetLegacyResponseData] = js.native
}
object ParametersTeamsGetLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsGetLegacyEndpoint,
    request: TeamsGetLegacyRequestOptions,
    response: OctokitResponse[TeamsGetLegacyResponseData]
  ): ParametersTeamsGetLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsGetLegacyEndpointOps[Self <: ParametersTeamsGetLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsGetLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsGetLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
