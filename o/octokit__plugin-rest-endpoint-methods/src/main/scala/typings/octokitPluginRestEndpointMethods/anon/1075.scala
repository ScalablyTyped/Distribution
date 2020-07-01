package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListGpgKeysForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListGpgKeysForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1075` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersListGpgKeysForAuthenticatedEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData]
}

object `1075` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListGpgKeysForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData]
  ): `1075` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1075`]
  }
}

