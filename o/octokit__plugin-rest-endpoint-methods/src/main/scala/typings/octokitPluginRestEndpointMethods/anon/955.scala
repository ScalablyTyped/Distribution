package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListBranchesEndpoint
import typings.octokitTypes.endpointsMod.ReposListBranchesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `955` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposListBranchesEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposListBranchesResponseData]
}

object `955` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListBranchesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListBranchesResponseData]
  ): `955` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`955`]
  }
}

