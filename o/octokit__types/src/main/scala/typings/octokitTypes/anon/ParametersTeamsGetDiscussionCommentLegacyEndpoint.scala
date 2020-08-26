package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsGetDiscussionCommentLegacyEndpoint extends js.Object {
  var parameters: TeamsGetDiscussionCommentLegacyEndpoint = js.native
  var request: TeamsGetDiscussionCommentLegacyRequestOptions = js.native
  var response: OctokitResponse[TeamsGetDiscussionCommentLegacyResponseData] = js.native
}

object ParametersTeamsGetDiscussionCommentLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetDiscussionCommentLegacyEndpoint,
    request: TeamsGetDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[TeamsGetDiscussionCommentLegacyResponseData]
  ): ParametersTeamsGetDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetDiscussionCommentLegacyEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsGetDiscussionCommentLegacyEndpointOps[Self <: ParametersTeamsGetDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsGetDiscussionCommentLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsGetDiscussionCommentLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetDiscussionCommentLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

