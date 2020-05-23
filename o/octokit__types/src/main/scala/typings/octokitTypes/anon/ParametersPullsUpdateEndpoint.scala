package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsUpdateEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateRequestOptions
import typings.octokitTypes.endpointsMod.PullsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsUpdateEndpoint extends js.Object {
  var parameters: PullsUpdateEndpoint
  var request: PullsUpdateRequestOptions
  var response: OctokitResponse[PullsUpdateResponseData]
}

object ParametersPullsUpdateEndpoint {
  @scala.inline
  def apply(
    parameters: PullsUpdateEndpoint,
    request: PullsUpdateRequestOptions,
    response: OctokitResponse[PullsUpdateResponseData]
  ): ParametersPullsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsUpdateEndpoint]
  }
}

