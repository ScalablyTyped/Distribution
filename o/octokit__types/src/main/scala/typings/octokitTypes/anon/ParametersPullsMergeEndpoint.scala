package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsMergeEndpoint
import typings.octokitTypes.endpointsMod.PullsMergeRequestOptions
import typings.octokitTypes.endpointsMod.PullsMergeResponse405Data
import typings.octokitTypes.endpointsMod.PullsMergeResponse409Data
import typings.octokitTypes.endpointsMod.PullsMergeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsMergeEndpoint extends js.Object {
  var parameters: PullsMergeEndpoint
  var request: PullsMergeRequestOptions
  var response: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data]
}

object ParametersPullsMergeEndpoint {
  @scala.inline
  def apply(
    parameters: PullsMergeEndpoint,
    request: PullsMergeRequestOptions,
    response: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data]
  ): ParametersPullsMergeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsMergeEndpoint]
  }
}

