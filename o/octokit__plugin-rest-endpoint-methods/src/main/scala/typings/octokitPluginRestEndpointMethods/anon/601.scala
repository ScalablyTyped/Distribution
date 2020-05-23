package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityListStargazersForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActivityListStargazersForRepoResponse200Data
import typings.octokitTypes.endpointsMod.ActivityListStargazersForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `601` extends js.Object {
  var parameters: RequestParameters with (Omit[ActivityListStargazersForRepoEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[
    ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
  ]
}

object `601` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActivityListStargazersForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
    ]
  ): `601` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`601`]
  }
}

