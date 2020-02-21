package typings.octokitRest

import typings.octokitRest.mod.Octokit.Endpoint
import typings.octokitRest.mod.Octokit.EndpointOptions
import typings.octokitRest.mod.Octokit.OrgsUpdateParams
import typings.octokitRest.mod.Octokit.OrgsUpdateParamsDeprecatedMembersAllowedRepositoryCreationType
import typings.octokitRest.mod.Octokit.OrgsUpdateResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsOrgsUpdateParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[OrgsUpdateResponse]] = js.native
  def apply(
    params: RequestOptions with OrgsUpdateParamsDeprecatedMembersAllowedRepositoryCreationType with OrgsUpdateParams
  ): js.Promise[Response[OrgsUpdateResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

