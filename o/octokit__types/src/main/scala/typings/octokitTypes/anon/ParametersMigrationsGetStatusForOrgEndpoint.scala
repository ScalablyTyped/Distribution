package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetStatusForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForOrgRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsGetStatusForOrgEndpoint extends js.Object {
  var parameters: MigrationsGetStatusForOrgEndpoint
  var request: MigrationsGetStatusForOrgRequestOptions
  var response: OctokitResponse[MigrationsGetStatusForOrgResponseData]
}

object ParametersMigrationsGetStatusForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsGetStatusForOrgEndpoint,
    request: MigrationsGetStatusForOrgRequestOptions,
    response: OctokitResponse[MigrationsGetStatusForOrgResponseData]
  ): ParametersMigrationsGetStatusForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetStatusForOrgEndpoint]
  }
}

