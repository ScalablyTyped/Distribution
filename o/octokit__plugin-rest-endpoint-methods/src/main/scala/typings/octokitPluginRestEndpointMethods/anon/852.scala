package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsUpdateReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `852` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsUpdateReviewEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsUpdateReviewResponseData]
}

object `852` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsUpdateReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsUpdateReviewResponseData]
  ): `852` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`852`]
  }
}

