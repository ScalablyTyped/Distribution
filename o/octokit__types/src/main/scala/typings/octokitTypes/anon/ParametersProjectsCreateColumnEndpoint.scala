package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateColumnRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateColumnResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsCreateColumnEndpoint extends js.Object {
  var parameters: ProjectsCreateColumnEndpoint
  var request: ProjectsCreateColumnRequestOptions
  var response: OctokitResponse[ProjectsCreateColumnResponseData]
}

object ParametersProjectsCreateColumnEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsCreateColumnEndpoint,
    request: ProjectsCreateColumnRequestOptions,
    response: OctokitResponse[ProjectsCreateColumnResponseData]
  ): ParametersProjectsCreateColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateColumnEndpoint]
  }
}

