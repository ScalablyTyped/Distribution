package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsGetCommitAuthorsEndpoint extends js.Object {
  var parameters: MigrationsGetCommitAuthorsEndpoint
  var request: MigrationsGetCommitAuthorsRequestOptions
  var response: OctokitResponse[MigrationsGetCommitAuthorsResponseData]
}

object ParametersMigrationsGetCommitAuthorsEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsGetCommitAuthorsEndpoint,
    request: MigrationsGetCommitAuthorsRequestOptions,
    response: OctokitResponse[MigrationsGetCommitAuthorsResponseData]
  ): ParametersMigrationsGetCommitAuthorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetCommitAuthorsEndpoint]
  }
}

