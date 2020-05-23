package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListEndpoint
import typings.octokitTypes.endpointsMod.OrgsListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListEndpoint extends js.Object {
  var parameters: OrgsListEndpoint
  var response: OctokitResponse[OrgsListResponseData]
}

object ParametersOrgsListEndpoint {
  @scala.inline
  def apply(parameters: OrgsListEndpoint, response: OctokitResponse[OrgsListResponseData]): ParametersOrgsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListEndpoint]
  }
}

