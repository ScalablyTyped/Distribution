package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchRequiredStatusChecksContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchRequiredStatusChecksContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `879` extends js.Object {
  var parameters: RequestParameters with (Omit[
    ReposAddProtectedBranchRequiredStatusChecksContextsEndpoint, 
    baseUrl | headers | mediaType
  ])
  var response: OctokitResponse[ReposAddProtectedBranchRequiredStatusChecksContextsResponseData]
}

object `879` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[
      ReposAddProtectedBranchRequiredStatusChecksContextsEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[ReposAddProtectedBranchRequiredStatusChecksContextsResponseData]
  ): `879` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`879`]
  }
}

