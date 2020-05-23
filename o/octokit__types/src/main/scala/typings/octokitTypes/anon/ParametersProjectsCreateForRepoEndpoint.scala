package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateForRepoEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsCreateForRepoEndpoint extends js.Object {
  var parameters: ProjectsCreateForRepoEndpoint
  var request: ProjectsCreateForRepoRequestOptions
  var response: OctokitResponse[ProjectsCreateForRepoResponseData]
}

object ParametersProjectsCreateForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsCreateForRepoEndpoint,
    request: ProjectsCreateForRepoRequestOptions,
    response: OctokitResponse[ProjectsCreateForRepoResponseData]
  ): ParametersProjectsCreateForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateForRepoEndpoint]
  }
}

