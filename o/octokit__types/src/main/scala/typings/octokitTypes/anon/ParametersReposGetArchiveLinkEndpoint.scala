package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetArchiveLinkEndpoint
import typings.octokitTypes.endpointsMod.ReposGetArchiveLinkRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetArchiveLinkEndpoint extends js.Object {
  var parameters: ReposGetArchiveLinkEndpoint
  var request: ReposGetArchiveLinkRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposGetArchiveLinkEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetArchiveLinkEndpoint,
    request: ReposGetArchiveLinkRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposGetArchiveLinkEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetArchiveLinkEndpoint]
  }
}

