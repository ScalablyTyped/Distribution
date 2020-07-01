package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1025` extends js.Object {
  var parameters: RequestParameters with (Omit[TeamsCheckPermissionsForRepoInOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[TeamsCheckPermissionsForRepoInOrgResponseData]
}

object `1025` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsCheckPermissionsForRepoInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsCheckPermissionsForRepoInOrgResponseData]
  ): `1025` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1025`]
  }
}

