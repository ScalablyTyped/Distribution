package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityGetFeedsEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetFeedsRequestOptions
import typings.octokitTypes.endpointsMod.ActivityGetFeedsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityGetFeedsEndpoint extends js.Object {
  var parameters: ActivityGetFeedsEndpoint
  var request: ActivityGetFeedsRequestOptions
  var response: OctokitResponse[ActivityGetFeedsResponseData]
}

object ParametersActivityGetFeedsEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityGetFeedsEndpoint,
    request: ActivityGetFeedsRequestOptions,
    response: OctokitResponse[ActivityGetFeedsResponseData]
  ): ParametersActivityGetFeedsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityGetFeedsEndpoint]
  }
}

