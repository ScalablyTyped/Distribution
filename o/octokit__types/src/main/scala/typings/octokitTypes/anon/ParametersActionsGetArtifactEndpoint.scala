package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetArtifactEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetArtifactRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetArtifactResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsGetArtifactEndpoint extends js.Object {
  var parameters: ActionsGetArtifactEndpoint
  var request: ActionsGetArtifactRequestOptions
  var response: OctokitResponse[ActionsGetArtifactResponseData]
}

object ParametersActionsGetArtifactEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetArtifactEndpoint,
    request: ActionsGetArtifactRequestOptions,
    response: OctokitResponse[ActionsGetArtifactResponseData]
  ): ParametersActionsGetArtifactEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetArtifactEndpoint]
  }
}

