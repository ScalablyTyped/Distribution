package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksListForSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksListForSuiteRequestOptions
import typings.octokitTypes.endpointsMod.ChecksListForSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersChecksListForSuiteEndpoint extends js.Object {
  var parameters: ChecksListForSuiteEndpoint
  var request: ChecksListForSuiteRequestOptions
  var response: OctokitResponse[ChecksListForSuiteResponseData]
}

object ParametersChecksListForSuiteEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksListForSuiteEndpoint,
    request: ChecksListForSuiteRequestOptions,
    response: OctokitResponse[ChecksListForSuiteResponseData]
  ): ParametersChecksListForSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListForSuiteEndpoint]
  }
}

