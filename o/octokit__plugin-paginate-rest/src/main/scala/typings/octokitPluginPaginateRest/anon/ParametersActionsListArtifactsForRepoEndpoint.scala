package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListArtifactsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListArtifactsForRepoEndpoint extends js.Object {
  var parameters: ActionsListArtifactsForRepoEndpoint
  var response: OctokitResponse[ActionsListArtifactsForRepoResponseData] with `4`
}

object ParametersActionsListArtifactsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListArtifactsForRepoEndpoint,
    response: OctokitResponse[ActionsListArtifactsForRepoResponseData] with `4`
  ): ParametersActionsListArtifactsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListArtifactsForRepoEndpoint]
  }
}

