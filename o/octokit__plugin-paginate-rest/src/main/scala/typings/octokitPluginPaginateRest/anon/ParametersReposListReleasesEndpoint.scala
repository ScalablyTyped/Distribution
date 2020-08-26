package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListReleasesEndpoint
import typings.octokitTypes.endpointsMod.ReposListReleasesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposListReleasesEndpoint extends js.Object {
  var parameters: ReposListReleasesEndpoint = js.native
  var response: OctokitResponse[ReposListReleasesResponseData] = js.native
}

object ParametersReposListReleasesEndpoint {
  @scala.inline
  def apply(parameters: ReposListReleasesEndpoint, response: OctokitResponse[ReposListReleasesResponseData]): ParametersReposListReleasesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListReleasesEndpoint]
  }
  @scala.inline
  implicit class ParametersReposListReleasesEndpointOps[Self <: ParametersReposListReleasesEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposListReleasesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListReleasesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

