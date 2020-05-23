package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposMergeEndpoint
import typings.octokitTypes.endpointsMod.ReposMergeRequestOptions
import typings.octokitTypes.endpointsMod.ReposMergeResponse404Data
import typings.octokitTypes.endpointsMod.ReposMergeResponse409Data
import typings.octokitTypes.endpointsMod.ReposMergeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposMergeEndpoint extends js.Object {
  var parameters: ReposMergeEndpoint
  var request: ReposMergeRequestOptions
  var response: OctokitResponse[ReposMergeResponseData | ReposMergeResponse404Data | ReposMergeResponse409Data]
}

object ParametersReposMergeEndpoint {
  @scala.inline
  def apply(
    parameters: ReposMergeEndpoint,
    request: ReposMergeRequestOptions,
    response: OctokitResponse[ReposMergeResponseData | ReposMergeResponse404Data | ReposMergeResponse409Data]
  ): ParametersReposMergeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposMergeEndpoint]
  }
}

