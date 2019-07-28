package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.IssuesUpdateParams
import typings.atOctokitRest.atOctokitRestMod.IssuesUpdateParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.IssuesUpdateResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsIssuesUpdateParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesUpdateResponse]] = js.native
  def apply(params: IssuesUpdateParams): js.Promise[Response[IssuesUpdateResponse]] = js.native
  def apply(params: IssuesUpdateParamsDeprecatedNumber): js.Promise[Response[IssuesUpdateResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

