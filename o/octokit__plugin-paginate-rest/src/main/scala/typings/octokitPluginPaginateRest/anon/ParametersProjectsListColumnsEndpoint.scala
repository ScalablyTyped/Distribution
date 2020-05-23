package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ProjectsListColumnsEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListColumnsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsListColumnsEndpoint extends js.Object {
  var parameters: ProjectsListColumnsEndpoint
  var response: OctokitResponse[ProjectsListColumnsResponseData]
}

object ParametersProjectsListColumnsEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsListColumnsEndpoint,
    response: OctokitResponse[ProjectsListColumnsResponseData]
  ): ParametersProjectsListColumnsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListColumnsEndpoint]
  }
}

