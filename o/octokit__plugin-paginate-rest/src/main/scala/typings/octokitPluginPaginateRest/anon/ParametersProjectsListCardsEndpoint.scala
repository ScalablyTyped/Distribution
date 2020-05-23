package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ProjectsListCardsEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListCardsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsListCardsEndpoint extends js.Object {
  var parameters: ProjectsListCardsEndpoint
  var response: OctokitResponse[ProjectsListCardsResponseData]
}

object ParametersProjectsListCardsEndpoint {
  @scala.inline
  def apply(parameters: ProjectsListCardsEndpoint, response: OctokitResponse[ProjectsListCardsResponseData]): ParametersProjectsListCardsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListCardsEndpoint]
  }
}

