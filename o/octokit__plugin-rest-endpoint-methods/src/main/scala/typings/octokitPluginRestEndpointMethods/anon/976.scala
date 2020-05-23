package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitEndpoint
import typings.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `976` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposListPullRequestsAssociatedWithCommitEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]
}

object `976` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListPullRequestsAssociatedWithCommitEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]
  ): `976` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`976`]
  }
}

