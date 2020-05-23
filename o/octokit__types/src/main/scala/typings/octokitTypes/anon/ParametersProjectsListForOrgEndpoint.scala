package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsListForOrgEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsListForOrgEndpoint extends js.Object {
  var parameters: ProjectsListForOrgEndpoint
  var request: ProjectsListForOrgRequestOptions
  var response: OctokitResponse[ProjectsListForOrgResponseData]
}

object ParametersProjectsListForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsListForOrgEndpoint,
    request: ProjectsListForOrgRequestOptions,
    response: OctokitResponse[ProjectsListForOrgResponseData]
  ): ParametersProjectsListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListForOrgEndpoint]
  }
}

