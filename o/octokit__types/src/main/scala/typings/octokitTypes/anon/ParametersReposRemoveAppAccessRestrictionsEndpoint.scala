package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveAppAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveAppAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRemoveAppAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposRemoveAppAccessRestrictionsEndpoint extends js.Object {
  var parameters: ReposRemoveAppAccessRestrictionsEndpoint = js.native
  var request: ReposRemoveAppAccessRestrictionsRequestOptions = js.native
  var response: OctokitResponse[ReposRemoveAppAccessRestrictionsResponseData] = js.native
}

object ParametersReposRemoveAppAccessRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveAppAccessRestrictionsEndpoint,
    request: ReposRemoveAppAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposRemoveAppAccessRestrictionsResponseData]
  ): ParametersReposRemoveAppAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveAppAccessRestrictionsEndpoint]
  }
  @scala.inline
  implicit class ParametersReposRemoveAppAccessRestrictionsEndpointOps[Self <: ParametersReposRemoveAppAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposRemoveAppAccessRestrictionsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposRemoveAppAccessRestrictionsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposRemoveAppAccessRestrictionsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

