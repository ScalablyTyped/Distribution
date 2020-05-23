package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsUpdateAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsUpdateAuthorizationRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsUpdateAuthorizationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOauthAuthorizationsUpdateAuthorizationEndpoint extends js.Object {
  var parameters: OauthAuthorizationsUpdateAuthorizationEndpoint
  var request: OauthAuthorizationsUpdateAuthorizationRequestOptions
  var response: OctokitResponse[OauthAuthorizationsUpdateAuthorizationResponseData]
}

object ParametersOauthAuthorizationsUpdateAuthorizationEndpoint {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsUpdateAuthorizationEndpoint,
    request: OauthAuthorizationsUpdateAuthorizationRequestOptions,
    response: OctokitResponse[OauthAuthorizationsUpdateAuthorizationResponseData]
  ): ParametersOauthAuthorizationsUpdateAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsUpdateAuthorizationEndpoint]
  }
}

