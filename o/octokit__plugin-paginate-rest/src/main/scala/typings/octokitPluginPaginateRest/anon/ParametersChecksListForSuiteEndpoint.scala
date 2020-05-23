package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ChecksListForSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksListForSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersChecksListForSuiteEndpoint extends js.Object {
  var parameters: ChecksListForSuiteEndpoint
  var response: OctokitResponse[ChecksListForSuiteResponseData] with `7`
}

object ParametersChecksListForSuiteEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksListForSuiteEndpoint,
    response: OctokitResponse[ChecksListForSuiteResponseData] with `7`
  ): ParametersChecksListForSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListForSuiteEndpoint]
  }
}

