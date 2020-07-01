package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `968` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposListCommitStatusesForRefEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposListCommitStatusesForRefResponseData]
}

object `968` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListCommitStatusesForRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListCommitStatusesForRefResponseData]
  ): `968` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`968`]
  }
}

