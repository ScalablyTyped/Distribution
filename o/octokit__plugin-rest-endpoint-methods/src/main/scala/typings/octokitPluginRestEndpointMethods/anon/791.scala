package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsListPublicMembersEndpoint
import typings.octokitTypes.endpointsMod.OrgsListPublicMembersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `791` extends js.Object {
  var parameters: RequestParameters with (Omit[OrgsListPublicMembersEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[OrgsListPublicMembersResponseData]
}

object `791` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsListPublicMembersEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsListPublicMembersResponseData]
  ): `791` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`791`]
  }
}

