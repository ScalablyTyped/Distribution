package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsStartForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsStartForOrgRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsStartForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsStartForOrgEndpoint extends js.Object {
  var parameters: MigrationsStartForOrgEndpoint
  var request: MigrationsStartForOrgRequestOptions
  var response: OctokitResponse[MigrationsStartForOrgResponseData]
}

object ParametersMigrationsStartForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsStartForOrgEndpoint,
    request: MigrationsStartForOrgRequestOptions,
    response: OctokitResponse[MigrationsStartForOrgResponseData]
  ): ParametersMigrationsStartForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsStartForOrgEndpoint]
  }
}

