package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefEndpoint
import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefRequestOptions
import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersChecksListSuitesForRefEndpoint extends js.Object {
  var parameters: ChecksListSuitesForRefEndpoint
  var request: ChecksListSuitesForRefRequestOptions
  var response: OctokitResponse[ChecksListSuitesForRefResponseData]
}

object ParametersChecksListSuitesForRefEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksListSuitesForRefEndpoint,
    request: ChecksListSuitesForRefRequestOptions,
    response: OctokitResponse[ChecksListSuitesForRefResponseData]
  ): ParametersChecksListSuitesForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListSuitesForRefEndpoint]
  }
}

