package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUpdateBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1005` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposUpdateBranchProtectionEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposUpdateBranchProtectionResponseData]
}

object `1005` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposUpdateBranchProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUpdateBranchProtectionResponseData]
  ): `1005` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1005`]
  }
}

