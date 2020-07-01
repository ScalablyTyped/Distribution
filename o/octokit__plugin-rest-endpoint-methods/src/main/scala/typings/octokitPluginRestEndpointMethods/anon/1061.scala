package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersDeletePublicSshKeyForAuthenticatedEndpoint
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1061` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersDeletePublicSshKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[_]
}

object `1061` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersDeletePublicSshKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[_]
  ): `1061` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1061`]
  }
}

