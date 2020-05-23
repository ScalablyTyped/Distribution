package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsDownloadArchiveForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsDownloadArchiveForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsDownloadArchiveForOrgEndpoint extends js.Object {
  var parameters: MigrationsDownloadArchiveForOrgEndpoint
  var request: MigrationsDownloadArchiveForOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersMigrationsDownloadArchiveForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsDownloadArchiveForOrgEndpoint,
    request: MigrationsDownloadArchiveForOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMigrationsDownloadArchiveForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsDownloadArchiveForOrgEndpoint]
  }
}

