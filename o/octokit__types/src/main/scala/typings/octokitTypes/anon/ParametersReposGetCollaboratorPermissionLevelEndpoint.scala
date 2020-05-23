package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetCollaboratorPermissionLevelEndpoint extends js.Object {
  var parameters: ReposGetCollaboratorPermissionLevelEndpoint
  var request: ReposGetCollaboratorPermissionLevelRequestOptions
  var response: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData]
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
}

