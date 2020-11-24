package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetMemberLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetMemberLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsGetMemberLegacyEndpoint extends js.Object {
  
  var parameters: TeamsGetMemberLegacyEndpoint = js.native
  
  var request: TeamsGetMemberLegacyRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsGetMemberLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsGetMemberLegacyEndpoint,
    request: TeamsGetMemberLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsGetMemberLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetMemberLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsGetMemberLegacyEndpointOps[Self <: ParametersTeamsGetMemberLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsGetMemberLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsGetMemberLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
