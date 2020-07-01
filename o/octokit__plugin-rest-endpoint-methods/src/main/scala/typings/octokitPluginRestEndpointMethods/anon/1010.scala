package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUpdatePullRequestReviewProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdatePullRequestReviewProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1010` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposUpdatePullRequestReviewProtectionEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposUpdatePullRequestReviewProtectionResponseData]
}

object `1010` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposUpdatePullRequestReviewProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUpdatePullRequestReviewProtectionResponseData]
  ): `1010` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1010`]
  }
}

