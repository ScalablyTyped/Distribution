package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListFollowedByAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowedByAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1081` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersListFollowedByAuthenticatedEndpoint, baseUrl | headers | mediaType]) = js.native
  var response: OctokitResponse[UsersListFollowedByAuthenticatedResponseData] = js.native
}

object `1081` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListFollowedByAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListFollowedByAuthenticatedResponseData]
  ): `1081` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1081`]
  }
  @scala.inline
  implicit class `1081Ops`[Self <: `1081`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[UsersListFollowedByAuthenticatedEndpoint, baseUrl | headers | mediaType])
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListFollowedByAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

