package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `927` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetBranchProtectionEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetBranchProtectionResponseData]
}

object `927` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetBranchProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetBranchProtectionResponseData]
  ): `927` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`927`]
  }
}

