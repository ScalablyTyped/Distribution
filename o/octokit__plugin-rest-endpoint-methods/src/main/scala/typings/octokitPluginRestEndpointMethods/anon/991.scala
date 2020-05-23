package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchRequiredStatusChecksContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchRequiredStatusChecksContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `991` extends js.Object {
  var parameters: RequestParameters with (Omit[
    ReposRemoveProtectedBranchRequiredStatusChecksContextsEndpoint, 
    baseUrl | headers | mediaType
  ])
  var response: OctokitResponse[ReposRemoveProtectedBranchRequiredStatusChecksContextsResponseData]
}

object `991` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[
      ReposRemoveProtectedBranchRequiredStatusChecksContextsEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[ReposRemoveProtectedBranchRequiredStatusChecksContextsResponseData]
  ): `991` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`991`]
  }
}

