package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityListNotificationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListNotificationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `589` extends js.Object {
  var parameters: RequestParameters with (Omit[
    ActivityListNotificationsForAuthenticatedUserEndpoint, 
    baseUrl | headers | mediaType
  ])
  var response: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]
}

object `589` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[
      ActivityListNotificationsForAuthenticatedUserEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]
  ): `589` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`589`]
  }
}

