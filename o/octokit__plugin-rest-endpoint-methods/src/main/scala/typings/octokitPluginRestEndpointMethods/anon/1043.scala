package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsListPendingInvitationsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListPendingInvitationsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1043` extends js.Object {
  var parameters: RequestParameters with (Omit[TeamsListPendingInvitationsInOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[TeamsListPendingInvitationsInOrgResponseData]
}

object `1043` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsListPendingInvitationsInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsListPendingInvitationsInOrgResponseData]
  ): `1043` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1043`]
  }
}

