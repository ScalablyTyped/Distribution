package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListInstallationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListInstallationsRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListInstallationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListInstallationsEndpoint extends js.Object {
  var parameters: OrgsListInstallationsEndpoint
  var request: OrgsListInstallationsRequestOptions
  var response: OctokitResponse[OrgsListInstallationsResponseData]
}

object ParametersOrgsListInstallationsEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListInstallationsEndpoint,
    request: OrgsListInstallationsRequestOptions,
    response: OctokitResponse[OrgsListInstallationsResponseData]
  ): ParametersOrgsListInstallationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListInstallationsEndpoint]
  }
}

