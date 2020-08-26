package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsCheckPermissionsForProjectInOrgEndpoint extends js.Object {
  var parameters: TeamsCheckPermissionsForProjectInOrgEndpoint = js.native
  var request: TeamsCheckPermissionsForProjectInOrgRequestOptions = js.native
  var response: OctokitResponse[TeamsCheckPermissionsForProjectInOrgResponseData] = js.native
}

object ParametersTeamsCheckPermissionsForProjectInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsCheckPermissionsForProjectInOrgEndpoint,
    request: TeamsCheckPermissionsForProjectInOrgRequestOptions,
    response: OctokitResponse[TeamsCheckPermissionsForProjectInOrgResponseData]
  ): ParametersTeamsCheckPermissionsForProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCheckPermissionsForProjectInOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsCheckPermissionsForProjectInOrgEndpointOps[Self <: ParametersTeamsCheckPermissionsForProjectInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsCheckPermissionsForProjectInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsCheckPermissionsForProjectInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCheckPermissionsForProjectInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

