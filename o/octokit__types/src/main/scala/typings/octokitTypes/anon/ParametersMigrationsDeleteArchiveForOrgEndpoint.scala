package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsDeleteArchiveForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsDeleteArchiveForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsDeleteArchiveForOrgEndpoint extends js.Object {
  var parameters: MigrationsDeleteArchiveForOrgEndpoint
  var request: MigrationsDeleteArchiveForOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersMigrationsDeleteArchiveForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsDeleteArchiveForOrgEndpoint,
    request: MigrationsDeleteArchiveForOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMigrationsDeleteArchiveForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsDeleteArchiveForOrgEndpoint]
  }
}

