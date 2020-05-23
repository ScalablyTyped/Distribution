package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchUserRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchUserRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `999` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposReplaceProtectedBranchUserRestrictionsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposReplaceProtectedBranchUserRestrictionsResponseData]
}

object `999` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposReplaceProtectedBranchUserRestrictionsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposReplaceProtectedBranchUserRestrictionsResponseData]
  ): `999` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`999`]
  }
}

