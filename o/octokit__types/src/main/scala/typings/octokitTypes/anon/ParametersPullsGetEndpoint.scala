package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsGetEndpoint
import typings.octokitTypes.endpointsMod.PullsGetRequestOptions
import typings.octokitTypes.endpointsMod.PullsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsGetEndpoint extends js.Object {
  var parameters: PullsGetEndpoint
  var request: PullsGetRequestOptions
  var response: OctokitResponse[PullsGetResponseData]
}

object ParametersPullsGetEndpoint {
  @scala.inline
  def apply(
    parameters: PullsGetEndpoint,
    request: PullsGetRequestOptions,
    response: OctokitResponse[PullsGetResponseData]
  ): ParametersPullsGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsGetEndpoint]
  }
}

