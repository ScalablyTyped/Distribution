package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsGetDiscussionInOrgEndpoint extends js.Object {
  var parameters: TeamsGetDiscussionInOrgEndpoint = js.native
  var request: TeamsGetDiscussionInOrgRequestOptions = js.native
  var response: OctokitResponse[TeamsGetDiscussionInOrgResponseData] = js.native
}

object ParametersTeamsGetDiscussionInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetDiscussionInOrgEndpoint,
    request: TeamsGetDiscussionInOrgRequestOptions,
    response: OctokitResponse[TeamsGetDiscussionInOrgResponseData]
  ): ParametersTeamsGetDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetDiscussionInOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsGetDiscussionInOrgEndpointOps[Self <: ParametersTeamsGetDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsGetDiscussionInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsGetDiscussionInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetDiscussionInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

