package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchRequiredStatusChecksContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `997` extends js.Object {
  var parameters: RequestParameters with (Omit[
    ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint, 
    baseUrl | headers | mediaType
  ])
  var response: OctokitResponse[ReposReplaceProtectedBranchRequiredStatusChecksContextsResponseData]
}

object `997` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[
      ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[ReposReplaceProtectedBranchRequiredStatusChecksContextsResponseData]
  ): `997` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`997`]
  }
}

