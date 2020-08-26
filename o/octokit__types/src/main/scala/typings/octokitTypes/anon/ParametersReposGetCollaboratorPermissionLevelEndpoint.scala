package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetCollaboratorPermissionLevelEndpoint extends js.Object {
  var parameters: ReposGetCollaboratorPermissionLevelEndpoint = js.native
  var request: ReposGetCollaboratorPermissionLevelRequestOptions = js.native
  var response: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData] = js.native
}

object ParametersReposGetCollaboratorPermissionLevelEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetCollaboratorPermissionLevelEndpoint,
    request: ReposGetCollaboratorPermissionLevelRequestOptions,
    response: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData]
  ): ParametersReposGetCollaboratorPermissionLevelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCollaboratorPermissionLevelEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetCollaboratorPermissionLevelEndpointOps[Self <: ParametersReposGetCollaboratorPermissionLevelEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetCollaboratorPermissionLevelEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetCollaboratorPermissionLevelRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

