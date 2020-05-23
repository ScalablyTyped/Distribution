package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsCreateReviewRequestEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReviewRequestResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `831` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsCreateReviewRequestEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsCreateReviewRequestResponseData]
}

object `831` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsCreateReviewRequestEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsCreateReviewRequestResponseData]
  ): `831` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`831`]
  }
}

