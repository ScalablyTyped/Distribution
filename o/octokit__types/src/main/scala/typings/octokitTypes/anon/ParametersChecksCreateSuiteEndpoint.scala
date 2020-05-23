package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksCreateSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksCreateSuiteRequestOptions
import typings.octokitTypes.endpointsMod.ChecksCreateSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersChecksCreateSuiteEndpoint extends js.Object {
  var parameters: ChecksCreateSuiteEndpoint
  var request: ChecksCreateSuiteRequestOptions
  var response: OctokitResponse[ChecksCreateSuiteResponseData]
}

object ParametersChecksCreateSuiteEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksCreateSuiteEndpoint,
    request: ChecksCreateSuiteRequestOptions,
    response: OctokitResponse[ChecksCreateSuiteResponseData]
  ): ParametersChecksCreateSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksCreateSuiteEndpoint]
  }
}

