package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsGetReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsGetReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `839` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsGetReviewEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsGetReviewResponseData]
}

object `839` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsGetReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsGetReviewResponseData]
  ): `839` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`839`]
  }
}

