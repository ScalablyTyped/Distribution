package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListInstallationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListInstallationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListInstallationsEndpoint extends js.Object {
  var parameters: OrgsListInstallationsEndpoint
  var response: OctokitResponse[OrgsListInstallationsResponseData] with `0`
}

object ParametersOrgsListInstallationsEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListInstallationsEndpoint,
    response: OctokitResponse[OrgsListInstallationsResponseData] with `0`
  ): ParametersOrgsListInstallationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListInstallationsEndpoint]
  }
}

