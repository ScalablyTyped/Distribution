package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `842` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsListReviewCommentsForRepoEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsListReviewCommentsForRepoResponseData]
}

object `842` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsListReviewCommentsForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListReviewCommentsForRepoResponseData]
  ): `842` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`842`]
  }
}

