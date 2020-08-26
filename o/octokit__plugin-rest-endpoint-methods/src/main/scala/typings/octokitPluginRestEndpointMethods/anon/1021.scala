package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1021` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposUpdateReleaseAssetEndpoint, baseUrl | headers | mediaType]) = js.native
  var response: OctokitResponse[ReposUpdateReleaseAssetResponseData] = js.native
}

object `1021` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposUpdateReleaseAssetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUpdateReleaseAssetResponseData]
  ): `1021` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1021`]
  }
  @scala.inline
  implicit class `1021Ops`[Self <: `1021`] (val x: Self) extends AnyVal {
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
      value: RequestParameters with (Omit[ReposUpdateReleaseAssetEndpoint, baseUrl | headers | mediaType])
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateReleaseAssetResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

