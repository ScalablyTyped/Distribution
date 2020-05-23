package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListProtectedBranchRequiredStatusChecksContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposListProtectedBranchRequiredStatusChecksContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `974` extends js.Object {
  var parameters: RequestParameters with (Omit[
    ReposListProtectedBranchRequiredStatusChecksContextsEndpoint, 
    baseUrl | headers | mediaType
  ])
  var response: OctokitResponse[ReposListProtectedBranchRequiredStatusChecksContextsResponseData]
}

object `974` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[
      ReposListProtectedBranchRequiredStatusChecksContextsEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[ReposListProtectedBranchRequiredStatusChecksContextsResponseData]
  ): `974` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`974`]
  }
}

