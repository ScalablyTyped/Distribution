package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListPublicKeysForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicKeysForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1079` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersListPublicKeysForUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersListPublicKeysForUserResponseData]
}

object `1079` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListPublicKeysForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListPublicKeysForUserResponseData]
  ): `1079` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1079`]
  }
}

