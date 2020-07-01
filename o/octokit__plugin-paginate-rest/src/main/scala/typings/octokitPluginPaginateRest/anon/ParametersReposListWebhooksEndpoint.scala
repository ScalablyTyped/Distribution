package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListWebhooksEndpoint
import typings.octokitTypes.endpointsMod.ReposListWebhooksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListWebhooksEndpoint extends js.Object {
  var parameters: ReposListWebhooksEndpoint
  var response: OctokitResponse[ReposListWebhooksResponseData]
}

object ParametersReposListWebhooksEndpoint {
  @scala.inline
  def apply(parameters: ReposListWebhooksEndpoint, response: OctokitResponse[ReposListWebhooksResponseData]): ParametersReposListWebhooksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListWebhooksEndpoint]
  }
}

