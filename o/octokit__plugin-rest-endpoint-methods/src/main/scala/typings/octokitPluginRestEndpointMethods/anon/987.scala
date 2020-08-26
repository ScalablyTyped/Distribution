package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListInvitationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ReposListInvitationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `987` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposListInvitationsForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]) = js.native
  var response: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData] = js.native
}

object `987` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListInvitationsForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData]
  ): `987` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`987`]
  }
  @scala.inline
  implicit class `987Ops`[Self <: `987`] (val x: Self) extends AnyVal {
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
      value: RequestParameters with (Omit[ReposListInvitationsForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

