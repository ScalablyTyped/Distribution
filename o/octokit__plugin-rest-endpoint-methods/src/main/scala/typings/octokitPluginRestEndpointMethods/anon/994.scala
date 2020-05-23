package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchUserRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchUserRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `994` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposRemoveProtectedBranchUserRestrictionsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposRemoveProtectedBranchUserRestrictionsResponseData]
}

object `994` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposRemoveProtectedBranchUserRestrictionsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposRemoveProtectedBranchUserRestrictionsResponseData]
  ): `994` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`994`]
  }
}

