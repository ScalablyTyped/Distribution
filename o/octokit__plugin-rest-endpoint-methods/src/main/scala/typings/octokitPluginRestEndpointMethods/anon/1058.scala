package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersCreatePublicKeyEndpoint
import typings.octokitTypes.endpointsMod.UsersCreatePublicKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1058` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersCreatePublicKeyEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersCreatePublicKeyResponseData]
}

object `1058` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersCreatePublicKeyEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersCreatePublicKeyResponseData]
  ): `1058` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1058`]
  }
}

