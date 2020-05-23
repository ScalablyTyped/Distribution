package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesUpdateMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `737` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesUpdateMilestoneEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesUpdateMilestoneResponseData]
}

object `737` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesUpdateMilestoneEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesUpdateMilestoneResponseData]
  ): `737` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`737`]
  }
}

