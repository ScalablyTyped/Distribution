package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1080` extends js.Object {
  var parameters: RequestParameters with (Omit[
    UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint, 
    baseUrl | headers | mediaType
  ])
  var response: OctokitResponse[UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData]
}

object `1080` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[
      UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData]
  ): `1080` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1080`]
  }
}

