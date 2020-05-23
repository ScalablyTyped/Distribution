package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCreateFromManifestEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateFromManifestRequestOptions
import typings.octokitTypes.endpointsMod.AppsCreateFromManifestResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsCreateFromManifestEndpoint extends js.Object {
  var parameters: AppsCreateFromManifestEndpoint
  var request: AppsCreateFromManifestRequestOptions
  var response: OctokitResponse[AppsCreateFromManifestResponseData]
}

object ParametersAppsCreateFromManifestEndpoint {
  @scala.inline
  def apply(
    parameters: AppsCreateFromManifestEndpoint,
    request: AppsCreateFromManifestRequestOptions,
    response: OctokitResponse[AppsCreateFromManifestResponseData]
  ): ParametersAppsCreateFromManifestEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCreateFromManifestEndpoint]
  }
}

