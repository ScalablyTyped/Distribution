package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListReposLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsListReposLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsListReposLegacyEndpoint extends js.Object {
  var parameters: TeamsListReposLegacyEndpoint = js.native
  var response: OctokitResponse[TeamsListReposLegacyResponseData] = js.native
}

object ParametersTeamsListReposLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListReposLegacyEndpoint,
    response: OctokitResponse[TeamsListReposLegacyResponseData]
  ): ParametersTeamsListReposLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListReposLegacyEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsListReposLegacyEndpointOps[Self <: ParametersTeamsListReposLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsListReposLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListReposLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

