package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsRemoveRepoInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsRemoveRepoInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsRemoveRepoInOrgEndpoint extends js.Object {
  var parameters: TeamsRemoveRepoInOrgEndpoint = js.native
  var request: TeamsRemoveRepoInOrgRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersTeamsRemoveRepoInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsRemoveRepoInOrgEndpoint,
    request: TeamsRemoveRepoInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveRepoInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveRepoInOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsRemoveRepoInOrgEndpointOps[Self <: ParametersTeamsRemoveRepoInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsRemoveRepoInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsRemoveRepoInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

