package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.RateLimitGetEndpoint
import typings.octokitTypes.endpointsMod.RateLimitGetRequestOptions
import typings.octokitTypes.endpointsMod.RateLimitGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersRateLimitGetEndpoint extends js.Object {
  var parameters: RateLimitGetEndpoint
  var request: RateLimitGetRequestOptions
  var response: OctokitResponse[RateLimitGetResponseData]
}

object ParametersRateLimitGetEndpoint {
  @scala.inline
  def apply(
    parameters: RateLimitGetEndpoint,
    request: RateLimitGetRequestOptions,
    response: OctokitResponse[RateLimitGetResponseData]
  ): ParametersRateLimitGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRateLimitGetEndpoint]
  }
}

