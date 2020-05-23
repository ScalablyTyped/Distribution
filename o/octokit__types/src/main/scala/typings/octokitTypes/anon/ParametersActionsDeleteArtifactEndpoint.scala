package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteArtifactEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteArtifactRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsDeleteArtifactEndpoint extends js.Object {
  var parameters: ActionsDeleteArtifactEndpoint
  var request: ActionsDeleteArtifactRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsDeleteArtifactEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsDeleteArtifactEndpoint,
    request: ActionsDeleteArtifactRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteArtifactEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteArtifactEndpoint]
  }
}

