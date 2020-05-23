package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersResponse extends js.Object {
  var parameters: OauthAuthorizationsListAuthorizationsEndpoint
  var response: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]
}

object ParametersResponse {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsListAuthorizationsEndpoint,
    response: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]
  ): ParametersResponse = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersResponse]
  }
}

