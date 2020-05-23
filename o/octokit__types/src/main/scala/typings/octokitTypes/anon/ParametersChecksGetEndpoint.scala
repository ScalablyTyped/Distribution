package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksGetEndpoint
import typings.octokitTypes.endpointsMod.ChecksGetRequestOptions
import typings.octokitTypes.endpointsMod.ChecksGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersChecksGetEndpoint extends js.Object {
  var parameters: ChecksGetEndpoint
  var request: ChecksGetRequestOptions
  var response: OctokitResponse[ChecksGetResponseData]
}

object ParametersChecksGetEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksGetEndpoint,
    request: ChecksGetRequestOptions,
    response: OctokitResponse[ChecksGetResponseData]
  ): ParametersChecksGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksGetEndpoint]
  }
}

