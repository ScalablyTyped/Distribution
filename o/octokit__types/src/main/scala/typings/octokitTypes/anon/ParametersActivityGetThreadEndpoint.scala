package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityGetThreadEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetThreadRequestOptions
import typings.octokitTypes.endpointsMod.ActivityGetThreadResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityGetThreadEndpoint extends js.Object {
  var parameters: ActivityGetThreadEndpoint
  var request: ActivityGetThreadRequestOptions
  var response: OctokitResponse[ActivityGetThreadResponseData]
}

object ParametersActivityGetThreadEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityGetThreadEndpoint,
    request: ActivityGetThreadRequestOptions,
    response: OctokitResponse[ActivityGetThreadResponseData]
  ): ParametersActivityGetThreadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityGetThreadEndpoint]
  }
}

