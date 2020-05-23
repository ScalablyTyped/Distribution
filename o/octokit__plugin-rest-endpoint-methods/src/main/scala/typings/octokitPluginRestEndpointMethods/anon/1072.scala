package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListFollowersForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowersForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1072` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersListFollowersForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData]
}

object `1072` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListFollowersForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData]
  ): `1072` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1072`]
  }
}

