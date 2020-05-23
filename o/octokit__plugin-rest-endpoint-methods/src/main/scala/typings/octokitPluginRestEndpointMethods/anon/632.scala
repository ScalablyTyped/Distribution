package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `632` extends js.Object {
  var parameters: RequestParameters with (Omit[
    AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint, 
    baseUrl | headers | mediaType
  ])
  var response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserStubbedResponseData]
}

object `632` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[
      AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserStubbedResponseData]
  ): `632` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`632`]
  }
}

