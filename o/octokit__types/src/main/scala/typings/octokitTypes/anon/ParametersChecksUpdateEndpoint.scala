package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksUpdateEndpoint
import typings.octokitTypes.endpointsMod.ChecksUpdateRequestOptions
import typings.octokitTypes.endpointsMod.ChecksUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersChecksUpdateEndpoint extends js.Object {
  var parameters: ChecksUpdateEndpoint
  var request: ChecksUpdateRequestOptions
  var response: OctokitResponse[ChecksUpdateResponseData]
}

object ParametersChecksUpdateEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksUpdateEndpoint,
    request: ChecksUpdateRequestOptions,
    response: OctokitResponse[ChecksUpdateResponseData]
  ): ParametersChecksUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksUpdateEndpoint]
  }
}

