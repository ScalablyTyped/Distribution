package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksListForRefEndpoint
import typings.octokitTypes.endpointsMod.ChecksListForRefRequestOptions
import typings.octokitTypes.endpointsMod.ChecksListForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersChecksListForRefEndpoint extends js.Object {
  var parameters: ChecksListForRefEndpoint
  var request: ChecksListForRefRequestOptions
  var response: OctokitResponse[ChecksListForRefResponseData]
}

object ParametersChecksListForRefEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksListForRefEndpoint,
    request: ChecksListForRefRequestOptions,
    response: OctokitResponse[ChecksListForRefResponseData]
  ): ParametersChecksListForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListForRefEndpoint]
  }
}

