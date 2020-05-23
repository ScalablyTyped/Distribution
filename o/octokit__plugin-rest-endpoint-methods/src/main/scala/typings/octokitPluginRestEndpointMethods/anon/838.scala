package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsGetCommentsForReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsGetCommentsForReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `838` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsGetCommentsForReviewEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsGetCommentsForReviewResponseData]
}

object `838` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsGetCommentsForReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsGetCommentsForReviewResponseData]
  ): `838` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`838`]
  }
}

