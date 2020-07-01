package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsCreateReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `830` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsCreateReviewEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsCreateReviewResponseData]
}

object `830` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsCreateReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsCreateReviewResponseData]
  ): `830` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`830`]
  }
}

