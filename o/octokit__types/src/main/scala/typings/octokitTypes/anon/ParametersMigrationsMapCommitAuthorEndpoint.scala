package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsMapCommitAuthorEndpoint
import typings.octokitTypes.endpointsMod.MigrationsMapCommitAuthorRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsMapCommitAuthorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsMapCommitAuthorEndpoint extends js.Object {
  var parameters: MigrationsMapCommitAuthorEndpoint
  var request: MigrationsMapCommitAuthorRequestOptions
  var response: OctokitResponse[MigrationsMapCommitAuthorResponseData]
}

object ParametersMigrationsMapCommitAuthorEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsMapCommitAuthorEndpoint,
    request: MigrationsMapCommitAuthorRequestOptions,
    response: OctokitResponse[MigrationsMapCommitAuthorResponseData]
  ): ParametersMigrationsMapCommitAuthorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsMapCommitAuthorEndpoint]
  }
}

