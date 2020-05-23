package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ProjectsListCollaboratorsEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListCollaboratorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsListCollaboratorsEndpoint extends js.Object {
  var parameters: ProjectsListCollaboratorsEndpoint
  var response: OctokitResponse[ProjectsListCollaboratorsResponseData]
}

object ParametersProjectsListCollaboratorsEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsListCollaboratorsEndpoint,
    response: OctokitResponse[ProjectsListCollaboratorsResponseData]
  ): ParametersProjectsListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListCollaboratorsEndpoint]
  }
}

