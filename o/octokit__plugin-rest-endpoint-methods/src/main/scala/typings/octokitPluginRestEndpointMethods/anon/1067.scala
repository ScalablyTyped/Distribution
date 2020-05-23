package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersGetPublicKeyEndpoint
import typings.octokitTypes.endpointsMod.UsersGetPublicKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1067` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersGetPublicKeyEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersGetPublicKeyResponseData]
}

object `1067` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersGetPublicKeyEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersGetPublicKeyResponseData]
  ): `1067` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1067`]
  }
}

