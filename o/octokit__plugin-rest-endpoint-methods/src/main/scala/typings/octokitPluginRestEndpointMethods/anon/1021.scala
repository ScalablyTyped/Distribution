package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.SearchUsersEndpoint
import typings.octokitTypes.endpointsMod.SearchUsersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1021` extends js.Object {
  var parameters: RequestParameters with (Omit[SearchUsersEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[SearchUsersResponseData]
}

object `1021` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[SearchUsersEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[SearchUsersResponseData]
  ): `1021` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1021`]
  }
}

