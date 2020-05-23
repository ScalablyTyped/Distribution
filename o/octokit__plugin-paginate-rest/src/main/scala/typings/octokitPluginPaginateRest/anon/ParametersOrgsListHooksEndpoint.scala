package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListHooksEndpoint
import typings.octokitTypes.endpointsMod.OrgsListHooksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListHooksEndpoint extends js.Object {
  var parameters: OrgsListHooksEndpoint
  var response: OctokitResponse[OrgsListHooksResponseData]
}

object ParametersOrgsListHooksEndpoint {
  @scala.inline
  def apply(parameters: OrgsListHooksEndpoint, response: OctokitResponse[OrgsListHooksResponseData]): ParametersOrgsListHooksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListHooksEndpoint]
  }
}

