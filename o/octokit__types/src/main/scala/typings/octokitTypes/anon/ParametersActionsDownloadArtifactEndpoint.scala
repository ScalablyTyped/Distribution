package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDownloadArtifactEndpoint
import typings.octokitTypes.endpointsMod.ActionsDownloadArtifactRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsDownloadArtifactEndpoint extends js.Object {
  var parameters: ActionsDownloadArtifactEndpoint
  var request: ActionsDownloadArtifactRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsDownloadArtifactEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsDownloadArtifactEndpoint,
    request: ActionsDownloadArtifactRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDownloadArtifactEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDownloadArtifactEndpoint]
  }
}

