package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOauthAuthorizationsListAuthorizationsEndpoint extends js.Object {
  var parameters: OauthAuthorizationsListAuthorizationsEndpoint
  var request: OauthAuthorizationsListAuthorizationsRequestOptions
  var response: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]
}

object ParametersOauthAuthorizationsListAuthorizationsEndpoint {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsListAuthorizationsEndpoint,
    request: OauthAuthorizationsListAuthorizationsRequestOptions,
    response: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]
  ): ParametersOauthAuthorizationsListAuthorizationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsListAuthorizationsEndpoint]
  }
}

