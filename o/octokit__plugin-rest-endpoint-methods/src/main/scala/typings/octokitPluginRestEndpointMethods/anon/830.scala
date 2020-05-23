package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsCreateReviewCommentReplyEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReviewCommentReplyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `830` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsCreateReviewCommentReplyEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsCreateReviewCommentReplyResponseData]
}

object `830` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsCreateReviewCommentReplyEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsCreateReviewCommentReplyResponseData]
  ): `830` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`830`]
  }
}

