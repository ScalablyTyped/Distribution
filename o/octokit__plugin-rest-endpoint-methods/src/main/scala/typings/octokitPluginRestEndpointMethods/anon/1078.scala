package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListPublicKeysEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicKeysResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1078` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersListPublicKeysEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersListPublicKeysResponseData]
}

object `1078` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListPublicKeysEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListPublicKeysResponseData]
  ): `1078` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1078`]
  }
}

