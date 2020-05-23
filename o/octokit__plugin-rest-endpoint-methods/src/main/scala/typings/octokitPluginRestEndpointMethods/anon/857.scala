package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReactionsCreateForPullRequestReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForPullRequestReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `857` extends js.Object {
  var parameters: RequestParameters with (Omit[ReactionsCreateForPullRequestReviewCommentEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReactionsCreateForPullRequestReviewCommentResponseData]
}

object `857` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReactionsCreateForPullRequestReviewCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReactionsCreateForPullRequestReviewCommentResponseData]
  ): `857` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`857`]
  }
}

