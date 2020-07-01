package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ChecksListForRefEndpoint
import typings.octokitTypes.endpointsMod.ChecksListForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersChecksListForRefEndpoint extends js.Object {
  var parameters: ChecksListForRefEndpoint
  var response: OctokitResponse[ChecksListForRefResponseData] with `9`
}

object ParametersChecksListForRefEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksListForRefEndpoint,
    response: OctokitResponse[ChecksListForRefResponseData] with `9`
  ): ParametersChecksListForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListForRefEndpoint]
  }
}

