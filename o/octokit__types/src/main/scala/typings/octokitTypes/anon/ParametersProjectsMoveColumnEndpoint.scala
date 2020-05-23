package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsMoveColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsMoveColumnRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsMoveColumnEndpoint extends js.Object {
  var parameters: ProjectsMoveColumnEndpoint
  var request: ProjectsMoveColumnRequestOptions
  var response: OctokitResponse[_]
}

object ParametersProjectsMoveColumnEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsMoveColumnEndpoint,
    request: ProjectsMoveColumnRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsMoveColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsMoveColumnEndpoint]
  }
}

