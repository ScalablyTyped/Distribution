package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1023` extends js.Object {
  var parameters: RequestParameters with (Omit[TeamsAddOrUpdateProjectPermissionsInOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsInOrgResponseData]
}

object `1023` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsAddOrUpdateProjectPermissionsInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsInOrgResponseData]
  ): `1023` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1023`]
  }
}

