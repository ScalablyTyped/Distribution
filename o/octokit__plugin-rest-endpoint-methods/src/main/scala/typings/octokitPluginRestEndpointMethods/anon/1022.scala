package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipInOrgResponse422Data
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1022` extends js.Object {
  var parameters: RequestParameters with (Omit[TeamsAddOrUpdateMembershipInOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[
    TeamsAddOrUpdateMembershipInOrgResponseData | TeamsAddOrUpdateMembershipInOrgResponse422Data
  ]
}

object `1022` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsAddOrUpdateMembershipInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      TeamsAddOrUpdateMembershipInOrgResponseData | TeamsAddOrUpdateMembershipInOrgResponse422Data
    ]
  ): `1022` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1022`]
  }
}

