package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsGetAuthenticatedEndpoint extends js.Object {
  var parameters: AppsGetAuthenticatedEndpoint
  var request: AppsGetAuthenticatedRequestOptions
  var response: OctokitResponse[AppsGetAuthenticatedResponseData]
}

object ParametersAppsGetAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: AppsGetAuthenticatedEndpoint,
    request: AppsGetAuthenticatedRequestOptions,
    response: OctokitResponse[AppsGetAuthenticatedResponseData]
  ): ParametersAppsGetAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetAuthenticatedEndpoint]
  }
}

