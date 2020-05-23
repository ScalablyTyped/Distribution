package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsListReviewRequestsEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewRequestsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `845` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsListReviewRequestsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsListReviewRequestsResponseData]
}

object `845` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsListReviewRequestsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListReviewRequestsResponseData]
  ): `845` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`845`]
  }
}

