package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListStatusesForRefEndpoint
import typings.octokitTypes.endpointsMod.ReposListStatusesForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListStatusesForRefEndpoint extends js.Object {
  var parameters: ReposListStatusesForRefEndpoint
  var response: OctokitResponse[ReposListStatusesForRefResponseData]
}

object ParametersReposListStatusesForRefEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListStatusesForRefEndpoint,
    response: OctokitResponse[ReposListStatusesForRefResponseData]
  ): ParametersReposListStatusesForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListStatusesForRefEndpoint]
  }
}

