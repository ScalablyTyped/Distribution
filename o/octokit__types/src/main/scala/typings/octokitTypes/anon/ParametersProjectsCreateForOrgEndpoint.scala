package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateForOrgEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsCreateForOrgEndpoint extends js.Object {
  var parameters: ProjectsCreateForOrgEndpoint
  var request: ProjectsCreateForOrgRequestOptions
  var response: OctokitResponse[ProjectsCreateForOrgResponseData]
}

object ParametersProjectsCreateForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsCreateForOrgEndpoint,
    request: ProjectsCreateForOrgRequestOptions,
    response: OctokitResponse[ProjectsCreateForOrgResponseData]
  ): ParametersProjectsCreateForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateForOrgEndpoint]
  }
}

