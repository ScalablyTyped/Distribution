package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsListReviewsEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `846` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsListReviewsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsListReviewsResponseData]
}

object `846` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsListReviewsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListReviewsResponseData]
  ): `846` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`846`]
  }
}

