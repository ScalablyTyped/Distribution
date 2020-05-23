package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsCancelImportEndpoint
import typings.octokitTypes.endpointsMod.MigrationsCancelImportRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsCancelImportEndpoint extends js.Object {
  var parameters: MigrationsCancelImportEndpoint
  var request: MigrationsCancelImportRequestOptions
  var response: OctokitResponse[_]
}

object ParametersMigrationsCancelImportEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsCancelImportEndpoint,
    request: MigrationsCancelImportRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMigrationsCancelImportEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsCancelImportEndpoint]
  }
}

