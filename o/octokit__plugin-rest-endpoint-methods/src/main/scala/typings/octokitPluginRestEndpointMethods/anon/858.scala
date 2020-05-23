package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `858` extends js.Object {
  var parameters: RequestParameters with (Omit[
    ReactionsCreateForTeamDiscussionCommentInOrgEndpoint, 
    baseUrl | headers | mediaType
  ])
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentInOrgResponseData]
}

object `858` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[
      ReactionsCreateForTeamDiscussionCommentInOrgEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentInOrgResponseData]
  ): `858` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`858`]
  }
}

