package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.MigrationsListForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersMigrationsListForOrgEndpoint extends js.Object {
  var parameters: MigrationsListForOrgEndpoint = js.native
  var response: OctokitResponse[MigrationsListForOrgResponseData] = js.native
}

object ParametersMigrationsListForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsListForOrgEndpoint,
    response: OctokitResponse[MigrationsListForOrgResponseData]
  ): ParametersMigrationsListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListForOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersMigrationsListForOrgEndpointOps[Self <: ParametersMigrationsListForOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: MigrationsListForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsListForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

