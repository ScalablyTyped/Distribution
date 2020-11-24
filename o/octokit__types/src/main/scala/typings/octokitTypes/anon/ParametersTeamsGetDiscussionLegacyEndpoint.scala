package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetDiscussionLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsGetDiscussionLegacyEndpoint extends js.Object {
  
  var parameters: TeamsGetDiscussionLegacyEndpoint = js.native
  
  var request: TeamsGetDiscussionLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsGetDiscussionLegacyResponseData] = js.native
}
object ParametersTeamsGetDiscussionLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsGetDiscussionLegacyEndpoint,
    request: TeamsGetDiscussionLegacyRequestOptions,
    response: OctokitResponse[TeamsGetDiscussionLegacyResponseData]
  ): ParametersTeamsGetDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetDiscussionLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsGetDiscussionLegacyEndpointOps[Self <: ParametersTeamsGetDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsGetDiscussionLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsGetDiscussionLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetDiscussionLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
