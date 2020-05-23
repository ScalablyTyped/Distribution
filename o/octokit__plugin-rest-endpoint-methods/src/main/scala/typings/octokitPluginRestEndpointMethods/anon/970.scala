package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListInvitationsEndpoint
import typings.octokitTypes.endpointsMod.ReposListInvitationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `970` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposListInvitationsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposListInvitationsResponseData]
}

object `970` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListInvitationsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListInvitationsResponseData]
  ): `970` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`970`]
  }
}

