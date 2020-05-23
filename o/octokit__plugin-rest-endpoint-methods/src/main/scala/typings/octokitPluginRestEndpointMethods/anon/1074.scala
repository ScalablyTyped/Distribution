package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListFollowingForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowingForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1074` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersListFollowingForUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersListFollowingForUserResponseData]
}

object `1074` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListFollowingForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListFollowingForUserResponseData]
  ): `1074` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1074`]
  }
}

