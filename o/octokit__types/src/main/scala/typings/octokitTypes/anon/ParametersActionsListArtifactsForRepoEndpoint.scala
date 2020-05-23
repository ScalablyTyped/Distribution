package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListArtifactsForRepoEndpoint extends js.Object {
  var parameters: ActionsListArtifactsForRepoEndpoint
  var request: ActionsListArtifactsForRepoRequestOptions
  var response: OctokitResponse[ActionsListArtifactsForRepoResponseData]
}

object ParametersActionsListArtifactsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListArtifactsForRepoEndpoint,
    request: ActionsListArtifactsForRepoRequestOptions,
    response: OctokitResponse[ActionsListArtifactsForRepoResponseData]
  ): ParametersActionsListArtifactsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListArtifactsForRepoEndpoint]
  }
}

