package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListInstallationsEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  var parameters: AppsListInstallationsEndpoint
  var response: OctokitResponse[AppsListInstallationsResponseData]
}

object Parameters {
  @scala.inline
  def apply(
    parameters: AppsListInstallationsEndpoint,
    response: OctokitResponse[AppsListInstallationsResponseData]
  ): Parameters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

