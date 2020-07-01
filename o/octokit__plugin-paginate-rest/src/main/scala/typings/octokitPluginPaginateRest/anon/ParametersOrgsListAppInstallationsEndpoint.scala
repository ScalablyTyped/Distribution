package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListAppInstallationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListAppInstallationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListAppInstallationsEndpoint extends js.Object {
  var parameters: OrgsListAppInstallationsEndpoint
  var response: OctokitResponse[OrgsListAppInstallationsResponseData] with `2`
}

object ParametersOrgsListAppInstallationsEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListAppInstallationsEndpoint,
    response: OctokitResponse[OrgsListAppInstallationsResponseData] with `2`
  ): ParametersOrgsListAppInstallationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListAppInstallationsEndpoint]
  }
}

