package typings.octokitRest

import typings.octokitRest.mod.Endpoint
import typings.octokitRest.mod.EndpointOptions
import typings.octokitRest.mod.IssuesRemoveAssigneesParams
import typings.octokitRest.mod.IssuesRemoveAssigneesParamsDeprecatedNumber
import typings.octokitRest.mod.IssuesRemoveAssigneesResponse
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsIssuesRemoveAssigneesParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesRemoveAssigneesResponse]] = js.native
  def apply(
    params: RequestOptions with IssuesRemoveAssigneesParamsDeprecatedNumber with IssuesRemoveAssigneesParams
  ): js.Promise[Response[IssuesRemoveAssigneesResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

