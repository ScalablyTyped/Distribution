package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsRequestReviewersEndpoint
import typings.octokitTypes.endpointsMod.PullsRequestReviewersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `831` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsRequestReviewersEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsRequestReviewersResponseData]
}

object `831` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsRequestReviewersEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsRequestReviewersResponseData]
  ): `831` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`831`]
  }
}

