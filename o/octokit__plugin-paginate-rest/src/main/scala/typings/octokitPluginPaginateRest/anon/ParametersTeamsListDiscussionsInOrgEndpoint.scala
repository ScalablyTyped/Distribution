package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListDiscussionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListDiscussionsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsListDiscussionsInOrgEndpoint extends js.Object {
  var parameters: TeamsListDiscussionsInOrgEndpoint = js.native
  var response: OctokitResponse[TeamsListDiscussionsInOrgResponseData] = js.native
}

object ParametersTeamsListDiscussionsInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListDiscussionsInOrgEndpoint,
    response: OctokitResponse[TeamsListDiscussionsInOrgResponseData]
  ): ParametersTeamsListDiscussionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionsInOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsListDiscussionsInOrgEndpointOps[Self <: ParametersTeamsListDiscussionsInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsListDiscussionsInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListDiscussionsInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

