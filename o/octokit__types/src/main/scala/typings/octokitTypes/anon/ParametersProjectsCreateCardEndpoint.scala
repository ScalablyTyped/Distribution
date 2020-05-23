package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateCardRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateCardResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsCreateCardEndpoint extends js.Object {
  var parameters: ProjectsCreateCardEndpoint
  var request: ProjectsCreateCardRequestOptions
  var response: OctokitResponse[ProjectsCreateCardResponseData]
}

object ParametersProjectsCreateCardEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsCreateCardEndpoint,
    request: ProjectsCreateCardRequestOptions,
    response: OctokitResponse[ProjectsCreateCardResponseData]
  ): ParametersProjectsCreateCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateCardEndpoint]
  }
}

