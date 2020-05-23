package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsMoveCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsMoveCardRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersProjectsMoveCardEndpoint extends js.Object {
  var parameters: ProjectsMoveCardEndpoint
  var request: ProjectsMoveCardRequestOptions
  var response: OctokitResponse[_]
}

object ParametersProjectsMoveCardEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsMoveCardEndpoint,
    request: ProjectsMoveCardRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsMoveCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsMoveCardEndpoint]
  }
}

