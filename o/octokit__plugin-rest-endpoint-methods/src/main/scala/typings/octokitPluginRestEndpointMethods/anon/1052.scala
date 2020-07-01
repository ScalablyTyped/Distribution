package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersAddEmailForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersAddEmailForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1052` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersAddEmailForAuthenticatedEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersAddEmailForAuthenticatedResponseData]
}

object `1052` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersAddEmailForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersAddEmailForAuthenticatedResponseData]
  ): `1052` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1052`]
  }
}

