package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetTeamAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposSetTeamAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetTeamAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposSetTeamAccessRestrictionsEndpoint extends js.Object {
  var parameters: ReposSetTeamAccessRestrictionsEndpoint = js.native
  var request: ReposSetTeamAccessRestrictionsRequestOptions = js.native
  var response: OctokitResponse[ReposSetTeamAccessRestrictionsResponseData] = js.native
}

object ParametersReposSetTeamAccessRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposSetTeamAccessRestrictionsEndpoint,
    request: ReposSetTeamAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposSetTeamAccessRestrictionsResponseData]
  ): ParametersReposSetTeamAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetTeamAccessRestrictionsEndpoint]
  }
  @scala.inline
  implicit class ParametersReposSetTeamAccessRestrictionsEndpointOps[Self <: ParametersReposSetTeamAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposSetTeamAccessRestrictionsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposSetTeamAccessRestrictionsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposSetTeamAccessRestrictionsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

