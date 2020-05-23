package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetGrantEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetGrantRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetGrantResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOauthAuthorizationsGetGrantEndpoint extends js.Object {
  var parameters: OauthAuthorizationsGetGrantEndpoint
  var request: OauthAuthorizationsGetGrantRequestOptions
  var response: OctokitResponse[OauthAuthorizationsGetGrantResponseData]
}

object ParametersOauthAuthorizationsGetGrantEndpoint {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsGetGrantEndpoint,
    request: OauthAuthorizationsGetGrantRequestOptions,
    response: OctokitResponse[OauthAuthorizationsGetGrantResponseData]
  ): ParametersOauthAuthorizationsGetGrantEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsGetGrantEndpoint]
  }
}

