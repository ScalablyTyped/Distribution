package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchAppRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchAppRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `877` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposAddProtectedBranchAppRestrictionsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposAddProtectedBranchAppRestrictionsResponseData]
}

object `877` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposAddProtectedBranchAppRestrictionsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposAddProtectedBranchAppRestrictionsResponseData]
  ): `877` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`877`]
  }
}

