package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserResponse200Data
import typings.octokitTypes.endpointsMod.ActivityListReposStarredByUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `605` extends js.Object {
  var parameters: RequestParameters with (Omit[ActivityListReposStarredByUserEndpoint, baseUrl | headers | mediaType]) = js.native
  var response: OctokitResponse[
    ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
  ] = js.native
}

object `605` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActivityListReposStarredByUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
    ]
  ): `605` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`605`]
  }
  @scala.inline
  implicit class `605Ops`[Self <: `605`] (val x: Self) extends AnyVal {
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
      value: RequestParameters with (Omit[ActivityListReposStarredByUserEndpoint, baseUrl | headers | mediaType])
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
        ]
    ): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

