package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserResponse200Data
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `598` extends js.Object {
  var parameters: RequestParameters with (Omit[ActivityListReposStarredByAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[
    ActivityListReposStarredByAuthenticatedUserResponseData | ActivityListReposStarredByAuthenticatedUserResponse200Data
  ]
}

object `598` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActivityListReposStarredByAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      ActivityListReposStarredByAuthenticatedUserResponseData | ActivityListReposStarredByAuthenticatedUserResponse200Data
    ]
  ): `598` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`598`]
  }
}

