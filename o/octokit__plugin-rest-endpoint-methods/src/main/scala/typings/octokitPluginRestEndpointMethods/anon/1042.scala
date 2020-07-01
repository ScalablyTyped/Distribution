package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsListMembersInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListMembersInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1042` extends js.Object {
  var parameters: RequestParameters with (Omit[TeamsListMembersInOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[TeamsListMembersInOrgResponseData]
}

object `1042` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsListMembersInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsListMembersInOrgResponseData]
  ): `1042` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1042`]
  }
}

