package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListAppInstallationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListAppInstallationsRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListAppInstallationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListAppInstallationsEndpoint extends js.Object {
  var parameters: OrgsListAppInstallationsEndpoint
  var request: OrgsListAppInstallationsRequestOptions
  var response: OctokitResponse[OrgsListAppInstallationsResponseData]
}

object ParametersOrgsListAppInstallationsEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListAppInstallationsEndpoint,
    request: OrgsListAppInstallationsRequestOptions,
    response: OctokitResponse[OrgsListAppInstallationsResponseData]
  ): ParametersOrgsListAppInstallationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListAppInstallationsEndpoint]
  }
}

