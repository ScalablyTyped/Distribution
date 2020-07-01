package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1057` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersCreateGpgKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData]
}

object `1057` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersCreateGpgKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData]
  ): `1057` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1057`]
  }
}

