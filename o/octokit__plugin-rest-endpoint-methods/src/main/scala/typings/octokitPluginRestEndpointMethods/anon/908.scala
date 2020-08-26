package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateUsingTemplateEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateUsingTemplateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `908` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposCreateUsingTemplateEndpoint, baseUrl | headers | mediaType]) = js.native
  var response: OctokitResponse[ReposCreateUsingTemplateResponseData] = js.native
}

object `908` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateUsingTemplateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateUsingTemplateResponseData]
  ): `908` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`908`]
  }
  @scala.inline
  implicit class `908Ops`[Self <: `908`] (val x: Self) extends AnyVal {
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
      value: RequestParameters with (Omit[ReposCreateUsingTemplateEndpoint, baseUrl | headers | mediaType])
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateUsingTemplateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

