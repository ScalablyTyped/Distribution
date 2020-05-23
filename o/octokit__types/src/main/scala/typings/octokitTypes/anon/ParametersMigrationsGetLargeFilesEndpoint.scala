package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetLargeFilesEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetLargeFilesRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetLargeFilesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsGetLargeFilesEndpoint extends js.Object {
  var parameters: MigrationsGetLargeFilesEndpoint
  var request: MigrationsGetLargeFilesRequestOptions
  var response: OctokitResponse[MigrationsGetLargeFilesResponseData]
}

object ParametersMigrationsGetLargeFilesEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsGetLargeFilesEndpoint,
    request: MigrationsGetLargeFilesRequestOptions,
    response: OctokitResponse[MigrationsGetLargeFilesResponseData]
  ): ParametersMigrationsGetLargeFilesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetLargeFilesEndpoint]
  }
}

