package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.IssuesListLabelsOnIssueParams
import typings.atOctokitRest.atOctokitRestMod.IssuesListLabelsOnIssueParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.IssuesListLabelsOnIssueResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsIssuesListLabelsOnIssueParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesListLabelsOnIssueResponse]] = js.native
  def apply(
    params: RequestOptions with IssuesListLabelsOnIssueParamsDeprecatedNumber with IssuesListLabelsOnIssueParams
  ): js.Promise[Response[IssuesListLabelsOnIssueResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

