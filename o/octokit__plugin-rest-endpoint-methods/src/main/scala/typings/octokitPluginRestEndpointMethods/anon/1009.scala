package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUpdateInvitationEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateInvitationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1009` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposUpdateInvitationEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposUpdateInvitationResponseData]
}

object `1009` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposUpdateInvitationEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUpdateInvitationResponseData]
  ): `1009` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1009`]
  }
}

