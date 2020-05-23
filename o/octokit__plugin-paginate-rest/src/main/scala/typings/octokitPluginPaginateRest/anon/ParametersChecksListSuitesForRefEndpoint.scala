package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefEndpoint
import typings.octokitTypes.endpointsMod.ChecksListSuitesForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersChecksListSuitesForRefEndpoint extends js.Object {
  var parameters: ChecksListSuitesForRefEndpoint
  var response: OctokitResponse[ChecksListSuitesForRefResponseData] with `8`
}

object ParametersChecksListSuitesForRefEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksListSuitesForRefEndpoint,
    response: OctokitResponse[ChecksListSuitesForRefResponseData] with `8`
  ): ParametersChecksListSuitesForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListSuitesForRefEndpoint]
  }
}

