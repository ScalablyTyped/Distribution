package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetReadmeEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReadmeRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetReadmeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetReadmeEndpoint extends js.Object {
  var parameters: ReposGetReadmeEndpoint
  var request: ReposGetReadmeRequestOptions
  var response: OctokitResponse[ReposGetReadmeResponseData]
}

object ParametersReposGetReadmeEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetReadmeEndpoint,
    request: ReposGetReadmeRequestOptions,
    response: OctokitResponse[ReposGetReadmeResponseData]
  ): ParametersReposGetReadmeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetReadmeEndpoint]
  }
}

