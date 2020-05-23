package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `572` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsListSelfHostedRunnersForOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData]
}

object `572` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsListSelfHostedRunnersForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData]
  ): `572` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`572`]
  }
}

