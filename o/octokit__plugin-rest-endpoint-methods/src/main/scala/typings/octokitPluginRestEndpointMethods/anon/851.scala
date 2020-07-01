package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsUpdateReviewCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateReviewCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `851` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsUpdateReviewCommentEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsUpdateReviewCommentResponseData]
}

object `851` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsUpdateReviewCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsUpdateReviewCommentResponseData]
  ): `851` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`851`]
  }
}

