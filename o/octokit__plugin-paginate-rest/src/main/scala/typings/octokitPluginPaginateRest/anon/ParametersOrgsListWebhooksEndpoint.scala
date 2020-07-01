package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListWebhooksEndpoint
import typings.octokitTypes.endpointsMod.OrgsListWebhooksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListWebhooksEndpoint extends js.Object {
  var parameters: OrgsListWebhooksEndpoint
  var response: OctokitResponse[OrgsListWebhooksResponseData]
}

object ParametersOrgsListWebhooksEndpoint {
  @scala.inline
  def apply(parameters: OrgsListWebhooksEndpoint, response: OctokitResponse[OrgsListWebhooksResponseData]): ParametersOrgsListWebhooksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListWebhooksEndpoint]
  }
}

