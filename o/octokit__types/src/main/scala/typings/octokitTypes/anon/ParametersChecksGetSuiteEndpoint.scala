package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksGetSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksGetSuiteRequestOptions
import typings.octokitTypes.endpointsMod.ChecksGetSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersChecksGetSuiteEndpoint extends js.Object {
  var parameters: ChecksGetSuiteEndpoint
  var request: ChecksGetSuiteRequestOptions
  var response: OctokitResponse[ChecksGetSuiteResponseData]
}

object ParametersChecksGetSuiteEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksGetSuiteEndpoint,
    request: ChecksGetSuiteRequestOptions,
    response: OctokitResponse[ChecksGetSuiteResponseData]
  ): ParametersChecksGetSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksGetSuiteEndpoint]
  }
}

