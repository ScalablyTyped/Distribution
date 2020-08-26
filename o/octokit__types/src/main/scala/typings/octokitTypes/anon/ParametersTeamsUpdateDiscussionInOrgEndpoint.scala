package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsUpdateDiscussionInOrgEndpoint extends js.Object {
  var parameters: TeamsUpdateDiscussionInOrgEndpoint = js.native
  var request: TeamsUpdateDiscussionInOrgRequestOptions = js.native
  var response: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData] = js.native
}

object ParametersTeamsUpdateDiscussionInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsUpdateDiscussionInOrgEndpoint,
    request: TeamsUpdateDiscussionInOrgRequestOptions,
    response: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData]
  ): ParametersTeamsUpdateDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateDiscussionInOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsUpdateDiscussionInOrgEndpointOps[Self <: ParametersTeamsUpdateDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsUpdateDiscussionInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsUpdateDiscussionInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

