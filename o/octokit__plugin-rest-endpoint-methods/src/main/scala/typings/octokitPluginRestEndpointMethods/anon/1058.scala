package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1058` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersCreatePublicSshKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData]
}

object `1058` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersCreatePublicSshKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData]
  ): `1058` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1058`]
  }
}

