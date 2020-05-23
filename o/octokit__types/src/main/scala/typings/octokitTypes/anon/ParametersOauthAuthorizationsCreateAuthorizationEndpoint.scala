package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsCreateAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsCreateAuthorizationRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsCreateAuthorizationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOauthAuthorizationsCreateAuthorizationEndpoint extends js.Object {
  var parameters: OauthAuthorizationsCreateAuthorizationEndpoint
  var request: OauthAuthorizationsCreateAuthorizationRequestOptions
  var response: OctokitResponse[OauthAuthorizationsCreateAuthorizationResponseData]
}

object ParametersOauthAuthorizationsCreateAuthorizationEndpoint {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsCreateAuthorizationEndpoint,
    request: OauthAuthorizationsCreateAuthorizationRequestOptions,
    response: OctokitResponse[OauthAuthorizationsCreateAuthorizationResponseData]
  ): ParametersOauthAuthorizationsCreateAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsCreateAuthorizationEndpoint]
  }
}

