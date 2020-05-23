package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchAdminEnforcementEndpoint
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchAdminEnforcementResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `876` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposAddProtectedBranchAdminEnforcementEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposAddProtectedBranchAdminEnforcementResponseData]
}

object `876` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposAddProtectedBranchAdminEnforcementEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposAddProtectedBranchAdminEnforcementResponseData]
  ): `876` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`876`]
  }
}

