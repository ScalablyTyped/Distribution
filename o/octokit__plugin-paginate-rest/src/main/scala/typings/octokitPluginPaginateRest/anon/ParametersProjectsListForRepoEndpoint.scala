package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ProjectsListForRepoEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsListForRepoEndpoint extends js.Object {
  var parameters: ProjectsListForRepoEndpoint
  var response: OctokitResponse[ProjectsListForRepoResponseData]
}

object ParametersProjectsListForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsListForRepoEndpoint,
    response: OctokitResponse[ProjectsListForRepoResponseData]
  ): ParametersProjectsListForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListForRepoEndpoint]
  }
}

